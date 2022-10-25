package J08_메소드;

import java.util.Random;

public class RandomNumber {
    //int x  int y 변수명 변수명을 지을수 있다 변수는 여러개로 선언해도 되고 써도 된다
    public static int calcRandom(int m) {
        Random random = new Random();
    int result = random.nextInt(10)* 1000 + m;
    //지역이 달라 random이 빨간줄이 그여 밑에 psvm 밑에있는 Random이 없다 같이 쓸수 없는 이유가 지역이 달라서
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        //스캐너처럼 Random을 따로 쳐야함

        /*for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(10); //() bound 는 숫자를 넣으면 자동적으로 나와 바운드 타이핑 x
            System.out.println(randNum);
            // 0~10이 되기 전까지
        }
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(10) + 10; //10부터 20까지 랜덤 옆에 +10;을 해주면된다
            System.out.println(randNum);
        }
        for (int i = 0; i < 10; i++) {
            int randNum = random.nextInt(100) + 100; //100부터 199까지 랜덤 옆에 +100;을 해주면된다
            System.out.println(randNum);
        }*/
        //1000원을 넣었을때 랜덤하게 얼마나 나오는지
        int money = 5000;
        /*int a = random.nextInt(10) * 1000 + money;
        System.out.println(a);
        int b = random.nextInt(10) * 1000 + money;
        System.out.println(b);
        int c = random.nextInt(10) * 1000 + money;
        System.out.println(c);
        int d = random.nextInt(10) * 1000 + money;
        System.out.println(d);

        System.out.println(a+b+c+d);*/
        //긴 공식들이 있다면 줄여줘야한다
        //함수에는 입려과 출력이 있다

        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        System.out.println(calcRandom(money));
        int r = calcRandom(money);
        System.out.println(r + 100);
        System.out.println(r + 1000);
        System.out.println(r + 10000);
        System.out.println(r + 100000);

    }
}
