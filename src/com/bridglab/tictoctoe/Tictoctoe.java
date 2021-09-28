package com.bridglab.tictoctoe;

import java.util.Scanner;
import java.util.Random;

class TicTac{
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    ////assign a Char 1D array as a static
    static char[] arr = new char[10];
    static boolean flag = true;

    //(can Calling from Main method) assign a empty space char by using 1D array
    void init() {
        for (int i = 0; i < 10; i++) {
            arr[i] = ' ';
        }
    }

    //display Tic Tac Toe 1D array Box
    //(can Calling from Main method)
    static void disp() {
        System.out.println("### Display Tic Tac Toe Box ###");
        System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2] );
        System.out.println("---------");
        System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5] );
        System.out.println("---------");
        System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8] );
        return;
    }

    //User can call this method by putting 'X' to specific index
    static void putX(int x){
        if(arr[x-1] != ' ')
            System.out.println("!!! No Space to enter the 'X' this cell !!!");
        else
            arr[x-1] = 'X';
        return;
    }

    //User can call this method by putting 'O' to specific index
    static void putO(int x){
        if (arr[x-1] != ' ')
            System.out.println("!!! No Space to enter the 'O' this cell !!!");
        else
            arr[x-1] = 'O';
        return;
    }

    int pingComputer(){
        //int com = rd.nextInt(9);
        return rd.nextInt(9);
    }

    void paly(){
        System.out.print("Choose a letter 'X' or 'O' -> : ");
        char c = sc.next().charAt(0);
        if ((c != 'X') && (c != 'O')){
            System.out.println("!!! Enter Only Char 'O' or 'X' !!!");
        }else ;


        switch (c) {
            case 'O':
                int o;
                System.out.println("Give the Index (1-9) of put -> 'O' : ");
                int a = rd.nextInt(2);
                if (a == 1){
                    System.out.println("$$$ Now Computer tun");
                    if (((arr[0] == 'X') && (arr[1] == 'X') && (arr[2] == ' ')) || ((arr[3] == 'X') && (arr[4] == 'X') && (arr[5] == ' ')) || ((arr[6] == 'X') && (arr[7] == 'X') && (arr[8] == ' ')) || ((arr[0] == 'X') && (arr[3] == 'X') && (arr[6] == ' ')) || ((arr[1] == 'X') && (arr[4] == 'X') && (arr[7] == ' ')) || ((arr[2] == 'X') && (arr[5] == 'X') && (arr[8] == ' ')) || ((arr[0] == 'X') && (arr[4] == 'X') && (arr[8] == ' ')) || ((arr[2] == 'X') && (arr[4] == 'X') && (arr[6] == ' '))){
                        System.out.println("/-/-/- Opponent can win play to block it -/-/-/");
                        if (arr[2] == ' ')
                            putO(3);
                        else if (arr[5] == ' ')
                            putO(6);
                        else if (arr[8] == ' ')
                            putO(9);
                        else if (arr[6] == ' ')
                            putO(7);
                        else if (arr[7] == ' ')
                            putO(8);
                        disp();
                        break;
                    }else
                        o = pingComputer();
                    putO(o);
                }else{
                    if (((arr[0] == 'X') && (arr[1] == 'X') && (arr[2] == ' ')) || ((arr[3] == 'X') && (arr[4] == 'X') && (arr[5] == ' ')) || ((arr[6] == 'X') && (arr[7] == 'X') && (arr[8] == ' ')) || ((arr[0] == 'X') && (arr[3] == 'X') && (arr[6] == ' ')) || ((arr[1] == 'X') && (arr[4] == 'X') && (arr[7] == ' ')) || ((arr[2] == 'X') && (arr[5] == 'X') && (arr[8] == ' ')) || ((arr[0] == 'X') && (arr[4] == 'X') && (arr[8] == ' ')) || ((arr[2] == 'X') && (arr[4] == 'X') && (arr[6] == ' '))){
                        System.out.println("/-/-/- Opponent can win play to block it -/-/-/");
                        if (arr[2] == ' ')
                            putO(3);
                        else if (arr[5] == ' ')
                            putO(6);
                        else if (arr[8] == ' ')
                            putO(9);
                        else if (arr[6] == ' ')
                            putO(7);
                        else if (arr[7] == ' ')
                            putO(8);
                        disp();
                        break;
                    }
                    putO(sc.nextInt());
                }
                disp();
                if( ((arr[0] == 'O') && (arr[1] == 'O') && (arr[2] == 'O')) || ((arr[3] == 'O') && (arr[4] == 'O') && (arr[5] == 'O')) || ((arr[6] == 'O') && (arr[7] == 'O') && (arr[8] == 'O')) || ((arr[0] == 'O') && (arr[3] == 'O') && (arr[6] == 'O')) || ((arr[1] == 'O') && (arr[4] == 'O') && (arr[7] == 'O')) || ((arr[2] == 'O') && (arr[5] == 'O') && (arr[8] == 'O')) || ((arr[0] == 'O') && (arr[4] == 'O') && (arr[8] == 'O')) || ((arr[2] == 'O') && (arr[4] == 'O') && (arr[6] == 'O')) ){
                    System.out.println("*** 'O' Player is Winner ***");
                    System.out.println("&&&&---Game is Over---&&&&");
                    flag = false;
                }
                break;
            case 'X':
                int x;
                System.out.println("Give the Index (1-9) of put 'X' : ");
                int b = rd.nextInt(2);
                if (b == 1){
                    System.out.println("$$$ Now Computer tun");
                    if (((arr[0] == 'O') && (arr[1] == 'O') && (arr[2] == ' ')) || ((arr[3] == 'O') && (arr[4] == 'O') && (arr[5] == ' ')) || ((arr[6] == 'O') && (arr[7] == 'O') && (arr[8] == ' ')) || ((arr[0] == 'O') && (arr[3] == 'O') && (arr[6] == ' ')) || ((arr[1] == 'O') && (arr[4] == 'O') && (arr[7] == ' ')) || ((arr[2] == 'O') && (arr[5] == 'O') && (arr[8] == ' ')) || ((arr[0] == 'O') && (arr[4] == 'O') && (arr[8] == ' ')) || ((arr[2] == 'O') && (arr[4] == 'O') && (arr[6] == ' '))){
                        System.out.println("/-/-/- Opponent can win play to block it -/-/-/");
                        if (arr[2] == ' ')
                            putX(3);
                        else if (arr[5] == ' ')
                            putX(6);
                        else if (arr[8] == ' ')
                            putX(9);
                        else if (arr[6] == ' ')
                            putX(7);
                        else if (arr[7] == ' ')
                            putX(8);
                        disp();
                        break;
                    }else
                        x = pingComputer();
                    putO(x);

                }else{
                    if (((arr[0] == 'O') && (arr[1] == 'O') && (arr[2] == ' ')) || ((arr[3] == 'O') && (arr[4] == 'O') && (arr[5] == ' ')) || ((arr[6] == 'O') && (arr[7] == 'O') && (arr[8] == ' ')) || ((arr[0] == 'O') && (arr[3] == 'O') && (arr[6] == ' ')) || ((arr[1] == 'O') && (arr[4] == 'O') && (arr[7] == ' ')) || ((arr[2] == 'O') && (arr[5] == 'O') && (arr[8] == ' ')) || ((arr[0] == 'O') && (arr[4] == 'O') && (arr[8] == ' ')) || ((arr[2] == 'O') && (arr[4] == 'O') && (arr[6] == ' '))){
                        System.out.println("/-/-/- Opponent can win play to block it -/-/-/");
                        if (arr[2] == ' ')
                            putX(3);
                        else if (arr[5] == ' ')
                            putX(6);
                        else if (arr[8] == ' ')
                            putX(9);
                        else if (arr[6] == ' ')
                            putX(7);
                        else if (arr[7] == ' ')
                            putX(8);
                        disp();
                        break;
                    }
                    putX(sc.nextInt());
                }
                disp();
                if( ((arr[0] == 'X') && (arr[1] == 'X') && (arr[2] == 'X')) || ((arr[3] == 'X') && (arr[4] == 'X') && (arr[5] == 'X')) || ((arr[6] == 'X') && (arr[7] == 'X') && (arr[8] == 'X')) || ((arr[0] == 'X') && (arr[3] == 'X') && (arr[6] == 'X')) || ((arr[1] == 'X') && (arr[4] == 'X') && (arr[7] == 'X')) || ((arr[2] == 'X') && (arr[5] == 'X') && (arr[8] == 'X')) || ((arr[0] == 'X') && (arr[4] == 'X') && (arr[8] == 'X')) || ((arr[2] == 'X') && (arr[4] == 'X') && (arr[6] == 'X')) ){
                    System.out.println("*** 'X' Player is Winner ***");
                    System.out.println("&&&&---Game is Over---&&&&");
                    flag = false;
                }
                break;
        }

    }
}

public class Tictoctoe {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTac t = new TicTac();
        t.init();
        t.disp();


        while  ( ((t.arr[0] == ' ') || (t.arr[1] == ' ') || (t.arr[2] == ' ') || (t.arr[3] == ' ') || (t.arr[4] == ' ') || (t.arr[5] == ' ') || (t.arr[6] == ' ') || (t.arr[7] == ' ') || (t.arr[8] == ' ')) && t.flag) {

            t.paly();

        }
        if (t.flag)
            System.out.println("@@@ 'O' Player and 'X' Player Got the match was draw @@@ \n &&&&---Game is Over---&&&&");



    }
}
