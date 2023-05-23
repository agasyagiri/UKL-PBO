/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Laundry;

/**
 *
 * @author agasy
 */ 
public class Laporan {

    public void laporan(Petugas petugas) {
        System.out.println("----------------------");
        System.out.println("Nama Petugas : " + petugas.getNama(0));
        System.out.println("Alamat : " + petugas.getAlamat(0));
        System.out.println("Telp : " + petugas.getTelepon(0));
        String jabatan = (petugas.getJabatan(0) == 0) ? "Owner" : "Pegawai";
        System.out.println("Status : " + jabatan);
        System.out.println("----------------------");
    }

    public void laporan(JenisLaundry jenisLaundry) {
        int x = jenisLaundry.getJmlJenisLaundry();

        System.out.println("\tJenis Laundry");
        System.out.println("----------------------");
        System.out.println("ID \t|Nama Jenis Laundry \t|Durasi(hr) \t|Harga/kg");
        for (int i = 0; i < x; i++) {
            System.out.println(i+1 + "\t|" + jenisLaundry.getNamaJenisLaundry(i) + "\t\t|"
                    + jenisLaundry.getDurasi(i) + "hr" + "\t\t|" + jenisLaundry.getHarga(i) + "/kg");
        }
        System.out.println("----------------------\n");
    }

    public void laporan(Client client) {
        int x = client.getJmlClient();

        System.out.println("\tData Client");
        System.out.println("----------------------");
        System.out.println("ID \t|Nama \t|Alamat\t\t   |Telepon \t| Saldo ");

        for (int i = 0; i < x; i++) {
            System.out.println(i+1 + "\t|" + client.getNama(i) + "\t|" + client.getAlamat(i) + "\t   |" + client.getTelepon(i) + "\t |" + client.getSaldo(i));
        }
        System.out.println("----------------------\n");
    }
}
