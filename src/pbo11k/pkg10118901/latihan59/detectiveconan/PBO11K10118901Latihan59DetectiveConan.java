
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
public class PBO11K10118901Latihan59DetectiveConan {

    public static void main(String[] args) {
        Detective conan = new Detective();
        conan.setNama("Shinichi Kudo");
        conan.setUmur(17);
        conan.setJenisKelamin("laki - laki");
        conan.tentang();
        conan.role();
        conan.kemampuanKhusus("selalu bisa menyelesaikan masalah yang sulit.\nSetelah menjadi Conan Edogawa dia selalu membantu detective Kogoro Mouri");
        System.out.println("");
        
        Sipil Chara = new Sipil();
        Chara.setNama("Ran Mouri");
        Chara.setUmur(17);
        Chara.setJenisKelamin("perempuan");
        Chara.tentang();
        Chara.role();
        Chara.hobi("Karate");
        System.out.println("");;    
        
        Villain villain = new Villain();
        villain.setNama("Vodka");
        villain.setUmur(30);
        villain.setJenisKelamin("laki - laki");
        villain.tentang();
        villain.role();
        villain.tindakKejahatan("Melakukan Pencurian");
        
    }
    
}
