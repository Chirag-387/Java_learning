package learning;

public class variableScope {

    static int x = 3; // it is class variable as it is present inside a class but not in any kind of methods and has a class scope. And when the variable inside methods are not declared and still the methods calls the variable then it will print class variable from class scope.

    public static void main(String[] args) {

        // a variable declared inside a method has a local scope.

        int x = 10; // has a Local scope and called as local variable inside main method.
        System.out.println(x);

        doSomething(); // prints 2.

    }

    static void doSomething() {

        int x = 2; // is a local scope in doSomething method.
        System.out.println(x);

    }

}