package J16_Bean;

public class Person {
    private final String name;             // 멤버변수에 final을 선언하면 필수값이 된다.
    private int age;

//    public Person(){}     //<-NoArgsConstructor는 RequiredArgsConstructor와 함꼐 쓸 수 없다.

    public Person(String name) {       // <-  requiredArgsConstructor
        this.name = name;
    }

    //상수가 이루어지면 초기화가 되어야한다.  생성자가 되어 값이 주입이 되어야한다.

//    public Person(String name){
//        this.name = name;
//    }
    public Person(String name, int age) {      // <-AllArgsConstructor
        this.name = name;
        this.age = age;

                                               //어떠한 변수는 초기화가 안될수도 있다.
    }
}
