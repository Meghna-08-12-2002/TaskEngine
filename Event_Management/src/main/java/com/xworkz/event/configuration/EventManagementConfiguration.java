package com.xworkz.event.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.event")
public class EventManagementConfiguration {
public EventManagementConfiguration(){
    System.out.println("EventManagementConfiguration created");
}
}
