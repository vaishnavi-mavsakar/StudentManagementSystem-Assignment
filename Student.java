package StudentManagementSystem;

public class Student extends Person implements ScolerShipEligibility{
private int studId;
private int[] grade;
private Course[]courses;
private int count;

private static int totalNoOfStudents=0;

    public Student(String name, int age, int studId, int[] grade) {
        super(name, age);
        this.studId = studId;
        this.grade = grade;
        this.courses = new Course[5];
        this.count = 0;

        totalNoOfStudents++;
    }

    @Override
    public void getDetails() {
        System.out.println("Student Id -"+studId);
        System.out.println("Student name -"+name);
        System.out.println("Student age -"+age);
        System.out.println("Student Average grade"+calculateAverageGrades());


    }
    public double calculateAverageGrades() {
        int sum = 0;
        for (int grade : grade) {
            sum = sum + grade;
        }
        if (grade.length > 0) {
            double average = (double) sum / grade.length;
            return average;
        }
        return 0;
    }
    public static int getTotalStudents(){
       return totalNoOfStudents;
    }

    @Override
    public boolean isElegibleForScolership() {
        return calculateAverageGrades()>85;
    }
    public void enrollCurses(String courseName,int courseId){
        if (count<courses.length){
            courses[count++]=new Course(courseName,courseId);
        }else{
            System.out.println("Not a sufficient space to enroll courses");
        }

    }
    public void displayCourse(){
        for (int i=0;i<count;i++){
            System.out.println(courses[i]);
        }
    }



    public class Course{
        private String courseName;
        private int courseId;

        public Course(String courseName, int courseId) {
            this.courseName = courseName;
            this.courseId = courseId;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }
        public void display(){
            System.out.println("Course name -"+courseName);
            System.out.println("Course id -"+courseId);
        }
    }
}
