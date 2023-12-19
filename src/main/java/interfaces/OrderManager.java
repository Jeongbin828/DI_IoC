package interfaces;

public class OrderManager {
//    private HyundaiMaker hyundaiMaker;
    private KiaMaker maker;

    public OrderManager(){
//        this.hyundaiMaker = new HyundaiMaker();
        this.maker = new KiaMaker();
    }

    public void order(int cost){
        Money money = new Money(cost);
        Car car = maker.sell(money);
        System.out.println("판매상(인수) : " + car.getName());
    }
}
