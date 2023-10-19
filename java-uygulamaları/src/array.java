public class array {
    
    public static void main(String[] args){
    
        String mesaj = "Öğrenci adı";
        String[] öğrenciler = new String[4];
        öğrenciler[0] = "Engin";
        öğrenciler[1] = "Derin";
        öğrenciler[2] = "Yusuf";
        öğrenciler[3] = "İbrahim";

        for (int i = 0;i<öğrenciler.length;i++){
            System.out.println(mesaj+öğrenciler[i]+".");
        }

        for (String öğrenci: öğrenciler){
            System.out.println(mesaj+öğrenci+".");
        }

        //recap demo enbüyük sayı ve toplam bulma
        double[] myList = {6.2,7.3,15.4,0.5};
        double total = 0;
        double max = myList[0];
        for (double number: myList){
            if (max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: "+total);
        System.out.println("En büyük sayı: "+max);

        //2 boyutlu diziler
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kırıkkale";
        sehirler[2][0] = "İzmir";
        sehirler[2][1] = "Muğla";
        sehirler[2][2] = "Manisa";

       for (int i = 0;i<=2;i++){
            System.out.println("--------------------");
            for (int j = 0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
        String[][][] nesneler = new String[3][3][3];
        nesneler[0][0][0] = "A nesnesi";
        nesneler[0][0][1] = "B nesnesi";
        nesneler[0][0][2] = "C nesnesi";
        nesneler[0][1][0] = "D nesnesi";
        nesneler[0][1][1] = "E nesnesi";
        nesneler[0][1][2] = "F nesnesi";
        nesneler[0][2][0] = "F nesnesi";
        nesneler[0][2][1] = "F nesnesi";
        nesneler[0][2][2] = "F nesnesi";
        nesneler[1][0][0] =  "G nesnesi";
        nesneler[1][0][1] = "H nesnesi";
        nesneler[1][0][2] = "I nesnesi";
        nesneler[1][1][0] = "J nesnesi";
        nesneler[1][1][1] = "K nesnesi";
        nesneler[1][1][2] = "L nesnesi";
        nesneler[1][2][0] = "M nesnesi";
        nesneler[1][2][1] = "N nesnesi";
        nesneler[1][2][2] = "O nesnesi";
        nesneler[2][0][0] = "P nesnesi";
        nesneler[2][0][1] = "R nesnesi";
        nesneler[2][0][2] = "S nesnesi";
        nesneler[2][1][0] = "T nesnesi";
        nesneler[2][1][1] = "U nesnesi";
        nesneler[2][1][2] = "V nesnesi";
        nesneler[2][2][0] = "Y nesnesi";
        nesneler[2][2][1] = "Z nesnesi";
        nesneler[2][2][2] = "X nesnesi";

        for (int i = 0;i<=2 ;i++){
            for(int j = 0;j<=2;j++){
                for(int k = 0;k<=2;k++){
                    System.out.println(nesneler[i][j][k]);
                }
            }   
        }
        
    }
}
