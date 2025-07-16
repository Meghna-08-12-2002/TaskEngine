package com.xworkz.spring.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
public SpringInitializer(){
    System.out.println("Create SpringInitializer");
}
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("running getRootConfigClasses");

        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("running getServletConfigClasses");

        return new Class[]{SpringConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("running getServletMappings");

        return new String[0];
    }
}
