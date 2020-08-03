package com.sansux.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
@Getter
@Setter
@ToString
public class Person {
    String lastName;
    int age;
    Date birth;
    Map<String, String> maps;
    List<String> list;


}
