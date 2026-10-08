import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

class Student {
    private String id;
    private String name;
    private double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', score=" + score + "}";
    }
}

public class GenericCollectionExperiment {
    public static void main(String[] args) {
        System.out.println("=== LinkedList泛型操作演示 ===");
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.add(new Student("001", "张三", 85.5));
        studentList.add(new Student("002", "李四", 92.0));
        studentList.add(new Student("003", "王五", 78.5));
        studentList.add(new Student("004", "赵六", 88.0));

        System.out.println("链表中的学生数量: " + studentList.size());
        System.out.println("索引1处的学生: " + studentList.get(1));

        studentList.set(2, new Student("003", "王五", 90.0));
        System.out.println("修改索引2后的学生: " + studentList.get(2));

        studentList.remove(1);
        System.out.println("删除索引1后的学生数量: " + studentList.size());

        System.out.println("遍历所有学生:");
        for (Student s : studentList) {
            System.out.println("  " + s);
        }

        Student searchTarget = new Student("004", "赵六", 88.0);
        boolean found = false;
        for (Student s : studentList) {
            if (s.getId().equals(searchTarget.getId())) {
                found = true;
                break;
            }
        }
        System.out.println("是否找到学号004的学生: " + found);

        System.out.println("\n=== HashMap泛型操作演示 ===");
        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("001", new Student("001", "张三", 85.5));
        studentMap.put("002", new Student("002", "李四", 92.0));
        studentMap.put("003", new Student("003", "王五", 78.5));
        studentMap.put("004", new Student("004", "赵六", 88.0));

        System.out.println("散列映射中的学生数量: " + studentMap.size());

        Student foundStudent = studentMap.get("002");
        System.out.println("学号002对应的学生: " + foundStudent);

        studentMap.remove("003");
        System.out.println("删除学号003后的学生数量: " + studentMap.size());

        System.out.println("遍历所有键值对:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("  键: " + entry.getKey() + ", 值: " + entry.getValue());
        }

        System.out.println("是否包含学号001: " + studentMap.containsKey("001"));
        System.out.println("是否包含学号005: " + studentMap.containsKey("005"));
    }
}