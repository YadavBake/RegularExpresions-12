/*import java.io.*;
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
		}*/
		
		
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