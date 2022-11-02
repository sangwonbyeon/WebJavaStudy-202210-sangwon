package J15_Object클래스;
/*
   hashCode 는 해당객체의 주소값
   모든 클래스는 Object 클래스를 상속받는다.

 */

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();


        int hashCode = objectTest.hashCode();

        System.out.println(hashCode);
        System.out.println(Integer.toHexString(hashCode)); //toHexString: 16진수로 변경해라 Integer 를
        System.out.println(objectTest);


    }
}
