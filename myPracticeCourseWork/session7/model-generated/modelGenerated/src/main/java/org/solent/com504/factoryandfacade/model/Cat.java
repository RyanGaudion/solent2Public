package org.solent.com504.factoryandfacade.model;

public class Cat implements Animal {

    private String name = "";
    
    @Override
    public String getSound() {
        return "MEOW";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
