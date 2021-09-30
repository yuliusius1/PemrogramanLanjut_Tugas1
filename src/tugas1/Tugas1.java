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
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalHarga = 0;
        String[] namaMakanan = {"NASIOPOR","NASILANGGI","LONTONGOPOR"};
        int[] jmlMakanan = {5,3,8};
        String[] namaMinuman = {"ESTEH","ESJERUK"};
        int[] jmlMinuman = {2,3};
        Total total = new Total();
        for(int i = 0;i<namaMakanan.length;i++){
            Makanan makanan = total.getMakanan(namaMakanan[i],jmlMakanan[i]);
            System.out.println(jmlMakanan[i] + " " + makanan.getNama()+ " \t\t= Rp." +makanan.getHarga());
            totalHarga += makanan.getHarga();
        }
        
        for(int i = 0;i<namaMinuman.length;i++){
            Minuman minuman = total.getMinuman(namaMinuman[i],jmlMinuman[i]);
            System.out.println(jmlMinuman[i]+" " + minuman.getNama()+ "\t\t= Rp." +minuman.getHarga());
            totalHarga += minuman.getHarga();
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Harga \t\t= Rp." + totalHarga);

    }
    
}
