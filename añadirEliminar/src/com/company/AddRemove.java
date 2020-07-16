package com.company;

public class AddRemove {
    public int[] add(int[] arrayOriginal) {
        int[] resultado = new int[5];
        for (int i = 0; i <arrayOriginal.length; i++){
            resultado[i] = arrayOriginal[i];

        resultado[resultado.length - 1] = 5;

        }

        return resultado;
    }
    public int[] remove(int[] arrayOriginal) {
    int[] resultado = new int[3];
    for ( int i = 0; i <arrayOriginal.length - 1; i++){
        resultado[i] = arrayOriginal[i];
        }

    return resultado;
    }
    public void print(int[] src) {
        for ( int i = 0; i < src.length - 1;i++)
    }

    public static void main(String[] args) {
        int[] valores = new int[] { 1, 2, 3, 4 };
        AddRemove instance = new AddRemove();
        valores = instance.add(valores);
        int[] resultadoFinal = instance.remove(valores);
        instance.print(resultadoFinal);


    }
}