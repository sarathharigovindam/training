package fileoperatilon;
import java.io.*;
import java.util.*;

	public class CreatingFile {

	  public static void main(String[] args)  {
	    String str = "Hi this is a test File Created by Ganesh";
	    try {

	      // Creating File
	      File f1 = new File("test.txt");
	      if (!f1.exists()) {

	        f1.createNewFile();

	        System.out.println("File  Created Successfully\n");

	      }

	      else {
	        System.out.println("File Already Exist\n");
	      }

	      // Writing Contents to the File

	      FileWriter writeFile = new FileWriter("test.txt");
	      writeFile.write(str);
	      writeFile.close();
	      System.out.println("Data Written Successfully\n");

	      System.out.println("The data present in the " + f1 + " is\n");

	      // Reading File Contents
	      Scanner readFile = new Scanner(f1);
	      while (readFile.hasNextLine()) {
	        System.out.println(readFile.nextLine());
	      }
	             readFile.close();
	      // Appending new data to the Existing File

	      String dataAdded = "\nThis data is appended to the text file";
	      FileWriter obj = new FileWriter("test.txt", true);
	      obj.write(dataAdded);
	      System.out.println("\nData Appended Successfully\n");
	      obj.close();

	      // Printing Contents in the File

	      Scanner testAppend = new Scanner(f1);
	      while (testAppend.hasNextLine()) {
	        System.out.println(testAppend.nextLine());
	      }
	      testAppend.close();
	            
	      System.out.println("\nDo you want to delete the file? Y or N");
	      Scanner s= new Scanner(System.in);
	      char option=s.next().charAt(0);
	      if((option=='Y')||(option=='y'))
	      {
	        //Deleting A File.
	      if(f1.delete())
	      {
	        System.out.println("\nFile Deleted\n");
	      
	      }
	      else
	      {
	        System.out.println("Error\n");
	      }
	    }
	    } catch (Exception e) {
	      System.out.println("Error\n");
	      e.toString();
	    }

	  }

	}

