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
	public static void main(String[] args) {
		System.out.println(urlify("Hello Debasish How are You?"));
	}

}
