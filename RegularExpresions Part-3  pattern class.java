
											RegularExpresions Part-3 || pattern class
										  ============================================

 
 ------------------------------
  Pattern class split() method 
 ------------------------------

  -> We can use pattern class split() method to split the target string according to a particular pattern.

	
	import java.util.regex.*;
	class PatternDemo
	{
		public static void main(String args[])
		{
			Pattern p = Pattern.compile("\\s");
			//Pattern p = Pattern.compile("a");
			//Pattern p = Pattern.compile("o");
			//Pattern p = Pattern.compile("b");
			//Pattern p = Pattern.compile("\\.");
			String []s = p.split("Durga  Software  Solution");
			for(String s1 : s)
			{
				System.out.println(s1);
			}
		}
	}
	
	
	import java.util.regex.*;
	class PatternDemo
	{
		public static void main(String args[])
		{
			
			//Pattern p = Pattern.compile(".");
			//Pattern p = Pattern.compile("\\.");
			Pattern p = Pattern.compile("[.]");
			String []s = p.split("www.durgajobs.com");
								 ------------------
			for(String s1 : s)			|------------>// target is here 
			{
				System.out.println(s1);
			}
		}
	}	
	
	www
	durgajobs
	com
-----------------------------
 String class split() method 
-----------------------------

 -> String class also contains split() method to split the target string according to a particular pattern.
 

	import java.util.regex.*;
	class PatternDemo
	{
		public static void main(String args[])
		{
			
			String s ="Durga Software Solutions";
			String []s1 = p.split("\\s");
								  -----	
			for(String s1 : s)		--->// pattern is here 
			{
				System.out.println(s1);
			}
		}
	}	
	
	www
	durgajobs
	com

 Note: 
 
	- Pattern class split() method can take "target String as argument" where as String class split() method can take 
	  "Pattern as argument"
	  
	  
----------------- 
 StringTokenizer 
-----------------

 -> It is a specially designed class for tokenzetion activity.
 
 -> String tokenizer prasent in java.util.
 
 -> 
 
 
	import java.util.*;
	class StringTokenizerDemo
	{
		public static void main(String args[])
		{
			StringTokenizer st  = new StringTokenizer("Durga Software Solutions");
			while(st.hasmoreTokens())
			{
				System.out.println(st.nextToken());
			}
		}
	}
	Durga
	Software
	Solutions
	
 Note: 
 
	- The default regular Expression for StringTokenizer is 'space'.
	
	
	

	import java.util.*;
	class StringTokenizerDemo
	{
		public static void main(String args[])
		{
			StringTokenizer st  = new StringTokenizer("19-09-2014", 		"_"				);
			while(st.hasmoreTokens())				   -----------	   --------------------
			{												|			 		|
				System.out.println(st.nextToken());	  /*Target String       RegularExpresions or 		
			}														   	    Pattern or  	
		}																    Delims	*/
	}
	
	19
	09
	2014	



 -> Write RegularExpresions to reprasent all valid 10 digit mobile numbers ?
 
	- Ruls 
		
		Every number should containe exactly 10 digits.
		
		The first digit should be 7 or 8 or 9.
		
		[abc] == [789]
		[0-9] == [0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]	

					[or]
		[7-9]
		[0-9]{9} // These reprasent all 10 digit mobile number.
		
		
		10-digit or 11-digit 		10-digit or 11-digit or 12-digit
		                            
		0?[7-9][0-9]{9}             (0/91)?[7-9][0-9]{9}
		
		
		
 -> Write RegularExpresions to reprasent valid mail ids ?


	

	d123_xyz.k@gmail.com 


	[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+	([.][a-zA-Z]+)+ // These is the reprasent of mail id.
	
	=> '+' plus symbol reprasent take any charcter at list one charcter.
	=> '*' multiplication reprasent any number of times we take.
	=> '[.]' considar '.' dot as symbol only that why we take dot in squar bracket.
	
	Only gmail id's 
	
	
	[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com 
	
	
 -> Write RegularExpresions to reprasent all yava language indentifiers	:


	Rules:

		- Allowed charcters are //a to z, A to Z , 0 to 9 , #, $.

		- Length of each indentifier should be at list 2 length.
		
		- The first charcter should be lower case alphabet symbol from // a to k.
		
		- Second charcter should be a digit divisiable by 3 .(0,3,6,9).
		
		
		
		[a-k][0369][a-zA-Z0-9#$]*
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		



























