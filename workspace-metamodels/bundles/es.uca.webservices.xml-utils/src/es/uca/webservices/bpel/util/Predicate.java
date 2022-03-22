package es.uca.webservices.bpel.util;

/**
 * Interface for classes that model a boolean predicate taking a single argument of a certain type.
 *
 * @author Antonio García-Domínguez
 */
public interface Predicate<T> {
	boolean evaluate(T x);
}
