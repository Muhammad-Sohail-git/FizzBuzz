/*
FizzBuzz is a fun game mostly played in elementary school. The rules are simple:

When our turn arrives, we say the next number (preferably with a French accent). However:

If that number is a multiple of five, we say the word “fizz“.
If the number is a multiple of seven, we say “buzz“.
If it is a multiple of both, we say “fizzbuzz.”
 */
public class Main {
    public static void main(String[] args) {
        int end = 100;
        for(int i = 0; i < end; i++){
            if(i%5 == 0){
                System.out.println("fizz!");
            }
            if(i%7 == 0){
                System.out.println("buzz!");
            }
            if(i%5 == 0 && i%7 == 0){
                System.out.println("fizzbuzz!");
            }
            System.out.println("The number " + i +  " is not divisible either by 5 or 7!");
        }
    }
}