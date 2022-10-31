package J09_클래스;

public class ClassBMain {
    public static void main(String[] args) {

        ClassB a1 = new ClassB();
        ClassB a2 = new ClassB();

        a1.schoolName= "부산대학교";
        a1.studentYear= 3;
        a1.name = "변상원";
        a1.studentCode=20220001;

        a2.schoolName= "부경대학교";
        a2.studentYear= 4;
        a2.name = "변상워";
        a2.studentCode=20220002;


        a1.callName();
        a2.callName();

        a1.increaseStudentYear();
        a2.increaseStudentYear();


//        System.out.println("<<<학년증가 반복>>>");
//        for(int i=0; i< 10; i++){
//            a1. increaseStudentYear();
//            a1. callName();
//        }
        a1.increaseStudentYear(2);
        a1.increaseStudentYear(2);
        a1.increaseStudentYear(2);

    }
}
