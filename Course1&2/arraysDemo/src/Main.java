public class Main {
    public static void main(String[] args) throws Exception {
        String student1 = "Student 1";
        String student2 = "Student 2";
        String student3 = "Student 3";
        String student4 = "Student 4";
        String student5 = "Student 5";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        String[] students = new String[3];

        students[0] = "Student 1";
        students[1] = "Student 2";
        students[2] = "Student 3";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (String student : students) {
            System.out.println(student);
        }

    }
}
