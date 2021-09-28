import java.util.List;
import java.util.ArrayList;

public class Module {

    private String moduleName;
    private List<Student> students;
    private List<Program> programsAssociated;

    public Module(String moduleName) {

        this.moduleName = moduleName;
        this.students = new ArrayList<>();
        this.programsAssociated = new ArrayList<>();
    }


    public String getModuleName() {
        return moduleName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Program> getProgramsAssociated() {
        return programsAssociated;
    }
}

