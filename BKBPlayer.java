/**
   The BKBPlayer class extends an abstract class player and 
   manages information about Basketball players.
*/

public class BKBPlayer extends Player
{

   private String playerPosition="Unknown";    // Position of the Baseball player
   private int numberOfThreePtTaken=0;         // Number of three points taken by a basketball player
   private int numberOfThreePtMade=0;          // Number of three points made by a basketball player
   private int numberOfTwoPtTaken=0;          // Number of two points taken by a basketball player
   private int numberOfTwoPtMade=0;           // Number of two points made by a basketball player
   private double efficiencyRating=0.0;       // Calculation of efficiency rating of a basketball player


   
   /**
      This constructor sets the name, jersey number, and salary of a basketball player
      to the value passed as an argument.
      @param last The last name of the BKBplayer
      @param first The first name of the BKBplayer
      @param number The Jersey Number of the BKBplayer
      @param salary The annual Salary  of the BKBplayer
   */

   public BKBPlayer ( String last, String first, String number, double salary)
   {
      super(last,first,number,salary);
   }

   
   
   /**
      This constructor sets the name, number,salary, position, 
      number of three points taken, number of three points made,
      number of two points taken, and number of two points made
      to the value passed as an argument.
      @param last The last name of the BKBplayer
      @param first The first name of the BKBplayer
      @param number The Jersey Number of the BKBplayer
      @param salary The annual Salary  of the BKBplayer
      @param position The position of the BKBPlayer
      @param threePtTaken  Number of three points taken by BKB Player
      @param threePtMade The number of threre points made by the BKB player
      @param twoPtTaken The number of two points taken by the BKB player
      @param twoPtMade The number of two points made by the BKB player
   */

   public BKBPlayer ( String last, String first, String number, double 
                    salary, String position, int threePtTaken, 
                    int threePtMade, int twoPtTaken, int twoPtMade)
   {
      super(last,first,number,salary);
      
      numberOfThreePtTaken=threePtTaken;
      numberOfThreePtMade=threePtMade;
      numberOfTwoPtTaken= twoPtTaken;
      numberOfTwoPtMade=twoPtMade;
      
      // Checking for invalid player position
      
      if ( position.equalsIgnoreCase("point guard") ||
       position.equalsIgnoreCase("shooting guard")||
       position.equalsIgnoreCase("small forward") || 
       position.equalsIgnoreCase("power forward")||
        position.equalsIgnoreCase("center") )
         playerPosition = position;
      else
         playerPosition ="Unknown";
   
   // Calculation of efficiency of Basketball player
      efficiencyRating = ((1.65*(double)numberOfTwoPtMade)+ 
         ( 2.65* (double)numberOfThreePtMade)-
         (0.72* (double)(numberOfThreePtTaken+numberOfTwoPtTaken-numberOfThreePtMade-numberOfTwoPtMade)))  ;
   
   }


   /**
      The getPosition method returns the position of the BKBplayer
      @return The value in the playerposition field.
   */

   public String getPosition()
   {
      return playerPosition;
   }

   
   
   /**
      The setPosition method sets  the position of the BKBplayer
      @param position  The position  of the BKBplayer
   */

   public void setPosition(String position)
   {
      playerPosition = position;
   }

   
   /**
      The getThreePtTaken method returns the number of three points shot taken by the BKBplayer
      @return The value in the numberOfThreePtTaken field.
   */

   public int getThreePtTaken()
   {
      return numberOfThreePtTaken;
   }

  /**
      The getThreePtMade method returns the number of three points shot made by the BKBplayer
      @return The value in the numberOfThreePtMade field.
   */

   public int getThreePtMade()
   {
      return numberOfThreePtMade;
   }

   /**
      The getTwoPtTaken method returns the number of two points shot taken by the BKBplayer
      @return The value in the numberOfTwoPtTaken field.
   */

