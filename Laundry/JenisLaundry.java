/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Laundry;

import java.util.ArrayList;

/**
 *
 * @author agasy
 */
public class JenisLaundry {

    private ArrayList<String> namaJenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        setNamaJenisLaundry("Cuci Reguler");
        setDurasi(3);
        setHarga(5000);

        setNamaJenisLaundry("Cuci Dry Clean");
        setDurasi(2);
        setHarga(10000);

        setNamaJenisLaundry("Cuci Express");
        setDurasi(1);
        setHarga(15000);
    }

    public int getJmlJenisLaundry() {
        return this.namaJenisLaundry.size();
    }

    public void setNamaJenisLaundry(String namaJenisLaundry) {
        this.namaJenisLaundry.add(namaJenisLaundry);
    }

    public String getNamaJenisLaundry(int idJenisLaundry) {
        return this.namaJenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getDurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }

    public void editDurasi(int idJenisLaundry, int durasi) {
        this.durasi.set(idJenisLaundry, durasi);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idJenisLaundry) {
        return this.harga.get(idJenisLaundry);
    }
}
