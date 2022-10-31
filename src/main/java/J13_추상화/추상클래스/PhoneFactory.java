package J13_추상화.추상클래스;

public class PhoneFactory extends Factory {
    //추상클래스는 다른 추상클래스와 함께 관계를 가지술 없다 / 1:N의 관계를 가진다,  N=N의 관계 x
    //인터페이스는 여러개를 구현가능
    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model){
        System.out.println("[ " + model + " ]" + "모델 스마트폰을 생산합니다. ");
    }

    @Override
    public void management() {
        System.out.println("스마트폰 공장을 관리합니다. ");
    }
}
