package Dog;

public class Dog {
    public String name;

    public Dog(String inputName){
        name = inputName;
    }

    public void speakNewName(String name){
        System.out.println("Hello, my new name is " + this.name);
    }

    public static void main(String[] args){
        Dog a = new Dog("Fido");
        Dog b = new Dog("Odie");

        a.speakNewName("Winston");


        b.speakNewName("Darla");

    }
}
