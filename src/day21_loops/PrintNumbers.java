package day21_loops;

public class PrintNumbers {

    /*
    print all the even numbers from 1 to 100

    print all the odd numbers from 1 to 100, but all in one line with spaces between each number
     */

    public static void main(String[] args) {
        int n = 2;

        while(n <= 100){
            System.out.println(n);
            n += 2;
        }

    //approach 2:
        System.out.println();
        int i = 1;

        while(i<=100){

            if (i%2 == 0){
                System.out.println(i);
            }
            i++;

        }

        System.out.println();
        int m = 0;

        while(m++ <= 100){
            if(m % 2 == 1){
                System.out.print(m + " ");
            }

        }
/* flow:
m = 0
m++ <= 100 --> 0 <= 100 --> loop runs and m is now 1
if (m % 2 == 1) --> 1%2 == 1 --> true -> prints number

while(m++ <= 100) --> 1 <= 100 --> loops runs and m increments to 2

if (m%2 ==1) --> 2 % 2 == 1 --> false -> nothing happens

while(m++ <= 100) --> 2 <= 100 --> loop runs and mincrements to 3
 */

        //approach 2
        System.out.println();

        int t = 1;

        while(t <= 100) {
            System.out.print(t + " ");
            t += 2;

        }



    }
}
