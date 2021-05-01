package lesson_12.multithread_library.xmlprocessors;

import lesson_12.multithread_library.models.Book;
import lesson_12.multithread_library.models.GenreName;
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

public class BooksDOMParser {

    private static Document document;

    public static ArrayList<Book> getObjectsFromXML(File file) {

        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(file);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.getMessage();
        }

        NodeList bookNodeList = document.getElementsByTagName("book");

        ArrayList<Book> bookList = new ArrayList<>();

        for (int i = 0; i < bookNodeList.getLength(); i++) {
            Element bookElement = (Element) bookNodeList.item(i);

            Book book = new Book();

            NodeList childNodes = bookElement.getChildNodes();
            for (int j = 0; j < childNodes.getLength(); j++) {
                if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                    Element childElement = (Element) childNodes.item(j);

                    switch (childElement.getNodeName()) {
                        case "title":
                            book.setTitle(childElement.getTextContent());
                            break;
                        case "author":
                            book.setAuthor(childElement.getTextContent());
                            break;
                        case "genre":
                            String genreValue = childElement.getTextContent().toUpperCase().trim();
                            book.setGenre(GenreName.valueOf(genreValue));
                            break;
                        case "year":
                            book.setYear(Integer.parseInt(childElement.getTextContent()));
                            break;
                        case "isHardCover":
                            book.setHardCover(Boolean.parseBoolean(childElement.getTextContent()));
                            break;
                    }
                }
            }
            bookList.add(book);
        }
        return bookList;
    }
}
