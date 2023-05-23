/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Lelang;

import java.util.ArrayList;

/**
 *
 * @author agasy
 */
public class Petugas implements Admin{

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    public Petugas() {
        namaPetugas.add("Adit");
        alamat.add("Ngantang");
        telepon.add("081642029852");
    }

    @Override
    public void setNama(String nama) {
        namaPetugas.add(nama);
    }
    
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return alamat.get(idPetugas);
    }

    @Override
    public String getTelepon(int idPetugas) {
        return telepon.get(idPetugas);
    }
    
    public void showPetugas() {
        int n = namaPetugas.size();
        for (int i = 0; i < n; i++) {
            System.out.println("=====================");
            System.out.println("Nama\t : " + getNama(i));
            System.out.println("Alamat\t : " + getAlamat(i));
            System.out.println("Telepon\t : " + getTelepon(i));
        }
    }
}
