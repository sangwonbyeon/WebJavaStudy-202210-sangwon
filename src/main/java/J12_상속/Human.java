package J12_상속;

public class Human extends Animal{

    public Human(String name){
        super(name); //부모 생성자 호출, 부모가 가지고 있는 객체가 침범하는 것. (항상 super는 생략되어있다.)
        System.out.println("Human 생성");
        //항상 부모 생성자가 항상 위에있어야 한다
    }
    /*
       메소드 오버라이딩(오버라이드)
       [ 재정의 ]
       상위(Animal) 객체의 메소드를 하위(Human) 객체에서 다시 정의하는 행위
     */

   /* public void move(){
        System.out.println("두 발로 걷습니다. ");
    }*/
    @Override //@: 어노테이션, 해당 메소드가 상위 객체로부터 재정의된 메소드입니다를 표기하기 위해 현재 오버라이드는 기능이 전혀없다
    public void move(){
        System.out.println("두 발로 걷습니다.");
        //두개의 클래스가 붙어있어 다른클래스로 호출이 가능하다
    }
    //상속 관계에서는 메소드가 선언이 된다
}
