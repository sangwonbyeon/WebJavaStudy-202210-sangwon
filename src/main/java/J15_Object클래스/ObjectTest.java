package J15_Object클래스;
/*
  자바에는 import를 안하는 것이 한가지인데 lang에 들어있는 것은 import 를 하지않는다.
 */
public class ObjectTest extends Object{

    private String name;
    private String address;

    public ObjectTest(){

    }


    public ObjectTest(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String showInfo(){
        return "name: " + name + ", address: " + address;
    }

    @Override
    public String toString() {
        return "name: " + name + ", address: " + address;
    }
}
