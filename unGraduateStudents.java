package StudentManagementSystem;

public class unGraduateStudents extends Student{


    public unGraduateStudents(String name, int age, int studId, int[] grade) {
        super(name, age, studId, grade);
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Ungraduated students");
    }
}
