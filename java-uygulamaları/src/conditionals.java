public class conditionals {
    
    public static void main(String[] args){
        int sayi = 20;
        if(sayi<20){
            System.out.println("Sayı 20'den küçüktür.");
        }
        else if(sayi == 20){
            System.out.println("Sayı 20'ye eşittir.");
        }
        else {
            System.out.println("Sayı 20'den büyüktür.");
        }

        // ufak bir program recapdemo1
        int sayi1 = 15;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı: "+enBuyuk);  

      
        //Switch Case
        char grade = 'A';

        switch(grade){
            case 'A':
                System.out.println("Mükemmel: Geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel: Geçtiniz.");    
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz.");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz.");        
            }   
            

    }
}
