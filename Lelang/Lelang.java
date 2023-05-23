/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Lelang;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agasy
 */
public class Lelang {

    Scanner input = new Scanner(System.in);

    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    ;
    public void setIdPenawar(int id) {
        this.idPenawar.add(id);
    }

    public void setIdBarang(int id) {
        this.idBarang.add(id);
    }

    public void setHargaTawar(int harga) {
        this.hargaTawar.add(harga);
    }
}
