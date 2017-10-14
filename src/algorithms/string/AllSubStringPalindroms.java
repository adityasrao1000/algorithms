package algorithms.string;

import java.util.ArrayList;

public class AllSubStringPalindroms {
	

	public static void main(String args[]){
	String s ="jkbvtjtiop";
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
	System.out.println(list);
	}

}
