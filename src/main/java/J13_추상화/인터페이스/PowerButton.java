package J13_추상화.인터페이스;

public class PowerButton extends Button {

    private boolean status;
    //boolean은 맨처음 false로 초기화된다


    @Override
    public void onPressed(){
        if(status){
            status = false;
            System.out.println("전원을 끕니다. ");
        }else{
            status = true;
            System.out.println("전원을 켭니다. ");
        }

    }

}
