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
public class Masyarakat implements Admin{

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();

    public Masyarakat() {
        namaMasyarakat.add("Ale");
        Alamat.add("Malang");
        Telepon.add("081234209724");

        namaMasyarakat.add("Daniel");
        Alamat.add("Surabaya");
        Telepon.add("083234209725");

        namaMasyarakat.add("Dino");
        Alamat.add("Jakarta");
        Telepon.add("082237209720");
    }

    @Override
    public void setNama(String Nama) {
        this.namaMasyarakat.add(Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        this.Alamat.add(Alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        this.Telepon.add(Telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.Alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.Telepon.get(id);
    }
    
    public void showMasyarakat(){
        int n = namaMasyarakat.size();
        for(int i = 0; i < n; i++){
            System.out.println("========================");
            System.out.println("Nama\t : " + getNama(i));
            System.out.println("Alamat\t : " +getAlamat(i));
            System.out.println("Telepon\t : " +getTelepon(i));
        }
    }
}

