package StudentManagementSystem;

public class StudentmanagementSystem {
    private static Student[]students=new Student[10];
    private static int count=0;

    public static void addStudent(Student student){
        if (count<students.length){
            students[count++]=student;
        }else {
            System.out.println("no more students can be added");
        }

    }
    public static void displayAllStudents() {
        for (Student student : students) {
            if (student != null) {
               student.getDetails();
                student.displayCourse();
            }
        }
    }

    public static void findScholarshipEligibleStudents() {
        for (Student student : students) {
            if (student != null && student.isElegibleForScolership()) {
                student.getDetails();
                System.out.println("is eligible for scolership");
            }
        }
    }
}
