package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	int[] miArray = new int[100];
	Random nRandom = new Random();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = nRandom.nextInt(100);
            System.out.println(miArray[i]);
        }
        int max = -1;
        int masIndex = -1;
        for ( int i = 0; i < miArray.length; i++){
            if (miArray[i] > max) {
                max = miArray[i];
                masIndex = i;
            }
            System.out.println(max);
        }
}}
