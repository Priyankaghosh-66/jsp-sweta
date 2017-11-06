/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo1;

import java.util.Scanner;

/**
 *
 * @author KOL-FACULTY01
 */
public class EmployeeDetails {


     public void showMenu ()  {
         int option;
        
         System.out.println("------------Menu--------");
         System.out.println("1. Enter Data");
         System.out.println("2. Display Data");
         System.out.println("3. Exit");
         System.out.println("\nChoose the option:  ");
          Scanner sc=new Scanner(System.in);
         option=sc.nextInt();


        // option = 1;
  switch (option)  {
  case 1:
   enterData();
   break;
  case 2:
   DisplayData();
   break;
  case 3:
   exitMenu();
   break;
  default:
   System.out.println("Incorrect menu option");
   showMenu();
   break;
    }
  }
  public void enterData() {
   System.out.println("enterData method is invoked");
  }

  public void DisplayData() {
   System.out.println("displayData method is invoked");
  }
  

  public void exitMenu() {
   System.out.println("exitMenu method is invoked");
   System.exit(0);
  }

  public static void main(String[] args)  {
   EmployeeDetails obj = new EmployeeDetails();
   obj.showMenu();
     }
  }
    

