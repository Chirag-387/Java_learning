package learning;

public class overloadMethod {
    public static void main(String[] args) {

        /*

        Overload methods -> methods that share the same name, but different parameters. Signature = name + parameters.
        In this I created two methods with same name "add" with different number of parameters, so they act as different as name-parameter pair.

        */

        System.out.println(add(2, 3));

        System.out.println(add(2, 3, 4));

        System.out.println(bakePizza("flat bread"));

        System.out.println(bakePizza("flat bread", "Extra"));

        System.out.println(bakePizza("flat bread", "no", "mushrooms & tomatoes"));

    }

    static double add(double a, double b) {
        return (a + b);
    }

    static double add(double a, double b, double c) {
        return (a + b + c);
    }

    static String bakePizza(String bread) {
        return (bread + " pizza.");
    }

    static String bakePizza(String bread, String cheese) {
        return (bread + " pizza with " + cheese + " cheese.");
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return (bread + " pizza with " + cheese + " cheese and with " + topping + " as a topping.");
    }

}
