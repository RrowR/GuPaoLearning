package com.gupaoedu.demo.annotaions.configures.componentscan;

import com.gupaoedu.project.controller.MyController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.gupaoedu.project",
               // includeFilters = {@Filter(type = FilterType.ANNOTATION,value = {Controller.class})},
               // includeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE,value = {MyController.class})},
               //   includeFilters = {@Filter(type = FilterType.CUSTOM,value = {GPTypeFilter.class})},
                useDefaultFilters = false)
public class MyConfig {


}
