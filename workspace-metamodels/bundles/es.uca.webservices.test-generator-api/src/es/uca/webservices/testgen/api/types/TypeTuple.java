/*
 *  Copyright 2011 Miguel Ángel Pérez Montero (miguelangel.perezmontero@alum.uca.es).
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
package es.uca.webservices.testgen.api.types;

import java.util.Arrays;

import es.uca.webservices.testgen.api.generators.GenerationException;
import es.uca.webservices.testgen.api.generators.IGenerator;


/**
 * Class that represents n-tuple
 *
 */
public class TypeTuple extends AbstractType {

    private static final int HASH = 5;
    private static final int HASHM = 97;
    private IType[] types = null;

    /**
     * Constructor n-tuple with the specified types
     * @param types 
     */
    public TypeTuple(IType... types) {
        this.types = types;
    }

    /**
     * Return size of the n-tuple
     * @return 
     */
    public int size() {
        return types.length;
    }

    /**
     * Return the IType specified position 
     * @param index
     * @return 
     */
    public IType getIType(int index) {
        return types[index];
    }

    /**
     * Return true if the objects are equals
     * @param o
     * @return 
     */
    @Override
    public boolean equals(Object o) {

        if (!(o instanceof TypeTuple)) {
            return false;
        }
        final TypeTuple tTuple = (TypeTuple) o;
        if (tTuple.size() != types.length) {
            return false;
        }
        if (tTuple == this) {
            return true;
        }
        for (int i = 0; i < tTuple.size(); ++i) {
            if (!this.types[i].equals(tTuple.getIType(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = HASH;
        hash = HASHM * hash + Arrays.deepHashCode(this.types);
        return hash;
    }

    /**
     * Generates an instance of the proper IType, using double dispatch.
     * @param abstractType Type of the value to be generated.
     * @return Generated instance of the specified type.
     */
    @Override
    public Object generate(IGenerator generator) throws GenerationException {
        return generator.generate(this);
    }
}
