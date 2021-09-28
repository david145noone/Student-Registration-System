import org.joda.time.DateTime;
import org.terasoluna.gfw.common.date.jodatime.DefaultJodaTimeDateFactory;
import java.util.List;
import java.util.ArrayList;

public class Program {

    private String programName;
    private List<Module> modules;
    private List<Student> students;
    private DefaultJodaTimeDateFactory defaultJodaTimeDateFactory;
    private DateTime startDate;
    private DateTime endDate;

    public Program (String programName) {

        this.programName = programName;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
        this.defaultJodaTimeDateFactory = new DefaultJodaTimeDateFactory();
        this.startDate = defaultJodaTimeDateFactory.newDateTime();
        this.endDate = defaultJodaTimeDateFactory.newDateTime();
    }

    public String getProgramName() {
        return programName;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Student> getStudents() {
        return students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }
}
