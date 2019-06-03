package iddfs;

public class App {

    public static void main (String[] args) {

        Node v1 = new Node("A");
        Node v2 = new Node("B");
        Node v3 = new Node("C");
        Node v4 = new Node("D");
        Node v5 = new Node("E");

        v1.addAdjacentNode(v2);
        v1.addAdjacentNode(v3);
        v2.addAdjacentNode(v4);
        v4.addAdjacentNode(v5);

        IDDFS iddfs = new IDDFS(v2);
        iddfs.runDeepeningSearch(v1);
    }

}
