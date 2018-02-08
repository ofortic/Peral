package bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author niten
 */
public class Node {

    private int data;
    private Node Llink, Rlink;

    public Node(int data) {
        this.data = data;
        Llink = null;
        Rlink = null;
    }

    void add(int i) {
        Node temp = this, ant = null;
        while (temp != null) {
            if (temp.data == i) {
                break;
            } else if (i > temp.data) {
                ant = temp;
                temp = temp.Rlink;
            } else {
                ant = temp;
                temp = temp.Llink;
            }
        }
        if (temp == null) {//no esta repetido
            if (i > ant.data) {
                ant.Rlink = new Node(i);
            } else {
                ant.Llink = new Node(i);
            }
        }
    }

    void lvl() {
        Node node = this;
        Queue<Node> cola = new LinkedList<>();
        cola.add(node);
        System.out.println("Nieves :");
        while (!cola.isEmpty()) {
            Node temp = cola.poll();
            System.out.print(temp.data + ",");
            if (temp.Llink != null) {
                cola.add(temp.Llink);
            }
            if (temp.Rlink != null) {
                cola.add(temp.Rlink);
            }
        }
        System.out.print("\b\n");
    }

    void preR() {
        preRe(this);
        System.out.print("\b\n");
    }
    
    void postR() {
        post(this);
        System.out.print("\b\n");
    }
    
    void inR() {
        inOr(this);
        System.out.print("\b\n");
    }

    private void preRe(Node x) {
        if (x != null) {
            System.out.print(x.data + " ");
            if (x.Llink != null) {
                preRe(x.Llink);
            }
            if (x.Rlink != null) {
                preRe(x.Rlink);
            }
        }
    }
    
    private void post(Node x){
        if(x != null){
            if (x.Llink != null) {
                preRe(x.Llink);
            }
            if (x.Rlink != null) {
                preRe(x.Rlink);
            }
            System.out.print(x.data + " ");
        }
    }
    
    private void inOr(Node x){
        if(x != null){
            if (x.Llink != null) {
                preRe(x.Llink);
            }
            System.out.print(x.data + " ");
            if (x.Rlink != null) {
                preRe(x.Rlink);
            }
        }
    }
}
