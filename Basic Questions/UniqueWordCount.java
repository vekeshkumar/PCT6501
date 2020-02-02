//CODE

import java.io.*;
import java.util.*;
public class UniqueWordCount{
	public static void main(String[] args){
		String inputName;
		Scanner s= new Scanner(System.in);
		inputName = s.nextLine();
		s.close();
		String[] nameArr = inputName.split(" ");
		Set<String> uniqueWordsSet= new HashSet<>(Arrays.asList(nameArr));
		System.out.print(uniqueWordsSet.size());
		
		
	}
	
}