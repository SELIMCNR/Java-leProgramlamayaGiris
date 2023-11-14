public class methods {
    public static void main(String[]args)
{
sayiBulmaca();
mesajVer("Hello world");
System.out.println("Sayılar ortalaması : "+Ortalama(30,450,57));

System.out.println("Cevap dogrumu : "+dogrumu("true")); 
System.out.println("Bölme işlemi : "+divide(10,2));

}

public static void sayiBulmaca(){
System.out.println("sayı bulunur");
}

public static void mesajVer(String mesaj){
    System.out.println(mesaj);
}

public static int Ortalama(int s1 , int s2 , int s3){
  return (s1+s2+s3)/3;
}

public static String dogrumu(String dogrumu){
    if(dogrumu=="true"){
        System.out.println("Doğru");
    }
    else{
        System.out.println("Yanlış");
    }
    return dogrumu;

  }
public static float divide (float a , float b){
    return a/b;
}
}

