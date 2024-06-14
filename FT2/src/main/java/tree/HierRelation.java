package tree;

public class HierRelation {
	
	private Long parentPid;
	private Long childPid;
	
	public HierRelation(Long parent, Long child)
	{
		this.parentPid = parent;
		this.childPid = child;
	}
	public Long getParentPid() {
		
		return parentPid;
	}
	public void setParentPid(Long parentPid) {
		this.parentPid = parentPid;
	}
	public Long getChildPid() {
		return childPid;
	}
	public void setChildPid(Long childPid) {
		this.childPid = childPid;
	}

}
