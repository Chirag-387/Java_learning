package learning;

public class enchancedSwitches {
    public static void main(String[] args) {

        String day = "Thursday";
        /*
        switch(day) {
            case "Monday" -> System.out.printf("%s is a weekday.", day);
            case "Tuesday" -> System.out.printf("%s is a weekday.", day);
            case "Wednesday" -> System.out.printf("%s is a weekday.", day);
            case "Thursday" -> System.out.printf("%s is a weekday.", day);
            case "Friday" -> System.out.printf("%s is a weekday.", day);
            case "Saturday" -> System.out.printf("%s is a weekend day.", day);
            case "Sunday" -> System.out.printf("%s is a weekend day.", day);
            default -> System.out.printf("%s is not a day.", day);
        }
        */

        // OR

        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.printf("%s is a weekday.", day);
            case "Saturday", "Sunday" -> System.out.printf("%s is weekend day.", day);
            default -> System.out.printf("%s is not a day.", day);
        }

    }
}
