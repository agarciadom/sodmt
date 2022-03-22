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
 * Implements Visitable and represents an AST (Abstract Syntax Tree) node
 *
 * @author Cristina Jiménez Gavilán (cristina.jimenezgavilan@alum.uca.es)
 */
public abstract class ASTNode implements Visitable {

    /**
     * Hash code value for the ASTNode object
     */
    protected int hashCode = 0;

    private static final int CODE_INI = 17;
    private static final int CODE_MUL = 37;

    /**
     * Accepts a Visitor and calls the apropriate visit method on the visitor
     * depending on the concrete implementation of this ASTNode
     *
     * @param visitor The concrete visitor
     * @param data The data object is the value returned from a call to the visit method on the parent input.
     * @return
     */
    @Override
    public Object accept(Visitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    /* Joshua Bloch. Effective Java: Programming Language Guide. Prentice
    Hall, Birmingham, UK, UK, 2008. ISBN 0321356683, 9780321356680.*/

    /**
     * Returns a hash code value for the object
     * 
     * @param fieldHashes Array of hash values, one for each field of the concrete ASTNode
     * @return The hash code value for the object
     */
    protected static int genericHash(int... fieldHashes) {
        int result = CODE_INI;
        for (int hash : fieldHashes) {
            result = CODE_MUL * result + hash;
        }
        return result;
    }
}
