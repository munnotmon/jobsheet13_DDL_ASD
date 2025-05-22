package DLL;

import java.util.Scanner;

public class Mahasiswa12 {
    public String nim, nama, kelas; 
    public double ipk;

    public Mahasiswa12(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Kelas: " + kelas + ", IPK " + ipk);
    }

    public static Mahasiswa12 inputMahasiswa12(Scanner scan12) {
        System.out.print("Masukkan NIM     : ");
        String nim = scan12.nextLine();
        
        System.out.print("Masukkan Nama    : ");
        String nama = scan12.nextLine();
        
        System.out.print("Masukkan Kelas   : ");
        String kelas = scan12.nextLine();
        
        System.out.print("Masukkan IPK     : ");
        double ipk = scan12.nextDouble();
        
        scan12.nextLine(); 
        return new Mahasiswa12(nim, nama, kelas, ipk);
    }
}


