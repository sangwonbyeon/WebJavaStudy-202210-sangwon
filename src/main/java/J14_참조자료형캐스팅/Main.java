package J14_참조자료형캐스팅;

public class Main {


    public static void main(String[] args) {

        Computer computer = new Computer();
        LED led = new LED();
        Speaker speaker = new Speaker();

        CentralControl centralControl = new CentralControl(computer, led, speaker);  //upcasting은 육시적 형변환이 가능하다.

        centralControl.powerOn();
        System.out.println("-----------------------------");
        centralControl.powerOff();
    }
}
