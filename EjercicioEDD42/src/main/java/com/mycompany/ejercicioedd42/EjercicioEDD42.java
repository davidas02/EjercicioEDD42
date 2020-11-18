/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd42;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class EjercicioEDD42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number,acumulator;
        Scanner reader=new Scanner(System.in);
        // TODO code application logic here
        //Here is the loop for 
        System.out.println("Escribe un numero");
        number=reader.nextInt();
        acumulator=0;
        for(int i=0;i<=number;i++){
            acumulator=acumulator+number;
            System.out.println(acumulator);
        }
    }
}
    

