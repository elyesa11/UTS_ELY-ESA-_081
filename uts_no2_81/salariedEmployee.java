/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_81;

/**
 *
 * @author ASUS
 */
public class salariedEmployee extends employee{
    int upahMingguan;

    public salariedEmployee(int upahMingguan, String nama, String nip) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Upah Mingguan : " + upahMingguan);
        
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = upahMingguan;
        System.out.println("Gaji : " + hitungGaji);
    }

}

