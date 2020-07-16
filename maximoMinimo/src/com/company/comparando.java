package com.company;
import java.util.Random;
public class comparando {
    public static void main(String[] args) {
        Random random = new Random();
        int[] primerArray = new int[20];
        int[] segundoArray = new int[20];

        int repeticiones = 0;
        int posicion = 0;
        for (int i = 0; i < primerArray.length ; i++) {
            primerArray[i] = random.nextInt(100);
            for (int j = 0; j < segundoArray.length ;j++){
                segundoArray[i] = random.nextInt(100);
                if (primerArray[i] == segundoArray[j]) {
                    repeticiones++;
                    if ( i == j){
                        posicion++;
                }
                }


            }
        }   System.out.println(repeticiones);
        System.out.println(posicion);
    }
}

