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
                System.out.println("6. Tambah data setelah NIM tertentu");
                System.out.println("7. Cari mahasiswa berdasarkan NIM");
                System.out.println("8. Tambah di indeks tertentu");
                System.out.println("9. Hapus setelah NIM tertentu");
                System.out.println("10. Hapus pada indeks tertentu");
                System.out.println("11. Tampilkan data pada indeks tertentu");
                System.out.println("12. Tampilkan data pertama dan terakhir");
                System.out.println("13. Tampilkan jumlah data");
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
                    System.out.print("Masukkan NIM yang ingin disisipkan setelahnya: ");
                    String keyNim = scan12.nextLine();
                    Mahasiswa12 mhs = Mahasiswa12.inputMahasiswa12(scan12);
                    list.insertAfter(keyNim, mhs);
                }
                case 7 -> {
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
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan12.nextInt(); scan12.nextLine();
                    Mahasiswa12 mhs = Mahasiswa12.inputMahasiswa12(scan12);
                    list.add(idx, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = scan12.nextLine();
                    list.removeAfter(nim);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int idx = scan12.nextInt(); scan12.nextLine();
                    list.remove(idx);
                }
                case 11 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = scan12.nextInt(); scan12.nextLine();
                    list.getIndex(idx);
                }
                case 12 -> {
                    list.getFirst();
                    list.getLast();
                }
                case 13 -> {
                    System.out.println("Jumlah data saat ini: " + list.size());
                }                
                case 0 -> System.out.println("Keluar dari Program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}