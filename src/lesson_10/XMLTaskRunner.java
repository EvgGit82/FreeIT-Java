package lesson_10;

import lesson_10.classes.Device;
import lesson_10.classes.EnergyConsumption;
import lesson_10.classes.Price;
import lesson_10.classes.Type;

public class XMLTaskRunner {

    public static final String VALIDATION_SCHEME_PATH = "src/lesson_10/xmls/validationScheme.xsd";
    public static final String XML_PATH = "src/lesson_10/xmls/devices.xml";

    public static void main(String[] args) {

        Device device = new Device("ViewSonic", "USA", new Price("USD", 245.0),
                new Type(true, new EnergyConsumption("Watt", 21.7),
                        false, "DVI"), false);

        XMLValidator.validateXML(XML_PATH, VALIDATION_SCHEME_PATH);

        


    }

}
