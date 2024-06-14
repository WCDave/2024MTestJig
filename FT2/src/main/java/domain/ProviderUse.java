package domain;

public abstract class ProviderUse {
	
	private Long pid;
	private Provider provider;
	private char descriminator;
	private Use use;
	
	public ProviderUse()
	{
		
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getPid() {
		return pid;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setDescriminator(char descriminator) {
		this.descriminator = descriminator;
	}

	public char getDescriminator() {
		return descriminator;
	}

	public void setUse(Use use) {
		this.use = use;
	}

	public Use getUse() {
		return use;
	}

}
