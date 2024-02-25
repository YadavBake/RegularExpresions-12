import java.util.regex.*;
		class RegExeDemo1
		{
			public static void main(String []argg)
			{
				Pattern p = Pattern.compile("[abc]");
                /*Pattern p = Pattern.compile("[^abc]");
                Pattern p = Pattern.compile("[a-z]");
                Pattern p = Pattern.compile("[0-9]");
                Pattern p = Pattern.compile("[a-zA-Z0-9]");
                Pattern p = Pattern.compile("[^a-zA-Z0-9]");*/
                
				Matcher m = p.matcher("a3b#k@9z");
				while(m.find())
				{
					System.out.println(m.start()+".."+m.end()+".."+m.group());
				}
			}
		}