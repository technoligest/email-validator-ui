package com.example.email_validator_ui;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
  

   @Test
   public static int validateEmail(String email) {
	  int result =validateCond1(email)+validateCond2(email)+validateCond3(email)+validateCond4(email);
      return result;
   }
   
   private static int validateCond1(String s){
	   if(s==null)
		   return 0;
	   int count = 0;
	   for(int i=0;i<s.length(); ++i){
		   if(s.charAt(i)=='@')
			   ++count;
		   if(count>1)
			   return 0;
	   }
	   if(count==1)
		   return 1;
	   return 0;
   }
   private static int validateCond2(String s){
	   if(s==null)
		   return 0;
	   for(int i=0;i<s.length(); ++i){
		   if(s.charAt(i)=='.')
			   return 1;
	   }
	   return 0;
   }
   private static int validateCond3(String s){
	   if(s==null)
		   return 0;
	   if(s.length()<5)
		   return 0;
	   return 1;
   }
   
   //checks if there is characters before the @
   private static int validateCond4(String s){
	   if(s==null)
		   return 0;
	   int i;
	   for(i=0;i<s.length(); ++i){
		   if(s.charAt(i)=='@')
			  break;
	   }
	   if(i>0)
		   return 1;
	   return 0;
   }  
}
