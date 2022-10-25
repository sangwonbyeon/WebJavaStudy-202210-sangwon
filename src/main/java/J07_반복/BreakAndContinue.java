package J07_반복;

public class BreakAndContinue {
    public static void main(String[] args) {

        int i = 0;

        while (true) {
            if(i > 9) {
                break;
            }
            System.out.println(i);
            i++;
        }
        // while에 true 값이 들어가면 계속 무한적으로 반복한다
        for (int j = 0; j < 10; j++) {
            if(j == 7) {
                System.out.println("7을 만났습니다.");
                break;
            }
            System.out.println(j);
        }
        System.out.println("<<<<<<continue>>>>>>");

        for (int j = 0;  j < 100; j++) {

            if(j%5 !=0 || j == 0){
                continue;
            }
            System.out.println(j);
        }
    }
}
