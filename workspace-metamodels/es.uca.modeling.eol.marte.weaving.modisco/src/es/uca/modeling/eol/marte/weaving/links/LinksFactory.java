/**
 */
package es.uca.modeling.eol.marte.weaving.links;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uca.modeling.eol.marte.weaving.links.LinksPackage
 * @generated
 */
public interface LinksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinksFactory eINSTANCE = es.uca.modeling.eol.marte.weaving.links.impl.LinksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Performance Requirement Links</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Requirement Links</em>'.
	 * @generated
	 */
	PerformanceRequirementLinks createPerformanceRequirementLinks();

	/**
	 * Returns a new object of class '<em>Performance Requirement Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Requirement Link</em>'.
	 * @generated
	 */
	PerformanceRequirementLink createPerformanceRequirementLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LinksPackage getLinksPackage();

} //LinksFactory
