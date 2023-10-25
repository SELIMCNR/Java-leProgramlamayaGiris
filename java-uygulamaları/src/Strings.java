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

        
    }
    
}
