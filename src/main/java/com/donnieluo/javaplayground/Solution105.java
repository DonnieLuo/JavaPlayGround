package com.donnieluo.javaplayground;

import com.donnieluo.javaplayground.common.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
//        TreeNode node = new TreeNode(preorder[0]);
       return build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, inorderMap)

    }


    public TreeNode build(int[] pre, int preStart, int preEnd, int[] in,int inStart, int inEnd, Map<Integer, Integer> inorderMap) {
        TreeNode node = new TreeNode(pre[preStart]);
        int inIndex = inorderMap.get(pre[preStart]);
        int leftLen = inIndex - inStart+1;

        node.left = build(pre, preStart+1, preStart+leftLen+1, in, inStart, inIndex-1,inorderMap);
        node.right = build(pre, preStart+leftLen+2, preEnd,in, inIndex+1, inEnd,inorderMap );
        return node;
    }

}
