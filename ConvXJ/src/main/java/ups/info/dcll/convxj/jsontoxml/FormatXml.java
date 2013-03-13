package ups.info.dcll.convxj.jsontoxml;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Mathieu Legrand
 *
 */
public class FormatXml {

    /**
     *
     * @param xml le xml a indenter
     * @return le xml indenté
     */
    public final String format(final String xml) {
        try {
            final Document doc = parseXmlFile(xml);
            final int lineWidth = 70;
            OutputFormat format = new OutputFormat(doc);
            format.setLineWidth(lineWidth);
            format.setIndenting(true);
            format.setIndent(2);
            Writer indentXml = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(indentXml, format);
            serializer.serialize(doc);

            return indentXml.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param xml le xml a parser
     * @return un objet Document contenant l'arborescence
     */
    private Document parseXmlFile(final String xml) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xml));
            return db.parse(is);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
