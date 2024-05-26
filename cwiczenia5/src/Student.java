import java.util.Date;
import java.util.ArrayList;

public class Student {
    String name;
    String lastname;
    String email;
    String address;
    String phone;
    Date dateOfBirth;
    static int count;
    String indexNumber;


    public Student(String name, String lastname, String email, String address, String phone, Date dateOfBirth) {
    this.name=name;
    this.lastname=lastname;
    this.email=email;
    this.address=address;
    this.phone=phone;
    this.dateOfBirth=dateOfBirth;
    setIndexNumber(indexNumber);
    }
    private String getIndexNumber() {

        return indexNumber;
    }

    private void setIndexNumber(String indexNumber) {
        count++;
        this.indexNumber = "S"+count;
    }
    private static ArrayList<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }
}
