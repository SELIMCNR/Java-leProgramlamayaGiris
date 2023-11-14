public class classTimeProductManager {
    public void Add(classTimeProduct product){

        System.out.println("Ürün eklendi. " + product.getName());
    }

    public void Add2(int id,String name,String description,int stockAmount,double price){
        
    }

    //Method overloading
    public int Topla(int number1,int number2){
        return number1 + number2;
    }
    public int Topla(int number1,int number2,int number3){
        return number1 + number2 + number3;
    }
    public int Topla(int number1,int number2,int number3,int number4){
        return number1 + number2 + number3 + number4;
    }
}
