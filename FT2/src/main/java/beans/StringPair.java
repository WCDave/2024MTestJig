package beans;

public class StringPair
	{
		String string1, string2;
		
		public StringPair(){
			
		}
		public StringPair(String string1, String string2)
		{
			this.string1 = string1;
			this.string2 = string2;
		}
		
		public String getString1()
		{
			return string1;
		}
		
		public void setString1(String aString)
		{
			string1 = aString;
		}
		
		public String getString2()
		{
			return string2;
		}
		
		public void setString2(String aString)
		{
			string2 = aString;
		}
	}