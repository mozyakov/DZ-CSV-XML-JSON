import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLSettingsReader {
    boolean isLoad;
    String loadFile;
    String loadFormat;

    boolean isSave;
    String saveFile;
    String saveFormat;

    boolean isLog;
    String logFile;

    public XMLSettingsReader(File xmlFile) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);

        Element root = doc.getDocumentElement();
        Element loadSettings = (Element) root.getElementsByTagName("load").item(0);
        Element saveSettings = (Element) root.getElementsByTagName("save").item(0);
        Element logSettings = (Element) root.getElementsByTagName("log").item(0);

        //System.out.println(loadSettings.getTextContent());
        isLoad = Boolean.parseBoolean(loadSettings.getElementsByTagName("enabled").item(0).getTextContent());
        loadFile = loadSettings.getElementsByTagName("fileName").item(0).getTextContent();
        loadFormat = loadSettings.getElementsByTagName("format").item(0).getTextContent();

        System.out.println(isLoad);
        System.out.println(loadFile);
        System.out.println(loadFormat);

    }
}
