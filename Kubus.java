/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangun_ruang_rework;

/**
 *
 * @author Sultan
 */
public class Kubus extends Bangun_Ruang_Rework{
    float s;
    @Override
    float Volume(){
        float Volume = s*s*s;
        System.out.println("Volume Kubus : "+ Volume);
        return Volume;
    }
}
