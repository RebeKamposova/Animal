public class Fish extends Animal implements Swim{
    private String name;
    Fish(String name){ //constructor
        this.name = name;
    }
    public void animalSound() {//prints sound
        System.out.println("Blob Blob");
    }
    public void name() { //prints name
        System.out.println("Hello I am a Fish and my name is " + name);
    }
    public void canSwim() { //implements swim
        System.out.println("fish can swim");
    }
}
