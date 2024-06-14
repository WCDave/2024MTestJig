package enums;

public enum BASE_TYPES {
	A(0xb0,"#FF0000"), C(25, "#008000"), G(198, "#0000FF") , T(79, "#00FFFF"), U(207, "#FFFF00");
	
	private byte value;
	private String hexColorString;
	
	private BASE_TYPES(int value, String hexColorString)
	{
		this.value = (byte)value;
		this.hexColorString = hexColorString;
	}

	public byte getValue() {
		return value;
	}
	
	public String getHexColorString()
	{
		return hexColorString;
	}
	
	public static String typeForHexString(String string)
	{
		if(string == null)
		{
			throw new IllegalArgumentException();
		}
		
		String result = null;
		for(BASE_TYPES t:values())
		{
			if(string.equals(t.hexColorString))
			{
				result = t.toString();
				break;
			}
		}
		return result;
	}
}