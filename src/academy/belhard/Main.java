package academy.belhard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Sergei", "Voitehovich", new Addres("Minsk", "Glebki", 28));
    Person person2 = new Person("Sinica", "Olga", new Addres("Brest", "Moskovskaya", 17));
    Person person3 = new Person("Vorobey", "Elena", new Addres("Grodno", "Pyshkina", 10));
    Person person4 = new Person(null, "Dybovik", new Addres("Vitebsk", "Chkalova", 37));
    Person person5 = new Person("Vladimir", null, new Addres("Mogilev", "Koroleva", 12));
    Person person6 = new Person("Sokolov", "Andrey", null);

    ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);
        personArrayList.add(person5);
        personArrayList.add(person6);

        personArrayList.stream()
                .filter(c -> c.getFirstName() != null)
            .filter(x -> x.getLastName() != null)
            .filter(y -> y.getAddres() != null)
             .sorted((o1, o2) -> o1.getAddres().getHouseNumber()-o2.getAddres().getHouseNumber())
                .map(str->str.toString())
             .collect(Collectors.toList())
             .forEach(System.out::println);


    }


    }


