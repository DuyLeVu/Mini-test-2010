package com.company.service.impl;

import com.company.model.Person;
import com.company.model.Student;
import com.company.service.GeneralManagerService;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagerImpl extends PersonManagerImpl{

    private ArrayList<Person> listStudent;

    public StudentManagerImpl() {
        listStudent = getListPerson();
    }

    @Override
    public void update(int id, Person person) {
        super.update(id, person);
        int index = findIndexById(id);
        listStudent.get(index).setScore(person.getScore());
    }

    public void sortByScore() {
            listStudent.sort((s1,s2) -> (int) (s1.getScore() - s2.getScore()));
        }

    public void calScore(){
        double totalScore = 0;
        for (int i=0; i<listStudent.size(); i++){
            totalScore += listStudent.get(i).getScore();
        }
        System.out.println("Điểm trung bình của tất cả học viên = " +totalScore);
    }
}
