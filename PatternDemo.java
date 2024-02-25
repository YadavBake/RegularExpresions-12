/*import java.util.regex.*;
	class PatternDemo
	{
		public static void main(String args[])
		{
			//Pattern p = Pattern.compile("\\s");
			//Pattern p = Pattern.compile("a");
			Pattern p = Pattern.compile("o");
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
			
			//Pattern p = Pattern.compile("\\.");
			//Pattern p = Pattern.compile("\\.");
			Pattern p = Pattern.compile("[.]");
			String []s = p.split("www.durgajobs.com");
			for(String s1 : s)
			{
				System.out.println(s1);
			}
		}
	}*/

	import java.util.regex.*;
	class PatternDemo
	{
		public static void main(String args[])
		{
			
			String s ="Durga Software Solutions";
			String []s1 = s.split("\\s");

			for(String s2 : s1)
			{
				System.out.println(s2);
			}
		}
	}		
	
	
	