/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Ini Tylius ad
 */
public class EsJeruk implements Minuman{
    private int jumlah;
    int harga = 4000;
    public EsJeruk(int i){
        jumlah=i*harga;
    }
    @Override
    public int getHarga(){
        return jumlah;
    }
    public String getNama(){
        return "Es Jeruk";
    }
}
