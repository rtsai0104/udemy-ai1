package depthfirstsearch;

import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS() {
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> vertexList) {

        for(Vertex v : vertexList) {
            if(!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }

    private void dfsRecursive(Vertex v) {

        System.out.println(v+" ");

        for(Vertex vertex : v.getNeighborList()) {
            if(!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsRecursive(vertex);
            }
        }

    }

    private void dfsWithStack(Vertex root) {

        this.stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()) {
            Vertex currentVertex = this.stack.pop();
            System.out.println(currentVertex+" ");

            for(Vertex v : currentVertex.getNeighborList()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }
}
