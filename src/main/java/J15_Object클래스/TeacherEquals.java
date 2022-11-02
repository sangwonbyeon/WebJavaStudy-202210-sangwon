package J15_Object클래스;

public class TeacherEquals {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("변상원", "코리아아이티");
        J15_Object클래스.equals.Teacher teacher2 = new J15_Object클래스.equals.Teacher("변상원", "코리아아이티");
//        System.out.println(teacher1 == teacher2);
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode() == teacher2.hashCode());
    }
}
