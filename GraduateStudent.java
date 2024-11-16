package StudentManagementSystem;

public class GraduateStudent extends Student{


    public GraduateStudent(String name, int age, int studId, int[] grade) {
        super(name, age, studId, grade);
    }

    public void getDetails(){
     super.getDetails();
        System.out.println("Graduated Students");
    }
}
