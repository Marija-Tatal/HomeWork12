package HomeWork12;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter Mom's first name");
        String momsName= input.next();
        System.out.println("Please enter Dad's first name");
        String dadsname= input.next();
        System.out.println("Please Enter the expected Baby gender");
        boolean boy= input.hasNext("boy");
        boolean girl= input.hasNext("girl");

        String babiesName;
        if (boy){
            babiesName=(dadsname.substring(0,2).concat(momsName.substring(3)));
            System.out.println(babiesName.toUpperCase());
        } else if (girl) {
            babiesName=(momsName.substring(0,2).concat(dadsname.substring(3)));
            System.out.println(babiesName.toUpperCase());
        }


    }
    }


