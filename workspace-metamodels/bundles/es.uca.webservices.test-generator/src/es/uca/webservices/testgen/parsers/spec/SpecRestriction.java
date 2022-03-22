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
package es.uca.webservices.testgen.parsers.spec;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.Token;

/**
 * Class that represents the rule restriction of the grammar TestSpec.g
 * 
 */
public class SpecRestriction {

    private int type;
    private Map<String, Token[]> restriction = new HashMap<String, Token[]>();

    /**
     * Constructor a RestrictionSpec with a token that represent a type
     * @param type 
     */
    public SpecRestriction(int type) {
        this.type = type;
    }

    /**
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * Associates the specified key with the specified value and add in restrictions
     * @param key
     * @param value 
     */
    public void addRestriction(String key, Token[] value) {
        this.restriction.put(key, value);
    }

    /**
     * @return the restriction
     */
    public Map<String, Token[]> getRestriction() {
        return restriction;
    }
}
