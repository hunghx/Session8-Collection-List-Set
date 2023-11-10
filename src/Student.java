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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
