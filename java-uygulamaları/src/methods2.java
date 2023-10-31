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
}
