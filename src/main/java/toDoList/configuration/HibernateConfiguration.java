package toDoList.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.sql.DataSource;
import java.net.URISyntaxException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {

    String driverClassName = "org.postgresql.Driver";

    static final Properties hibernateProperties = new Properties() {
        {
            setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
            setProperty("hibernate.show_sql", "true");
            setProperty("hibernate.hbm2ddl.auto", "create");

        }
    };

    public HibernateConfiguration() throws URISyntaxException {
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public LocalSessionFactoryBean sessionFactory() throws URISyntaxException {
        final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("toDoList.core.model");
        sessionFactory.setHibernateProperties(hibernateProperties);
        return sessionFactory;
    }

    @Bean
    public HibernateTransactionManager transactionManager() throws URISyntaxException {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = null;
        dataSource = new DriverManagerDataSource("jdbc:postgresql://localhost:5432/project",
                "postgres",
                "root");

        dataSource.setDriverClassName(driverClassName);

        return dataSource;
    }
}

//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean
//    public DataSource dataSource() {
//        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//
//    @Value("${hibernate.dialect}")
//    private String hibernateDialect;
//    @Value("${hibernate.show_sql}")
//    private String hibernateShowSql;
//    @Value("${hibernate.hbm2ddl.auto}")
//    private String hibernateHBM2DDLAuto;
//
//    @Bean
//    public Properties hibernateProperties() {
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", hibernateDialect);
//        properties.put("hibernate.show_sql", hibernateShowSql);
//        properties.put("hibernate.hbm2ddl.auto", hibernateHBM2DDLAuto);
//        return properties;
//    }
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory(DataSource dataSource) {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setPackagesToScan("/core/");
//        sessionFactory.setHibernateProperties(this.hibernateProperties());
//        return sessionFactory;
//    }
//
//    @Bean
//    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
//        HibernateTransactionManager htm = new HibernateTransactionManager();
//        htm.setSessionFactory(sessionFactory);
//        return htm;
//    }
//}
