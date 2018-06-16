package chapter1ArrayString;

public class URLify {
	
	public static String urlify(String str)
	{
		String[] strArr = str.trim().split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<strArr.length;i++)
		{
			String s =(i<strArr.length-1)?(strArr[i]+"%20"):(strArr[i]);
			sb.append(s);
		}
		return sb.toString();
	}
	
	public static int a(int x)
	{
		System.out.println(x);
		for(int i=0;i<3;++i)
		{
			x=x+1;
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		System.out.println(urlify("Hello Debasish How are You?"));
		String s="j";
		String s1=new String("j");
		System.out.println(s.compareTo(s1));
		int x = 5;
		int y=0;
		y+=y + a(x) + ++x;
		System.out.println(y);
		switch(10000) {
		case 1_00_00 : System.out.println("hi");
		}	
	}
}
