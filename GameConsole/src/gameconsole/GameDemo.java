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
public class GameDemo   {
  
  public static void main(String args[])   {
   Badminton obj1 = new Badminton ();
   obj1.playGame();
   obj1.computeScore();
   obj1.displayScore();

   TableTennis obj2 = new TableTennis();
   obj2.playGame();
   obj2.computeScore();
   obj2.displayScore();
  }
 }