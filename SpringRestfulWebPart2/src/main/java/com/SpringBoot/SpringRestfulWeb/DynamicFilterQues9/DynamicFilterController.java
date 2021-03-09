package com.SpringBoot.SpringRestfulWeb.DynamicFilterQues9;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicFilterController {
    @GetMapping("/dynamicFiltering")
    public MappingJacksonValue staticFiltering() {

        SimpleBeanPropertyFilter propertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("userId","userName");

        FilterProvider filter = new SimpleFilterProvider().addFilter("dynamicfilter", propertyFilter);

        User user = new User(201, "pratap", "password");
        MappingJacksonValue value = new MappingJacksonValue(user);
        value.setFilters(filter);
        return value;
    }

}
