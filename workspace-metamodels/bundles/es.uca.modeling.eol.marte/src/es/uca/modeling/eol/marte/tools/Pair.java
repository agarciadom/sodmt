package es.uca.modeling.eol.marte.tools;

/**
 * Generic immutable container for a pair of values of possibly different types.
 * @author Antonio García-Domínguez
 */
public class Pair<T1, T2> {

	private T1 left;
	private T2 right;

	public Pair(T1 left, T2 right) {
		this.left = left;
		this.right = right;
	}

	public T1 getLeft()  { return left;  }
	public T2 getRight() { return right; }
}
