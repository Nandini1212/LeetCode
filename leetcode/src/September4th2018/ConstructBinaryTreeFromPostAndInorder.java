
package September4th2018;

/**
 *
 * @author nandini
 */
class TreeNod{
    int value;
    TreeNod left;
    TreeNod right;
    TreeNod(int item){
        value = item;
        left = null;
        right = null;
    }
}
public class ConstructBinaryTreeFromPostAndInorder {
    public static TreeNod buildTree(int [] postOrder, int [] inOrder){
        return buildTre(postOrder, 0, postOrder.length - 1,
                inOrder, 0, inOrder.length - 1);
    }
    public static TreeNod buildTre(int []postOr, int postStart, int postEnd, int[]inOr,
    int inStart, int inEnd){
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }
        int rootVal = postOr[postEnd];
        
        int rootIndex = 0;
        
        for(int i = inStart; i <= inEnd; i++){
            if(inOr[i] == rootVal){
                rootIndex = i;
                break;
            }
        }
        int len = rootIndex - inStart;
        TreeNod root = new TreeNod(rootVal);
        
        root.left = buildTre(postOr, postStart, postStart + len - 1,
                inOr, inStart, rootIndex - 1);
        
        root.right = buildTre(postOr, postStart + len, postEnd - 1,
                inOr, rootIndex + 1, inEnd);
        return root;
        
    }
    

}


