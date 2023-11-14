public class Strings {
    public static void main(String[] args){

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Karakter sayısı: "+mesaj.length());
        System.out.println("5. karakter: "+mesaj.charAt(4));
        System.out.println(mesaj.concat("iyi "));
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));

        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(mesaj.indexOf('A'));
        System.out.println(mesaj.lastIndexOf('a'));

        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2, 5));

        for(String kelime: mesaj.split(" ")){
            System.out.println(kelime);
        }

        String takım = "Şampiyon Fenerbahçe";
        System.out.println(takım);
        if(takım.length()==takım.length()){
            System.out.println(takım.length());
        }
        else{
            System.out.println("Yanlış");
        }
        if(takım.charAt(4)=='i'){
            takım=takım.replace(" ","*");
            System.out.println(takım);
        }
        else if(takım.charAt(5)=='y'){
            takım=takım.substring(8,16);
            System.out.println(takım);
        }
        else if(takım.startsWith("Ş")){
            takım = String.valueOf(takım.lastIndexOf('e')) ;
            System.out.println(takım);
        }
        else if(takım.indexOf("F")==10){
            System.out.println(takım);
        }

        String mesaj2 = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam, quibusdam.";
        System.out.println(mesaj2.length());
        System.out.println(mesaj2.indexOf('a'));
        System.out.println(mesaj2.lastIndexOf('a'));
        System.out.println(mesaj2.substring(0, 10));
        System.out.println(mesaj2.replace(" ", "*"));
        System.out.println(mesaj2.concat("Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam, quibusdam."));
    
    }
    
}
