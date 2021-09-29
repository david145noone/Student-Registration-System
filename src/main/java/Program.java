import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;

public class Program {

    private String programName;
    private List<Module> modules;
    private List<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Program (String programName, DateTime startDate, DateTime endDate) {

        this.programName = programName;
        this.modules = new ArrayList<>();
        this.students = new ArrayList<>();
        this.startDate = startDate;
        this.endDate = endDate;
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

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addModule(Module module) {
        modules.add(module);
    }
}
