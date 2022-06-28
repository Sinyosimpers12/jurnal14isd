package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    Map<Mahasiswa, Integer> mapMahasiswa = new HashMap<Mahasiswa, Integer>();

        Mahasiswa mahasiswa1 = new Mahasiswa("12313123", "4501", "ihsan");
        Mahasiswa mahasiswa2 = new Mahasiswa("3242234", "4501", "falaq");
        mapMahasiswa.put(mahasiswa1, 90);
        mapMahasiswa.put(mahasiswa2, 60);

        boolean cek = true;
        while (cek){
            int selectMenu = menu();
            switch (selectMenu){
                case 1:
                    tambahMahasiswa(mapMahasiswa);
                    break;
                case 2:
                    removeMahasiswa(mapMahasiswa);
                    break;
                case 3:
                    lihatNilai(mapMahasiswa);
                    break;
                case 4:
                    cek = false;
                    break;
            }
        }
    }

    public static int menu(){
        System.out.println("Silahkan pilih menu berikut ini");
        System.out.println("1. Tambah data mahasiswa");
        System.out.println("2. Hapus data mahasiswa");
        System.out.println("3. Tampilkan nilai dan nilai semua mahasiswa");
        System.out.println("4. Keluar Aplikasi");
        return scanner.nextInt();
    }

    public static void tambahMahasiswa(Map mapMahasiswa){
        System.out.println("Masukan Nim");
        scanner.nextLine();
        String nim = scanner.nextLine();
        System.out.println("Masukan Kelas");
        String kelas = scanner.nextLine();
        System.out.println("Masukan nama");
        String nama = scanner.nextLine();

        System.out.println("Masukan Nilai");
        int nilai = scanner.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(nim,kelas, nama);
        mapMahasiswa.put(mahasiswa, nilai);
    }

    public static void removeMahasiswa(Map<Mahasiswa, Integer> mapMahasiswa){
        System.out.println("masukan nim :");
        scanner.nextLine();
        String nim = scanner.nextLine();

        Set<Mahasiswa> keySet = mapMahasiswa.keySet();
        for (Mahasiswa key : keySet)
        {
            if(key.Nim.equals(nim)){
                mapMahasiswa.remove(key);
            }
        }
    }

    public static void lihatNilai(Map<Mahasiswa, Integer> mapMahasiswa){
        int semuaNilai = 0;
        Set<Mahasiswa> keySet = mapMahasiswa.keySet();
        for (Mahasiswa key : keySet)
        {
            int value = mapMahasiswa.get(key);
            System.out.println(key + " : " + value);
            semuaNilai += value;
        }
        int rataRata = semuaNilai / mapMahasiswa.size();
        System.out.println("Jumlah nilai adalah : " + semuaNilai);
        System.out.println("Nilai rata rata semua nilai adalah : " + rataRata);
    }
}
