/*
 *  Copyright 2010 Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es).
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package es.uca.webservices.wsdl.ast;

/**
 * This interface declares a visit operation for each class of AST nodes.
 * The operation's name and signature identifies the class that sends the Visit request to the visitor.
 * That lets the visitor determine the concrete class of the element being visited.
 * Then the visitor can access the elements directly through its particular interface.
 * The data object is the value returned from a call to the visit method on the parent input. 
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public interface Visitor {

    /**
     * Visits the node with the data receive from parent
     * @param node The ASTNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(ASTNode node, Object data);

    /**
     * Visits the node with the data receive from parent
     * @param node The AttrNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(AttrNode node, Object data);

    /**
     * Visits the node with the data receive from parent
     * @param node The RootNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(RootNode node, Object data);

    /**
     * Visits the node with the data receive from parent
     * @param node The ElemNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(ElemNode node, Object data);

    /**
     * Visits the node with the data receive from parent
     * @param node The ForeachNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(ForeachNode node, Object data);
 
    /**
     * Visits the node with the data receive from parent
     * @param node The ListNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(ListNode node, Object data);

    /**
     * Visits the node with the data receive from parent
     * @param node The ListNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(ChoiceNode node, Object data);

    /**
     * Visits the node with the data receive from parent
     * @param node The VariableNode
     * @param data The data
     * @return The object containing the result
     */
    Object visit(VariableNode node, Object data);
}
