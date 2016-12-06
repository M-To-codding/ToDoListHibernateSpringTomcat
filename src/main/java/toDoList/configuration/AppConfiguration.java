package toDoList.configuration;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.net.URISyntaxException;
import java.util.Properties;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by marina on 06.12.16.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"core", "configuration"})
@Import({HibernateConfiguration.class})
//@PropertySource(value = {"classpath:hibernate.properties"})
public class AppConfiguration {
    @Bean
    public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("hibernate.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }
//    @Autowired
//    private Environment environment;
//
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource());
//        sessionFactory.setPackagesToScan(new String[]{"toDoList.core.model"});
//        sessionFactory.setHibernateProperties(hibernateProperties);
//        return sessionFactory;
//    }
//
//    static final Properties hibernateProperties = new Properties() {
//        {
//            setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//            setProperty("hibernate.show_sql", "true");
//        }
//    };
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("spring.datasource.driver-class-name");
//        dataSource.setUrl("spring.datasource.url");
//        dataSource.setUsername("spring.datasource.username");
//        dataSource.setPassword("spring.datasource.password");
//        return dataSource;
//    }
//
//    public HibernateTransactionManager transactionManager() throws URISyntaxException {
//        HibernateTransactionManager trm = new HibernateTransactionManager();
//        trm.setSessionFactory(sessionFactory().getObject());
//        return trm;
//    }
}

