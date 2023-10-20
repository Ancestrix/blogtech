package app.config;


import junia.lab07.api.config.ApiConfig;
import junia.lab07.core.config.CoreConfig;
import junia.lab07.web.config.WebConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({CoreConfig.class, ApiConfig.class, WebConfig.class})
public class AppConfig {
}
