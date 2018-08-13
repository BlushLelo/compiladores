package project;

import project.com.compiladores.domain.Person;

public class Compilador {
    public static void main(String[] args) {
        Person person = Person.builder().age(10).name("João").build();
        System.out.println(person);
    }
}
