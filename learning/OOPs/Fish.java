package learning.OOPs;

// public class Fish extends Animals{
    
    // @Override
    // void move() {
    //     System.out.println("This animal is swimming.");
    // }

// }

public class Fish implements prey, predator {

    public void flee() {
        System.out.println("The fish is swimming away.");
    }

    public void hunt() {
        System.out.println("The fish is hunting.");
    }

}