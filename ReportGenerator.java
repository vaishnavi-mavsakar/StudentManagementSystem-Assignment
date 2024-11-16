package StudentManagementSystem;

public class ReportGenerator implements Runnable{
private Student[]students;

    public ReportGenerator(Student[] students) {
        this.students = students;
    }


    @Override
    public void run() {
        System.out.println("Print students report");
        for (int i=0;i<students.length;i++){
            if (students[i]!=null){
                students[i].getDetails();
            }
        }

    }
}
