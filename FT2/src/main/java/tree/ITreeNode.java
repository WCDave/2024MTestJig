package tree;

import java.util.List;

public interface ITreeNode {
	
	ITreeNode getParentNode();
	List<Long> getChildNodes();
	Long getPid();
	Object getData();
	boolean isRoot();
	void setParentNode(ITreeNode parentNode);
	void setRoot(boolean isRoot);

}
