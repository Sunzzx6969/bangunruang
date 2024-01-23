/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangun_ruang_rework;

/**
 *
 * @author Sultan
 */
public class Limas extends Bangun_Ruang_Rework {
    float Lalas;
    float tinggi;
    @Override
    float Volume(){
        float Volume = Lalas*tinggi*1/3;
        System.out.println("Volume Limas : "+ Volume);
        return Volume;
    }
}
