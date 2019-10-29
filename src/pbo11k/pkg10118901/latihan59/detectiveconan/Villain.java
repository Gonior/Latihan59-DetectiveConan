/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan59.detectiveconan;
/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * Kelas        : PBO11K
 * NIM          : 10118901
 * Deskripsi Program : Explorasi anime detective conan dengan konsep overloading dan pewarisan
 * 
 */
public class Villain extends Role{

    @Override
    public void role() {
        System.out.println(getNama() + " adalah seorang penjahat");
    }
    
    public void tindakKejahatan(String jahat) {
        System.out.println(getNama()+" pernah melakukan "+jahat);
    }
    
}
