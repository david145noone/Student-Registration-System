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

    @Test
    public void testStudentIdRange() {
        Assert.assertTrue(student.getId() < 1000000);
        Assert.assertTrue(student.getId() >= 100000);
    }

    @Test
    public void testStudentUserName() {
        Assert.assertEquals("John Smith1995", student.getUserName());
    }

    @Test
    public void testBlankStudentName() {
        Assert.assertEquals("N/A1995", student.genRandomUsername(null, DateTime.parse("04/02/1995",
                DateTimeFormat.forPattern("dd/MM/yyyy"))));
    }

    @Test
    public void testAddModule() {
        Module mockModule = new Module("CT417");
        student.addModule(mockModule);
        Assert.assertTrue(student.getModules().contains(mockModule));
    }

    @Test
    public void testRemoveModule() {
        Module mockModule = new Module("CT417");
        student.addModule(mockModule);
        student.removeModule(mockModule);
        Assert.assertFalse(student.getModules().contains(mockModule));
    }
}