package lesson_10.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Device {

    private String name;
    private String origin;
    private Price price;
    private Type type;
    private boolean isCritical;

    public Device() {
    }

    @Override
    public String toString() {
        return "Device [name = " + name + ", origin = " + origin + ", price = " + price + ", type = " + type +
                ", functionally critical = " + isCritical + ']';
    }
}
