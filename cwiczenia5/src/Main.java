import java.util.Date;

public class Main {
    public static void main(String[] args) {
            Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw,Zlota 12", "333-322-222",new Date(1980, 1, 1));
            //student getthe indexNumber automatically assigned
            StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);
            //7 ishe number of semesters, 5 - number of possible ITN's beforebeing allowed to be promoted to next semester
            s.enrollStudent(it);
//we assign the student to the first semester by default
            s.addGrade(5, "PGO");
            s.addGrade(2, "APBD");
    //...
    //We try to promote students - this method should go through all our students and run the promoteToNextSemester() method on each student.
    //Remember to check whether a student is not already on the
    //last semester - then we can set student's status = "Graduate".
    //Remember to check whether the student didn't exceed the
    //number of ITN's allowed on specific studies.
            Student.promoteAllStudents();
    //We check the current semester for each student
Student.displayInfoAboutAllStudents();
    }
}