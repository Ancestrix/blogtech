package app.config;



import api.config.ApiConfig;
import core.config.CoreConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import web.config.WebConfig;

@Configuration
@Import({CoreConfig.class, ApiConfig.class, WebConfig.class})
public class AppConfig {
}
