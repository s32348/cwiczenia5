import java.util.Date;

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
    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        count++;
        this.indexNumber = "S"+count;
    }
}
