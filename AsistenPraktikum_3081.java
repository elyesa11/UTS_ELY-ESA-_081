/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3;

/**
 *
 * @author ASUS
 */
public class AsistenPraktikum_3081 extends Mahasiswa_3081{
    String mkAsisten;
int jumlahPertemuan;
    
public double totalPendapatan(){
return(jumlahPertemuan * 50000);
}
public void tampilDataAsistenPraktikum() {
super.tampilDataMhs();
System.out.println(" Mata Kuliah : " + mkAsisten);
System.out.println(" Jumlah Pertemuan : " + jumlahPertemuan);
System.out.println(" Total Pendapatan : " + totalPendapatan());
}
}
