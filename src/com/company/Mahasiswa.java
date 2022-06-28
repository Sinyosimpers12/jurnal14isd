package com.company;

public class Mahasiswa {
    public String Nim;
    public String Kelas;
    public String Nama;

    public Mahasiswa(String nim, String kelas, String nama) {
        Nim = nim;
        Kelas = kelas;
        Nama = nama;
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 29;
        int h1 = Nim.hashCode();
        int h2 = Nama.hashCode();
        int h = HASH_MULTIPLIER * h1 + h2;
        return h;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) obj;
        return Nim.equals(other.Nim) && Nama.equals(other.Nama);
    }



    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nim='" + Nim + '\'' +
                ", Kelas='" + Kelas + '\'' +
                ", Nama='" + Nama + '\'' +
                '}';
    }
}
