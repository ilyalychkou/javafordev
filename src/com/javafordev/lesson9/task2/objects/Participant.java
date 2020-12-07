package com.javafordev.lesson9.task2.objects;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Participant", propOrder = {
        "name",
        "age",
        "company"
})
public class Participant {

    @XmlElement(required = true)
    private String name;

    @XmlElement(required = true)
    private int age;

    @XmlElement(required = true)
    private String company;

    public Participant() {
    }

    public Participant(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                '}';
    }
}
