//package toDoList.configuration;
//
///**
// * Created by employee on 11/23/16.
// */
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@ComponentScan("toDoList.*")
//public class ApplicationContextConfig {
//
//    @Bean(name = "viewResolver")
//    public InternalResourceViewResolver getViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/pages/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
//}