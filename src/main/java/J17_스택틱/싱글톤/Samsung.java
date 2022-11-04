package J17_스택틱.싱글톤;

import lombok.Getter;


public class Samsung {

    @Getter
    private String company;
    private int serialNumber;


    private static Samsung instance = null;

    private Samsung(){
        company = getClass().getSimpleName();
        serialNumber = 20220001;
    }

    public static Samsung getInstance() {
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model){
        return model + "_" + ++serialNumber;
    }



}
