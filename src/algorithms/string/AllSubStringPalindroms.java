package algorithms.string;

import java.util.ArrayList;

public class AllSubStringPalindroms {
	

	public static void main(String args[]){
	String s ="jkbvtjtiop";
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> rev = new ArrayList<String>();
	for(int i=0;i<s.length();i++)
	{
	for(int j=i+1;j<=s.length();j++){
	if(s.substring(i,j).length()!= 1)
	{
	 list.add(s.substring(i,j));
	}

	}

	}
	 for(String obj:list)  {
	   String temp = "";
	   
	    char ch1[] =  obj.toCharArray(); 
	    for(int i=ch1.length-1;i>=0;i--) {
	      
	      temp += ch1[i];
	    }
	    rev.add(temp);

	 }  
	list.retainAll(rev);
	System.out.println(list);
	}

}
