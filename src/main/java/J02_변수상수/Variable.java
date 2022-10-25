package J02_변수상수;
/*
변수 var로 시작하는 것은 변수라 의미한다
 */
public class Variable {
    public static void main(String[] args) {
        //논리자료형 변수
        boolean checkFlag = false;   //<= 선언 false라는 값이 checkFlag 라는 값을 초기화 시키는것
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        //문자자료형 변수
        char name1 = '변';
        //문자, 문자열  문자열은 문자들이 열거되어있는거(묶여 있는거) ""묶어 줘야한다
        //단어 하나면 '' 작은 따움표로
        char name2 = '상';
        char name3 = '원';
        //문자('변')를 담을수 있는 변수가 char 이다
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1 + name2 + name3);
        //코드들을 적다가 회색으로 자동완성 되는 것들이 보이면 Tab을 누르면 자동완성된다
        /*
        출력 했을때 왜 숫자가 나오는가?
        char로 쓰면 기본적으로 유니코드라는 값으로 담겨있다
        유니코드가 AC00로 시작한다
        */
        System.out.println('가'+0);

        int a = '가' + 0;

        System.out.println(Integer.toHexString(a));
        /*
        10진수 숫자를 16진수로 바꾼다
        각각의 name1 + name2 + name3 가 각각의 유니코드들이 더해졌던것
         */
        //글자가 합쳐져서 보이고 싶으면은
        System.out.println("" + name1 + name2 + name3);
        //""로 붙여서 문자열로 담을수 있는 그릇을 만들어 + 해주면 문자열로 만들어준다
        //boolean char int 로 쓰던 ""로 + name 해주면 문자열로 바꿔버린다
        //""+ name1(문자) = 둘이 더하면서 문자열로 되어 문자가 표기가 된다
        //println은 최종적으로 문자열을 출력하기 위한 곳이다



        // 문자열자료형 변수
        String name = "변상원";
        //여러 글자를 담을 수 있는 변수 String
        /*
        String name2 ="" 가 name2를 썼을떄 오류가 나는데 char에서 이미 쓰고 있어서 더이상 못쓴다
        char 변수형에서 String이라는 새로운 변수에서는 못쓴다
         */
        String name4 = "강지혜";
        String name5 = "name + name4";
        System.out.println(name5);


        // 정수자료형 변수
        int width = 100;
        int width2 = 200;


        String width3 = "300";
        String width4 = "400";


        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);
        //300400으로 합쳐져서 나온다
        /*
        숫자를 계산을 하고싶으면은 int라는 정수형 자료형을 써줘야하고
        문자열 자료형을 써버리면은 문자열로 본다 글자가 이어지는 것이 숫자의 연산이 일어나지 않음
         */

        long time = System.currentTimeMillis();
        System.out.println(time);
        /*
        현재 시간을 표기하는데 1666539705999이렇게 표기된다
        컴퓨터는 2022년 처럼 우리가 보기 쉬운 시간을 표기하는 것을 좋아하지 않는다
        하지만 long 으로 나온 값을 뽑아 낼수는 있다
         */

        //int time2 = 1666539705999;
        //int는 21억단위까지 넣을수 있다 지금 값이 넘어 버린다 long으로 바꿔 넣어야한다
        long time2 = 1666539705999L;
        System.out.println(time2);

        //실수자료형 변수
        double pi = 3.14159265359;
        System.out.println(pi);

        double pi2 = 3.1415926535999999999;
        System.out.println(pi2);
        /*숫자가 어느 순간 짤려서 나오고 어느 순간 반올림되어서 나타남*/

        double pi3 = 3000000000000.1415926535999999999;
        System.out.println(pi3);
        /*
        E12 가 나오는데 10^12로 나온다 왜냐?
        정수가 커지면은 표기할수 있는 공간의 크기를 넘어 버린다
        8byte 의 공간을 넘어버려서 다 채울수가 없다 (이렇게 까지 쓸 일은 없다)
         */


        /*
        메모리(RAM)는 CPU SSD(하드디스크)가 일처리를 하는데 주로 데이터 관리를 한다
        메모리는 공간이 적다 메모리가 핵심이며 저장공간은 작지만 빠르게 일처리가 가능하기 떄문에
        CPU의 연산 속도를 따라가는것은 메모리뿐이며
        메모리가 CPU에서 받은 데이터들을 쓰고 SSD에 저장시킨다(SSD가 보조기억장치역활)
        메모리가 데이터들고 와서 쓰고 다시 넣어서 저장시켜둔다
        메모리의 역활은 임시 저장소이고 SSD가
         */

        /*
        메모리는 데이터를 저장하는 공간이 있고 그 공간은
        각각의 주소를 가지고 있다 각 주소에 있는 값을 가지고 오고 싶다
        하지만 주소를 모르면 가지고 올수가 없다 그래서
        이 주소의 이름을 변수라고 한다
        변수da라고해서 char가 들어갈수 있는 2byte라는 공간을 할당을 받는다
        2byte라는 공간이 ㅁㅁ로 치고 ㅁ(d)ㅁ(a)로 할당을 받아 da
         */

        //상수
        final String FILE_PATH = "C:/Users/백엔드";
//        FILE_PATH ="D:/Users/aaa";
        System.out.println(FILE_PATH);
        /*
        C드라이브가 FILE_PATH라는 메모리 값에 들어갔다 한번 들어가고 나서는
        FILE_PATH ="D:/Users/aaa"; D드라이브에 들어갈수 없다(바꿀수가 없다)
        대입 자체가 불가능 하지만 final을 빼버리면 가능하다
         */
        //해당 문단을 주석처리 하고싶으면 드래그 ctrl + / (안되면 한영키 눌러주기)
        /*
        값을 저장하는 상수들은 대문자를 쓴다(ex{FILE_PATH})
        상수는 스네이크(_)표기법으로 쓴다
         */




    }
}
