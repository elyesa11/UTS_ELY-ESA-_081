/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class UTS_NO3 {

    public static void main(String[] args) {
      
        //Membuat object menggunakan array
        AsistenPraktikum_3081[] ap = new AsistenPraktikum_3081[1];
        StudentStaf_3081[] ss = new StudentStaf_3081[1];
        
        ap[0] = new AsistenPraktikum_3081();
        ss[0] = new StudentStaf_3081();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array asisten
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                ap[i].nim = br.readLine();
                System.out.print("Nama             : ");
                ap[i].nama = br.readLine();
                System.out.print("Jurusan          : ");
                ap[i].jurusan =br.readLine();
                System.out.print("IPK              : ");
                ap[i].ipk =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                ap[i].mkAsisten = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                ap[i].jumlahPertemuan = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data asisten praktikum
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3081 AP : ap){
                AP.tampilDataAsistenPraktikum();
                System.out.println("");
            }

            //mengisi data ke array pada data staff
            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                ss[i].nim = br.readLine();
                System.out.print("Nama        : ");
                ss[i].nama = br.readLine();
                System.out.print("Jurusan     : ");
                ss[i].jurusan =br.readLine();
                System.out.print("IPK         : ");
                ss[i].ipk =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                ss[i].unitKerja = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                ss[i].jamKerja = Integer.parseInt(br.readLine());
                System.out.println("Total Pendapatan : ");
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data staff
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaf_3081 SS : ss){
                SS.tampilDataStudentStaff();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
        
    }
}
