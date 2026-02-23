package PTIT_CNTT4_IT203_SESSION10.ex3;

class Duck extends Animal implements Swimmable, Flyable {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " dang boi");
    }

    @Override
    public void fly() {
        System.out.println(name + " dang bay");
    }
}
