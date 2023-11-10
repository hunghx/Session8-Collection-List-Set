package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        studentList = new ArrayList<>();
    }
    public List<Student> getALl(){
        return studentList;
    }
    public Student findById(int id){
        for (Student s:studentList) {
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
    public void addStudent(Student s){
        studentList.add(s);
    }

    public void updateStudent(Student s){
        studentList.set(studentList.indexOf(findById(s.getId())),s);
    }

    public void deleteById(int id){
        studentList.remove(findById(id));
    }
}
