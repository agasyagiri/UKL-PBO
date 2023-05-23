/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Laundry;

/**
 *
 * @author agasy
 */
public class MainLaundry {

    public static void main(String[] args) {
        JenisLaundry jenisLaundry = new JenisLaundry();
        Client client = new Client();
        Petugas penjagaToko = new Petugas();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        laporan.laporan(client);
        laporan.laporan(jenisLaundry);
        transaksi.prosesTransaksi(client, transaksi, jenisLaundry);
    }
}
