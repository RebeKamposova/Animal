public class Dog extends Animal{
    private String name;
    Dog(String name){ //constructor
        this.name = name;
    }
    public void name() {//prints name
        System.out.println("Hello I am a Dog and my name is " + name);
    }
    public void animalSound() { //prints sound
        System.out.println("Woof Woof");
    }
}
