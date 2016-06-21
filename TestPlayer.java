 /**  
	Sample Program to test the Player, BBPlayer, and BKBPlayer classes.
	
	Author: Jose L. Cordova
	Course: CSCI 2073 - Fall 2014
 */
 
import java.io.*;
import java.util.*;

public class TestPlayer
{
   public static void main(String[] args)
   {
      Player [] players = new Player[4];
      BBPlayer  bb1  = new BBPlayer ("Boss", "Jim", "13", 540000);
      BBPlayer  bb2  = new BBPlayer ("Bean", "Joe", "33", 600000, "catcher", 640, 240);
      BKBPlayer bkb1 = new BKBPlayer("Baxter", "Bob", "5", 120000);
      BKBPlayer bkb2 = 
         new BKBPlayer("Jumper", "Lana", "35", 100000, "small forward", 38, 20, 56, 22);
      bb1.setAtBats(200);
      bb1.setHits(25);
      bkb1.setTwoPointAttempts(60);
      bkb1.setTwoPointBaskets(25);
      bkb1.setThreePointAttempts(4);
      bkb1.setThreePointBaskets(1);
   
      double total = 0;
      double payCheck;
      		
      players[0] = bb1;
      players[1] = bkb1;
      players[2] = bkb2;         
      players[3] = bb2;
      for (int i = 0; i < players.length; i++)
      {         
         System.out.println (players[i]);
         System.out.println ("\nEfficiency Rating = " + players[i].getEfficiencyRating());
         players[i].adjustSalary();                   
         payCheck = players[i].getSalary();
         System.out.printf ("New Salary: $%7.2f\n\n", payCheck);
         total = total + payCheck;
      }
   
      System.out.printf ("Total salaries: $%7.2f", total);
   }
			
}