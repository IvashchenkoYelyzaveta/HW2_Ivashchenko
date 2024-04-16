package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;
        System.out.println(x + y);
        System.out.println("" + x + y);

        //Подати у десятковому вигляді
        // 101 = 1*2^2 + 0*2^1 + 1*2^0 = 5
        // 11 = 1*2^1 + 1*2^0 = 3
        // 111 = 1*2^2 + 1*2^1 + 1*2^0 = 7

        //Подати у двійковому вигляді
        // 2 = 10
        // 23 = 10111
        // 15 = 0111

        int a = 5;
        a = a++;
        System.out.println(a);

        int b = 5;
        b = b++ + b++;
        System.out.println(b);
        
        int c = 5;
        c = c++ + ++c;
        System.out.println(c);

        int d = 5;
        d = ++d + ++d;
        System.out.println(d);



    }
}