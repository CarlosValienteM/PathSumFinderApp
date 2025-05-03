package com.carlos.pathsum.pathsumfinderapp;

import java.util.ArrayList;
import java.util.List;

public class PathSumFinder {

    public List<List<Integer>> findPaths(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPathsRecursive(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    private void findPathsRecursive(TreeNode node, int remainingSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) return;

        currentPath.add(node.val);
        remainingSum -= node.val;

        // Si es una hoja y la suma coincide, se guarda el camino
        if (node.left == null && node.right == null && remainingSum == 0) {
            result.add(new ArrayList<>(currentPath));
        } else {
            findPathsRecursive(node.left, remainingSum, currentPath, result);
            findPathsRecursive(node.right, remainingSum, currentPath, result);
        }

        // Backtrack: quitar el último nodo antes de regresar
        currentPath.remove(currentPath.size() - 1);
    }
}
