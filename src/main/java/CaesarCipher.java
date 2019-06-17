import models.Caesar;

import java.io.Console;

public class CaesarCipher{
    public static void main(String[] ars){
      Console userIn = System.console();
      // Intro to the application
      System.out.println("                                 +-+-+-+-+-+-+-+-+-+-+-+");
      System.out.println("                                     Caesar Cipher");
      System.out.println("                                 +-+-+-+-+-+-+-+-+-+-+-+");
      System.out.println("");
      System.out.println("");
      System.out.println("                                  Welcome to Caesar-Cipher");
      System.out.println("                   Where you can encrypt and decrypt your secret message");
      System.out.println("====================================================");
      System.out.println("  Instructions:");
      System.out.println("================");
      System.out.println("* Choose either the encrypt or decrypt choice");
      System.out.println("* Enter the sentence and the key by which to shift the letters");
      System.out.println("* Wait for your secret message");
      System.out.println("");
      System.out.println("              Lets get started!");

      boolean programRunning = true;

      // Options used to navigate through he application
      System.out.println("=================================================================");
      System.out.println("1. Encrypt a word");
      System.out.println("2. Decrypt a word");
      System.out.println("3. Exit");
      System.out.println("");

      while (programRunning){
      // The user's option selection
      System.out.println("Enter the number of the option you wish to perform:");
      String userChoice = userIn.readLine();

      // Encrypt option
          if (userChoice.equals("1")){
              System.out.println("Enter the sentence/ word:");
              String userSentence = userIn.readLine();
              System.out.println("Enter the key:");
              String userKey = userIn.readLine();
              int userIntKey = Integer.parseInt(userKey);
              Caesar userCaesar = new Caesar(userSentence, userIntKey);
              String userEncryption = userCaesar.encrypt();
              System.out.println("****************************");
              System.out.println(userEncryption);
              System.out.println("****************************");
          }
          // Decrypt option
          else if (userChoice.equals("2")){
              System.out.println("Enter the sentence/ word:");
              String userSentence = userIn.readLine();
              System.out.println("Enter the key:");
              String userKey = userIn.readLine();
              int userIntKey = Integer.parseInt(userKey);
              Caesar userUnCaesar = new Caesar(userSentence, -userIntKey);
              String userDecryption = userUnCaesar.encrypt();
              System.out.println("****************************");
              System.out.println(userDecryption);
          }
          // Exit option
          else if (userChoice.equals("3") || userChoice.equalsIgnoreCase("exit")){
              programRunning = false;
          }
          // Catching an error in the choice entered
          else{
              System.out.println("Error!!!!!!!!!!!!!!!!!!:Please enter a valid choice");
          }
      }
    }
}