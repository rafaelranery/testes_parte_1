package br.com.rnery.entities;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public interface IPerson {
    static List<IPerson> dataToPersonOList(List<String> unformattedList) {
        List<IPerson> personList = unformattedList.stream()
                .map(s -> s.split("-"))
                .map(strings -> new Person(strings[0].trim(), strings[1].trim()))
                .collect(Collectors.toList());
        return personList;
    }


    static String[] receivePersonInput() {
        Scanner s = new Scanner(System.in);
        System.out.println(
                "Insert a list of people, providing their name and gender following the example: \n" +
                        "Carlos - M, Maria - F, Elias - M, Silvana - F, etc...");
        String[] input = s.nextLine().split(",");
        return input;
    }

    String getGender();
    String getName();
}
