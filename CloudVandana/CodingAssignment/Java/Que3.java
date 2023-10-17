//Check if the input is PANGRAM or not. (A Pangram is a sentances that contains all the
// alphabets from A to Z)

import java.util.HashSet;
import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentance : ");
        String s=sc.nextLine();
        String n=s.toLowerCase();
        HashSet <Character> hs=new HashSet<>();
        for(int i=0;i<n.length();i++){
           char ch=n.charAt(i);
           if(ch>=97 && ch<=122){
              hs.add(ch);
           }
        }
        if (hs.size()==26) {
            System.out.println("The given sentance is a Pangram.");

        }else {
            System.out.println("The given sentance is Not a Pangram.");
        }

    }
}
