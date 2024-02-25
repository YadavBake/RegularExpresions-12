
										RegularExpresions Part-4 || How to use Regular Expresions
									  =============================================================


 -> Write a program to check whether the given number is valid mobile number or not ?

	import java.util.regex.*;
	class RegexDemo1
	{
		public static void main(String args[])
		{
			Pattern p = Pattern.compile("(0/91)[7-9][0-9]{9}");
			Matcher m = p.matcher(args[0]);
			if(m.find()&&m.group().equals(args[0]))
			{
				System.out.println("valid mobile number");
			}else 
			{
				System.out.println("Invalid mobile number");
			}
		}
	}
	
 -> Write a program to check whether the given mail id is valid or not /

	- In the program we have to replace mobile number RegularExpresions with Mail id RegularExpresions.



	import java.util.regex.*;
	class RegexDemo1
	{
		public static void main(String args[])
		{
			Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
			Matcher m = p.matcher(args[0]);
			if(m.find()&&m.group().equals(args[0]))
			{
				System.out.println("valid mobile number");
			}else 
			{
				System.out.println("Invalid mobile number");
			}
		}
	}
	
	
 -> Write a program to read all mobile number prasent in the given inputfile where mobile number mixed with normal text 
	data.
	
		import java.io.*;
		import java.util.regex.*;
		class MobileNumberExtractor
		{
			public static void main (String args[]) throws Exception 
			{
				PrintWriter pw = new PrintWriter("output.txt");
				Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");//creating pattern object for mobile number
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));// for reading file data 
				String line = br.readLine();
				while(line !=null)
				{
					Matcher m = p.matcher(line);
					while(m.find())
					{
						pw.println(m.group());
					}
					line= br.readLine();
				}
				pw.flush();
			}
		}
	
	
 -> Write a program to read all mail id  prasent in the given inputfile where mobile number mixed with normal text 
	data.

	- In the program we have to replace mobile number RegularExpresions with Mail id RegularExpresions.	
	
	
		import java.io.*;
		import java.util.regex.*;
		class MobileNumberExtractor
		{
			public static void main (String args[]) throws Exception 
			{
				PrintWriter pw = new PrintWriter("output.txt");
				Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");//creating pattern object for mobile number
				BufferedReader br = new BufferedReader(new FileReader("input.txt"));// for reading file data 
				String line = br.readLine();
				while(line !=null)
				{
					Matcher m = p.matcher(line);
					while(m.find())
					{
						pw.println(m.group());
					}
					line= br.readLine();
				}
				pw.flush();
			}
		}
		
		
  -> Write a program to display all .txt file names prasent in D:\\ Durga_class ?
  
	[a-zA-Z0-9_.$]+[.]txt

	import java.io.*;
	import java.util.regex.*;
	class FileNameExtractorName 
	{
		public static void main(String args[])
		{
			int count = 0;
			//Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]class");
			//Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]java");
			//Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt");
			Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.](class|java|txt)");
			File f  = new File("D:\\java_note_Durga_sir\\RegularExpresions - 12");
			String s[] = f.list();
			for( String s1 : s)
			{
				Matcher m = p.matcher(s1);
				if(m.find()&& m.group().equals(s1))
				{	
					count++;
					System.out.println(s1);
				}
			}
			System.out.println("The total number :" + count);
		}
	}


	

	