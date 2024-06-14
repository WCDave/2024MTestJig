package domain;

public class RequestItemDetailProviderUse extends ProviderUse {
	
	private RequestItemDetail requestItemDetail;
	
	public RequestItemDetailProviderUse()
	{
		super.setDescriminator('D');
	}

	public void setRequestItemDetail(RequestItemDetail requestItemDetail) {
		this.requestItemDetail = requestItemDetail;
	}

	public RequestItemDetail getRequestItemDetail() {
		return requestItemDetail;
	}

}
