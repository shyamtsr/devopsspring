package com.ssreddy.devops.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {

        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:i18n/messages");
        //Checks for new messages every 30 minutes
        messageSource.setCacheSeconds(1800);

        return messageSource;

    }

}
