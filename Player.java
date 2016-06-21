/**
   The Player class simulates an abstract class 
   which manages information about different types
   of players.
*/

public abstract class Player
{

   
   private String firstName;    // First name of  player
   private String lastName;     // Last name of player
   private String FullName;     // Full name of player
   private String jerseyNumber; // Jersey Number of player
   private double annualSalary; // Annual Salary of Player

  
  /**
      This constructor sets the name, number, and salary of a player
      to the value passed as an argument.
      @param last The last name of the player
      @param first The first name of the player
      @param number The Jersey Number of the player
      @param salary The annual Salary  of the player
   */

   public Player ( String last, String first, String number, double salary)
   {
      lastName = last;
      firstName= first;
      jerseyNumber = number;
      annualSalary = salary;
      FullName = firstName+ " " + lastName;
   }

   
   /**
      The getName method returns the full name of the player
      @return The value in the FullName field.
   */

   public String getName()
   {
      return FullName;
   }

   /**
      The setName method initializes  the full name of the player
      @param last The last name of the player
      @param first The first name of the player
   */

   public void setName( String last, String first)
   {
      FullName = firstName+ " " + lastName; 
   }

  
  /**
      The getJerseyNumber method returns the JerseyNumber of the player
      @return The value in the jerseyNumber field.
   */

   public String getJerseyNumber()
   {
      return jerseyNumber;
   }

   /**
      The setJerseyNumber method initializes  the jersey number of the player
      @param number  The Jersey Number  of the player
   */

   public void setJerseyNumber( String number)
   {
      jerseyNumber = number;
   }

   /**
      The getSalary method returns the annual salary of the player
      @return The value in the annualSalary field.
   */

   public double getSalary()
   {
      return annualSalary;
   }

   /**
      The setSalary method initializes  the annual salary of the player
      @param salary  The annual salary of the player
   */

   public void setSalary( double salary)
   {
      annualSalary = salary;
   }

   /**
      The toString method displays the contents of player object
      @return The value in the result variable
   */

   public String toString()
   {
      String result;
      result = " Player's Name : "+FullName+"\n Jersey Number : "+jerseyNumber+"\n Annual Salary : "+annualSalary;
      return result;
   }

 
  
   // Abstract Methods
   
   /**
      The getEfficiencyRating method gives the efficiency rating of the player
   */

   public abstract double getEfficiencyRating();
   
   /**
      The adjustSalary method adjusts the salary of the player
   */
   public abstract void adjustSalary();


} // End Class