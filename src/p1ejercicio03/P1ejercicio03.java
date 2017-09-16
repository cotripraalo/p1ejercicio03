/*
 * Ejercicio03

 */
package p1ejercicio03;

import java.util.Scanner;

/**
 *
 * @author ALONDRA COTRINA
 */
public class P1ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int numeroDia=0;
       System.out.println("INGRESE DIA");
         int dia=input.nextInt();
         System.out.println("INGRESE MES");
         int mes=input.nextInt();
         System.out.println("INGRESE AÑO");
         int año=input.nextInt();
         System.out.print("La fecha ingresada "+dia+"/"+mes+"/"+año);
         if(año%4==0)
         {  
             if(mes==1){numeroDia=dia;}
             else if(mes==2){numeroDia=31+dia;}
             else if(mes==3){numeroDia=60+dia;}
             else if(mes==4){numeroDia=91+dia;}
             else if(mes==5){numeroDia=121+dia;}
             else if(mes==6){numeroDia=152+dia;}
             else if(mes==7){numeroDia=182+dia;}
             else if(mes==8){numeroDia=213+dia;}
             else if(mes==9){numeroDia=244+dia;}
             else if(mes==10){numeroDia=274+dia;}
             else if(mes==11){numeroDia=305+dia;}
             else if(mes==12){numeroDia=335+dia;}
             
         }
         else
         {
             if(mes==1){numeroDia=dia;}
             else if(mes==2){numeroDia=31+dia;}
             else if(mes==3){numeroDia=59+dia;}
             else if(mes==4){numeroDia=99+dia;}
             else if(mes==5){numeroDia=120+dia;}
             else if(mes==6){numeroDia=151+dia;}
             else if(mes==7){numeroDia=181+dia;}
             else if(mes==8){numeroDia=212+dia;}
             else if(mes==9){numeroDia=243+dia;}
             else if(mes==10){numeroDia=273+dia;}
             else if(mes==11){numeroDia=304+dia;}
             else if(mes==12){numeroDia=334+dia;}
         }
         System.out.print(" corresponde al "+numeroDia+" dia del año");
         System.out.println("");
    }
    
}