/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Laundry;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agasy
 */
public class Transaksi {

    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenisLaundry) {
        boolean program = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat Datang Di Laundry Selalu Satset");
        System.out.print("Masukkan ID Client : ");
        int idClient = in.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient - 1));

        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan ID jenis laundry (masukkan kode 0 untuk berhenti):");
            temp = in.nextInt();
            if (temp != 0) {
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getNamaJenisLaundry(temp - 1) + " sebanyak(kg) : ");
                banyak.add(in.nextInt());
                i++;

                System.out.println("\nTransaksi belanja " + client.getNama(idClient - 1) + " sebagai berikut");
                System.out.println("Jenis Laundry\t|Banyak(kg)\t|Harga\t\t|Jumlah");

                int total = 0;
                int x = idJenisLaundry.size();
                for (int j = 0; j < x; j++) {
                    int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
                    total += jumlah;
                    System.out.println(jenisLaundry.getNamaJenisLaundry(idJenisLaundry.get(j)) + "\t|"
                            + banyak.get(j) + "\t" + "\t|"
                            + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t|"
                            + jumlah);
                    transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),
                            banyak.get(j));
                }

                System.out.println("\nTotal Laundry : " + total);
                if (total > client.getSaldo(idClient-1)) {
                    System.out.println("Maaf Saldo anda tidak mencukupi");
                    System.out.println("Silahkan Isi Saldo Sebesar ");
                    System.out.println(total - client.getSaldo(idClient-1));
                    
                    System.exit(0);
                }
                client.editSaldo(idClient, client.getSaldo(idClient-1) - total);
                System.out.println("Sisa Saldo " + client.getNama(idClient-1) + " = " + client.getSaldo(idClient));
            }
        } while (program = false);
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }

    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}
