/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameconsole;

/**
 *
 * @author KOL-FACULTY01
 */
 
public abstract class GameConsole  {

   int score;
    void displayScore ()   {
   System.out.println("The displayScore method.");
  }
  
  abstract void computeScore();
  abstract void playGame();
 }

 class Badminton extends GameConsole{

  void playGame()   {
   System.out.println("Starting the Badmintion Game...");
  }

  void computeScore()  {
   System.out.println("Calculating Score for the Badmintion Game...");
  }
 }
  class TableTennis extends GameConsole  {

  void playGame()   {
   System.out.println("Starting the TableTennis Game...");
  }
  void computeScore()  {
   System.out.println("Calculating Score for the TableTennis Game...");
  }
 }

 
    
