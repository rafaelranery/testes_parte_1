package br.com.rnery;

import br.com.rnery.entities.IPerson;
import br.com.rnery.entities.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.stream(IPerson.receivePersonInput()).toList();
        List<IPerson> personList = IPerson.dataToPersonOList(input);

        System.out.println("\nProvided list:");
        personList.forEach(person -> System.out.println(person));

        List<IPerson> filteredList = Person.filterByGender("F", personList);

        System.out.println("\nFiltered list of women:");
        filteredList.forEach(person -> System.out.println(person));
    }


}
