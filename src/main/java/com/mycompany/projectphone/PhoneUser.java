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

//Kelas induk
public class PhoneUser {
    
    //Atribut kelas induk
    private Phone phone;
    
    //Konstruktor
    public PhoneUser(Phone phone){
        this.phone = phone;
    }
    
    //Method menyalakan hp
    void turnOnThePhone(){
        this.phone.powerOn();
    }

    //Method mematikan hp
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    //Method menambah volume hp
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    
    //Method mengurangi volume hp
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
    
}