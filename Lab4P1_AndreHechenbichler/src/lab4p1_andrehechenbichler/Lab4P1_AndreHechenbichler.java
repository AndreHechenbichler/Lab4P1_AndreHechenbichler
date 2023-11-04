/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_andrehechenbichler;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Lab4P1_AndreHechenbichler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        Scanner lere=new Scanner(System.in);
        System.out.println("*********MENU*********");
        System.out.println("1. Inversión especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. para salir");
        int opcion=leer.nextInt();
        while(opcion>0&&opcion<4){
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese una cadena de almenos 5 dijitos");
                    String cadena1=lere.nextLine();
                    int cant=cadena1.length();
                    if(cant>4){
                        System.out.print("Cadena invertida: ");
                        for(int i=cant-1;i>=0;i--){
                            System.out.print(cadena1.charAt(i));
                        }
                        System.out.println("");
                    }
                    else{
                        System.out.println("la cadena debe tener minimo de 5 letra");
                    }
                    
                break;}
                case 2:{
                    char cant, cant1, cant2;
                    int num=0, num1=0, num2=0;
                    String cadena1, cadena2, cadena3;
                    System.out.println("Ingrese 3 cadenas para calcular su peso");
                    System.out.println("cadena 1");
                    cadena1=lere.nextLine();
                    System.out.println("cadena 2");
                    cadena2=lere.nextLine();
                    System.out.println("cadena 3");
                    cadena3=lere.nextLine();
                    for(int i=0;i<cadena1.length();i++){
                        cant=cadena1.charAt(i);
                        num=num+cant;
                    }
                    for(int i=0;i<cadena2.length();i++){
                        cant1=cadena2.charAt(i);
                        num1=num1+cant1;
                    }
                    for(int i=0;i<cadena3.length();i++){
                        cant2=cadena3.charAt(i);
                        num2=num2+cant2;
                    }
                    System.out.println(""+num);
                    System.out.println(""+num1);
                    System.out.println(""+num2);
                    int mayor=num;
                    if(mayor<num1){
                        System.out.println("La cadena 2 es la mayor");
                    }
                    else if(mayor<num2){
                        System.out.println("La cadena 3 es la mayor");
                    }
                    else if(mayor>num1&&mayor>num2){
                        System.out.println("La cadena 1 es la mayor");
                    }
                    else{
                        System.out.println("los 3 son iguales");
                    }
                break;}
                case 3:{
                    int num=0;
                    char cant;
                    System.out.println("Ingrese mensaje para desifrar");
                    String cadena=lere.nextLine();
                    for(int i=0;i<cadena.length();i++){
                        cant=cadena.charAt(i);
                        num=2+cant;
                        char camb=(char)num;
                        System.out.print(""+camb);
                    }
                    System.out.println("");
                break;}
            }
        System.out.println("*********MENU*********");
        System.out.println("1. Inversión especial");
        System.out.println("2. Balanza de cadenas");
        System.out.println("3. Cifrado de mensajes");
        System.out.println("4. para salir");
        opcion=leer.nextInt();
        }
    }
    
}
