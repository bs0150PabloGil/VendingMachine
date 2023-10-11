package org.example;

public class Lista_Productos {
    private String[] productos = new String[8];
    private double[] precios = new double[8];
    private int[] cantidad = new int[8];

    public Lista_Productos(){
        productos[0] = "CocaCola";
        productos[1] = "Fanta";
        productos[2] = "Aquarius";
        productos[3] = "Zumo de Naranja";
        productos[4] = "Zumo de Piña";
        productos[5] = "Zumo de Melocoton";
        productos[6] = "Huesitos";
        productos[7] = "Barrita de Cereales";

        precios[0] = 1.5;
        precios[1] = 1.5;
        precios[2] = 1.5;
        precios[3] = 1.25;
        precios[4] = 1.25;
        precios[5] = 1.25;
        precios[6] = 0.5;
        precios[7] = 0.5;

        cantidad[0] = 10;
        cantidad[1] = 7;
        cantidad[2] = 13;
        cantidad[3] = 8;
        cantidad[4] = 7;
        cantidad[5] = 1;
        cantidad[6] = 3;
        cantidad[7] = 2;
    }

    public void mostrarProductos(){
        for(int i=0; i<8; i++){
            if(this.cantidad[i] > 0){
                System.out.print(" > $ " + precios[i] + "\t > " + cantidad[i] + " unidades\t > " + productos[i] + "\n");
            }
        }
    }


}
