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
public class Barang extends Lelang{

    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        
        this.namaBarang.add("Aerox 2022");
        this.hargaAwal.add(19);
        this.status.add(true);

        this.namaBarang.add("iPhone 14 Pro");
        this.hargaAwal.add(24);
        this.status.add(true);

        this.namaBarang.add("MacBook Pro");
        this.hargaAwal.add(20);
        this.status.add(true);
    }
    public void discontinue(int id) {
        this.namaBarang.remove(id);
        this.hargaAwal.remove(id);
        this.status.remove(id);
    }

    public void setNamaBarang(String Barang) {
        namaBarang.add(Barang);
    }

    public String getNamaBarang(int id) {
        return namaBarang.get(id);
    }

    public void setstatus( boolean status) {
        this.status.add(status);
    }

    public boolean getstatus(int Id) {
        return status.get(Id);
    }

    public void setHargaAwal(int hargaHarga) {
        hargaAwal.add(hargaHarga);
    }

    public int getHargaAwal(int Id) {
        return hargaAwal.get(Id);
    }
    
    public void gantiHarga(int id, int harga) {
        hargaAwal.set(id, harga);
    }
    
    public int getJumlahBrg() {
        return namaBarang.size();
    }
    
    public String toString() {
        int n = namaBarang.size();
        for (int i = 0; i < n; i++) {
            System.out.println("==========================");
            System.out.println("ID Barang\t : " + (i+1));
            System.out.println("Nama Barang\t : " + getNamaBarang(i));
            System.out.println("Harga Awal\t : " + getHargaAwal(i));
            System.out.println("status\t\t : " + getstatus(i));     
        }
        return null;
    }
}
