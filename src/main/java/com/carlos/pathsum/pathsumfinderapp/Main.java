package com.carlos.pathsum.pathsumfinderapp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Construcción del árbol del ejemplo
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        PathSumFinder finder = new PathSumFinder();
        List<List<Integer>> paths = finder.findPaths(root, targetSum);

        System.out.println("Caminos con suma " + targetSum + ":");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
