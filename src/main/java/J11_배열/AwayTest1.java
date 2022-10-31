package J11_배열;

//하나의 묶음

public class AwayTest1 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        /*new = 동적할당, 컴퓨터는 항상 0부터 시작 , int공간안에 10개의 배열을 묶어라
        10개의 int를 배열 안에 생성된 주소 numArray 에 넣어라
         */
        int index = 9;
        //밑에 numArray[] 대갈호 안에 값이 있으면 index안에 넣을수 있다.

        numArray[index] = 10;
        /*
        int[] numArray = new int[10];
        numArray[0] = 10;
        인덱스 번호처럼 해당공간안에 접근을 하고 그 공간안에다가 10을 넣는것
         */

        for(int i = 0; i < 10; i++) {
            System.out.println(numArray[i]);
        }

        int num1 =10;
        int num2 =11;
        int num3 =12;
        int num4 =13;
        int num5 =14;
        int num6 =15;



    }
}
