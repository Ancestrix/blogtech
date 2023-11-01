package core.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "core.entity")
@ComponentScan(basePackages = {"core.service","core.controller","core.dto"})
public class CoreConfig
{
}
