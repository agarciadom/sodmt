/**
 */
package serviceComposition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swimlane Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link serviceComposition.SwimlaneContainer#getSwimlaneNames <em>Swimlane Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see serviceComposition.ServiceCompositionPackage#getSwimlaneContainer()
 * @model annotation="gmf.node label='swimlanes' figure='es.uca.modeling.figures.SwimlanesFigure' tool.name='Swimlanes' size='600,300'"
 * @generated
 */
public interface SwimlaneContainer extends EObject
{
  /**
   * Returns the value of the '<em><b>Swimlane Names</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Swimlane Names</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Swimlane Names</em>' attribute list.
   * @see serviceComposition.ServiceCompositionPackage#getSwimlaneContainer_SwimlaneNames()
   * @model
   * @generated
   */
  EList<String> getSwimlaneNames();

} // SwimlaneContainer
