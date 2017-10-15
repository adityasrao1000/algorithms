package algorithms.string;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWords {

	static void duplicateWords(String inputString)
    {
		if(inputString.trim().length()==0 || inputString == null) {
			System.out.println("cannot commute for null string");
			System.exit(0);
		}
    //Splitting inputString into words
    String[] words = inputString.split(" ");

    //Creating one HashMap with words as key and their count as value

    HashMap<String, Integer> wordCount = new HashMap<String, Integer>();

    //Checking each word

    for (String word : words)
    {
        //whether it is present in wordCount

        if(wordCount.containsKey(word.toLowerCase()))
        {
            //If it is present, incrementing it's count by 1

            wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
        }
        else
        {
            //If it is not present, put that word into wordCount with 1 as it's value

            wordCount.put(word.toLowerCase(), 1);
        }
    }

    //Extracting all keys of wordCount

    Set<String> wordsInString = wordCount.keySet();

    //Iterating through all words in wordCount

    for (String word : wordsInString)
    {
        //if word count is greater than 1

        if(wordCount.get(word) > 1)
        {
            //Printing that word and it's count

            System.out.println(word+" : "+wordCount.get(word));
        }
    }
}

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	
	//table input from the user
	System.out.println("Enter a sentence");
	String s=sc.nextLine();
	
	
    duplicateWords(s);
    sc.close();

}

}
