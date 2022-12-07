package model;

import model.Person;

public abstract class PersonFactory
{
    public abstract Person getObject(String csv);
}