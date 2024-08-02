package com.ivoronline.springboot_accessories_bean_construct_all;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class Person {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }

  //POST CONSTRUCT
  @PostConstruct
  public void postConstruct() {
    System.out.println("postConstruct()");
  }

  //INIT METHOD
  public void initMethod() {
    System.out.println("initMethod()");
  }
  
}
