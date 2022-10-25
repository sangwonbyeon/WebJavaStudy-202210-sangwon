package J06_조건;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int VIP_POINT = 80;
        final int GOLD_POINT = 60;
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        //alt + shift + 방향키 위아래    원하는 문단의 위치를 바꿔줌

        int point = 0;

        String rating = null;

        System.out.println("회원 포인트 점수를 입력하세요: ");
        point = scanner.nextInt();

        if (point > SILVER_POINT) System.out.println("test");
        // if와 else는 한 묶음이며 묶여서 사용해야한다 따로 쓿수는 없다.


        if (point > VIP_POINT) {
            rating = "VIP";
        } else {
            if (point > GOLD_POINT) {
                rating = "gold";
            } else {
                if (point > SILVER_POINT) {
                    rating = "SILVER";
                } else {
                    if (point > BRONZE_POINT) {
                        rating = "BRONZE";
                    } else {
                        rating = "GENERAL";
                    }
                }
            }


        }


    }
}