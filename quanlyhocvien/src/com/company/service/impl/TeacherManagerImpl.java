package com.company.service.impl;

import com.company.model.Person;
import com.company.model.Teacher;

import java.util.ArrayList;

public class TeacherManagerImpl extends PersonManagerImpl{
    private ArrayList<Person> listTeacher;

    public TeacherManagerImpl() {
        listTeacher = getListPerson();
    }

    @Override
    public void update(int id, Person person) {
        super.update(id, person);
        int index = findIndexById(id);
        listTeacher.get(index).setSalary(person.getSalary());
    }
}
