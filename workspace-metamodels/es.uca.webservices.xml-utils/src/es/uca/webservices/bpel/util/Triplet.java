package es.uca.webservices.bpel.util;

/**
 * A template class used to store tree elements
 * @author Antonio García Domínguez
 * @param <T1>
 * @param <T2>
 * @param <T3>
 */
public class Triplet<T1, T2, T3> {
	private T1 left;
	private T2 middle;
	private T3 right;

        /**
         * Constructor
         * @param a     Value of the first element
         * @param b     Value of the second element
         * @param c     Value of the third element
         */
	public Triplet(T1 a, T2 b, T3 c) {
		this.left = a;
		this.middle = b;
		this.right = c;
	}

        /**
         * Sets the value of the first element
         * @param a     The new value
         */
	public void setLeft(T1 a) {
		this.left = a;
	}

        /**
         * Returns the value of the first element
         * @return  The current value of the first element
         */
	public T1 getLeft() {
		return left;
	}

        /**
         * Sets the value of the second element
         * @param b The new value
         */
	public void setMiddle(T2 b) {
		this.middle = b;
	}

        /**
         * Returns the value of the second element
         * @return  The current value of the second element
         */
	public T2 getMiddle() {
		return middle;
	}

        /**
         * Sets the value of the third element
         * @param c The new value
         */
	public void setRight(T3 c) {
		this.right = c;
	}

        /**
         * Returns the value of the third element
         * @return  The current value of the third element
         */
	public T3 getRight() {
		return right;
	}
}
