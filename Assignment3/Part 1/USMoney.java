/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment 3, Part 1  Spring 2019   *
 *                                                          *
 *  Programmer:  Dominykas Karalius - Z1809478              *  
 *                                                          *
 *  Date Due:    11:59 PM on Wednesday, 03/06/2019          *
 *                                                          *
 *  USMoney Class                                           *
 *                                                          *
 ************************************************************/ 
/**
 * The USMoney class has two private variables, a constructor, that checks for invalid
 * arguments, and two 'get' methods. It also has a method that returns a USMoney object that is the sum
 * of two other USMoney objects that is provided by the user.
 */

public class USMoney
{
   //Variable declaration
   private int Dollars;
   private int Cents;
   
   //Constructor
   public USMoney(int Dollars, int Cents)
   {
      //Error validation
      if (Dollars < 0 || Cents < 0)
      {
         throw new IllegalArgumentException("Negative dollars or cents");
      }
      
      this.Dollars = (Cents / 100);
      this.Cents = (Cents % 100);
      this.Dollars += Dollars;
   }
   
   public int getDollars()
   {
      return Dollars;
   }
   
   public int getCents()
   {
      return Cents; 
   }   
   
   //Method that creates a new USMoney object that is the sum of the argument USMoney object and the USMoney
   //object that called it.
   public USMoney plus(USMoney object)
   {
      USMoney plus = new USMoney(this.Dollars + object.getDollars(), this.Cents + object.getCents());
      return plus;
   }   
}