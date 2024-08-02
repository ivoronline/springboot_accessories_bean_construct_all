package com.ivoronline.springboot_accessories_bean_construct_all;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

  //PERSON
  @Bean(initMethod = "initMethod")
  public Person person() {
    return new Person();
  }

}
