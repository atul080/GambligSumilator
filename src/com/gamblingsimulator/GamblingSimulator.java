package com.gamblingsimulator;

import java.util.Random;

/*
 * @author Atul Srivastav
 * @date 29/12/2021
 * To make a gambler simulator program which starts with a stake and bets every game to win.
 * Gambler bets in every game to win or loose some stake. He exits if stake reaches maximum or minuimum limit.
 */
public class GamblingSimulator {
    //initializing variables
    public static int STAKE=100;
    public static final int BET=1;

    /*
     *   Declared a checkBet method.
     *   @param int
     *   It accepts a bet value passed from main for win or loose.
     */
    public static void checkBet(int betVal)
    {
        if(betVal==BET)
        {
            System.out.println("Gambler WON the bet.");
        }
        else
        {
            System.out.println("Gambler LOOSE the bet.");
        }

    }
    public static void main(String[] ar) {
        //welcome message
        System.out.println("Welcome to gambling simulator. ");
        //making object of Random Class and getting a random bet value between 0 and 1
        Random rm=new Random();
        int betVal=rm.nextInt(2);
        //calling checkBet method to check if gambler won the bet or not.
        checkBet(betVal);
    }
}