   public int getTwoPtTaken()
   {
      return numberOfTwoPtTaken;
   }

   
   /**
      The getTwoPtMade method returns the number of two points shot made by the BKBplayer
      @return The value in the numberOfTwoPtMade field.
   */
   public int getTwoPtMade()
   {
      return numberOfTwoPtMade;
   }


   
  
  /**
      The setThreePointAttempts method sets  the number of three points taken by  the BKBplayer
      @param threePtTaken  The number of three points taken by the BKBplayer
   */
   public void setThreePointAttempts(int threePtTaken)
   {
      numberOfThreePtTaken=threePtTaken ;
      efficiencyRating = ((1.65*(double)numberOfTwoPtMade)+ 
         ( 2.65* (double)numberOfThreePtMade)-
         (0.72* (double)(numberOfThreePtTaken+numberOfTwoPtTaken-numberOfThreePtMade-numberOfTwoPtMade)))  ;
   
   }



   /**
      The setThreePointBasket method sets  the number of three points made by  the BKBplayer
      @param threePtMade  The number of three points Made by the BKBplayer
   */

   public void setThreePointBaskets(int threePtMade)
   {
      numberOfThreePtMade=threePtMade;
      efficiencyRating = ((1.65*(double)numberOfTwoPtMade)+ 
         ( 2.65* (double)numberOfThreePtMade)-
         (0.72* (double)(numberOfThreePtTaken+numberOfTwoPtTaken-numberOfThreePtMade-numberOfTwoPtMade)))  ;
   
   }

   
   /**
      The setTwoPointAttempts method sets  the number of two points taken by  the BKBplayer
      @param twoPtTaken  The number of two points taken by the BKBplayer
   */

   public void setTwoPointAttempts(int twoPtTaken)
   {
      numberOfTwoPtTaken= twoPtTaken;
      efficiencyRating = ((1.65*(double)numberOfTwoPtMade)+ 
         ( 2.65* (double)numberOfThreePtMade)-
         (0.72* (double)(numberOfThreePtTaken+numberOfTwoPtTaken-numberOfThreePtMade-numberOfTwoPtMade)))  ;
   
   
   }

   
   /**
      The setTwoPointBasket method sets  the number of two points made by  the BKBplayer
      @param twoPtMade  The number of two points Made by the BKBplayer
   */

   public void setTwoPointBaskets(int twoPtMade)
   {
      numberOfTwoPtMade=twoPtMade;
      efficiencyRating = ((1.65*(double)numberOfTwoPtMade)+ 
         ( 2.65* (double)numberOfThreePtMade)-
         (0.72* (double)(numberOfThreePtTaken+numberOfTwoPtTaken-numberOfThreePtMade-numberOfTwoPtMade)))  ;
   
   }



  /**
      The toString method displays the contents of Basketball player object
      @return The value in the display variable
   */

   public String toString()
   {
      String display;
      display = super.toString()+"\n Player's Position : "
         +playerPosition+"\n Number of three-point shots taken : "
         +numberOfThreePtTaken+"\n Number of three-point shots made : "
         +numberOfThreePtMade+"\n Number of two-point shots taken : "
         +numberOfTwoPtTaken+"\n Number of two-point shots made : "
         +numberOfTwoPtMade;
      return display;
   }

   
   
   /**
      The  getEfficiencyRating method returns the efficiency rating of the Basketball player
      @return The value in the efficiencyRating field
   */

   public  double getEfficiencyRating()
   {
      return efficiencyRating;
   }

   
   
   /**
      The  adjustSalary method adjusts the salary of a Basketball player based on  the efficiency rating
   */

   public  void adjustSalary()
   {
      if(efficiencyRating <=10)
         setSalary(getSalary()- (0.05*getSalary()));
      
      else if ( efficiencyRating >10 && efficiencyRating < 20)
         setSalary(getSalary());
      
      else 
         setSalary(getSalary()+ (0.05*getSalary()));
   
     
   }



} //End Class