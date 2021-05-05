package com.mvc.model;

import javax.validation.constraints.*;

public class Registration {

//    @NotNull
//    @NotEmpty
    @NotEmpty(message = "sad ..  ektb ay 7aga") // properties file overrides message here
    @Size(min = 3, max = 30)
    private String name;

//    @Digits(integer = 5, fraction = 2)
    @Min(value = 2000)
    @Max(value = 15000)
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
