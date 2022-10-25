package j04_연산자;

/**
 * <<<<<논리 연산자>>>>>
 *
 *     True(1), False(0)
 *
 *     AND(&&) ->곱  T x T => T,   T x F => F   F x F => F 하나라도 거짓이면 무조건 거짓
 *     OR (||) ->합  T + T => T,   T + F =>     F + F =>
 *     NOT  (!)-> 부정
 *
 */
public class Operation_2 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T * T=>" + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T * F=>" + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F * F=>" + result3);
        boolean result4 = flag1 || flag1;
        System.out.println("T || T=>" + result4);
        boolean result5 = flag1 || flag1;
        System.out.println("T || F=>" + result5);
        boolean result6 = flag1 || flag1;
        System.out.println("F || F=>" + result6);

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F * T=>"+ result7);

        boolean result8 = 10%3 !=0;

        int year = 2022;
        boolean result9 = year % 2 == 0 && year % 20 !=0 || year% 100 == 0;
        System.out.println(result9);

    }
}
