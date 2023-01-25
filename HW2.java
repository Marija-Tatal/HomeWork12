package HomeWork12;

public class HW2 {
    //2) Create a String and print it in reverse order (Sunday → yadnuS).
    public static void main(String[] args) {
        String weekday="Sunday";
        String reverse="";


        for (int i = 0; i < weekday.length(); i++) {
            reverse=weekday.charAt(i)+reverse;
        }
        System.out.println("Reversed String "+reverse);
    }
    }

