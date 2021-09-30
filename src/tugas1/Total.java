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
public class Total {
     public Makanan getMakanan(String namaProduk,int jmlProduk) {
         
        if (namaProduk == null) {
            return null;
        }
        if (namaProduk.equalsIgnoreCase("NASIOPOR")) {
            return new NasiOpor(jmlProduk);
        } else if (namaProduk.equalsIgnoreCase("NASILANGGI")) {
            return new NasiLanggi(jmlProduk);
        } else if (namaProduk.equalsIgnoreCase("LONTONGOPOR")) {
            return new LontongOpor(jmlProduk);
        }
        return null;
    }
    public Minuman getMinuman(String namaProduk,int jmlProduk) {
         
        if (namaProduk == null) {
            return null;
        }
        if (namaProduk.equalsIgnoreCase("ESTEH")) {
            return new EsTeh(jmlProduk);
        } else if (namaProduk.equalsIgnoreCase("ESJERUK")) {
            return new EsJeruk(jmlProduk);
        } 
        return null;
    }
}
