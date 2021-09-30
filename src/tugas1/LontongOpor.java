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
public class LontongOpor implements Makanan{
    private int jumlah;
    int harga = 15000;
    public LontongOpor(int hs){
        jumlah=hs;
    }
    
    @Override
    public int getHarga(){
        return jumlah*harga;
    }
    
    public String getNama(){
        return "Lontong Opor";
    }
}
