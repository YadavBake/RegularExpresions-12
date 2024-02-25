	
											RegularExpresions Part-2 || character matching
										  =================================================

 ---------------------
  character classes
 ---------------------

 -> 
		
		[abc]        => Either 'a' or 'b' or 'c'.
		[^abc]       => Except 'a' and 'b' and 'c'
		[a-z]        => Any lower case alphabet symbol from a to z.
		[A-Z]        => Any Upper case alphabet symbol from A to Z.
		[a-zA-Z]     => Any alphabet symbol.
		[0-9]        => Any digit from 0 to 9.
		[0-9a-zA-Z]  => Any alphanumeric Symbol.
		[^0-9a-zA-Z] => Except alphanumeric character is nothing but special Symbol.
		
		
		
		
		
		
		

	Ex. 
		import java.util.regex.*;
		class RegExeDemo1
		{
			public static void main(String []argg)
			{
				Pattern p = Pattern.compile("[abc]");
                Matcher m = p.matcher("a3b#k@9z");
				while(m.find())
				{
					System.out.println(m.start()+".."+m.end()+".."+m.group());
				}
			}
		}
				
	--------------------------------------------------------------------			
	|x=[abc]| x=[^abc]| x=[a-z]| x=[0-9]| x=[a-zA-Z0-9]| x=[^a-zA-Z0-9]|
	--------------------------------------------------------------------
	|0...a  | 1...3   | 0...a  | 1...3  | 0...a        | 3...#         |
	|2...b  | 3...#   | 2...b  | 6...9  | 1...3        | 5...@         |
	|		| 4...k   | 4...k  |        | 2...b        |               |
	|       | 5...@   | 7...z  |        | 3...#        |               |
	|       | 6...9   |        |        | 4...k        |               |
	|       | 7...z   |        |        | 5...@        |               |
	|       |         |        |        | 6...9        |               |
	|       |         |        |        | 7...z        |               |
	--------------------------------------------------------------------
	
	
	=> Pre-Define character classes .
		
		\s => space character.
		\S => Except space character.
		\d => Any digit from 0 to 9.
		\D => Except digit any character.
		\w => Any word character [0-9a-zA-Z]
		\W => Except word character [special character]
		.  => Any character.
		
		
	
	
	import java.util.regex.*;
		class RegExeDemo1
		{
			public static void main(String []argg)
			{
				Pattern p = Pattern.compile("x");
                Matcher m = p.matcher("a7b k@9z");
				while(m.find())
				{
					System.out.println(m.start()+".."+m.end()+".."+m.group());
				}
			}
		}
	
	-------------------------------------------------------------------
	|x = \\s|  x = \\S |  x = \\d|  x = \\D| x = \\w|  x = \\W|  x = .|
	-------------------------------------------------------------------
	|3...   |  0...a   | 1...7   | 0...a   |0...a   | 3...    | 0...a |
	|       |  1...7   | 6...9   | b...2   |1...7   | 5...@   | 1...7 |
	|       |  2...b   |         | 3...    |2...b   |         | 3...  |
	|       |  4...k   |         | 4...k   |4...k   |         | 2...b |
	|       |  5...@   |         | 5...@   |6...9   |         | 4...k |
	|       |  6...9   |         | 7...z   |7...z   |         | 5...@ |
	|       |  7...z   |         |         |        |         | 6...9 |
	|       |          |    	 |		   |        |         |       |        	   7...z
	|		|		   |		 |		   |		|		  |	      |
	-------------------------------------------------------------------
	
 =============	
  Quantifiers 	
 =============

 -> We can use quantifiers to specify number of occurences to matche .

	a  => Excatly one 'a' 
	a+ => At List one 'a' 
    a* => Any number of 'a's' including 
    a? => At most one 'a'	
 
	
	import java.util.regex.*;
		class RegExeDemo1
		{
			public static void main(String []argg)
			{
				Pattern p = Pattern.compile("a");
                Matcher m = p.matcher("abaabaaab");
				while(m.find())
				{
					System.out.println(m.start()+".."+m.end()+".."+m.group());
				}
			}
		}
	  
	===================================== 
	|x = a |  x = a+  | x = a* | x  = a?|
	=====================================
	|0...a |  0...a   |0...a   |0...a   |
	|2...a |  2...aa  |1...    |1...    |
	|3...a |  5...aaa |2...aa  |2...a   |
	|5...a |          |4...    |3...a   |
	|6...a |          |5...aaa |4...    |
	|7...a |          |8...    |5...a   |
	|      |          |9...    |6...a   |
	|      |          |        |7...a   | 
	|      |          |        |8...    |
	|      |          |        |9...    |
	-------------------------------------
	
	
	
	                                     
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	 
	 
	  
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	