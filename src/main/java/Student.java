import org.joda.time.DateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Student {

    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int id;
    private String userName;
    private List<Module> modules;
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

    private int genRandomId() {

        int randomNum = ThreadLocalRandom.current().nextInt(S_MIN, S_MAX + 1);
        return randomNum;
    }

    public String genRandomUsername(String name, DateTime dateOfBirth) {

        String userName = (name == null) ? "N/A" : name;
        String DOB = (dateOfBirth == null) ? "N/A" : dateOfBirth.year().getAsText();

        return userName + DOB;
    }

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

    public void addModule(Module module) {
        modules.add(module);
    }
}

