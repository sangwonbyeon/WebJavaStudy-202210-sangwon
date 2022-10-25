package j03_형변화;

public class Operation1 {
    public static void main(String[] args) {
        int num = 10;
        num = num+1;
        // 코드들은 스텝구조를 가지고 있으며 먼저 쓰여진 num에 새로운 + 더하고 싶은 숫자를 순서적으로 표기해야한다
        System.out.println(num);
        //++num  선증가  num++ 후증가
        System.out.println(num--);  //모든 계산이 끝나고 나면은 그때 더하기 시작 (후증가)
        System.out.println(++num);
        //=하나는 대입, ==같다는 표시  != not 두개가 달라야만 쓸수 있다
        // 0 != 0   0이 같은 경우 쓰지 말아라고 나온다



    }
}
