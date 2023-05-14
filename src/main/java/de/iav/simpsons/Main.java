package de.iav.simpsons;

import de.iav.simpsons.model.Simpson;

public class Main {


    public static void main(String[] args ){
        Simpson homer = new Simpson( 39, "Homer Jay","Male","3 Traurige schwarze Haare");
        Simpson marge = new Simpson(36, "Marjorie Jacqueline (Marge)", "Female","Blau");
        Simpson bart = new Simpson(10, "Bartholomew Jojo (Bart)", "Male", "Blonde");
        Simpson lisa = new Simpson(8, "Lisa Marie", "Female", "Blonde");
        Simpson maggie = new Simpson(1, "Maggie", "Female", "Blond");
        Simpson grandpa = new Simpson(83, "Abraham Jebediah (Grandpa Ape", "Male", "Blond");
        Simpson mona = new Simpson();

        System.out.println(homer);
        System.out.println(" ");
        System.out.println(marge);
        System.out.println(" ");
        System.out.println(bart);
        System.out.println(" ");
        System.out.println(lisa);
        System.out.println(" ");
        System.out.println(maggie);
        System.out.println(" ");
        System.out.println(grandpa);
        System.out.println(" ");
        System.out.println(mona);


/*        Simpsons homer = new Simpsons();
        homer.name = "Homer Jay";
        homer.gender = "Male";
        homer.setAge(39);
        System.out.println(homer);

        Simpsons bart = new Simpsons();
        bart.name = "Bartholomew Jojo (Bart)";
        bart.gender = "Male";
        bart.setAge(10);
        System.out.println(bart);

        Simpsons marge = new Simpsons();
        marge.name = "Marjorie Jacqueline (Marge)";
        marge.gender = "Female";
        marge.setAge(36);
        marge.setHairColor("Blue");
        System.out.println(marge);

        Simpsons lisa = new Simpsons();
        lisa.name = "Lisa Marie";
        lisa.gender = "Female";
        lisa.setAge(8);
        System.out.println(lisa);

        Simpsons maggie = new Simpsons();
        maggie.name = "Maggie";
        maggie.gender = "Female";
        maggie.setAge(1);
        System.out.println(maggie);

        Simpsons abe = new Simpsons();
        abe.name = "Abraham Jebediah (Abe)";
        abe.gender = "Male";
        abe.setAge(83);
        System.out.println(abe);

        Simpsons mona = new Simpsons();
        mona.name = "Mona";
        mona.gender = "Female";
        mona.setAge(76);
        System.out.println(mona);*/

    }
}
