package br.com.rnery.entities;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person implements IPerson {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = resolveGender(gender);
    }

    private Person() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = resolveGender(gender);
    }

    private static String resolveGender(String prefix) {
        switch (prefix) {
            case "M":
                return "Male";
            case "F":
                return "Female";
            default:
                return "Unknown";
        }
    }

    public static List<IPerson> filterByGender(String gender, List<IPerson> personList) {
        String term = resolveGender(gender);
        return personList.stream()
                .filter(person -> person.getGender().equals("Female"))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
