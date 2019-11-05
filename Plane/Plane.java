//import the scanner
import java.util.Scanner;
public class Plane
{
  //initialize the variables 
  private int FCL = 4;
  private int ECL = 6;
  private String[] fr1 = {"O","O","I","O","O"};
  private String[] fr2 = {"O","O","I","O","O"};
  private String[] fr3 = {"O","O","I","O","O"};
  private String[] fr4 = {"O","O","I","O","O"};
  private String[] fr5 = {"O","O","I","O","O"};
       
  private String[] er1 = {"O","O","O","I","O","O","O"};
  private String[] er2 = {"O","O","O","I","O","O","O"};
  private String[] er3 = {"O","O","O","I","O","O","O"};
  private String[] er4 = {"O","O","O","I","O","O","O"};
  private String[] er5 = {"O","O","O","I","O","O","O"};
  private String[] er6 = {"O","O","O","I","O","O","O"};
  private String[] er7 = {"O","O","O","I","O","O","O"};
  private String[] er8 = {"O","O","O","I","O","O","O"};
  private String[] er9 = {"O","O","O","I","O","O","O"};
  private String[] er10 = {"O","O","O","I","O","O","O"};
  private String[] er11 = {"O","O","O","I","O","O","O"};
  private String[] er12 = {"O","O","O","I","O","O","O"};
  private String[] er13 = {"O","O","O","I","O","O","O"};
  private String[] er14 = {"O","O","O","I","O","O","O"};
  private String[] er15 = {"O","O","O","I","O","O","O"};
  Scanner scan = new Scanner(System.in);
  Scanner scan1 = new Scanner(System.in);
  Scanner scan2 = new Scanner(System.in);
  Scanner scan3 = new Scanner(System.in);
  Scanner scan4 = new Scanner(System.in);
  Scanner scan5 = new Scanner(System.in);
  Scanner scan6 = new Scanner(System.in);
  
  public Plane()
  {     
  }
  
  public void addPass()
  {
      System.out.println("***********New*Passenger**************");
      System.out.println("Would you like First Class or Economy?");
      System.out.println("Enter F for First Class or E for Economy");
      String cls;
      cls = scan.nextLine();
      if (cls.equals("F"))
      {
          newFC();
      }
      else if (cls.equals("E"))
      {
          newEC();
      }
  }
  
