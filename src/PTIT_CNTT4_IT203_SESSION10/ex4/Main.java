package PTIT_CNTT4_IT203_SESSION10.ex4;

public class Main {
    public static void main(String[] args) {

        RemoteControl smartLight = new RemoteControl() {

            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
