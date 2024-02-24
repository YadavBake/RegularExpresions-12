
											RegularExpresions Part-1  Introduction
										  ==========================================

 
 -------------------
  RegularExpresions
 ------------------- 
  
 -> If you want to reprasent a group of Strings according to a particular pattern then we should go for RegularExpresions.
	
	Ex.1 
	
		- We can write RegularExpresions to reprasent all valid mobile numbers.
		
		- We can write RegularExpresions to reprasent all mail Id's.
		

 -> The main important application areas of RegularExpresions are.
 
		- To develop validation frameworks.
		
		- To develop pattern application.(CTR+F in windows and Grep in UNIX)
		
		- To develop translators like Assemblers,compilers,Interpritors ect.
		
		- To develop Digital circutes. 
		
		- To develop communication protocols like TCP/IP,UDP ect.
		
		

 Ex.
 
	import java.util.regex.*;
	class RegExDemo
	{
		public static void main(String args[])
		{
			int count = 0;
			Pattern p = Pattern.compile("ab");
			Matcher m = p.matcher("abbabbba");
			while(m.find())
			{
				count++;
				System.out.println(m.start());
				System.out.println(m.start()+"..."+m.end()+"..."+m.group());
			}
			System.out.println("The total numbers of accurances :"+ count);
		}
	}
	
	
 -> Pattern

	 - A pattern object is a compiled version of RegularExpresions that is it is java equivalent object of pattern.
	 
	 - We can create a pattern object by using compile() method of pattern class.
	 
			--------------------------------------------------------
			|public static Pattern compile(String RegularExpresions)|
			---------------------------------------------------------
						
			Ex. 
			
				Pattern p = Pattern.compile("ab");
	
	- We can use matcher object to check the given pattern in the target String.
	
	- We can create matcher object by using matcher() method of pattern class.
		
		---------------------------------------
		|public Matcher matcher(String target)|
		---------------------------------------
				
		Ex. 
		
			Matcher m = p.matcher("abbabbba");
			
   -----------------------------------			
	Importent method of Matcher class 		
   -----------------------------------

	1. boolean find();
		
		- It attemps to find next match and returns true if it is available.
	
	2. int start();
	
		- returns start index of the match.

	3. int end();
		
		- returns end+1 index of the match.
		
	4. Sting group();
	
		- It returns the matched pattern.
		

 Note:
 
	Pattern and Matcher classes prasent in java.util.regex package and introduce in 1.4v version.
	
		