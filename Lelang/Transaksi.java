/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Lelang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author agasy
 */
public class Transaksi {

    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();
    static Masyarakat m = new Masyarakat();
    static Petugas p = new Petugas();
    static Barang b = new Barang();
    static Lelang l = new Lelang();
    static Transaksi t = new Transaksi();
    static Scanner in = new Scanner(System.in);

    public static void showApp() {
        boolean program = true;

        System.out.println("=======SELAMAT DATANG========");
        System.out.print("Apakah anda memiliki akun? [y/n] ");
        String akun = in.next();
        if (akun.equalsIgnoreCase("y")) {
            login();
        } else if (akun.equalsIgnoreCase("n")) {
            signUp();
        } else {
            IncorrectAkun();
        }
        while (program) {
            System.out.println("======= MENU =======");
            System.out.println("1. Identitas Petugas");
            System.out.println("2. List pengikut Lelang");
            System.out.println("3. List Barang");
            System.out.println("4. Ikuti Lelang");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            int menu = in.nextInt();

            if (menu == 1) {
                p.showPetugas();
            } else if (menu == 2) {
                m.showMasyarakat();
            } else if (menu == 3) {
                b.toString();
            } else if (menu == 4) {
                t.prosesTransaksi(m, l, b, p);
            } else if (menu == 0) {
                System.out.println("=======TERIMA KASIH========");
                program = false;
            }
        }
    }

    public static void login() {
        System.out.print("ID anda : ");
        int id = in.nextInt();
        if (id > 1 || id < 3) {
            System.out.println("Halo, " + m.getNama(id - 1));
        } else if (id < 1 || id > 3) {
            System.out.println("YOUR ID IS NOT REGISTERED");
            login();
        }
    }

    public static void signUp() {
        System.out.println("Register");
        System.out.println("1. Petugas");
        System.out.println("2. User");
        System.out.print("Pilih role anda: ");
        int answer = in.nextInt();

        if (answer == 1) {
            //nama
            System.out.println("Nama anda : ");
            String nama = in.next();
            p.setNama(nama);
            //alamat
            System.out.println("Alamat : ");
            String alamat = in.next();
            p.setAlamat(alamat);
            //telp
            System.out.println("No. Telp : ");
            String telp = in.next();
            p.setTelepon(telp);

            System.out.println("Selamat, anda sudah terdaftar sebagai Petugas");

        } else if (answer == 2) {
            //nama
            System.out.print("Nama anda : ");
            String nama = in.next();
            m.setNama(nama);
            //alamat
            System.out.print("Alamat : ");
            String alamat = in.next();
            m.setAlamat(alamat);
            //telp
            System.out.print("No. Telp : ");
            String telp = in.next();
            m.setTelepon(telp);

            System.out.println("Selamat, anda sudah terdaftar sebagai user");

        }
    }

    public static void IncorrectAkun() {
        System.out.println("Incorrect type data entered!");
        System.out.print("Apakah anda memiliki akun? [y/n] ");
        String akun = in.next();
        if (akun.equalsIgnoreCase("y")) {
            login();
        } else if (akun.equalsIgnoreCase("n")) {
            signUp();
        } else {
            IncorrectAkun();
        }
    }

    public int prosesTransaksi(Masyarakat masyarakat, Lelang lelang, Barang barang, Petugas staf) {

        System.out.println("==================================");
        System.out.println("SELAMAT DATANG DI APLIKASI LELANG");
        System.out.println("==================================");

        int option = 0;
        Barang b = new Barang();

        System.out.println("Apakah anda yakin ingin meengikuti lelang?\n 1. YES\n 2. NO");
        System.out.print("Jawaban anda \t : ");
        option = in.nextInt();

        if (option == 1) {
            System.out.println("Daftar barang yang akan dilelang : ");
            for (int i = 0; i < b.getJumlahBrg(); i++) {
                System.out.println(i + 1 + "." + b.getNamaBarang(i));
            }
            System.out.print("Pilih barang \t: ");
            int idBarang = in.nextInt();

            System.out.println("Barang yang akan dilelang: " + barang.getNamaBarang(idBarang - 1));
            System.out.print("Apakah anda yakin [y][n] \t: ");
            String answer = in.next();
            System.out.println("==========================================");

            if (answer.equalsIgnoreCase("Y")) {
                barang.setstatus(true);
                System.out.println("Nama Barang \t: " + barang.getNamaBarang(idBarang - 1));
                System.out.println("Harga \t\t: " + barang.getHargaAwal(idBarang - 1));
                System.out.println("Barang boleh dilelang dengan maksimal 3x penawaran");

                int max = 0;

                do {
                    System.out.println("\n====================================");
                    System.out.print("ID Pelelang \t : ");
                    int id = in.nextInt();

                    if (id < 1 || id > 3) {
                        System.out.println("YOUR ID IS NOT REGISTERED");
                        System.out.println("Input ID");
                    } else {
                        System.out.println("Mulai Penawaran (Min. " + barang.getHargaAwal(idBarang - 1) + ")");
                        System.out.print("Tawaran Anda \t: ");
                        int tawar = in.nextInt();

                        if (tawar > barang.getHargaAwal(id - 1)) {
                            hargaTawar.add(tawar);
                            idPenawar.add(id - 1);
                        } else if (tawar < barang.getHargaAwal(id - 1)) {
                            System.out.println("TIDAK MEMENUHI HARGA TAWAR");
                            max--;
                        }
                        max++;
                    }
                } while (max != 3);
                if (max == 3) {
                    barang.setstatus(false);
                    int most = Collections.max(hargaTawar);
                    int index = hargaTawar.indexOf(most);
                    int win = idPenawar.get(index);

                    System.out.println(
                            "====================================\nPetugas Lelang \t\t: " + staf.getNama(0)
                            + "\nPemenang Lelang \t\t: " + masyarakat.getNama(win)
                            + "\nBarang yang dilelang \t: " + barang.getNamaBarang(idBarang - 1)
                            + "\nHarga Lelang Terjual\t: " + most
                            + "\nStatus Barang"
                            + "\n====================================");
                    //Pemenang
                    System.out.println("Selamat," + masyarakat.getNama(win) + " Memenang Lelang!");
                    System.out.print("Tekan Y Untuk Membeli Hasil Lelang : ");
                    String confirm = in.next();
                    if (confirm.equalsIgnoreCase("Y")) {
                        barang.discontinue(idBarang - 1);
                        System.out.println("""
                                           \n====================================
                                           TERIMAH KASIH TELAH MENGIKUTI LELANG
                                           ====================================""");
                        System.exit(0);
                    } else {
                        System.out.println("Barang kembali ke harga awal");
                    }
                }
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("CANCELLED");
            } else {
                System.out.println("ERROR \nWRONG INPUT \n");   
            }
        }
        return 0;
    }
}
