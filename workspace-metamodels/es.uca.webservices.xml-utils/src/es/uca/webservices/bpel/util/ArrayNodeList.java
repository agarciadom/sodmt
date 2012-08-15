package es.uca.webservices.bpel.util;

import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Simple NodeList implementation, backed by an ArrayList.
 * 
 * @author Antonio García-Domínguez
 * @version 1.0
 */
public class ArrayNodeList implements NodeList, Iterable<Node> {

    private ArrayList<Node> store = new ArrayList<Node>();

    @Override
    public int getLength() {
        return store.size();
    }

    @Override
    public Node item(int index) {
        return index < store.size() ? store.get(index) : null;
    }

    /**
     * Adds a Node at the end of the list.
     * 
     * @param n
     *            Node to be added.
     */
    public void add(Node n) {
        store.add(n);
    }

    @Override
    public Iterator<Node> iterator() {
        return store.iterator();
    }
}
