import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6];
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++)
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
 String hey = new String();               // letters only
  for (int i =0; i<word.length(); i++)
  {
if(Character.isLetter(word.charAt(i)))
hey+=word.charAt(i);
  }
 
    String checka = new String();
  for (int i=0; i<hey.length(); i++){
    if (hey.charAt(i)!=' ')
checka+=hey.charAt(i);    
  }
 checka = checka.toLowerCase();
 
  if (checka.equals(reverse(word)))
  return true;
  return false;
}
public String reverse(String str)
{
  String somet = new String();               // letters only
  for (int i =0; i<str.length(); i++)
  {
if(Character.isLetter(str.charAt(i)))
somet+=str.charAt(i);
  }
 
    String wasup = new String();
  for (int i=0; i<somet.length(); i++){
    if (somet.charAt(i)!=' ')
wasup+=somet.charAt(i);    
  }
 
    String sNew = new String();            
   for (int s = wasup.length()-1;s>=0; s--)
   {
     sNew+=wasup.charAt(s);
   }
sNew=sNew.toLowerCase();
    return sNew;
}
}
