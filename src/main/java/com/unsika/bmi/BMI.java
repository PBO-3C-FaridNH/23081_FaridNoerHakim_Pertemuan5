/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsika.bmi;

import java.util.Scanner;

/**
 *
 * @author farid
 */
public class BMI {
    public static void main(String[] args) {
        try ( // TODO code application logic here
            Scanner input = new Scanner (System.in)) {
            String ulang;
            
            do {
                System.out.print("Masukkan berat badan (kg): ");
                double berat = input.nextDouble();
                
                System.out.print("Masukkan tinggi badan (cm): ");
                double tinggi = input.nextDouble();
                
                double tinggiM = tinggi / 100;
                
                double bmi = berat / (tinggiM*tinggiM);
                
                System.err.println("Indeks Massa Tubuh (IMT) Anda adalah: "+bmi);
                
                String kriteria;
                if(bmi < 18.4){
                    kriteria = "Berat Badan Kurang";
                }else if(bmi >= 18.5 && bmi <= 24.9){
                    kriteria = "Berat Badan Ideal";
                }else if(bmi >= 25 && bmi <= 29.9){
                    kriteria = "Berat Badan Berlebih";
                }else if(bmi >= 30 && bmi <=39.9){
                    kriteria = "Gemuk";
                }else {
                    kriteria = "Obesitas";
                }
                
                System.out.println("Kriteria: "+ kriteria);
                
                System.out.println("Apakah anda ingin Keluar dari program? (Y/N)");
                input.nextLine();
                ulang = input.nextLine();
            }while (ulang.equalsIgnoreCase("N"));
        }        
    }
}
