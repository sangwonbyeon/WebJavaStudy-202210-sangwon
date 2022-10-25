package J08_메소드;
/*
메소드란? 함수이다.
함수란? 일련의 동작을 묶어 정의한 것.
함수의 특징: 입력과 출력을 가질 수 있다(가질 수 있지만 필수는 x)
그러면 왜 메소드라고 부르는가?

클래스 안에 함수를 정의하면 메소드라고 부른다.
자바에는 무조건 클래스 안에서만
psvm은 메인 메소드라 불린다
메인 메소드는 실행이 가능하다는 점
함수를 실행하는 것을 우리는 호출(call)라고 칭한다.

 */

public class Method1 {

    //1. [x | x] 입력(매개변수), 출력(반환) 앞에 x는 입력 뒤에는 출력
    public static void call1(){    //매개는 전달을 하는 역활 매개변수  출력은 void
        System.out.println("[x | x]");
    }

    //2. [o | x]  입력은 있고 출력이 없을때

    public static void call2(String str){
        System.out.println("[o | x]");
        System.out.println("수업과목: "+ str);
    }

    //3. [x | o]  입력이 없고 출력이 있을때

    public static String call3(){
        String result = "";

        for(int i = 0; i < 5; i++){
            for(int j =0; j < i+1; j++){
                result += "*";

            }
            result +="\n";
        }
        return  result;
    }

    //4. [o | o]
    public static String call4(int year, int month, int day){
        System.out.println("[o | o]");
        return year + "년 " + month + "월 " + day + "일 ";  //문자열 안에서 띄어쓰기 해야 출력때 띄어서 나온다
        //함수 메소드는 입력은 여러개 할 수 있지만 출력은 하나만
    }

    //메인 메소드
    public static void main(String[] args) {
        call1();
        call2("java"); //str도 자동으로 뜬다
        String star1 = call3();
        System.out.println(star1);
        String date = call4(2022, 10, 24);
        System.out.println(date);
    }
}
