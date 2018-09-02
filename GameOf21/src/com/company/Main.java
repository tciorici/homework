package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


                Scanner input = new Scanner(System.in);
                final int TWENTY_ONE = 21;
                int playerOneEntry;
                int computerEntry = 0;
                int total = 0;
                System.out.println("Instructions, two players take turns by entering 1, 2, or 3 \n"+ "which is then added to a running total. Whoever makes the score go over twenty one "+ "loses\n");

                while(total <= 21) {
                    System.out.println("Player, please enter 1, 2, or 3 >>> ");
                    playerOneEntry = input.nextInt();
                    while(playerOneEntry != 1 && playerOneEntry != 2 && playerOneEntry != 3) {
                        System.out.println("Player, please enter 1, 2, or 3 >>> ");
                        playerOneEntry = input.nextInt();
                    }
                    total += playerOneEntry;
                    System.out.println("The total is " + total);
                    if(total == 21) {
                        System.out.println("Player Wins!");
                        total = 25;
                    }

                    if(total < TWENTY_ONE) {
                        switch (total) {
                            case 1:
                                computerEntry = 1;
                                break;
                            case 2:
                                computerEntry = 1;
                                break;
                            case 3:
                                computerEntry = 3;
                                break;
                            case 4:
                                computerEntry = 3;
                                break;
                            case 5:
                                computerEntry = 3;
                                break;
                            case 6:
                                computerEntry = 2;
                                break;
                            case 7:
                                computerEntry = 1;
                                break;
                            case 8:
                                computerEntry = 1;
                                break;
                            case 9:
                                computerEntry = 3;
                                break;
                            case 10:
                                computerEntry = 2;
                                break;
                            case 11:
                                computerEntry = 3;
                                break;
                            case 12:
                                computerEntry = 2;
                                break;
                            case 13:
                                computerEntry = 1;
                                break;
                            case 14:
                                computerEntry = 3;
                                break;
                            case 15:
                                computerEntry = 2;
                                break;
                            case 16:
                                computerEntry = 1;
                                break;
                            case 17:
                                computerEntry = 1;
                                break;
                            case 18:
                                computerEntry = 3;
                                break;
                            case 19:
                                computerEntry = 2;
                                break;
                            case 20:
                                computerEntry = 1;
                                break;
                            default:
                                computerEntry = 1;
                        }
                    }

                    total += computerEntry;
                    System.out.println("Computer entered " + computerEntry);
                    System.out.println("The total is " + total);
                    if(total == 21) {
                        System.out.println();
                        total = 25;
                        System.out.println("Computer Wins!");
                    }
                    else {
                        System.out.println("The total is " + total);
                    }
                }

            }






}
