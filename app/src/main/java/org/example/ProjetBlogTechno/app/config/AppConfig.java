package org.example.ProjetBlogTechno.app.config;



import org.example.ProjetBlogTechno.api.config.ApiConfig;
import org.example.ProjetBlogTechno.core.config.CoreConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.example.ProjetBlogTechno.config.WebConfig;

@Configuration
@Import({CoreConfig.class, ApiConfig.class, WebConfig.class})
public class AppConfig {
}
