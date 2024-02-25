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


	