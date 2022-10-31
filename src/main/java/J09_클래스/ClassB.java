package J09_클래스;

public class ClassB {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;


    void increaseStudentYear(){
        studentYear++;
        if(studentYear>5){
            System.out.println("더 이상 학년을 증가시킬 수 없다. ");
            studentYear--;
            return;
            //5보다 커버리면 증가시키지 않고 감소시킨다
            //-- 말고도 else를 주는 방법이 있고 if가 들어있으면 return이라는 반환값을 넣을수 있다(void에서도 return을 쓸 수 있음)
        }
        callName();
    }

    void increaseStudentYear(int studentYear){
        studentYear += studentYear;
        if(studentYear > 5){
            System.out.println(studentYear + "학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다. ");
            System.out.println();
            studentYear -= studentYear;
            return;
        }
        callName();
    }


    void callName(){
        System.out.println("이름: " +name);
        System.out.println("학교 : " + schoolName);
        System.out.println("학년: " + studentYear);
        System.out.println("코드: " + studentCode);
        System.out.println();
    }


}
