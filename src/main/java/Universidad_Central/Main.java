package Universidad_Central;

import java.util.Scanner;
//Rama2 edicion y unificacion del proyecto
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la cantidad de articulos requeridos");
        int CA = sc.nextInt();

        System.out.println("Digite el precio del articulo");
        float PA = sc.nextFloat();

        float IVA = 0.19f;
        float PV = CA * PA;
        float PB = PV + PV * IVA; // Corregir el cálculo del precio bruto

        if (PB > 93000) {
            float Des = PB * 0.05f; // Descuento del 5% sobre el precio bruto sin IVA
            float TP = PB - Des;
            System.out.println("FACTURA:\n" +
                    "El precio unitario es: " + PA + "\n" +
                    "Cantidad de articulos: " + CA + "\n" +
                    "El IVA es: " + IVA + "\n" +
                    "El precio bruto es: " + PB + "\n" +
                    "El descuento es: " + Des + "\n" +
                    "Valor a pagar: " + TP);
        } else {
            System.out.println("FACTURA:\n" +
                    "El precio unitario es: " + PA + "\n" +
                    "Cantidad de articulos: " + CA + "\n" +
                    "IVA: " + IVA + "\n" +
                    "El precio bruto es: " + PB + "\n" +
                    "Valor a pagar: " + PB);
        }
    }
}