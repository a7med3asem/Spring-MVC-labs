package com.practice.gettingStarted;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

@Configuration
public class MyConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/files/**")
//                .addResourceLocations("/WEB-INF/pdf/");
//    }

    /*
    * to register my interceptor
    * */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);

        return localeResolver;
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor changeInterceptor = new LocaleChangeInterceptor();
        changeInterceptor.setParamName("lang");

        return changeInterceptor;
    }

    /*
     * ViewResolver works instead of working with application.properties
     * it takes the return value from Get annotated methods and put it in
     * prefix and suffix
     * */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver myResolver = new InternalResourceViewResolver();
        myResolver.setPrefix("/WEB-INF/jsp/");
        myResolver.setSuffix(".jsp");
        myResolver.setOrder(0);

        return myResolver;
    }
}
