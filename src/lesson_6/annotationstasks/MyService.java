package lesson_6.annotationstasks;

import java.util.Objects;

@VersionAnnotation(isActive = true, version = 1.7, versionCodeName = "Nougat")
public class MyService {

    private String className;
    private int id;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private void thisClassInfo(){
        System.out.println("[Information on this class (provided by thisClassInfo PRIVATE method): class type = " + MyService.class
                + ", number of fields = 2,\n\t\t\t\tgetters and setters availability = available, " +
                "other methods: equals(), hashCode(), toString()]\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && Objects.equals(className, myService.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(className, id);
    }

    @Override
    public String toString() {
        return "MyService [" + "object name = " + className + ", id = " + id + ']';
    }
}