package J07_반복;

public class Star {
    public static void main(String[] args) {
        for(int i = 0; i <10; i++) {

            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");


            }
            System.out.println();
            //반복문을 사용해야 하며 내려 갈수록 별이 하나씩 늘어야 한다
        }
        for(int i = 0; i < 10; i++) {

            for(int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //i < 10; i++  /  j < 10 - i; j++ 반복횟수이며 i가 숫자가 증가함에 따라 j값이 점차 작아지며 내려간다



        System.out.println();
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i; j++){
                System.out.println(" ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
