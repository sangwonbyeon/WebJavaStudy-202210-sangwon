package J17_스택틱.싱글톤;

public class ViewMain {
    public static void main(String[] args) {
        ProductView productView = ProductView.getInstance();

        productView.showMainView();
        productView.showOrderView();

//        ProductView getInstance().showMainView();
//        ProductView getInstance().showOrderView();
    }
}
