import java.util.*;



public class Main{
	public static void main(String[] args){
		BSTT tree = new BSTT();
		tree.append(5);
		tree.append(2);
		tree.append(7);
		tree.append(8);
		tree.append(10);
		tree.delete(2);
		tree.print();
		
	}
}