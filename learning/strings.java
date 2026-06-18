package learning;

public class strings {
    public static void main(String[] args) {

        String name = "no name";
        
        int length = name.length(); // ".length" is a string method to find the length of a string and it also included spaces.
        System.out.println(length);

        char letter = name.charAt(0); // gives the output of a letter of a string at the given index.
        System.out.println(letter);

        int index = name.indexOf('o'); // gives the index of first occurrence of 'o'.
        System.out.println(index);

        int lastIndex = name.lastIndexOf('n'); // gives the index of last occurrence of 'n'.
        System.out.println(lastIndex);

        name = name.toUpperCase(); // changes the whole string to uppercase.
        System.out.println(name);

        name = name.toLowerCase(); // changes the whole string to lowercase.
        System.out.println(name);

        String name2 = "       no name           ";
        name2 = name2.trim(); // deletes the before the start of a string and after the end of a string.
        System.out.println(name2);

        name2 = name2.replace('n', 'm'); // replaces a letter with given letter.
        System.out.println(name2);

        System.out.println(name2.isEmpty()); // gives false if not empty and true if empty.

        String name3 = " ";
        System.out.println(name3.isEmpty()); // gives false

        System.out.println(name3.contains(" ")); // gives true if character is available else false.

        System.out.println(name.equals(name2)); // gives true if equal else false.
        System.out.println(name.equals("no name"));

        System.out.println(name.equalsIgnoreCase("NO NAME")); // ignores if a string or a character is upper or lower case, just check if they are same character.



    }
}
