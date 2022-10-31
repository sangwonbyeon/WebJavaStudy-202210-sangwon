package J10_접근지정자;

import J10_접근지정자.StudentAccessModifier;

public class AccessModifierMain {
    public static void main(String[] args) {

        StudentAccessModifier sam = new StudentAccessModifier(20220001, "변상원");

        sam.showInfo();
        sam.setName("변상워");
        sam.showInfo();

        System.out.println(sam.getCode());


    }
}
