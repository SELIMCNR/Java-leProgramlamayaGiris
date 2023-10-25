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

    }
}
