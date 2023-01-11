package hello.core.singleton;

public class StatefulService {
    private int price;  //상태를 유지하는 필드(상태가 없는 형태로 바꿔야 함)

    public void order(String name, int price){
        System.out.println("name ="+ name + "price ="+ price);
        this.price = price; //여기가 문제
    }

    public int getPrice(){
        return price;
    }
}
