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
public class NasiOpor implements Makanan{
    private int jumlah;
    int harga = 13000;
    public NasiOpor(int i){
        jumlah=i*harga;
    }
    @Override
    public int getHarga(){
        return jumlah;
    }
    
    
    public String getNama(){
        return "Nasi Opor";
    }
}
