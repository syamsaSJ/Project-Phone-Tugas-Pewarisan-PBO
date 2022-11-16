/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectphone;

import java.util.Scanner;

/**
 * @author Syamsa Shahira Julyinda
 * NIM   : 21103078
 * KELAS : S1SI-05-C
 */

public class ProjectPhone {

    public static void main(String[] args) {
        
        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone iphone14 = new iphone();
        Phone A77S = new oppo();
        Phone Flip4 = new Samsung();
        
        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);
        PhoneUser bebby = new PhoneUser(iphone14);
        PhoneUser dani = new PhoneUser(A77S);
        PhoneUser syamsa = new PhoneUser(Flip4);
        
        //Program Input Pemilihan Handphone
        Scanner input = new Scanner(System.in);
        
        //Atribut untuk memilih hp dan interface
        int pilihan, pilih;
        
        //Untuk kembali ke menu utama
        Menu:
        
        //Menu pemilihan handphone menggunakan do-while dan switch-case
        do{
            System.out.println("=== MENU PEMILIHAN HANDPHONE ===");
            System.out.println("1. Xiaomi");
            System.out.println("2. Iphone");
            System.out.println("3. Oppo");
            System.out.println("4. Samsung");
            System.out.println("0. Keluar");
            System.out.print("Pilih Handphone : ");
            pilihan = input.nextInt();
            System.out.println("");
            
            switch(pilihan){
            case 1 :
                //Menu pemilihan aplikasi interface xiaomi menggunakan do-while dan switch-case
                do{
                    System.out.println("=== APLIKASI INTERFACE XIAOMI ===");
                    System.out.println("1. Nyalakan HP");
                    System.out.println("2. Matikan HP");
                    System.out.println("3. Perbesar Volume");
                    System.out.println("4. Kecilkan Volume");
                    System.out.println("5. Ke menu utama");
                    System.out.println("0. Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi : ");
                    pilih = input.nextInt();
                    System.out.println("");
                    
                    switch(pilih){
                    case 1 :
                        dian.turnOnThePhone();
                        System.out.println("");
                        break;
                    case 2 :
                        dian.turnOffThePhone();
                        System.out.println("");
                        break;
                    case 3 :
                        dian.makePhoneLouder();
                        System.out.println("");
                        break;
                    case 4 :
                        dian.makePhoneSilent();
                        System.out.println("");
                        break;
                    case 5 :
                        continue Menu; //Untuk ke menu utama
                    case 0 :
                        System.exit(0);
                        System.out.println("");
                        break;
                    default :
                        System.out.println("Kamu memilih aksi yang salah!");
                        System.out.println("");
                        break;
                    }
                }while(pilih != 0);
                
            case 2 :
                //Menu pemilihan aplikasi interface iphone menggunakan do-while dan switch-case
                do{
                    System.out.println("=== APLIKASI INTERFACE IPHONE ===");
                    System.out.println("1. Nyalakan HP");
                    System.out.println("2. Matikan HP");
                    System.out.println("3. Perbesar Volume");
                    System.out.println("4. Kecilkan Volume");
                    System.out.println("5. Ke menu utama");
                    System.out.println("0. Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi : ");
                    pilih = input.nextInt();
                    System.out.println("");
                    
                    switch(pilih){
                    case 1 :
                        bebby.turnOnThePhone();
                        System.out.println("");
                        break;
                    case 2 :
                        bebby.turnOffThePhone();
                        System.out.println("");
                        break;
                    case 3 :
                        bebby.makePhoneLouder();
                        System.out.println("");
                        break;
                    case 4 :
                        bebby.makePhoneSilent();
                        System.out.println("");
                        break;
                    case 5 :
                        continue Menu;
                    case 0 :
                        System.exit(0);
                        System.out.println("");
                        break;
                    default :
                        System.out.println("Kamu memilih aksi yang salah!");
                        System.out.println("");
                        break;
                    }
                }while(pilih != 0);
                
            case 3 :
                //Menu pemilihan aplikasi interface oppo menggunakan do-while dan switch-case
                do{
                    System.out.println("=== APLIKASI INTERFACE OPPO ===");
                    System.out.println("1. Nyalakan HP");
                    System.out.println("2. Matikan HP");
                    System.out.println("3. Perbesar Volume");
                    System.out.println("4. Kecilkan Volume");
                    System.out.println("5. Ke menu utama");
                    System.out.println("0. Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi : ");
                    pilih = input.nextInt();
                    System.out.println("");
                    
                    switch(pilih){
                    case 1 :
                        dani.turnOnThePhone();
                        System.out.println("");
                        break;
                    case 2 :
                        dani.turnOffThePhone();
                        System.out.println("");
                        break;
                    case 3 :
                        dani.makePhoneLouder();
                        System.out.println("");
                        break;
                    case 4 :
                        dani.makePhoneSilent();
                        System.out.println("");
                        break;
                    case 5 :
                        continue Menu;
                    case 0 :
                        System.exit(0);
                        System.out.println("");
                        break;
                    default :
                        System.out.println("Kamu memilih aksi yang salah!");
                        System.out.println("");
                    }
                }while(pilih != 0);
                
            case 4 :
                //Menu pemilihan aplikasi interface samsung menggunakan do-while dan switch-case
                do{
                    System.out.println("=== APLIKASI INTERFACE SAMSUNG ===");
                    System.out.println("1. Nyalakan HP");
                    System.out.println("2. Matikan HP");
                    System.out.println("3. Perbesar Volume");
                    System.out.println("4. Kecilkan Volume");
                    System.out.println("5. Ke menu utama");
                    System.out.println("0. Keluar");
                    System.out.println("--------------------------");
                    System.out.print("Pilih aksi : ");
                    pilih = input.nextInt();
                    System.out.println("");
                    
                    switch(pilih){
                    case 1 :
                        syamsa.turnOnThePhone();
                        System.out.println("");
                        break;
                    case 2 :
                        syamsa.turnOffThePhone();
                        System.out.println("");
                        break;
                    case 3 :
                        syamsa.makePhoneLouder();
                        System.out.println("");
                        break;
                    case 4 :
                        syamsa.makePhoneSilent();
                        System.out.println("");
                        break;
                    case 5 :
                        continue Menu;
                    case 0 :
                        System.exit(0);
                        System.out.println("");
                        break;
                    default :
                        System.out.println("Kamu memilih aksi yang salah!");
                        System.out.println("");
                    }
                }while(pilih != 0);
                
            case 0 :
                System.out.println("Anda Keluar");
                System.out.println("");
                break;
                
            default :
                System.out.println("Pilihan Anda Salah");
                System.out.println("");
                break;
            }
        }while(pilihan != 0);   
        
    }
    
}