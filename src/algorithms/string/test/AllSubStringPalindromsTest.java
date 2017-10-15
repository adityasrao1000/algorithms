package algorithms.string.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test; 
public class AllSubStringPalindromsTest {
	@Test  
    public void testFindMax(){  
		String s = "asa";
		Pattern pattern = Pattern.compile("\\s");
		Matcher matcher = pattern.matcher(s);
		
		//check if white spaces exist
		if(matcher.find()) {
			System.out.println("string cannot contain white spaces. Please enter a string without white spaces.");
			System.exit(0);
		}
		//create array list to hold all substrings
		ArrayList<String> list = new ArrayList<String>();
		//create array list to hold reversed substrings
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
		   //create temporary string to hold substring values
		   String temp = "";
		   
		    char ch1[] =  obj.toCharArray(); 
		    for(int i=ch1.length-1;i>=0;i--) {	      
		      temp += ch1[i];
		    }
		    rev.add(temp);

		 }  
		
		//only keep strings that are the same in both lists
		list.retainAll(rev);
		if(list.isEmpty()) {
			System.out.println("no palindrome's exist");
			System.exit(0);
		}
		
		Set<String> set = new HashSet<String>(list);
		assertEquals(3,list.size());  
		
	
        
    }  
}
