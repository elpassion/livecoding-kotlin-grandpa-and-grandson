package com.elpassion.genealogical.javaimpl;

public class FatherNameDisplayer {

    public String display(Person person) {
        Person father = person.getFather();
        if (father != null) {
            String name = father.getName();
            if (name != null) {
                return name;
            }
        }
        return "Name not known";
    }
}
