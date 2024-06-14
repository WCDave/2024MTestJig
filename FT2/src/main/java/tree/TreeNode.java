package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode implements ITreeNode {
	
	private boolean isRoot;
	private ITreeNode parentNode;
	private List<Long> childList = new ArrayList<Long>();
	private Long pid;
	private Object data;
	
	public TreeNode(Long pid, Object data) {
		this.pid = pid;
		this.data = data;
	}

	@Override
	public ITreeNode getParentNode() {
		return parentNode;
	}

	@Override
	public List<Long> getChildNodes() {
		return childList;
	}

	@Override
	public Long getPid() {
		return pid;
	}

	@Override
	public Object getData() {
		return data;
	}

	@Override
	public boolean isRoot() {
		return isRoot;
	}

	@Override
	public void setParentNode(ITreeNode parentNode) {
		this.parentNode = parentNode;
		
	}

	@Override
	public void setRoot(boolean isRoot) {
		this.isRoot = isRoot;		
	}

}
