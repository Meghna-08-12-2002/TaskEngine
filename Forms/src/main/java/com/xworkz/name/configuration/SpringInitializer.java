package com.xworkz.name.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{NameConfiguration.class,HospitalConfiguration.class, RTOConfiguration.class, PoliceStationConfiguration.class, FruitsConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/save","/submit","/entered","/filled","/given"};
    }
}
