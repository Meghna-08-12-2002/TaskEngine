package com.xworkz.event.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class EventmangamentInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{EventManagementConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/send"};
    }
}
