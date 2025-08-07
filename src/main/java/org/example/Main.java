package org.example;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) {

        //Exercise 1: append() - Appending Content
        sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
        System.out.println();

        //Exercise 2: insert() - Inserting Content at a Position
        sb = new StringBuilder("Java is great!");
        sb.insert(8, "really ");
        System.out.println(sb);
        System.out.println();

        //Exercise 3: delete() - Deleting Content
        sb = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        sb.delete(8, 16);
        System.out.println("After delete(8, 16): " + sb);

        // Deletes the character at index 4 (the ' ')
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(4): " + sb);
        System.out.println();

        //Exercise 4: replace() - Replacing a Section
        sb = new StringBuilder("I like programming in Python.");
        sb.replace(24, 30, "Java");
        System.out.println(sb);
        System.out.println();

        //Exercise 5: Method Chaining
        sb = new StringBuilder("Start");
        sb.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        System.out.println(sb);
        System.out.println();

        //Exercise 6: substring(), indexOf(), and Non-Existing Words
        sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");

        String sub = sb.substring(16, 19);
        System.out.println("Substring: " + sub);

        int indexOfFox = sb.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        int indexOfCat = sb.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);
        System.out.println();

        //Exercise 7: toString() - Converting back to a String
        sb = new StringBuilder("Status: ");
        sb.append("Pending");

        String finalStatus = sb.toString();

        sb.append(" - Approved");

        System.out.println("StringBuilder: " + sb);
        System.out.println("Final String: " + finalStatus);
    }
}