import java.util.Scanner;

public class uygulama {

    public static void main(String[] args){
        // Asal sayı projesi
        int number = 25;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number<1){
            System.out.println("Geçersiz sayı");
            
        }
        if(number == 1){
            System.out.println("Sayı asal değildir.");
        }


        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Asal sayıdır.");                        
    }
        else{
            System.out.println("Asal sayı değildir.");
        }


        // Kalın ince sesli harfler

        char harf = 'I';

        switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    
        // Mükemmel sayı
        int number15 = 20;
        int total = 0;
        for(int i = 1; i < number15; i++){
            if(number15 % i == 0){
                total += i;
            }
        }
        if(total == number15){
            System.out.println("Mükemmel sayıdır.");
        }
        else{
            System.out.println("Mükemmel sayı değildir.");
        }       


        //Arkadaş sayılar
        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for(int i =1; i < number1; i++){
            if(number1 % i == 0){
                total1 += i;
            }
        }
        for(int i =1; i < number2; i++){
            if(number2 % i == 0){
                total2 += i;
            }
        }

        if(number1 == total2 && number2 == total1){
            System.out.println("Arkadaş sayıdır.");
        }
        else{
            System.out.println("Arkadaş sayı değildir.");
        }

        //Sayı bulma
        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 5;
        boolean isThere = false;
        for(int num : numbers ){
            if(num == search){
                isThere = true;
                break;
            }
        }
        if(isThere){
            System.out.println("Sayı mevcuttur.");
        }
        else{
            System.out.println("Sayı mevcut değildir.");
        }




        //HesapMakinesi dışardan değer girişli yada dizi de değer kullanarak hesaplama yapılabilir.
        int[] nums = new int[]{10,20,30,40,50};
        Scanner input = new Scanner(System.in);
         System.out.println("ilk sayısını giriniz : ");
        nums[0] = input.nextInt();
        System.out.println("ikinci sayısını giriniz : ");
        nums[1] = input.nextInt();
        char operation = '+';
        if(operation == '+'){
            int toplam = nums[0] + nums[1];
            System.out.println("Toplam : " + toplam);
        }
        if(operation == '-'){
            int fark = nums[0] - nums[1];
            System.out.println("Fark : " + fark);
        }
        if(operation == '*'){
            int carpim = nums[0] * nums[1];
            System.out.println("Çarpım : " + carpim);
        }
        if(operation == '/'){
            int bolum = nums[0] / nums[1];
            System.out.println("Bölüm : " + bolum);
        }
        
    }
}
