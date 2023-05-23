/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UKL_PBO.Laundry;

/**
 *
 * @author agasy
 */
public interface User {
    
    void setNama(String nama);
    void setAlamat(String alamat);
    void setTelepon(String telepon);
    
    String getNama(int id);
    String getAlamat(int id);
    String getTelepon(int id);
}
