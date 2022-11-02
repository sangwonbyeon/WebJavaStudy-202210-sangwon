package J15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("변상원 ", "코라아아이티 ");
        Teacher teacher2 = new Teacher("변상원 ", "코라아아이티 ");

        Class t_class = teacher1.getClass();

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());


        Field[] fields = t_class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
            System.out.println(fields[i].getType().getSimpleName());
        }

        Method[] methods = t_class.getDeclaredMethods();
        for (int i = 0; i <methods.length; i++) {
            System.out.println(methods[i].getReturnType());
        }

        System.out.println(teacher1.getClass() == teacher2.getClass()); //get class 를 하게되면  teacher1.getClass() 탸입의 객체를 들고온다
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class);
        System.out.println(teacher2.getClass() == Teacher.class);

    }
}
