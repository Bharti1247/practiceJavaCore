package com.sapient.dsa;

import java.util.ArrayList;
import java.util.List;

public class PreOrderDFSTree {
	
	public List<Integer> traversePreOrder(Node root) {
		List<Integer> result = new ArrayList<>();
				
		class Traverse {
			Traverse (Node currentNode) {
				result.add(currentNode.value);
				
				if (currentNode.left != null) 
					new Traverse(currentNode.left);
				
				if (currentNode.right != null)
					new Traverse(currentNode.right);
			}
		}
		
		new Traverse(root);
		return result;
	}
	
		
}
