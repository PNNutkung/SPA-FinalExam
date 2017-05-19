package com.pipatpol.finalexam.database;

/**
 * Created by PNNutkung on 2017-05-19.
 */
public class Pattern {
    private Integer id;
    private String name;
    private String group;
    private String implementation;

    public Pattern() {
        super();
    }

    public Pattern(String name, String group, String implementation) {
        this.name = name;
        this.group = group;
        this.implementation = implementation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getImplementation() {
        return implementation;
    }

    public void setImplementation(String implementation) {
        this.implementation = implementation;
    }
}
