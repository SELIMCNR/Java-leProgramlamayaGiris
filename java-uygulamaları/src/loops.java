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

    
     }
}

