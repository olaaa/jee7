/**
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.simplegreeting;

import javax.enterprise.context.Dependent;

@Informal
@Dependent
public class InformalGreeting extends Greeting {
    
    @Override
    public String greet(String name) {
        return "Hi, " + name + "!";
    }
}