package HomeWork12;

public class HW3 {
    public static void main(String[] args) {

        String name = "hello";


        if (!name.isEmpty()) {
            int length = name.length();
            if (length % 2 != 0 && length >= 3) {
                int middleIndex = length / 2;
                System.out.println(name.charAt(middleIndex));

            }
        }
    }

}

