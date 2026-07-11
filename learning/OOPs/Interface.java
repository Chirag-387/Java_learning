package learning.OOPs;

public class Interface {
    public static void main(String[] args) {
        
        /*
        
        Interface ->    A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
                        Support multiple inheritance type behaviour.
        
        */

        rabbit rabbit1 = new rabbit();

        rabbit1.flee();

        hawk hawk1 = new hawk();

        hawk1.hunt();

        Fish fish = new Fish();

        fish.hunt();
        fish.flee();

    }
}
