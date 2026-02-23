package PTIT_CNTT4_IT203_SESSION10.ex4;

interface RemoteControl {

    void powerOn();

    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}