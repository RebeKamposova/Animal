public class Cat extends Animal{
    private String name;
    Cat(String name){//constructor
        this.name = name;
    }
    public void name() { //prints name
        System.out.println("Hello I am a Cat and my name is " + name);
    }
    public void animalSound() { //prints sound
        System.out.println("Moew Moew");
    }
}
