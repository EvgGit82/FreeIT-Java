package lesson_10.xmlprocessors;

import lesson_10.classes.Device;
import lesson_10.classes.EnergyConsumption;
import lesson_10.classes.Price;
import lesson_10.classes.Type;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMparser {

    private static Document document;

    public static ArrayList<Device> getObjectsFromXML(File file) {

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(file);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.getMessage();
        }

        NodeList deviceNodeList = document.getElementsByTagName("device");

        ArrayList<Device> deviceList = new ArrayList<>();

        for (int i = 0; i < deviceNodeList.getLength(); i++) {
            Element deviceElement = (Element) deviceNodeList.item(i);

            Device device = new Device();

            NodeList childNodes = deviceElement.getChildNodes();
            for (int j = 0; j < childNodes.getLength(); j++) {
                if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                    Element childElement = (Element) childNodes.item(j);

                    switch (childElement.getNodeName()) {
                        case "name":
                            device.setName(childElement.getTextContent());
                            break;
                        case "origin":
                            device.setOrigin(childElement.getTextContent());
                            break;
                        case "price":
                            NodeList priceElements = childElement.getChildNodes();
                            String currency = priceElements.item(1).getTextContent();
                            double priceValue = Double.parseDouble(priceElements.item(3).getTextContent());
                            device.setPrice(new Price(currency, priceValue));
                            break;
                        case "type":
                            NodeList typeElements = childElement.getChildNodes();
                            boolean isPeripheral = Boolean.parseBoolean(typeElements.item(1).getTextContent());

                            NodeList energyConsumptionElements = typeElements.item(3).getChildNodes();
                            String ECunit = energyConsumptionElements.item(1).getTextContent();
                            double ECvalue = Double.parseDouble(energyConsumptionElements.item(3).getTextContent());

                            boolean coolerAvailability = Boolean.parseBoolean(typeElements.item(5).getTextContent());

                            NodeList portList = typeElements.item(7).getChildNodes();

                            String port = portList.item(1).getTextContent();

                            device.setType(new Type(isPeripheral, new EnergyConsumption(ECunit, ECvalue),
                                    coolerAvailability, port));
                            break;
                        case "isCritical":
                            device.setCritical(Boolean.parseBoolean(childElement.getTextContent()));
                            break;
                    }
                }
            }
            deviceList.add(device);
        }
        return deviceList;
    }
}
