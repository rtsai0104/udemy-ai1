package astar;

public class Node {

    // Distance of node from starting point
    private int g;

    // Distance of node from ending point
    private int h;

    private int rowIndex;

    private int colIndex;

    // Previous node (for tracking shortest path)
    private Node predecessor;

    // If the node is an obstacle
    private boolean isBlock;

    public Node(int rowIndex, int colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getF() {
        return this.g+this.h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getColIndex() {
        return colIndex;
    }

    public void setColIndex(int colIndex) {
        this.colIndex = colIndex;
    }

    public Node getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Node predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public boolean equals(Object node2) {
        Node otherNode = (Node) node2;
        return this.rowIndex == otherNode.getRowIndex() && this.colIndex == otherNode.getColIndex();
    }

    @Override
    public String toString() {
        return "Node (" + this.rowIndex + ";" + this.colIndex + ") h:"+this.h+" - g:"+this.g+" - f="+(this.g+this.h);
    }


}
