/**
 */
package es.uca.modeling.eol.marte.weaving.links.impl;

import es.uca.modeling.eol.marte.weaving.links.LinksPackage;
import es.uca.modeling.eol.marte.weaving.links.PerformanceRequirementLink;
import es.uca.modeling.eol.marte.weaving.links.TimeLimitMetric;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;

import org.eclipse.uml2.uml.ExecutableNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getExecNode <em>Exec Node</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getKlazz <em>Klazz</em>}</li>
 *   <li>{@link es.uca.modeling.eol.marte.weaving.links.impl.PerformanceRequirementLinkImpl#getTestMethods <em>Test Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceRequirementLinkImpl extends EObjectImpl implements PerformanceRequirementLink {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final TimeLimitMetric METRIC_EDEFAULT = TimeLimitMetric.MAX;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected TimeLimitMetric metric = METRIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExecNode() <em>Exec Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecNode()
	 * @generated
	 * @ordered
	 */
	protected ExecutableNode execNode;

	/**
	 * The cached value of the '{@link #getKlazz() <em>Klazz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlazz()
	 * @generated
	 * @ordered
	 */
	protected ClassDeclaration klazz;

	/**
	 * The cached value of the '{@link #getTestMethods() <em>Test Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodDeclaration> testMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceRequirementLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinksPackage.Literals.PERFORMANCE_REQUIREMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeLimitMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetric(TimeLimitMetric newMetric) {
		TimeLimitMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutableNode getExecNode() {
		if (execNode != null && execNode.eIsProxy()) {
			InternalEObject oldExecNode = (InternalEObject)execNode;
			execNode = (ExecutableNode)eResolveProxy(oldExecNode);
			if (execNode != oldExecNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE, oldExecNode, execNode));
			}
		}
		return execNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableNode basicGetExecNode() {
		return execNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecNode(ExecutableNode newExecNode) {
		ExecutableNode oldExecNode = execNode;
		execNode = newExecNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE, oldExecNode, execNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration getKlazz() {
		if (klazz != null && klazz.eIsProxy()) {
			InternalEObject oldKlazz = (InternalEObject)klazz;
			klazz = (ClassDeclaration)eResolveProxy(oldKlazz);
			if (klazz != oldKlazz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__KLAZZ, oldKlazz, klazz));
			}
		}
		return klazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration basicGetKlazz() {
		return klazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKlazz(ClassDeclaration newKlazz) {
		ClassDeclaration oldKlazz = klazz;
		klazz = newKlazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__KLAZZ, oldKlazz, klazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodDeclaration> getTestMethods() {
		if (testMethods == null) {
			testMethods = new EObjectResolvingEList<MethodDeclaration>(MethodDeclaration.class, this, LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS);
		}
		return testMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__METRIC:
				return getMetric();
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
				if (resolve) return getExecNode();
				return basicGetExecNode();
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__KLAZZ:
				if (resolve) return getKlazz();
				return basicGetKlazz();
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS:
				return getTestMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__METRIC:
				setMetric((TimeLimitMetric)newValue);
				return;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
				setExecNode((ExecutableNode)newValue);
				return;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__KLAZZ:
				setKlazz((ClassDeclaration)newValue);
				return;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS:
				getTestMethods().clear();
				getTestMethods().addAll((Collection<? extends MethodDeclaration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
				setExecNode((ExecutableNode)null);
				return;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__KLAZZ:
				setKlazz((ClassDeclaration)null);
				return;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS:
				getTestMethods().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__METRIC:
				return metric != METRIC_EDEFAULT;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__EXEC_NODE:
				return execNode != null;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__KLAZZ:
				return klazz != null;
			case LinksPackage.PERFORMANCE_REQUIREMENT_LINK__TEST_METHODS:
				return testMethods != null && !testMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //PerformanceRequirementLinkImpl
