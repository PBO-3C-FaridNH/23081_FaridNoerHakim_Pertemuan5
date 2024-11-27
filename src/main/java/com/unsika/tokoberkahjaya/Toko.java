/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unsika.tokoberkahjaya;

import java.util.Scanner;

/**
 *
 * @author farid
 */
public class Toko {

     public static void main(String[] args) {

         try (Scanner input = new Scanner(System.in)) {
             String ulang;
             
             do {
                 System.out.print("Masukkan nama barang : ");
                 String namaProduk = input.nextLine();
                 
                 System.out.print("Masukkan harga (Rp): ");
                 double harga = input.nextDouble();
                 
                 System.out.print("Masukkan Jumlah : ");
                 int Jumlah = input.nextInt();
                 
                 double totalBeli = harga*Jumlah;
                 
                 double diskon;
                 
                 if(totalBeli < 50000) {
                     diskon = totalBeli * 0.05;
                 }else {
                     diskon = totalBeli * 0.20;
                 }
                 
                 double totalBayar = totalBeli - diskon;
                 
                 System.out.println("\n======Detail Transaksi======");
                 System.out.println("Nama Barang : " + namaProduk);
                 System.out.println("Jumlah Barang : " + Jumlah);
                 System.out.println("Harga per Barang : Rp." + harga);
                 System.out.println("Total Pembelian : Rp." + totalBeli);
                 System.out.println("Besarnya Potongan : Rp." + diskon);
                 System.out.println("Total Pembayaran :Rp." + totalBayar);
                 
                 System.out.println("Apakah anda ingin Membeli lagi? (Y/N)");
                 input.nextLine();
                 ulang = input.nextLine();
             } while (ulang.equalsIgnoreCase("Y"));
         }
        System.out.println("\nTerima Kasih sudah berbelanja di Toko kami");
    }
}
