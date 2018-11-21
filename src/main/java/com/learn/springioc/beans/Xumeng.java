package com.learn.springioc.beans;

public class Xumeng {
    
    private String name = "xumeng";
    
    private Integer age = 24;
    
    private String gender = "Ů";
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
	return "Xumeng [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
    
    

}
