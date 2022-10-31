package J09_클래스;

public class ClassA {

    int num;
    String name;
    double score;


    //생성자, 생성자라는 메서드는 처음부터 대문자로 시작하며 메서드처럼 쓸수있다.
    //생성자는 항상 반환이 있다(리턴이 없는 이유) 그래서 반환 자료형이 없다
    //생성자 오버로딩도 가능하다
    //다른 생성자로 오버로딩 되면은 비활성화 된다
    //오버로딩이 하나라도 있으면..
    ClassA(){

    }
    //매개변수가 없는 생성자

    ClassA(int a) {
        System.out.println("a: " + a);
        System.out.println("ClassA를 생성합니다.");
    }


    void callName() {
        System.out.println(name + "을(를) 부릅니다.");
    }

}
/*
ClassName: Student
Properties(속성)-(멤버)변수
schoolName
studentCode
studentYear
name
Function(기능)-(멤버)메소드
increaseStudentYear()-호출시에 현재 학년을 1학년 증가 (최대 5학년)
showStudentInfo-학생 정보 출력

부산대학교
2022001
2
변상원

increaseStudentYear(): 호출하면 학생정보가 출력
showStudentInfo(): 출력이 나오게 학년은 +1
부산대학교
2022001
3
변상원

 */