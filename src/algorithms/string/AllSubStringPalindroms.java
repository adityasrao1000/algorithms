package algorithms.string;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllSubStringPalindroms {
	

  public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	
	//table input from the user
	System.out.println("Enter the string");  
	String s=sc.nextLine(); 
	sc.close();
	Pattern pattern = Pattern.compile("\\s");
	Matcher matcher = pattern.matcher(s);
	
	//check if white spaces exist
	if(matcher.find()) {
		System.out.println("string cannot contain white spaces. Please enter a string without white spaces.");
		System.exit(0);
	}
	//create arraylist to hold all substrings
	ArrayList<String> list = new ArrayList<String>();
	//create arraylist to hold reversed substrings
	ArrayList<String> rev = new ArrayList<String>();
	
	//algorithm to extract every possible substring
	for(int i=0;i<s.length();i++)
	{
	  for(int j=i+1;j<=s.length();j++){
	    if(s.substring(i,j).length()!= 1)
		{
		  list.add(s.substring(i,j));
		}
	  }
	}
	
	//algorithm to  extract and reverse all substrings
	 for(String obj:list)  {
	   String temp = "";
	   
	    char ch1[] =  obj.toCharArray(); 
	    for(int i=ch1.length-1;i>=0;i--) {
	      
	      temp += ch1[i];
	    }
	    rev.add(temp);

	 }  
	
	//only keep strings that are the same in both lists
	list.retainAll(rev);
	//print results
	System.out.println("Total number of palindrome strings: "+ list.size());
	System.out.println(list);
	}

}