  public void newFC()
  {
      System.out.println("********First*Class*Passenger********");
      System.out.println("How many people will be traveling?");
      System.out.println("Enter 1 or 2");
      int numfc = 0;
      numfc = scan1.nextInt();
      if (numfc==2)
      {
          int i = 1;
          if (fr1[0].equals("O") && fr1[1].equals("O"))
          {fr1[0]="" + i; fr1[1]="" + i; i++;}
          if (fr1[3].equals("O") && fr1[4].equals("O"))
          {fr1[3]="" + i; fr1[4]="" + i; i++;}
          if (fr2[0].equals("O") && fr2[1].equals("O"))
          {fr2[0]="" + i; fr2[1]="" + i; i++;}
          if (fr2[3].equals("O") && fr2[4].equals("O"))
          {fr2[3]="" + i; fr2[4]="" + i; i++;}
          if (fr3[0].equals("O") && fr3[1].equals("O"))
          {fr3[0]="" + i; fr3[1]="" + i; i++;}
          if (fr3[3].equals("O") && fr3[4].equals("O"))
          {fr3[3]="" + i; fr3[4]="" + i; i++;}
          if (fr4[0].equals("O") && fr4[1].equals("O"))
          {fr4[0]="" + i; fr4[1]="" + i; i++;}
          if (fr4[3].equals("O") && fr4[4].equals("O"))
          {fr4[3]="" + i; fr4[4]="" + i; i++;}
          if (fr5[0].equals("O") && fr5[1].equals("O"))
          {fr5[0]="" + i; fr5[1]="" + i; i++;}
          if (fr5[3].equals("O") && fr5[4].equals("O"))
          {fr5[3]="" + i; fr5[4]="" + i; i++;}
      }
      else if (numfc==1)
      {
          System.out.println("Is your prefrence Window or Aisle");
          System.out.println("Enter W for Window or A for Aisle");
          String waFC;
          waFC = scan2.nextLine();
          if (waFC.equals("W"))
          {
              int i = 1;
              if (fr1[0].equals("O"))
              {fr1[0]="" + i; i++;}
              if (fr1[4].equals("O"))
              {fr1[4]="" + i; i++;}
              if (fr2[0].equals("O"))
              {fr2[0]="" + i; i++;}
              if (fr2[4].equals("O"))
              {fr2[4]="" + i; i++;}
              if (fr3[0].equals("O"))
              {fr3[0]="" + i; i++;}
              if (fr3[4].equals("O"))
              {fr3[4]="" + i; i++;}
              if (fr4[0].equals("O"))
              {fr4[0]="" + i; i++;}
              if (fr4[4].equals("O"))
              {fr4[4]="" + i; i++;}
              if (fr5[0].equals("O"))
              {fr5[0]="" + i; i++;}
              if (fr5[4].equals("O"))
              {fr5[4]="" + i; i++;}
          }
          else if (waFC.equals("A"))
          {
              int i = 1;
              if (fr1[1].equals("O"))
              {fr1[1]=Integer.toString(i); i++;}
              if (fr1[3].equals("O"))
              {fr1[3]=Integer.toString(i); i++;}
              if (fr2[1].equals("O"))
              {fr2[1]=Integer.toString(i); i++;}
              if (fr2[3].equals("O"))
              {fr2[3]=Integer.toString(i); i++;}
              if (fr3[1].equals("O"))
              {fr3[1]=Integer.toString(i); i++;}
              if (fr3[3].equals("O"))
              {fr3[3]=Integer.toString(i); i++;}
              if (fr4[1].equals("O"))
              {fr4[1]=Integer.toString(i); i++;}
              if (fr4[3].equals("O"))
              {fr4[3]=Integer.toString(i); i++;}
              if (fr5[1].equals("O"))
              {fr5[1]=Integer.toString(i); i++;}
              if (fr5[3].equals("O"))
              {fr5[3]=Integer.toString(i); i++;}
          }
      }
      System.out.println("");
      System.out.println("Here are your options:");
      printFC();
      System.out.println("Select choice by entering option number:");
      int choice = scan3.nextInt();
      for (int i = 0; i<=FCL; i++){
      if (fr1[i].equals(Integer.toString(choice))) fr1[i]="X";}
      for (int i = 0; i<=FCL; i++){
      if (fr2[i].equals(Integer.toString(choice))) fr2[i]="X";}
      for (int i = 0; i<=FCL; i++){
      if (fr3[i].equals(Integer.toString(choice))) fr3[i]="X";}
      for (int i = 0; i<=FCL; i++){
      if (fr4[i].equals(Integer.toString(choice))) fr4[i]="X";}
      for (int i = 0; i<=FCL; i++){
      if (fr5[i].equals(Integer.toString(choice))) fr5[i]="X";}
      clearFC();
    }
  
  public void clearFC()
  {
      for (int i = 0; i<=FCL; i++){
      if (fr1[i].equals("X") || fr1[i].equals("O") || fr1[i].equals("I"))fr1[i]=fr1[i];
      else fr1[i]="O";}
      for (int i = 0; i<=FCL; i++){
      if (fr2[i].equals("X") || fr2[i].equals("O") || fr2[i].equals("I"))fr2[i]=fr2[i];
      else fr2[i]="O";}
      for (int i = 0; i<=FCL; i++){
      if (fr3[i].equals("X") || fr3[i].equals("O") || fr3[i].equals("I"))fr3[i]=fr3[i];
      else fr3[i]="O";}
      for (int i = 0; i<=FCL; i++){
      if (fr4[i].equals("X") || fr4[i].equals("O") || fr4[i].equals("I"))fr4[i]=fr4[i];
      else fr4[i]="O";}
      for (int i = 0; i<=FCL; i++){
      if (fr5[i].equals("X") || fr5[i].equals("O") || fr5[i].equals("I"))fr5[i]=fr5[i];
      else fr5[i]="O";}
  }
   
