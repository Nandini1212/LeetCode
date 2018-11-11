/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

/**
 *
 * @author nandini
 */
public class InOrderPreOrderBTPrintPostOrder {

	static int preIndex = 0;
	public static void postOrderTraversalFromInorderAndPreorder(int[]in, int[]pre,int inStrt,int inEnd){
		if(inStrt > inEnd){
			return ;
		}     
		 
		int inIndex = search(in,inStrt,inEnd,pre[preIndex++]);
		// traverse left tree
		postOrderTraversalFromInorderAndPreorder(in, pre, inStrt, inIndex - 1);
		// traverse right tree
		postOrderTraversalFromInorderAndPreorder(in, pre, inIndex + 1, inEnd);
		
		// print root node at the end of traversal
	    System.out.print(in[inIndex]+" ");
		
	}
	public static int search(int[]in,int startIn,int endIn,int data){
		int i=0;
		for(i=startIn;i<endIn;i++){
			if(in[i]==data){
				return i;
			}
		}
		return i;
	}
	public static void main(String ars[]){
		int in[] = {4, 2, 5, 1, 3, 6};
		int pre[] =  {1, 2, 4, 5, 3, 6};
		 int len = in.length;
		 
		 
		 postOrderTraversalFromInorderAndPreorder(in,pre,0,len-1);
		
	}

}
