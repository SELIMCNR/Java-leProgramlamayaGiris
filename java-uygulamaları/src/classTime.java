public class classTime {

    public static void main(String[] args){
        //Referans değer tipler
        //değer tipler stackde depolanır heaple işi yoktur
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        System.out.println(sayi2);

        //referans tipler stackde depolanır heapde adreslenir
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        System.out.println(sayilar2[0]);


        //Classtan nesne üretildi class stackde depolanır ve heapde adreslenir
        classTimeCustomerManager cm = new classTimeCustomerManager();
        classTimeCustomerManager cm2 = new classTimeCustomerManager();
        cm = cm2; // cm2 nin referansını cm ye atadık
        cm.Add(); // nesneler classın içinde metotları çağırıyor
        cm.Update();
        cm.Remove();    
        cm2.Add();


        //Class dörtişlem uygulaması
        classTimeDortislem dortislem = new classTimeDortislem();
       var result= dortislem.Topla(1,2);
       result= dortislem.Cikar(8,2);
       result= dortislem.Bol(8, 4);
       result= dortislem.Carp(2, 3);
       System.out.println(result);

       //Field alan ve özellikler
         classTimeProduct product = new classTimeProduct(2,"Laptop","Asus Laptop",3000,2,"Siyah","Kod1234");
         product.setName("Laptop");
         product.setId(5);
         product.setDescription("Vestel Laptop");
         product.setPrice(5000);
         product.setStockAmount(3);
         System.out.println(product.getName());  
         System.out.println(product.getPrice()); 
         System.out.println(product.getKod());   
         
         //productmanagere ürün ekledik farklı clasdan
            classTimeProductManager productManager = new classTimeProductManager();
            productManager.Add(product);

        //Method overloading    
       var sonuc= productManager.Topla(2, 3);
        sonuc=productManager.Topla(2, 3, 4);
        sonuc=productManager.Topla(2, 3, 4, 5);
        System.out.println(sonuc);
    }
    
}

