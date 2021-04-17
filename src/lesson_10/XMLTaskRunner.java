package lesson_10;

import lesson_10.xmlprocessors.DOMparser;
import lesson_10.classes.Device;
import lesson_10.xmlprocessors.XMLValidator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;


public class XMLTaskRunner {

    public static final String VALIDATION_SCHEME_PATH = "src/lesson_10/xmls/validationScheme.xsd";
    public static final String XML_PATH = "src/lesson_10/xmls/devices.xml";
    private static File xmlFile = new File(XML_PATH);

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        System.out.println("Validation of xml-file:");

        XMLValidator.validateXML(XML_PATH, VALIDATION_SCHEME_PATH);

        System.out.println();

        System.out.println("Parsing of xml-file and printing the results:");

        List<Device> devicesFromXML = DOMparser.getObjectsFormXML(xmlFile);

        for (Device device : devicesFromXML) {
            System.out.println(device);
        }
    }
}
