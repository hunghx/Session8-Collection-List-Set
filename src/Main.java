import model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(2);
        collection.add(3);
        collection.add(1);
        collection.add(5);

        // duyệt danh sách bằng iterator

//        for (Integer num: collection
//             ) {
//            System.out.println(num);
//        }

        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> arrayList = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.add("Hung");
        arrayList.add(1,"Nam"); //hoang, Hùng, Nam ,khánh, ánh, việt,nam,Hung,
        arrayList.add("Hung");
        arrayList.add(2,"Khánh");
        arrayList.add(3,"Ánh");
        arrayList.add(4,"Nam");
        arrayList.add(4,"Việt");
        arrayList.add(0,"Hoàng");
        System.out.println(arrayList);

//        arrayList ?
        linkedList = new LinkedList<>(arrayList);

        arrayList = new ArrayList<>(linkedList);


        // các thao tấc cơ bản
        for (int i = 0; i < arrayList.size(); i++) {
            // lấy ra phần tử theo index
            System.out.println(arrayList.get(i));
        }
        // thay đổi giá trị
        arrayList.set(0,"Lộc");
        System.out.println(arrayList);
        // kiểm tra dánh sách rỗng
        System.out.println(arrayList.isEmpty());
        // kiểm tra tồn  tại 1 phần tử
        System.out.println(arrayList.contains("Ánh"));

        // tạo nhanh danh sách
        List<String> subList = Arrays.asList("Ánh","Khánh","Việt","Lộc","Nam");
        // kiểm tra tồn tại cả 1 danh sách
        System.out.println(arrayList.containsAll(subList));
        // Xóa 1 phần tử theo vị trí
        arrayList.remove(1);
        arrayList.remove("Khánh");
        System.out.println(arrayList);

//        linkedList = new LinkedList<>(arrayList);
//        linkedList.addFirst("Quý");
//        linkedList.addLast("Ngọc");

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(21);
        set.add(3);
        set.add(40);
        set.add(5);
        set.add(9);
        set.add(17);
        System.out.println(set);

        Student s1 = new Student(10,"Hùng");
        Student s2 = new Student(20,"Khánh");
        Student s3 = new Student(3,"Anh");
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s3);
        System.out.println(studentSet);
        // sử dụng colection thực hiện CRUD quản lí sinh viên ?
     }
}