  public void newEC()
  {
      System.out.println("********Economy*Passenger********");
      System.out.println("How many people will be traveling?");
      System.out.println("Enter 1, 2, or 3");
      int numEc = 0;
      numEc = scan4.nextInt();
      if (numEc==3)
      {
          int i = 1;
          if (er1[0].equals("O") && er1[1].equals("O") && er1[2].equals("O"))
          {er1[0]="" + i; er1[1]="" + i; er1[2]="" + i; i++;}
          if (er1[4].equals("O") && er1[5].equals("O") && er1[6].equals("O"))
          {er1[4]="" + i; er1[5]="" + i; er1[6]="" + i; i++;}
          if (er2[0].equals("O") && er2[1].equals("O") && er2[2].equals("O"))
          {er2[0]="" + i; er2[1]="" + i; er2[2]="" + i; i++;}
          if (er2[4].equals("O") && er2[5].equals("O") && er2[6].equals("O"))
          {er2[4]="" + i; er2[5]="" + i; er2[6]="" + i; i++;}
          if (er3[0].equals("O") && er3[1].equals("O") && er3[2].equals("O"))
          {er3[0]="" + i; er3[1]="" + i; er3[2]="" + i; i++;}
          if (er3[4].equals("O") && er3[5].equals("O") && er3[6].equals("O"))
          {er3[4]="" + i; er3[5]="" + i; er3[6]="" + i; i++;}
          if (er4[0].equals("O") && er4[1].equals("O") && er4[2].equals("O"))
          {er4[0]="" + i; er4[1]="" + i; er4[2]="" + i; i++;}
          if (er4[4].equals("O") && er4[5].equals("O") && er4[6].equals("O"))
          {er4[4]="" + i; er4[5]="" + i; er4[6]="" + i; i++;}
          if (er5[0].equals("O") && er5[1].equals("O") && er5[2].equals("O"))
          {er5[0]="" + i; er5[1]="" + i; er5[2]="" + i; i++;}
          if (er5[4].equals("O") && er5[5].equals("O") && er5[6].equals("O"))
          {er5[4]="" + i; er5[5]="" + i; er5[6]="" + i; i++;}
          if (er6[0].equals("O") && er6[1].equals("O") && er6[2].equals("O"))
          {er6[0]="" + i; er6[1]="" + i; er6[2]="" + i; i++;}
          if (er6[4].equals("O") && er6[5].equals("O") && er6[6].equals("O"))
          {er6[4]="" + i; er6[5]="" + i; er6[6]="" + i; i++;}
          if (er7[0].equals("O") && er7[1].equals("O") && er7[2].equals("O"))
          {er7[0]="" + i; er7[1]="" + i; er7[2]="" + i; i++;}
          if (er7[4].equals("O") && er7[5].equals("O") && er7[6].equals("O"))
          {er7[4]="" + i; er7[5]="" + i; er7[6]="" + i; i++;}
          if (er8[0].equals("O") && er8[1].equals("O") && er8[2].equals("O"))
          {er8[0]="" + i; er8[1]="" + i; er8[2]="" + i; i++;}
          if (er8[4].equals("O") && er8[5].equals("O") && er8[6].equals("O"))
          {er8[4]="" + i; er8[5]="" + i; er8[6]="" + i; i++;}
          if (er9[0].equals("O") && er9[1].equals("O") && er9[2].equals("O"))
          {er9[0]="" + i; er9[1]="" + i; er9[2]="" + i; i++;}
          if (er9[4].equals("O") && er9[5].equals("O") && er9[6].equals("O"))
          {er9[4]="" + i; er9[5]="" + i; er9[6]="" + i; i++;}
          if (er10[0].equals("O") && er10[1].equals("O") && er10[2].equals("O"))
          {er10[0]="" + i; er10[1]="" + i; er10[2]="" + i; i++;}
          if (er10[4].equals("O") && er10[5].equals("O") && er10[6].equals("O"))
          {er10[4]="" + i; er10[5]="" + i; er10[6]="" + i; i++;}
          if (er11[0].equals("O") && er11[1].equals("O") && er11[2].equals("O"))
          {er11[0]="" + i; er11[1]="" + i; er11[2]="" + i; i++;}
          if (er11[4].equals("O") && er11[5].equals("O") && er11[6].equals("O"))
          {er11[4]="" + i; er11[5]="" + i; er11[6]="" + i; i++;}
          if (er12[0].equals("O") && er12[1].equals("O") && er12[2].equals("O"))
          {er12[0]="" + i; er12[1]="" + i; er12[2]="" + i; i++;}
          if (er12[4].equals("O") && er12[5].equals("O") && er12[6].equals("O"))
          {er12[4]="" + i; er12[5]="" + i; er12[6]="" + i; i++;}
          if (er13[0].equals("O") && er13[1].equals("O") && er13[2].equals("O"))
          {er13[0]="" + i; er13[1]="" + i; er13[2]="" + i; i++;}
          if (er13[4].equals("O") && er13[5].equals("O") && er13[6].equals("O"))
          {er13[4]="" + i; er13[5]="" + i; er13[6]="" + i; i++;}
          if (er14[0].equals("O") && er14[1].equals("O") && er14[2].equals("O"))
          {er14[0]="" + i; er14[1]="" + i; er14[2]="" + i; i++;}
          if (er14[4].equals("O") && er14[5].equals("O") && er14[6].equals("O"))
          {er14[4]="" + i; er14[5]="" + i; er14[6]="" + i; i++;}
          if (er15[0].equals("O") && er15[1].equals("O") && er15[2].equals("O"))
          {er15[0]="" + i; er15[1]="" + i; er15[2]="" + i; i++;}
          if (er15[4].equals("O") && er15[5].equals("O") && er15[6].equals("O"))
          {er15[4]="" + i; er15[5]="" + i; er15[6]="" + i; i++;}
      }
      else if (numEc==2)
      {
          int i = 1;
          if (er1[0].equals("O") && er1[1].equals("O"))
          {er1[0]="" + i; er1[1]="" + i; i++;}
          if (er1[4].equals("O") && er1[5].equals("O"))
          {er1[4]="" + i; er1[5]="" + i; i++;}
          if (er2[0].equals("O") && er2[1].equals("O"))
          {er2[0]="" + i; er2[1]="" + i; i++;}
          if (er2[4].equals("O") && er2[5].equals("O"))
          {er2[4]="" + i; er2[5]="" + i; i++;}
          if (er3[0].equals("O") && er3[1].equals("O"))
          {er3[0]="" + i; er3[1]="" + i; i++;}
          if (er3[4].equals("O") && er3[5].equals("O"))
          {er3[4]="" + i; er3[5]="" + i; i++;}
          if (er4[0].equals("O") && er4[1].equals("O"))
          {er4[0]="" + i; er4[1]="" + i; i++;}
          if (er4[4].equals("O") && er4[5].equals("O"))
          {er4[4]="" + i; er4[5]="" + i; i++;}
          if (er5[0].equals("O") && er5[1].equals("O"))
          {er5[0]="" + i; er5[1]="" + i; i++;}
          if (er5[4].equals("O") && er5[5].equals("O"))
          {er5[4]="" + i; er5[5]="" + i; i++;}
          if (er6[0].equals("O") && er6[1].equals("O"))
          {er6[0]="" + i; er6[1]="" + i; i++;}
          if (er6[4].equals("O") && er6[5].equals("O"))
          {er6[4]="" + i; er6[5]="" + i; i++;}
          if (er7[0].equals("O") && er7[1].equals("O"))
          {er7[0]="" + i; er7[1]="" + i; i++;}
          if (er7[4].equals("O") && er7[5].equals("O"))
          {er7[4]="" + i; er7[5]="" + i; i++;}
          if (er8[0].equals("O") && er8[1].equals("O"))
          {er8[0]="" + i; er8[1]="" + i; i++;}
          if (er8[4].equals("O") && er8[5].equals("O"))
          {er8[4]="" + i; er8[5]="" + i; i++;}
          if (er9[0].equals("O") && er9[1].equals("O"))
          {er9[0]="" + i; er9[1]="" + i; i++;}
          if (er9[4].equals("O") && er9[5].equals("O"))
          {er9[4]="" + i; er9[5]="" + i; i++;}
          if (er10[0].equals("O") && er10[1].equals("O"))
          {er10[0]="" + i; er10[1]="" + i; i++;}
          if (er10[4].equals("O") && er10[5].equals("O"))
          {er10[4]="" + i; er10[5]="" + i; i++;}
          if (er11[0].equals("O") && er11[1].equals("O"))
          {er11[0]="" + i; er11[1]="" + i; i++;}
          if (er11[4].equals("O") && er11[5].equals("O"))
          {er11[4]="" + i; er11[5]="" + i; i++;}
          if (er12[0].equals("O") && er12[1].equals("O"))
          {er12[0]="" + i; er12[1]="" + i; i++;}
          if (er12[4].equals("O") && er12[5].equals("O"))
          {er12[4]="" + i; er12[5]="" + i; i++;}
          if (er13[0].equals("O") && er13[1].equals("O"))
          {er13[0]="" + i; er13[1]="" + i; i++;}
          if (er13[4].equals("O") && er13[5].equals("O"))
          {er13[4]="" + i; er13[5]="" + i; i++;}
          if (er14[0].equals("O") && er14[1].equals("O"))
          {er14[0]="" + i; er14[1]="" + i; i++;}
          if (er14[4].equals("O") && er14[5].equals("O"))
          {er14[4]="" + i; er14[5]="" + i; i++;}
          if (er15[0].equals("O") && er15[1].equals("O"))
          {er15[0]="" + i; er15[1]="" + i; i++;}
          if (er15[4].equals("O") && er15[5].equals("O"))
          {er15[4]="" + i; er15[5]="" + i; i++;}
      }
      else if (numEc==1)
      {
          System.out.println("Is your prefrence Window or Aisle");
          System.out.println("Enter W for Window or A for Aisle");
          String waEC;
          waEC = scan5.nextLine();
          if (waEC.equals("W"))
          {
              int i = 1;
              if (er1[0].equals("O"))
              {er1[0]="" + i; i++;}
              if (er1[6].equals("O"))
              {er1[6]="" + i; i++;}
              if (er2[0].equals("O"))
              {er2[0]="" + i; i++;}
              if (er2[6].equals("O"))
              {er2[6]="" + i; i++;}
              if (er3[0].equals("O"))
              {er3[0]="" + i; i++;}
              if (er3[6].equals("O"))
              {er3[6]="" + i; i++;}
              if (er4[0].equals("O"))
              {er4[0]="" + i; i++;}
              if (er4[6].equals("O"))
              {er4[6]="" + i; i++;}
              if (er5[0].equals("O"))
              {er5[0]="" + i; i++;}
              if (er5[6].equals("O"))
              {er5[6]="" + i; i++;}
              if (er6[0].equals("O"))
              {er6[0]="" + i; i++;}
              if (er6[6].equals("O"))
              {er6[6]="" + i; i++;}
              if (er7[0].equals("O"))
              {er7[0]="" + i; i++;}
              if (er7[6].equals("O"))
              {er7[6]="" + i; i++;}
              if (er8[0].equals("O"))
              {er8[0]="" + i; i++;}
              if (er8[6].equals("O"))
              {er8[6]="" + i; i++;}
              if (er9[0].equals("O"))
              {er9[0]="" + i; i++;}
              if (er9[6].equals("O"))
              {er9[6]="" + i; i++;}
              if (er10[0].equals("O"))
              {er10[0]="" + i; i++;}
              if (er10[6].equals("O"))
              {er10[6]="" + i; i++;}
              if (er11[0].equals("O"))
              {er11[0]="" + i; i++;}
              if (er11[6].equals("O"))
              {er11[6]="" + i; i++;}
              if (er12[0].equals("O"))
              {er12[0]="" + i; i++;}
              if (er12[6].equals("O"))
              {er12[6]="" + i; i++;}
              if (er13[0].equals("O"))
              {er13[0]="" + i; i++;}
              if (er13[6].equals("O"))
              {er13[6]="" + i; i++;}
              if (er14[0].equals("O"))
              {er14[0]="" + i; i++;}
              if (er14[6].equals("O"))
              {er14[6]="" + i; i++;}
              if (er15[0].equals("O"))
              {er15[0]="" + i; i++;}
              if (er15[6].equals("O"))
              {er15[6]="" + i; i++;}
          }
          else if (waEC.equals("A"))
          {
              int i = 1;
              if (er1[2].equals("O"))
              {er1[2]="" + i; i++;}
              if (er1[4].equals("O"))
              {er1[4]="" + i; i++;}
              if (er2[2].equals("O"))
              {er2[2]="" + i; i++;}
              if (er2[4].equals("O"))
              {er2[4]="" + i; i++;}
              if (er3[2].equals("O"))
              {er3[2]="" + i; i++;}
              if (er3[4].equals("O"))
              {er3[4]="" + i; i++;}
              if (er4[2].equals("O"))
              {er4[2]="" + i; i++;}
              if (er4[4].equals("O"))
              {er4[4]="" + i; i++;}
              if (er5[2].equals("O"))
              {er5[2]="" + i; i++;}
              if (er5[4].equals("O"))
              {er5[4]="" + i; i++;}
              if (er6[2].equals("O"))
              {er6[2]="" + i; i++;}
              if (er6[4].equals("O"))
              {er6[4]="" + i; i++;}
              if (er7[2].equals("O"))
              {er7[2]="" + i; i++;}
              if (er7[4].equals("O"))
              {er7[4]="" + i; i++;}
              if (er8[2].equals("O"))
              {er8[2]="" + i; i++;}
              if (er8[4].equals("O"))
              {er8[4]="" + i; i++;}
              if (er9[2].equals("O"))
              {er9[2]="" + i; i++;}
              if (er9[4].equals("O"))
              {er9[4]="" + i; i++;}
              if (er10[2].equals("O"))
              {er10[2]="" + i; i++;}
              if (er10[4].equals("O"))
              {er10[4]="" + i; i++;}
              if (er11[2].equals("O"))
              {er11[2]="" + i; i++;}
              if (er11[4].equals("O"))
              {er11[4]="" + i; i++;}
              if (er12[2].equals("O"))
              {er12[2]="" + i; i++;}
              if (er12[4].equals("O"))
              {er12[4]="" + i; i++;}
              if (er13[2].equals("O"))
              {er13[2]="" + i; i++;}
              if (er13[4].equals("O"))
              {er13[4]="" + i; i++;}
              if (er14[2].equals("O"))
              {er14[2]="" + i; i++;}
              if (er14[4].equals("O"))
              {er14[4]="" + i; i++;}
              if (er15[2].equals("O"))
              {er15[2]="" + i; i++;}
              if (er15[4].equals("O"))
              {er15[4]="" + i; i++;}
          }
      }
      System.out.println("");
      System.out.println("Here are your options:");
      printEC();
      System.out.println("Select choice by entering option number:");
      int choice = scan6.nextInt();
      for (int i = 0; i<=ECL; i++){
      if (er1[i].equals(Integer.toString(choice))) er1[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er2[i].equals(Integer.toString(choice))) er2[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er3[i].equals(Integer.toString(choice))) er3[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er4[i].equals(Integer.toString(choice))) er4[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er5[i].equals(Integer.toString(choice))) er5[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er6[i].equals(Integer.toString(choice))) er6[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er7[i].equals(Integer.toString(choice))) er7[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er8[i].equals(Integer.toString(choice))) er8[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er9[i].equals(Integer.toString(choice))) er9[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er10[i].equals(Integer.toString(choice))) er10[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er11[i].equals(Integer.toString(choice))) er11[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er12[i].equals(Integer.toString(choice))) er12[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er13[i].equals(Integer.toString(choice))) er13[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er14[i].equals(Integer.toString(choice))) er14[i]="X";}
      for (int i = 0; i<=ECL; i++){
      if (er15[i].equals(Integer.toString(choice))) er15[i]="X";}
      clearEC();
  }   
  
