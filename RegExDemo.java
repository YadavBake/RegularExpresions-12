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
			System.out.println(m.start()+"..."+m.end()+"..."+m.group());
		}
		System.out.println("The total numbers of accurances :"+ count);
	}
}