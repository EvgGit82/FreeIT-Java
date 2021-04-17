package lesson_10;

import lesson_10.classes.Device;
import lesson_10.classes.EnergyConsumption;
import lesson_10.classes.Price;
import lesson_10.classes.Type;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;


public class XMLTaskRunner {

    public static final String VALIDATION_SCHEME_PATH = "src/lesson_10/xmls/validationScheme.xsd";
    public static final String XML_PATH = "src/lesson_10/xmls/device.xml";

    public static void main(String[] args) {

        Device device = new Device("ViewSonic", "USA", new Price("USD", 245.0),
                new Type(true, new EnergyConsumption("Watt", 21.7),
                        false, "DVI"), false);

        System.out.println(validateXML());
    }

    public static boolean validateXML () {
        try {
            SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(new File(VALIDATION_SCHEME_PATH));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(XML_PATH)));
        } catch (SAXException | IOException e) {
            System.out.println("What went wrong: " + e.getMessage());
            return false;
        }
        return true;
    }

}
