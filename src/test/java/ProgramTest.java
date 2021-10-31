import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProgramTest {

    Program program;

    @Before
    public void setUp() {
        program = new Program("Computer Science",
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")),
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")));
    }

    @Test
    public void testProgramName() {
        Assert.assertEquals("Computer Science", program.getProgramName());
    }

    @Test
    public void testAddStudent() {
        Student mockStudent = new Student("John Smith",
                20, DateTime.parse("01/01/1997", DateTimeFormat.forPattern("dd/MM/yyyy")));
        program.addStudent(mockStudent);
        Assert.assertTrue(program.getStudents().contains(mockStudent));
    }

    @Test
    public void testRemoveStudent() {

        Student mockStudent = new Student("John Smith",
                20, DateTime.parse("01/01/1997", DateTimeFormat.forPattern("dd/MM/yyyy")));
        program.addStudent(mockStudent);
        program.removeStudent(mockStudent);
        Assert.assertFalse(program.getStudents().contains(mockStudent));
    }

    @Test
    public void testAddModule() {
        Module mockModule = new Module("CT417");
        program.addModule(mockModule);
        Assert.assertTrue(program.getModules().contains(mockModule));
    }

    @Test
    public void testRemoveModule() {
        Module mockModule = new Module("CT417");
        program.addModule(mockModule);
        program.removeModule(mockModule);
        Assert.assertFalse(program.getModules().contains(mockModule));
    }
}
