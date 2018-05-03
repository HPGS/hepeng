package com.guishan.shrio;

public class BinaryTree {
	
	 private Node root = null;  
     
	    BinaryTree(int value) {  
	        root = new Node(value);  
	        root.leftChild  = null;  
	        root.rightChild = null;  
	    }  
	    public Node findKey(int value) {
	    	Node current = root;  
	        while (true) {  
	            if (value == current.value) {  
	                return current;  
	            } else if (value < current.value) {  
	                current = current.leftChild;  
	            } else if (value > current.value) {  
	                current = current.rightChild;  
	            }  
	              
	            if (current == null) {  
	                return null;  
	            }  
	        }  }   //查找  
	        public String insert(int value) {
	        	String error = null;  
	        	  
	        	Node node = new Node(value);  
	        	if (root == null) {  
	        	    root = node;  
	        	    root.leftChild  = null;  
	        	    root.rightChild = null;  
	        	} else {  
	        	    Node current = root;  
	        	    Node parent = null;  
	        	    while (true) {
	        	    	System.out.println("111111111111s");
	        	        if (value < current.value) {  
	        	            parent = current;  
	        	            current = current.leftChild;  
	        	            if (current == null) {  
	        	                parent.leftChild = node;  
	        	                break;  
	        	            }  
	        	        } else if (value > current.value) {  
	        	            parent = current;  
	        	            current = current.rightChild;  
	        	            if (current == null) {  
	        	                parent.rightChild = node;  
	        	                break;  
	        	            }  
	        	        } else {  
	        	            error = "having same value in binary tree";
	        	            break;
	        	        }     
	        	    } // end of while  
	        	}  
	        	return error; 
	        }  //插入  
	        /** 
	         * //中序遍历(递归)： 
	         *    1、调用自身来遍历节点的左子树 
	         *    2、访问这个节点 
	         *    3、调用自身来遍历节点的右子树 
	         */
	        public void inOrderTraverse() {
	        	System.out.print("中序遍历:");  
	            inOrderTraverse(root);  
	            System.out.println(); 
	        }    //中序遍历递归操作  
	        private void inOrderTraverse(Node node) {
	        	if (node == null)   
	                return ;  
	            inOrderTraverse(node.leftChild);  
	            node.display();  
	            inOrderTraverse(node.rightChild); 
			}
			public void inOrderByStack() {}     //中序遍历非递归操作      
	        public void preOrderTraverse() {}  //前序遍历  
	        public void preOrderByStack() {}   //前序遍历非递归操作  
	        public void postOrderTraverse() {} //后序遍历  
	        public void postOrderByStack() {}  //后序遍历非递归操作  
	        public int getMinValue() {
				return 0;} //得到最小(大)值  
	        public boolean delete(int value) {
				return false;} //删除 
}
