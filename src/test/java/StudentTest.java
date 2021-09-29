import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.joda.time.DateTime;
import org.junit.Test;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student  = new Student("John Smith", 25, DateTime.parse("07/04/1995",
                DateTimeFormat.forPattern("dd/MM/yyyy")));
    }

    @Test
    public void testStudentName() {
        Assert.assertEquals("John Smith", student.getName());
    }

    @Test
    public void testStudentAge() {

        Assert.assertEquals(25, student.getAge());
    }

    @Test
    public void testStudentDOB() {

        Assert.assertEquals(DateTime.parse("07/04/1995",
                DateTimeFormat.forPattern("dd/MM/yyyy")), student.getDateOfBirth());
    }


}