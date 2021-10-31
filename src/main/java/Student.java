import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Student {

    // student fields
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int id;
    private String userName;
    private List<Module> modules;

    // constants as limits to id values
    private static final int S_MIN = 100000;
    private static final int S_MAX = 999999;

    public Student(String name, int age, DateTime dateOfBirth) {

        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = genRandomId();
        this.userName = genRandomUsername(name, dateOfBirth);
        this.modules = new ArrayList<>();
    }

    // creates a random id for each student within bounds
    private int genRandomId() {

        int randomNum = ThreadLocalRandom.current().nextInt(S_MIN, S_MAX + 1);
        return randomNum;
    }

    // generates the desired username combining DOB and name
    public String genRandomUsername(String name, DateTime dateOfBirth) {

        String userName = (name == null) ? "N/A" : name;
        String DOB = (dateOfBirth == null) ? "N/A" : dateOfBirth.year().getAsText();

        return userName + DOB;
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public List<Module> getModules() {
        return modules;
    }

    // add / remove methods
    public void addModule(Module module) {
        modules.add(module);
    }

    public void removeModule(Module module) {

        if (modules.contains(module)) {
            modules.remove(module);
        }
    }

    // better toString() for displaying Student data
    @Override
    public String toString() {
        return "Student name: " + getName() + "\n" +
                "Student age: " + getAge() + "\n" +
                "Student DOB: " + getDateOfBirth().toString() + "\n" +
                "Student ID: " + getId() + "\n" +
                "Student username: " + getUserName() + "\n" +
                "Student's modules: " + getModules();
    }
}

