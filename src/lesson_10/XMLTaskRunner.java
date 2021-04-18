package lesson_10;

import lesson_10.xmlprocessors.DOMParser;
import lesson_10.classes.Device;
import lesson_10.xmlprocessors.XMLValidator;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;


/*
Создать xml-файл, хранящий информацию об объектах предметной области ниже. Для валидации полученного xml-файла
необходимо разработать соответствующую xsd схему.
1. Общие требования:
- Простые и комплексные типы
- Шаблоны и предельные значения
- Обязательно использование атрибутов и типа ID
- Задание атрибутов по умолчанию
2. Произвести проверку XML-документа с помощью XSD.
3. Предметная область:
Компьютерные комплектующие:
- Name - название комплектующего
- Origin - страна производства
- Price - цена (0 - n USD)
- Type (должно быть несколько)
- периферийное либо нет, энергопотребление (ватт), наличие кулера( есть или нет), группа комплектующих
(устройства ввода-вывода, мультимедийные), порты (COM, USB, LPT)
- Critical - критично ли наличие комплектующего для работы компьютера.
Корневой элемент назвать Devices
*/

public class XMLTaskRunner {

    public static final String VALIDATION_SCHEME_PATH = "src/lesson_10/xmls/validationScheme.xsd";
    public static final String XML_PATH = "src/lesson_10/xmls/devices.xml";
    private static File xmlFile = new File(XML_PATH);

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        System.out.println("Validation of xml-file:");

        XMLValidator.validateXML(XML_PATH, VALIDATION_SCHEME_PATH);

        System.out.println();

        System.out.println("Parsing of xml-file and printing the results:");

        List<Device> devicesFromXML = DOMParser.getObjectsFromXML(xmlFile);

        for (Device device : devicesFromXML) {
            System.out.println(device);
        }

        System.out.println();

        System.out.println("Now we can work with the objects: ");
        System.out.println("First device name is '" + devicesFromXML.get(0).getName() + "'");
    }
}
