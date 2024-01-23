/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangun_ruang_rework;

/**
 *
 * @author Sultan
 */
public class Tabung extends Bangun_Ruang_Rework{
    float pi2;
    float r;
    float tinggi2;
    @Override
    float Volume(){
        float Volume = pi2*r*r*tinggi2;
        System.out.println("Volume tabung : "+ Volume);
        return Volume;
    }
}
