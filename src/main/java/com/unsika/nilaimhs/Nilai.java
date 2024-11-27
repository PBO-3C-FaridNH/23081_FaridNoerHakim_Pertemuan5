/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unsika.nilaimhs;

import java.util.Scanner;

/**
 *
 * @author farid
 */
public class Nilai {
    public static void main(String[] args) {
        try ( // TODO code application logic here
            Scanner input = new Scanner(System.in)) {
            String ulang;
            
            do{
                System.out.print("NPM : ");
                String npm = input.nextLine();
                
                System.out.print("Nama Mahasiswa : ");
                String nama = input.nextLine();
                
                System.out.print("Nilai Kehadiran : ");
                double nHadir = input.nextDouble();
                
                System.out.print("Nilai Tugas : ");
                double nTugas = input.nextDouble();
                
                System.out.print("Nilai UTS : ");
                double nUTS = input.nextDouble();
                
                System.out.print("Nilai UAS : ");
                double nUAS = input.nextDouble();
                
                double nAkhir = (0.10*nHadir) + (0.20*nTugas)+ (0.30*nUTS) + (0.40*nUAS);
                String nilai;
                String ket;
                
                if(nAkhir >= 76 && nAkhir <= 100){
                    nilai = "A";
                    ket = "Istimewa";
                }else if(nAkhir >= 66 && nAkhir <= 75){
                    nilai = "B";
                    ket = "Baik";
                }else if(nAkhir >= 56 && nAkhir <= 65){
                    nilai = "C";
                    ket = "Cukup";
                }else if(nAkhir >= 46 && nAkhir <= 55){
                    nilai = "D";
                    ket = "Kurang";
                }else {
                    nilai = "E";
                    ket = "Mengulang";
                }
                
                System.out.println("\nNilai Akhir Mahasiswa");
                System.out.println("NPM Mahasiswa : " + npm);
                System.out.println("Nama Mahasiswa : " + nama);
                System.out.println("Nilai Rata-rata: " + nAkhir);
                System.out.println("Grade : " + nilai);
                System.out.println("Keterangan : " + ket);
                
                System.out.println("\nApakah anda ingin menginput nilai lagi? (Y/N)");
                input.nextLine();
                ulang = input.nextLine();
            } while (ulang.equalsIgnoreCase("Y"));
        }
    }
}
