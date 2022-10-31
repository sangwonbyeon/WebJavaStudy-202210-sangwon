package J09_클래스;

public class Constructor {

    int num;
    //전역변수 or 멤버변수
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    Constructor(int num){
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로하는 생성자)");
        this.num = num;   //num끼리 대입을 하고있는중 그럴때 int num에 2를 붙여 구분은 되지만 더러워진다
    }
    //그냥 num은 num=num;에 대입을 하지만 this.num 쓰면서 전역변수, int num을 직접적으로 끌고온다
    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로하는 생성자)");
        this.name = name;
    }
    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    void showInfo(){
        System.out.println("num:" + num);
        System.out.println("name: " + name);
    }
    //this를 쓰지 않는 이유는 변수명이 겹치는게 없기 때문
}
