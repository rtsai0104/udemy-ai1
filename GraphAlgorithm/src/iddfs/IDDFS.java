package iddfs;

import java.util.Stack;

public class IDDFS {

    private Node targetVertex;

    private volatile boolean isTargetFound;

    public IDDFS(Node targetVertex) {
        this.targetVertex = targetVertex;
    }

    public void runDeepeningSearch(Node root) {

        int depth = 0;

        while(!isTargetFound) {
            System.out.println();
            dfs(root, depth);
            depth++;
        }
    }

    private void dfs(Node source, int depthLevel) {

        Stack<Node> stack = new Stack<>();
        source.setDepthLevel(0);
        stack.push(source);

        while(!stack.isEmpty()) {

            Node currentNode = stack.pop();
            System.out.println(currentNode+" ");

            if(currentNode.getName().equals(this.targetVertex.getName())) {
                System.out.println("Node has been found!");
                this.isTargetFound = true;
                return;
            }

            if(currentNode.getDepthLevel() >= depthLevel) {
                continue;
            }

            for(Node node : currentNode.getAdjacenciesList()) {
                node.setDepthLevel(currentNode.getDepthLevel()+1);
                stack.push(node);
            }
        }
    }



}
