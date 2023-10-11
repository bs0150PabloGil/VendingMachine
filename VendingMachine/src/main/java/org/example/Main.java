package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" > Introduzca un importe: ");
        double importe = scanner.nextDouble();
        Saldo saldo = new Saldo(importe);
        System.out.print("\n");


        Lista_Productos lista = new Lista_Productos();
        lista.mostrarProductos();
    }
}