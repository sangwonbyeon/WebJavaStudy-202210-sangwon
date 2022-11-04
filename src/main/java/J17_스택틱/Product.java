package J17_스택틱;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
/*
static 을 제외시켠 시리얼 번호가 20220001 만 뜬다 증가 x,  static은 공유영역
private static int autoIncrement = 20220001; 카피가 x , static은 자신이 정의되면 그 영역에서 계산이 이어간다.
autoIncrement를 제외한 밑에 부분은
*/

@Data
public class Product {
    public static int autoIncrement = 20220001;

    private int serialNumber;
    private String productName;

    public Product(String productName) {
        serialNumber = ++autoIncrement;
        this.productName = productName;
    }

    public static int getAutoIncrement() {
        return autoIncrement;
    }

    public static void printInfo(){
//      System.out.println(productName);   멤버변수는 스태틱 메소드에서 사용할 수 없다.  productName 가 Non static field 인데 static 변수가 아니기 때문에 (메모리 공간이 없거나 확장이 안되어 있을수 있다.)
        Product product = new Product("product");
        System.out.println(product.productName);   //메모리에 할당시켜서 사용이 가능해졌다.
        System.out.println(autoIncrement);
    }



}
