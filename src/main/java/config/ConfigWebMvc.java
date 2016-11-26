package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Я on 24.11.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"core", "config"})
public class ConfigWebMvc extends WebMvcConfigurerAdapter{

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http:localhost:8080")
                .allowedMethods("GET", "POST", "DELETE", "UPDATE")
                .allowedHeaders("/", "/*")
                .exposedHeaders("/**")
                .allowCredentials(false).maxAge(3600);
    }
}
