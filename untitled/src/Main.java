import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //establishes Animals
        ArrayList<Animal> farm = new ArrayList<Animal>();
        Fish fish = new Fish("Nemo");
        farm.add(fish);
        Dog dog = new Dog("Dunco");
        farm.add(dog);
        Cat cat = new Cat("Muro");
        farm.add(cat);

        for (int i = 0; i < farm.size(); i++) { //prints animal Sound and Name + sleep or swim
            farm.get(i).name();
            farm.get(i).animalSound();
            if (i == 0) {
                fish.canSwim();
            } else {
                farm.get(i).sleep();
            }
            System.out.println("**************************************");
        }
    }
}