package bst;

/**
 *
 * @author niten
 */
public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node Arbol = new Node(50);
        Arbol.add(10);
        Arbol.add(60);
        Arbol.add(55);
        Arbol.add(80);
        Arbol.add(10);
        Arbol.add(3);
        Arbol.add(25);
        Arbol.lvl();
        Arbol.preR();
        Arbol.postR();
        Arbol.inR();
    }
    
}
