package J10_접근지정자;

public class StudentAccessModifier {

    private int code;
    private String name;
    //모든 변수들은 private이다, 메서드들은 public

    StudentAccessModifier(int code, String name){
        this.code = code;
        this.name = name;
    }
    //생성자가 앞에 public 붙어있지 않으면  항상 default, default라는 패키지는 잘 안쓰인다
    public void setCode(int code){   //앞에 set을 붙이고 그다음은 카멜 표기법을 따른다.
        this.code = code;
    }

    public int getCode(){
        return code;   //가지고 올려면 return을 써야한다
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void showInfo(){
        System.out.println("학번: " + this.code);
        System.out.println("이름 " + name );
    }

}
