package Universidad_Central;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite la cantidad de articulos requeridos");
        int CA = sc.nextInt();
        System.out.println("Digite el precio del articulo");
        int PA = sc.nextInt();
        float IVA = (float) 0.19;
        float PV = CA*PA;
        float PB = PV * IVA;
        PB = PB +PV;

        if(PB>93000){
            float Des= (float) ((float)PB*0.05);
            float TP= PB-Des;
            System.out.println("FACTURA:"+"\n"+"El precio unitario es:"+PA+"\n"+"Cantidad de articulos:"+CA
                    +"\n"+"El IVA es:"+IVA+"\n"+"El precio bruto es:"+PB+"\n"+"El descuento es:"+Des+"\n"+"Valor a pagar"+TP);
        }else{
            System.out.println("Factura:"+"\n"+"El precio unitario es:"+PA+"\n"+"Cantidad de articulos:"+CA
                    +"\n"+"IVA:"+IVA+"\n"+"El precio bruto es:"+PB+"\n"+"Valor a pagar"+PB);
        }


    }
}