  public void clearEC()
  {
      for (int i = 0; i<=ECL; i++){
      if (er1[i].equals("X") || er1[i].equals("O") || er1[i].equals("I"))er1[i]=er1[i];
      else er1[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er2[i].equals("X") || er2[i].equals("O") || er2[i].equals("I"))er2[i]=er2[i];
      else er2[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er3[i].equals("X") || er3[i].equals("O") || er3[i].equals("I"))er3[i]=er3[i];
      else er3[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er4[i].equals("X") || er4[i].equals("O") || er4[i].equals("I"))er4[i]=er4[i];
      else er4[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er5[i].equals("X") || er5[i].equals("O") || er5[i].equals("I"))er5[i]=er5[i];
      else er5[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er6[i].equals("X") || er6[i].equals("O") || er6[i].equals("I"))er6[i]=er6[i];
      else er6[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er7[i].equals("X") || er7[i].equals("O") || er7[i].equals("I"))er7[i]=er7[i];
      else er7[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er8[i].equals("X") || er8[i].equals("O") || er8[i].equals("I"))er8[i]=er8[i];
      else er8[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er9[i].equals("X") || er9[i].equals("O") || er9[i].equals("I"))er9[i]=er9[i];
      else er9[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er10[i].equals("X") || er10[i].equals("O") || er10[i].equals("I"))er10[i]=er10[i];
      else er10[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er11[i].equals("X") || er11[i].equals("O") || er11[i].equals("I"))er11[i]=er11[i];
      else er11[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er12[i].equals("X") || er12[i].equals("O") || er12[i].equals("I"))er12[i]=er12[i];
      else er12[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er13[i].equals("X") || er13[i].equals("O") || er13[i].equals("I"))er13[i]=er13[i];
      else er13[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er14[i].equals("X") || er14[i].equals("O") || er14[i].equals("I"))er14[i]=er14[i];
      else er14[i]="O";}
      for (int i = 0; i<=ECL; i++){
      if (er15[i].equals("X") || er15[i].equals("O") || er15[i].equals("I"))er15[i]=er15[i];
      else er15[i]="O";}
  }
  
