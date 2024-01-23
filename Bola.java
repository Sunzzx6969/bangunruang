/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangun_ruang_rework;

/**
 *
 * @author Sultan
 */
public class Bola extends Bangun_Ruang_Rework {
    float r;
    float pi;
    @Override
    float Volume(){
        float Volume = 4/3*pi*r*r;
        System.out.println("Volume Bola : "+ Volume);
        return Volume;
    }
}
