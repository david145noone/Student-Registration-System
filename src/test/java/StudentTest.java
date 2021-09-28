import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.joda.time.DateTime;
import org.junit.Test;

public class StudentTest {

    Student student;

    @Before
    public void setUp() {
        student  = new Student("John Smith", 25, DateTime.parse("04/02/1995 20:27:05",
                DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss")));
    }

    @Test
    public void testStudentName() {

        Assert.assertEquals("John Smith", student.getName());
    }



}