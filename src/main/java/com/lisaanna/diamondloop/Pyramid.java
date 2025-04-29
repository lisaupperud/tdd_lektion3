package com.lisaanna.diamondloop;

import java.util.zip.DeflaterOutputStream;

public class Pyramid {

    String y = "";


    public void buildPyramid(int x) {
        for (int i = 0; i < x; i++) {

            y = y.concat("*");

            System.out.println(y);


        }


        for (int i = x; i > 0; i--) {
            System.out.println(y.substring(0, y.length() - 1));
        }

    }





}
