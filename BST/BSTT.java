public class BSTT{
	Node root;

	public void append(int data){
		Node adding = new Node(data);
		if(root == null){
			root = adding;

		}
		else{
			Node currentnode = root;
			Node helpernode;
			while(currentnode != null){
				helpernode = currentnode;
				if( data < currentnode.data){
					currentnode = currentnode.left;
					if(currentnode == null){
						helpernode.left = adding;
					}
					
				}
				
				else if(data > currentnode.data ){
					currentnode = currentnode.right;
					if(currentnode == null){
						helpernode.right = adding; 
					}
				}
			}
			
		}
	}
	public int delete(int data){
		
		Node currentnode = root;
		Node helper;
		while(currentnode.data != data){
			helper = currentnode;
			if(data > currentnode.data){
				currentnode = currentnode.right;
			}
			else if(data < currentnode.data){
				currentnode = currentnode.left;
			}
	
		}
		System.out.println(currentnode.data);
		if(currentnode.left == null && currentnode.right == null){
			currentnode = null;
		}
		return 1;

	}
	public void print(){
		System.out.println(root.data);
		System.out.println(root.left.data);

		System.out.println(root.right.data);

		System.out.println(root.right.right.data);
		System.out.println(root.right.right.right.data);
		
		

	}
}
