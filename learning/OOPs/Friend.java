package learning.OOPs;

public class Friend {
    
    static int numOfFriend; // if static is not used after each object calling, the value of numOfFriends will reset.
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriend++;
    }

    static void showFriend() {
        System.out.printf("You have %d total friends.\n", numOfFriend);
    }

}
