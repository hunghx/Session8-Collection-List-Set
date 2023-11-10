package run;

import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student s1 = new Student(3,"Hồ Xuân Hùng",23,true);
        Student s2 = new Student(5,"Lê Đức Anh",21,true);
        Student s3 = new Student(4,"Phạm Tất Dũng",20,true);
        Student s4 = new Student(1,"Lê Ngọc Nam",24,true);
        // thêm mới
        studentService.addStudent(s1);
        studentService.addStudent(s2);
        studentService.addStudent(s3);
        studentService.addStudent(s4);
        showStudentList(studentService);
        // sửa
        System.out.println("Nhập id sinh viên muốn sửa");
        int idEdit =  new Scanner(System.in).nextInt();
        Student studentEdit = studentService.findById(idEdit);
        if (studentEdit==null){
            System.err.println("id không tồn tại");
        }else {
            // hiển thị thông tin cũ
            System.out.println(studentEdit);
            System.out.println("Nhạp tên mới");
            studentEdit.setName( new Scanner(System.in).nextLine());
            System.out.println("Nhạp tuổi mới");
            studentEdit.setAge( new Scanner(System.in).nextInt());
            System.out.println("Nhạp giới tính mới");
            studentEdit.setSex( new Scanner(System.in).nextBoolean());
            studentService.updateStudent(studentEdit);
            showStudentList(studentService);
        }

/// xóa 
        System.out.println("Nhập id sinh viên muốn xóa");
        int idDelete =  new Scanner(System.in).nextInt();
        if (studentService.findById(idDelete)==null){
            System.err.println("id không tồn tại");
        }else {
            studentService.deleteById(idDelete);
            showStudentList(studentService);
        }

    }

    private static void showStudentList(StudentService studentService) {
        System.out.println("Danh sách sinh viên");
        for (Student s: studentService.getALl()) {
            System.out.println(s);
        }
    }
}
