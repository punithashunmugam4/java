package Graph;

public class CycleNode {
	int curr_node;
	int parent_node;
	CycleNode(int curr_node,int parent_node){
		this.curr_node=curr_node;
		this.parent_node=parent_node;
	}
}
