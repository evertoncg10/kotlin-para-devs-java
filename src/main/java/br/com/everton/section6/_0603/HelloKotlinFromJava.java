package br.com.everton.section6._0603;

import br.com.everton.section05._0505.MaxKt;

public class HelloKotlinFromJava {
    public static void main(String[] args) {
        Person rob = new Person("Robert", "Martin");
        System.out.println("His name is " + rob.getFirstName());

        rob.setFirstName("Uncle Bob");
        System.out.println("His name is now " + rob.getFirstName());

        Integer maxInt = MaxKt.max(2001, 2022);
        System.out.println("The max value is " + maxInt);
    }
}
