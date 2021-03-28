package lesson_6.annotationstasks;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface VersionAnnotation {
    boolean isActive () default false;
    double version();
    String versionCodeName();
}