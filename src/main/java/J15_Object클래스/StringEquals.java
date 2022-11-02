package J15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        String name1 = "변상원"; // 변, 상, 원  각각의 글자는 char 이고 합친 것, [ㅁ ㅁ ㅁ ] []안에 배열이 존재하며 주소는 동일하다
        String name2 = "변상원";
        String name3 = new String("변상원");
        String name4 = new String("변상원");

        System.out.println(name1 + ", " + name2 + ", " + name3);

        System.out.println(name1 == name2); //true
        System.out.println(name1 == name3); //false
        System.out.println(name4 == name3); //false
        //new String 에 new 는 새로 생성한 메모리에 할당을 받는 것, name1과 비교했을때 주소가 틀려서 false 가 나온다.
        System.out.println(name1.equals(name3)); //equals 는 주소비교가 아닌 값 비교, == 주소값 비교
    }
}
