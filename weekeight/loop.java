package weekeight;
//Take 10 integers from keyboard using loop and print their average value on the
//screen.

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<10; i++);
        {
            sum = sum+ inp.nextInt();
        }
        System.out.println("sum of above numbers "+sum);
        float avg = sum/10;
        System.out.println("the above average is" +avg);

    }
    }