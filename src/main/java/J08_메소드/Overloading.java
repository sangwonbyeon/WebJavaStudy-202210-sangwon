package J08_메소드;

public class Overloading {

    public static void add(){
        System.out.println("add()");
    }

    public static void add(int a){
        System.out.println("add()");
    }
    /*
    => 똑같은 메소드는 사용할수 없다 하지만 ()안에 값이 주어지면 사용이 가능하다
    이런것이 메소드 오버로딩이다
    정의
    :매개변수의 형태가 다르면 동일한 메소드 명을 가지고 정의할 수있다.

    ""로 쓰면 문자열이라 String 으로 그냥 정수 10이면 int로 찾아들어간다
     */
    public static void add(String s){
        System.out.println("add(String s)");
    }

    public static void add(int a, int b){
        System.out.println("add(int a,int b)");
    }

    public static void add(int a, String b){
        System.out.println("add(int a,String b)");
    }

    public static void add(String b, int a){
        System.out.println("add(String b, int a)");
    }

    public static void main(String[] args) {

        add();
        add(10);
        add("10");
        add(10, 20);
        add(10, "20");
        add("10", 20);
    }
}
