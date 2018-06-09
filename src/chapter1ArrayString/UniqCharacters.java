package chapter1ArrayString;


public class UniqCharacters {

	public static boolean uniqChars(String str)
	{
		if(str.length()>128)
		{
			return false;
		}
		boolean[] charBoolArr = new boolean[128];
		char[] strArr = str.toCharArray();
		for(int i=0;i<strArr.length;i++)
		{
			if(charBoolArr[strArr[i]])
			{
				return false;
			}
			else {
				charBoolArr[strArr[i]]=true;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(uniqChars("deba"));
	}

}
