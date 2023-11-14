import java.util.Random;

public class methods2 {
    public static void main(String[] args){
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        add();
        delete();
        update();
        System.out.println("Değer döndüren metod"+sum(50,25));
        System.out.println("Sehir ver"+sehirVer());
        int toplam = sums2(1,2,3,4,5);
        System.out.println("Değer dönüren args dizi metot"+toplam);
        System.out.println("Harfler : "+harf('a','b','c','d','e'));

        rastgeleSayi(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
    }

    public static void add(){
        System.out.println("Added. Değer döndürmeyen metod.");
    }
    public static void delete(){
        System.out.println("Deleted. Değer döndürmeyen metod");
    }
    public static void update(){
        System.out.println("Updated.Değer döndürmeyen metod");
    }

    public static int sum (int sayi1,int sayi2){
        return 15+8 ;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    public static int sums2(int... sayilar){
        int toplam =0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static char harf(char...harfler){
        char grade=' ';
        for (char c : harfler) {
           grade = c;
        }
        return grade;
  
    }

    public static void rastgeleSayi (int...sayilar){
        Random rd = new Random();
       
        for (int i : sayilar) {
            int rastgeleSayi ;
            rastgeleSayi = rd.nextInt(i);
            System.out.println("Rastgele sayi : "+rastgeleSayi);
        }
      
    }
}
