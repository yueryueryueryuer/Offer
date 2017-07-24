package offer04;


/**
 * Created by Taoxiao on 2017/7/20 0020.
 * Describe:输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * <p>
 * 思路：通过前序和中序，判断根节点左右，进行递归
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null && in == null)
            return null;
        TreeNode root = new TreeNode(pre[0]);
        int left_length = 0;
        int right_length = 0;

        for (int i = 0; i < in.length; i++) {
            if (in[i] == pre[0]) {
                break;
            } else {
                left_length++; //获得根节点左边的长度
            }
        }
        right_length = in.length - left_length - 1;

        if (left_length != 0) {
            int prel[] = new int[left_length];
            int inl[] = new int[left_length];
            for (int i = 0; i < left_length; i++) {
                prel[i] = pre[i + 1];
                inl[i] = in[i];
            }
            root.left = reConstructBinaryTree(prel, inl);  //递归
        } else {
            root.left = null;
        }
        if (right_length != 0) {
            int prer[] = new int[right_length];
            int inr[] = new int[right_length];
            int count = 0;
            for (int i = right_length; i > 0; i--) {
                prer[count] = pre[pre.length - i];
                inr[count] = in[pre.length - i];
                count++;
            }
            root.right = reConstructBinaryTree(prer, inr);
        } else {
            root.right = null;
        }
        return root;
    }
}
