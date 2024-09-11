public class StudentPractice {
    public static void main(String[] args){
        Student josh = new Student("Joshua", 1, 1, 4.0);
        System.out.println(josh.getName() + " " + josh.getStudentId() + " " + josh.getNumberOfCredits() + " " + josh.getGpa());

        Teacher mrJosh = new Teacher("Josh", "Waynick", "Computer Science", 4);
        System.out.println(mrJosh.getFirstName() + " " + mrJosh.getLastName() + " " + mrJosh.getSubject() + " " + mrJosh.getYearsTeaching());


    }
}
