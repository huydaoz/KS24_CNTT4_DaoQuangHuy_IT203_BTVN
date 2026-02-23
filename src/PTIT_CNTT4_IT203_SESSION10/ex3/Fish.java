package PTIT_CNTT4_IT203_SESSION10.ex3;

class Fish extends Animal implements Swimmable {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " dang boi");
    }
}
