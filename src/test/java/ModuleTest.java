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

        module.addStudent(new Student("John Smith",
                20, DateTime.parse("01/01/1997", DateTimeFormat.forPattern("dd/MM/yyyy"))));
        Assert.assertEquals(1, module.getStudents().size());
    }

    @Test
    public void testAddProgram() {

        module.addProgram(new Program("Computer Science",
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy")),
                DateTime.parse("01/01/1997",
                        DateTimeFormat.forPattern("dd/MM/yyyy"))));
    }
}
