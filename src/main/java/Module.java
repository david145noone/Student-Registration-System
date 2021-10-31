import java.util.List;
import java.util.ArrayList;

public class Module {

    // fields for module class
    private String moduleName;
    private List<Student> students;
    private List<Program> programsAssociated;

    public Module(String moduleName) {

        this.moduleName = moduleName;
        this.students = new ArrayList<>();
        this.programsAssociated = new ArrayList<>();
    }


    // accessor methods
    public String getModuleName() {
        return moduleName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Program> getProgramsAssociated() {
        return programsAssociated;
    }

    // add / remove methods
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {

        if(students.contains(student)) {
            students.remove(student);
        }
    }

    public void addProgram(Program program) {
        programsAssociated.add(program);
    }

    public void removeProgram(Program program) {

        if(programsAssociated.contains(program)) {
            programsAssociated.remove(program);
        }
    }

    // A simpler method for displaying Module data in Driver program
    @Override
    public String toString() {
        StringBuilder module = new StringBuilder("Module title: " + getModuleName() + "\n");
        module.append("List of students enrolled: \n");
        students.forEach(student -> module.append(student));
        module.append("\nList of associated programs: \n");
        programsAssociated.forEach(program -> module.append(program));
        return module.toString();
    }
}

