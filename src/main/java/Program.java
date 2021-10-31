import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;

public class Program {

    // program fields
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

    // accessor methods
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

    // add and remove methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
        }
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void removeModule(Module module) {
        if (modules.contains(module)) {
            modules.remove(module);
        }
    }

    // A simpler method for displaying Program data in Driver program
    @Override
    public String toString() {
        StringBuilder program = new StringBuilder("Program title: " + getProgramName() + "\n");
        program.append("List of students enrolled: \n");
        students.forEach(student -> program.append(student));
        program.append("\nList of modules included: \n");
        modules.forEach(module -> program.append(module));
        program.append("\nStart date: " + getStartDate().toString());
        program.append("\nEnd date: " + getEndDate().toString());
        return program.toString();
    }
}
