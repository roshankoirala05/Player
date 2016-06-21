/**
   The BBPlayer class extends an abstract class player and 
   manages information about Baseball players.
*/


public class BBPlayer extends Player
{

   
   private String playerPosition="Unknown";  // Position of the Baseball player
   private int numberOfAtBats=0;             // Number of At-bats of the baseball player
   private int numberOfHits=0;               // Number of Hits of the baseball player
   private double efficiencyRating=0.0;      // Efficiency Ratinng of the player


   /**
      This constructor sets the name, jersey number, and salary of a player
      to the value passed as an argument.
      @param last The last name of the BBplayer
      @param first The first name of the BBplayer
      @param number The Jersey Number of the BBplayer
      @param salary The annual Salary  of the BBplayer
   */

   public BBPlayer ( String last, String first, String number, double salary)
   {
      super(last,first,number,salary); // Call to super class constructor
   }

   /**
      This constructor sets the name, number,salary, position, atBats, and total hits of BBplayer
      to the value passed as an argument.
      @param last The last name of the BBplayer
      @param first The first name of the BBplayer
      @param number The Jersey Number of the BBplayer
      @param salary The annual Salary  of the BBplayer
      @param position The position of the BBPlayer
      @param atBats The number of at-bats of the BBPlayer
      @param hits The number of hits of the BBPlayer
   */

   public BBPlayer ( String last, String first, String number, double salary, String position, int atBats, int hits)
   {
      super(last,first,number,salary);
      
      numberOfAtBats = atBats;
      numberOfHits = hits;
      if ( position.equalsIgnoreCase("catcher") || position.equalsIgnoreCase("pitcher")
      ||position.equalsIgnoreCase("catcher") || position.equalsIgnoreCase("first base")
      || position.equalsIgnoreCase("second base") || position.equalsIgnoreCase("third base") 
      || position.equalsIgnoreCase("shortstop")|| position.equalsIgnoreCase("outfield"))
         playerPosition = position;
      else
         playerPosition ="Unknown";
      
      efficiencyRating = (double)numberOfHits/numberOfAtBats ; // Calculation of efficiency rating 
    }

   /**
      The getPosition method returns the position of the BBplayer
      @return The value in the playerposition field.
   */

   public String getPosition()
   {
      return playerPosition;
   }

   
   
   /**
      The setPosition method sets  the position of the BBplayer
      @param position  The position  of the BBplayer
   */

   public void setPosition(String position)
   {
      playerPosition = position;
   }

   
   /**
      The getAtBats method returns the number of at-bats of the BBplayer
      @return The value in the numberOfAtBats field.
   */

   public int getAtBats()
   {
      return numberOfAtBats;
   }
   
   
   /**
      The setAtBats method sets  the number of atBats of the BBplayer
      @param atBats  The number of at-bats  of the BBplayer
   */

   public void setAtBats(int atBats)
   {
      numberOfAtBats = atBats;
      efficiencyRating = (double)numberOfHits/numberOfAtBats ;
   
   }

   /**
      The getHits method returns the number of hits of the BBplayer
      @return The value in the numberOfHits field.
   */

   public int getHits()
   {
      return numberOfHits;
   }

  /**
      The setHits method sets  the number of hits of the BBplayer
      @param hits  The number of hits of the BBplayer
   */

   public void setHits(int hits)
   {
      numberOfHits = hits;
      efficiencyRating = (double)numberOfHits/numberOfAtBats ;
   
   }

  
  /**
      The toString method displays the contents of Base ball player object
      @return The value in the display variable
   */

   public String toString()
   {
      String display;
      display = super.toString()+"\n Player's Position : "+playerPosition+"\n Number of at-bats : "
      +numberOfAtBats+"\n Number of Hits : "+numberOfHits;
      return display;
   }

   
   /**
      The  getEfficiencyRating method returns the efficiency rating of the base ball player
      @return The value in the efficiencyRating field
   */

   public  double getEfficiencyRating()
   {
      return efficiencyRating;
   }

  
  /**
      The  adjustSalary method adjusts the salary of a base ball player based on  the efficiency rating
   */
   public  void adjustSalary()
   {
      if(efficiencyRating < .200)
         setSalary(getSalary()- (0.05*getSalary()));
      
      else if ( efficiencyRating >= .200 && efficiencyRating < .300)
         setSalary(getSalary());
      
      else 
         setSalary(getSalary()+ (0.05*getSalary()));
      
   }



}// End class