package com.khoza.atm.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
@Configuration
public class AppConf {

  @Bean
  public MessageSource messageSource() {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasenames("messages/users", "messages/messages");
    messageSource.setDefaultEncoding("UTF-8");
    return messageSource;
  }
}
