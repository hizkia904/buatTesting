/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 *
 * @author  6181901017 - 6181901041 - 6181901075
 */

public class RPL3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //jadwal suatu mata kuliah
        System.out.println("Masukkan nama matakuliah");
        String namaMatkul = sc.nextLine();
        System.out.println("Masukkan jadwal mulai matakuliah " + namaMatkul);
        int jamMulaiMatakuliah = sc.nextInt();
        System.out.println("Masukkan jadwal selesai matakuliah " + namaMatkul);
        int jamSelesaiMataKuliah = sc.nextInt();
        int mulai = jamMulaiMatakuliah - 7;
        int selesai = jamSelesaiMataKuliah - 7;
        int[] jadwalASD = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = mulai; i <= selesai; i++) {
            jadwalASD[i] = 1;
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(jadwalASD[i]);
        }
        System.out.println("");
       
        //masukkan nilai suatu matakuliah
        System.out.println("Masukkan nilai matakuliah " + namaMatkul);
        String nilai = sc.next();
        
        
        //jadwal calon asisten dosen
        System.out.println("Masukkan jadwal anda");
        int[] jadwalCalonASDOS = new int[12];
        for (int i = 0; i < 12; i++) {
            jadwalCalonASDOS[i] = sc.nextInt();
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(jadwalCalonASDOS[i]);
        }
        System.out.println("");
        
        //cek jadwal
        int[] banding = new int[12];
        for (int i = 0; i < 12; i++) {
            banding[i] = jadwalASD[i] + jadwalCalonASDOS[i];
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(banding[i]);
        }

        boolean result1 = true;
        for (int i = mulai; i <= selesai; i++) {
            if (jadwalASD[i] == banding[i]) {
                result1 = true;
            } else {
                result1 = false;
            }
        }
        System.out.println();
        if(result1){
            System.out.println("Jadwal tidak bentrok");
        }
        else{
            System.out.println("Bentrok");
        }
        
        //cek nilai  
        boolean result2 = true;
        if(nilai.equals("A") || nilai.equals("A-") || nilai.equals("B+") || nilai.equals("B") || nilai.equals("B-")){
            System.out.print("Nilai masuk kedalam kriteria");
            result2 = true;
        }
        else {
            System.out.print("Nilai tidak masuk kedalam kriteria");
            result2 = false;
        }
        
        System.out.println();
        if(result1 && result2){
            System.out.print("Cocok menjadi asisten dosen " + namaMatkul);
        }
        else{
            System.out.print("Tidak cocok menjadi asisten dosen " + namaMatkul);
        }
    }
}

//7 9
//1 1 1 1 1 1 1 1 1 1 1 1
// 0 0 0 0 0 0 0 0 0 0 0 0 

//0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0
//0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0
//dicek si matkul nya di jam berapa yaitu di index berapa = index 3 4 5
//
//kalo index 1 2 3 sama ya yaudah bisa

