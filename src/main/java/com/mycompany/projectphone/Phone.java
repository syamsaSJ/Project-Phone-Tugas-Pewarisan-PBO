/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.mycompany.projectphone;

/**
 * @author Syamsa Shahira Julyinda
 * NIM   : 21103078
 * KELAS : S1SI-05-C
 */

//Interface
public interface Phone {
    
    //Atribut
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    //Method
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    
}
