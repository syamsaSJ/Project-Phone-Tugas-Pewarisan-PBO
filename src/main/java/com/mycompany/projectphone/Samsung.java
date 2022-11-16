/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.projectphone;

/**
 * @author Syamsa Shahira Julyinda
 * NIM   : 21103078
 * KELAS : S1SI-05-C
 */

//Kelas anak yang di implements ke interface phone
public class Samsung implements Phone{
    
    //Atribut
    private int volume;
    private boolean isPowerOn;

    //Konstruktor
    public Samsung() {
        // set volume awal
        this.volume = 50;
    }

    //Method menyalakan hp
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di SAMSUNG");
        System.out.println("Android version 13");
    }

    //Method mematikan hp
    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    //Method menambah volume
    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    //Method mengurangi volume
    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }

    //Method yang mereturn volume
    public int getVolume() {
        return this.volume;
    }
}
