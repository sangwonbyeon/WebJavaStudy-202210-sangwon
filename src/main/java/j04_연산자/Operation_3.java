package j04_연산자;
/*
윤년은 연도가 4의 배수이면서,
100의 배수가 아닌 떄 또는 400의 배수일 떄이다.
 */
public class Operation_3 {
    public static void main(String[] args) {
        int year = 2400;
        boolean result = false;

        result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;


        System.out.println("결과: " + result);













    }
}
