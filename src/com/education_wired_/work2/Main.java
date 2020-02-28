package com.education_wired_.work2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("ivan");
        person.setLastName("petrov");
        try {
            person.setAge(0234);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
