package br.com.rnery.entities;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void filterByGender() {
        List<IPerson> personList = List.of(
                new Person("Rafael", "M"), new Person("Ana", "F"),
                new Person("Alexandro", "M"), new Person("Carolina", "F"),
                new Person("Pedro", "M"), new Person("Maria", "F")
        );

        List<IPerson> filteredWomenList = Person.filterByGender("F", personList);

        filteredWomenList.forEach(iPerson -> Assert.assertEquals("Female", iPerson.getGender()));
    }
}