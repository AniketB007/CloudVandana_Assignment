// Enter a roman number as an input and convert it to an integer. (Ex:- IX=9)

import java.util.Scanner;

public class Que2 {
    public static int romValue(char ch) {
        //Here we define Roman Values
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default: return 0;
        }
    }

     public  static int romToInt(String num){
        int s=num.length();
        int sum=0;
        for(int i=0;i<s;i++){
            char ch=num.charAt(i);
            if((i+1)<s && romValue(ch) < romValue(num.charAt(i+1))){
                sum=sum-romValue(ch);
            }else{
                sum=sum+romValue(ch);
            }
        }
         return sum;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman Number : ");
        String s=sc.next();
//        Que2 q2=new Que2();
        int total=romToInt(s);
        System.out.println("The Integer value is "+total);

    }
}
 /*
  Logic:-
                                1)  I V = 4       2)  V I = 6
                                    1 5               5 1
                    We have to check the next value  if it is greater than present value so we
                    assume  that value as Negative value Or the Next value is less than Present value
                    then we assume that value as Possitive value.

                  Ex :- s= ""MCMXCIV";
                        M=1000, C=100, X=10, I=1,V=5.
                        = +1000-100+1000-10+100-1+5
                        =2000+5-11
                        =2005-11
                        =1994


  */


