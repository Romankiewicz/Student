package de.iav.studend;

import de.iav.studend.model.*;
import de.iav.studend.model.animals.Pet;

public class Main {

    public static void main(String[] args) {

        Student max = new BiologyStudent("Biology Class");
        max.setId("1234");
        max.setName("Max Pain");
        max.setActiveStudent(true);
        max.setAge(58);

        Student neo = new ComputerScienceStudent("Computer Science Class");
        neo.setId("4567");
        neo.setName("Thomas 'Neo' Anderson");
        neo.setAge(37);
        neo.setActiveStudent(true);

        Student nathan = new ArcheologyStudent("Archeology Class");
        nathan.setId("2345");
        nathan.setName("Nathan Drake");
        nathan.setAge(40);
        nathan.setActiveStudent(true);

        Student indy = new ArcheologyStudent("Archeology Class");
        indy.setId("3456");
        indy.setName("Henry Walton 'Indiana, Indy' Johnes jr.");
        indy.setAge(124);
        indy.setActiveStudent(false);
        ((ArcheologyStudent) indy).setCardNumber(01);
        ((ArcheologyStudent)indy).setAdress("Chicago");

        ComputerScienceStudent morpheus = new ComputerScienceStudent();
        morpheus.setName("Morpheus");
        morpheus.setAdress("Zion");

        Pet cat = new Pet("Tom");





        System.out.println(max);
        System.out.println(indy);
        System.out.println(nathan);
        System.out.println(neo);
        System.out.println(morpheus);
        System.out.println(cat);

    }
}