  public void printCmd()
  {
      System.out.println("**************************");
      System.out.println("Enter A to add passengers");
      System.out.println("Enter P to print seating");
      System.out.println("");
      System.out.println("Enter Q to Quit");
      System.out.println("**************************");
  }
 
  public void printFC()
  {
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr1[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr2[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr3[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr4[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr5[i]+" ");
      System.out.println();
  }
  
  public void printEC()
  {
      for (int i = 0; i<=ECL; i++)
      System.out.print(er1[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er2[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er3[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er4[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er5[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er6[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er7[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er8[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er9[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er10[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er11[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er12[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er13[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er14[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er15[i]+" ");
      System.out.println();
  } 
  
  //print seating
  public void printAll()
   {
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr1[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr2[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr3[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr4[i]+" ");
      System.out.println();
      System.out.print("  ");
      for (int i = 0; i<=FCL; i++)
      System.out.print(fr5[i]+" ");
      System.out.println();
     
      for (int i = 0; i<=ECL; i++)
      System.out.print(er1[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er2[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er3[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er4[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er5[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er6[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er7[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er8[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er9[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er10[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er11[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er12[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er13[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er14[i]+" ");
      System.out.println();
      for (int i = 0; i<=ECL; i++)
      System.out.print(er15[i]+" ");
      System.out.println();
   }
    
}
