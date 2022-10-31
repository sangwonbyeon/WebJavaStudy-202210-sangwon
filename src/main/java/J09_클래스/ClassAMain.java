package J09_클래스;

public class ClassAMain {
    public static void main(String[] args) {
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        System.out.println(new ClassA());
        //새로운 클래스 a를 생성해라 (동작, 메소드)
        ClassA a1 = new ClassA();
        //class a 에 자료형을 만들었다
        ClassA a2 = new ClassA();
        /*
        ClassA라는 자료형 a1으로 주소가 들어있다
        주소를 타고 들어가는 것을 접근
        class A의 주소가 출력된다
        메모리 어딘가 주소에 만들어졌다
         */
        a1.name = "변상원";

        System.out.println(a1.name);

        a2.name = "변상워";

        System.out.println(a1.name);
        System.out.println(a2.name);

//        System.out.println(a1.callName();); <=메서드, 돌려 줄게 없어 출력할게 없다

        a1.callName();
        a2.callName();

    }
}
