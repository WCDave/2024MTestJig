package beans;

public class NonManagedBean {
	
	private String testingString;
	
	public NonManagedBean()
	{
		super();
	}
	
	public String getTestingString()
	{
		return "Hello";
	}
	
	public void setTestingString(String aString)
	{
		this.testingString = aString;
	}

}
