package DLL;

import java.util.Scanner;
    public class DLLMain12 {
        public static void main(String[] args) {
            DoubleLinkedList12 list = new DoubleLinkedList12();
            Scanner scan12 = new Scanner(System.in);
            int pilihan;

            do { 
                System.out.println("\nMenu Double Linked List Mahasiswa");
                System.out.println("1. Tambah di awal");
                System.out.println("2. Tambah di akhir");
                System.out.println("3. Hapus di awal");
                System.out.println("4. Hapus di akhir");
                System.out.println("5. Tampilkan data");
                System.out.println("6. Cari mahasiswa berdasarkan NIM");
                System.out.println("0. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scan12.nextInt();
                scan12.nextLine();
    
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa12 mhs = Mahasiswa12.inputMahasiswa12(scan12);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa12 mhs = Mahasiswa12.inputMahasiswa12(scan12);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan12.nextLine();
                    Node12 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak Ditemukan.");
                    }
                }
                case 0 -> System.out.println("Keluar dari Program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}