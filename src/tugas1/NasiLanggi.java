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
public class NasiLanggi implements Makanan{
    private int jumlah;
    private int harga = 14000;
    public NasiLanggi(int hs){
        jumlah=hs*harga;
    }
    
    @Override
   
    
    public int getHarga(){
        return jumlah;
    }
    public String getNama(){
        return "Nasi Langgi";
    }
    
    
    
}
