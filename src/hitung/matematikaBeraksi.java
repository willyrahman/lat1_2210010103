
package hitung;


public class matematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        matematika1 willy = new matematika1(0,3);
        
        System.out.println("hasil penjumlahan"+willy.setPenjumlahan());
        System.out.println("hasil pengurangan"+willy.setPengurangan());
        System.out.println("hasil perkalian"+willy.setPerkalian());
        System.out.println("hasil pembagian"+willy.setPembagian());
    }
}
