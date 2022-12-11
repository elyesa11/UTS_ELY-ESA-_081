/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_81;

/**
 *
 * @author ASUS
 */
public class UTS_no2_81 {

    public static void main(String[] args) {
        commissionEmployee c1 = new commissionEmployee(200000,30000,5,"ely","88E8SF6A8");
        projectPlanner p1 = new projectPlanner(300000,20000,6,"esa","A9SF6A78");
        salariedEmployee s1 = new salariedEmployee(100000,"Primita","ASPR869S");
        
        System.out.println("DATA COMMISION EMPLOYEE");
        c1.tampilData();
        c1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA PROJECT PLANNER");
        p1.tampilData();
        p1.hitungGaji();
        
        System.out.println();
        
        System.out.println("DATA SALARIED EMPLOYEE");
        s1.tampilData();
        s1.hitungGaji();
        
    }

}
    
