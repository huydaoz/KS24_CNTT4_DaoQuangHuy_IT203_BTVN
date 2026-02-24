package PTIT_CNTT4_IT203_SESSION11.KiemTraDauGio;

public class Main {
    public static void main(String[] args) {

        Drink[] drinks = new Drink[3];
        drinks[0] = new Coffee("D01", "Bạc sỉu", 30000, true);
        drinks[1] = new FruitJuice("D02", "Nước cam", 40000, 10);
        drinks[2] = null;

        System.out.println("----- HÓA ĐƠN -----");
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                drinks[i].displayInfo();
                System.out.println("Thành Tiền: " + drinks[i].calculatePrice());

                if (drinks[i] instanceof IMixable) {
                    IMixable m = (IMixable) drinks[i];
                    m.mix();
                }
                System.out.println("-------------------");
            }
        }
    }
}
