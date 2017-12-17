package algorithms.string;

import java.util.Hashtable;
import java.util.Map;

public class FirstRepeatingCharacter { 
	
public static void main(String[] args) {  
	
   String s ="asdfsfhjs";
   Hashtable<Character,Integer> m=new Hashtable<Character,Integer>();
   // during the first pass add everything to a hashtable
   for(int i= 0;i<s.length();i++){
	   
    if(m.containsKey(s.charAt(i))){
       //increment value of key if it already exists
       int value=  m.get(s.charAt(i));
       m.put(s.charAt(i),++value);
       
    }else{
       //else insert 
       m.put(s.charAt(i),1);

    } 
    
   }
  
  //second pass, check for the first key with value greater than one and print
  for(Map.Entry<Character,Integer> m1: m.entrySet()){  
	  
   if((int)m1.getValue()>1){
	   
    System.out.println(m1.getKey()+ " "+ m1.getValue());
	break;
  }
 
   
  }
 }  
}  
