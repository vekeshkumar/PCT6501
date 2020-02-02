//Transcript Name Printing Problem
/*Analyze - Testcases - Data Structure -Coding*
Analyze :
  FIRSTNAME MIDDLENAME SURNAME -in order
  SURNAME FIRSTNAME MIDDLENAME  - expected output
  Change the order in certain crieteria's
  IF(FIRSTNAME SURNAME )
  FIRSTNAME SURNAME -  CHANGE THE ORDER OF THE  SURNAME ENDING WITH (a,e,i,o,u or A,E,I,O,U)
  FIRSTNAME MIDDLENAME - KEEP THE SEQUENCE HAS IT IS
  
  TESTCASES :
  
  T1 : if Fname Mname Surname  is there  reverse the surname
  T2 : Each Name is max of 50 characters
  T3 :If only 2 words are der then check then check for Second word ends with vowel
  T4: If second word doesn't end with vowel - Print as it is.
  T5 :If only one name/word print as it is.
  T6: If second name ends with any special case then also it will be printed same.
  T7: Name should be printed with space ,each name divide by new line
  T8: After reversing the name, it should be in printed as it was given.
  
  
  DATA STRUCTURES:
  Arrays
  String manipulation  - endswith
  Switch case
*/
//CODE

import java.io.*;
import java.util.*;
public class TranscriptNameProblem{
	public static void main(String[] args){
		String inputName;
		Scanner s= new Scanner(System.in);
		inputName = s.nextLine();
		s.close();
		String[] nameArr = inputName.split(" ");
		boolean isNameEndWithVowel = false;
		if(nameArr.length>0){
			switch(nameArr.length){
				case 1:
					System.out.print(inputName);
					break;
				case 2:
					isNameEndWithVowel  = checkForVowel(nameArr[1]);
					if(isNameEndWithVowel)
						System.out.print(String.join(" ",nameArr[1],nameArr[0]));
					else
					System.out.print(inputName);
				break;
				
				case 3 :		
				System.out.print(String.join(" ",nameArr[2],nameArr[0],nameArr[1]));		
				break;
				default :
				System.out.print(inputName);
			}
		}else
		System.out.print(inputName);

	}
    public static boolean checkForVowel(String givenName){
		ArrayList<String> vowelsList = new ArrayList<>(Arrays.asList("a","e","i","o","u","A","E","I","O","U"));
		
		String lastChar = String.valueOf(givenName.charAt(givenName.length() -1));
		if(vowelsList.contains(lastChar))
			return true;			
		else
			return false;
		
	}
	
}

