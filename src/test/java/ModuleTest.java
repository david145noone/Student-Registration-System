import org.joda.time.format.DateTimeFormat;
import org.junit.Assert;
import org.junit.Before;
import org.joda.time.DateTime;
import org.junit.Test;

public class ModuleTest {

    Module module;

    @Before
    public void setUp() {
        module  = new Module("CT404");
    }

    @Test
    public void testModuleName() {
        Assert.assertEquals("CT404", module.getModuleName());
    }

    @Test
    public void testAddStudent() {

        Student mockStudent = new Student("John Smith",
                20, DateTime.parse("01/01/1997", DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addStudent(mockStudent);
        Assert.assertTrue(module.getStudents().contains(mockStudent));
    }

    @Test
    public void testRemoveStudent() {

        Student mockStudent = new Student("John Smith",
                20, DateTime.parse("01/01/1997", DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addStudent(mockStudent);
        module.removeStudent(mockStudent);
        Assert.assertFalse(module.getStudents().contains(mockStudent));
    }

    @Test
    public void testAddProgram() {

        Program mockProgram = new Program("Computer Science",
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")),
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addProgram(mockProgram);
        Assert.assertTrue(module.getProgramsAssociated().contains(mockProgram));
    }

    @Test
    public void testRemoveProgram() {
        Program mockProgram = new Program("Computer Science",
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")),
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addProgram(mockProgram);
        module.removeProgram(mockProgram);
        Assert.assertFalse(module.getProgramsAssociated().contains(mockProgram));
    }

    @Test
    public void testPrintModule() {

        Student mockStudent = new Student("John Smith",
                20, DateTime.parse("01/01/1997", DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addStudent(mockStudent);
        Program mockProgram = new Program("Computer Science",
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")),
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")));
        module.addProgram(mockProgram);

        Assert.assertEquals("Module title: CT404\nList of students enrolled: \n"
                + mockStudent.toString()
                + "\nList of associated programs: \n"
                + mockProgram.toString(), module.toString());
    }
}
