package J05_Scanner;

import java.util.Scanner;

public class input_3 {

    /*
    이름: 변상원  name
    나이: 27    age
    주소: 부산 해운대구 우동  address
    연락처: 010 8919 3331   phone

    사용자의 이름은 변상원이고 나이는 27입니다.
    주소는 부산 해운대구 우동이며 연락처는 010 8919 3331입니다.
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name = null ;
            int age = 0;
            String adress = null;
            String phone = null;

            System.out.println("이름 ");
            name = scanner.next();

            System.out.println("나이 ");
            age = scanner.nextInt();

            System.out.println("주소 ");
            scanner.nextLine();
            //scanner.nextLine(); 로 버퍼를 날리는 용도 (이름과 나이를 적으면서 엔터의 버퍼링이 남아있어 버퍼를 날리는 용도로 쓰임)
            adress = scanner.nextLine();

            System.out.println("연락처 ");
            phone = scanner.nextLine();

            System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "입니다. ");
            System.out.println("주소는 " + adress + "이며 연락처는 " + phone + "입니다.");

            /*영상 같은 곳에서 버퍼를 쓰는 이유 영상에서 100% 나와야 한다 하지만 요즘 시대에는 스트리밍(즉시 재생해서 볼수있는 환경)을
            쓰고 있는데 인터넷 환경에 따라서(인터넷은 속도가 항상 일정하지 않다 인터넷이 그 만큼 빠르면 버퍼 없이 재생 가능) 영상의 속도가
            다르며 버퍼를 써서 영상이 재생할수 있는 다운로드를 해주게 함
             */
            /* 프로그램에 실행에 흐름이 있다 그 흐름을 제어 하는게 제어흐름
            1.조건문
            if, else if:만약~면 , 이 조건이 참일때 실행된다
            그게 아니면 실행되는것이 else 두 갈래길로 나뉜다.
             */


    }
}
