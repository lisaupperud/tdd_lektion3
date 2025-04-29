package com.lisaanna.randomcomplimentgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomise {

    List<Compliment> complimentList = new ArrayList<Compliment>();

    Compliment hair = new Compliment("hair");
    Compliment eyes = new Compliment("eyes");
    Compliment nails = new Compliment("nails");
    Compliment smile = new Compliment("smile");

    void addCompliment() {
        complimentList.add(hair);
        complimentList.add(eyes);
        complimentList.add(nails);
        complimentList.add(smile);
    }

    Random rand = new Random();

    public String randomCompliment(){
        return "Your " + rand.nextInt(complimentList.size()) + " is nice.";
    }


}
