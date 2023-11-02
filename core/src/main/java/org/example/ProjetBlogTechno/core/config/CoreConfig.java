package org.example.ProjetBlogTechno.core.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.example.ProjetBlogTechno.core.repository.entity")
@EnableJpaRepositories("org.example.ProjetBlogTechno.core.repository")
@ComponentScan(basePackages = {"org.example.ProjetBlogTechno.core.service"})
public class CoreConfig
{
}
