package J06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int score = 0;         //시험 점수
        String grade = null;     //학점 (등급)

        System.out.println("점수를 입력하세요: ");
        score = scanner.nextInt();

        if (score < 0 || score > 100) {
            grade = "X";
        } else {
            if (score > 89) {
                grade = "A";
            } else {
                if (score > 79) {
                    grade = "B";
                } else {
                    if (score > 69) {
                        grade = "C";
                    } else {
                        if (score > 59) {
                            grade = "D";
                        } else {
                            if (score < 60) {
                                grade = "F";
                            }
                            System.out.println("입력한 점수는 " + score + "이며 학점은" + grade + "학점입니다.");
                        }
                    }
                }
            }
        }
    }
}