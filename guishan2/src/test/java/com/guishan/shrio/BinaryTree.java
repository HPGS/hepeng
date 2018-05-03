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
	        }  }   //����  
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
	        }  //����  
	        /** 
	         * //�������(�ݹ�)�� 
	         *    1�����������������ڵ�������� 
	         *    2����������ڵ� 
	         *    3�����������������ڵ�������� 
	         */
	        public void inOrderTraverse() {
	        	System.out.print("�������:");  
	            inOrderTraverse(root);  
	            System.out.println(); 
	        }    //��������ݹ����  
	        private void inOrderTraverse(Node node) {
	        	if (node == null)   
	                return ;  
	            inOrderTraverse(node.leftChild);  
	            node.display();  
	            inOrderTraverse(node.rightChild); 
			}
			public void inOrderByStack() {}     //��������ǵݹ����      
	        public void preOrderTraverse() {}  //ǰ�����  
	        public void preOrderByStack() {}   //ǰ������ǵݹ����  
	        public void postOrderTraverse() {} //�������  
	        public void postOrderByStack() {}  //��������ǵݹ����  
	        public int getMinValue() {
				return 0;} //�õ���С(��)ֵ  
	        public boolean delete(int value) {
				return false;} //ɾ�� 
}
