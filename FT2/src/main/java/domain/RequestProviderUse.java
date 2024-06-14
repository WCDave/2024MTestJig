package domain;

public class RequestProviderUse extends ProviderUse {
	
	private Request request;
	
	public RequestProviderUse()
	{
		super.setDescriminator('R');
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Request getRequest() {
		return request;
	}

}
