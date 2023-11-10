package model;

public class Student implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        // đói tương 1 : this
        // đối tượng 2 : o
        if(this.id > o.id){
            return 1;
        } else if (this.id == o.id) {
            return 0;
        }else {
            return -1;
        }
    }

    private int id ;
    private String name;
    private int age ;
    private boolean sex;

    public Student(int id, String name, int age, boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + (sex?"Nam":"Nữ") +
                '}';
    }
}
