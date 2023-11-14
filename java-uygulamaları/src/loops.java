public class loops {

    public static void main(String[] args )
    {
        //for döngüsü
        for(int i = 0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("Döngü bitti.");
   
    
    int i2 = 0;
    //while döngüsü
    while(i2<10){
        System.out.println(i2);
        i2+=2;
    }
    System.out.println("While döngüsü bitti");
    //do-while döngüsü
    do {
        System.out.println(i2);
        i2+=2;
    }while(i2<10);
    System.out.println("Do-While döngüsü bitti");

    var sayi = 100;
    for (int i = 1;i<sayi;i++){
      if(i%2==0){
        System.out.println("Çift : "+i);
        if(i%3==0){
        System.out.println("3'ün katı : "+i);
      }
      else if(i%5==0){
        System.out.println("5'in katı : "+i);
      }
      else if(i%7==0){
        System.out.println("7'nin katı : "+i);
      }
      else if(i %10 == 0){
        System.out.println("10 un katı : "+i);	
      }
      }
      else if(i%2==1){
        System.out.println("Tek : "+i);
     if(i%3==0){
        System.out.println("3'ün katı : "+i);
      }
      else if(i%5==0){
        System.out.println("5'in katı : "+i);
      }
      else if(i%7==0){
        System.out.println("7'nin katı : "+i);
      }
      else if(i %10 == 0){
        System.out.println("10 un katı : "+i);	
      }
      }
     
      else{
        System.out.println("Sayı : "+i);
      }
    
     }

     char harf = 'A';

    for(char a='Z'; harf<=a;harf++){
     if(harf =='A'){
      System.out.println("A harfi");
     }
     else if(harf =='B'){
      System.out.println("B harfi");
     }
     else if(harf =='C'){
      System.out.println("C harfi");
     }
    }

    int fiyat =0;
    for (fiyat=1;fiyat<100;fiyat++){
       if(fiyat <25 || fiyat<50){
          System.out.println("İndirimli fiyat: "+fiyat*0.2);
       }
       else if(fiyat>50 || fiyat<100){
        System.out.println("İndirimli fiyat: "+fiyat*0.5);
       }
    }

    int dogru =0;
    int yanlis = 0;
    int ortalama = 0;
    int sorusayısı = 0;
    String cevapA = "A";
    String cevapB = "B";
    String cevapC = "C";
    String cevapD = "D";
    String cevap1 ="A";

    for(sorusayısı=0;sorusayısı<4;sorusayısı++){
      if(sorusayısı==1){
        System.out.println("Soru 1 : A");
        if(cevap1 == cevapA){
          dogru++;
        }
        else if(cevap1 == cevapB || cevap1 == cevapC || cevap1 == cevapD){
          yanlis++;
        }
        else{
          System.out.println("Soru 1 : "+cevap1);
        }
      }
      else if(sorusayısı==2){
        cevap1="B";
        System.out.println("Soru 2 : B");
        if(cevap1 == cevapB){
          dogru++;
        }
        else if(cevap1 == cevapA || cevap1 == cevapC || cevap1 == cevapD){
          yanlis++;
        }
        else{
          System.out.println("Soru 1 : "+cevap1);
        }
      }
 else if(sorusayısı==3){
        cevap1="C";
        System.out.println("Soru 2 : C");
        if(cevap1 == cevapC){
          dogru++;
        }
        else if(cevap1 == cevapB || cevap1 == cevapC || cevap1 == cevapD){
          yanlis++;
        }
        else{
          System.out.println("Soru 1 : "+cevap1);
        }
      }

      else{
        System.out.println("Soru sayısı : "+sorusayısı);
      }
      System.out.println("Doğru sayısı : "+dogru);
      System.out.println("Yanlış sayısı : "+yanlis);
      ortalama = dogru-yanlis;
      System.out.println("Ortalama : "+ortalama*100/3);
    }

}
}
