package J12_상속;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }
    /*public void move(){
        System.out.println("네 발로 뜁니다. ");
    }*/

    @Override
    public void move() {
        super.move();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
