package tree;

public class TestHierRelation extends HierRelation {
	
	private Object data;

	public TestHierRelation(Long parent, Long child, Object data) {
		super(parent, child);
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
