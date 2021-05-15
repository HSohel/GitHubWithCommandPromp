package javareview;

public class InterfacePig implements InterfaceAnimal {
    @Override
    public void AnimalSound() {
        System.out.println("This is for animal sound");
    }

    @Override
    public void AnimalSleep() {
        System.out.println("This is for animal sleep");
    }
}
