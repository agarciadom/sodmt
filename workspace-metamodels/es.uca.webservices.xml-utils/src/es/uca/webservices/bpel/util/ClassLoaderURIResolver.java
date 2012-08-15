package es.uca.webservices.bpel.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;
import javax.xml.transform.stream.StreamSource;

/**
 * This resolver allows the XSLT sheets to include other XSLT documents that
 * are stored in the same JAR. If it is not in the JAR file, it relies in the default
 * behaviour of searching in the current working dir.
 * 
 * @author Antonio García Domínguez
 * @version 1.0
 */
class ClassLoaderURIResolver implements URIResolver {

    /**
     * Implements the "resolve" method
     * @param href  The file (href) to be resolved
     * @param base  The base dir
     * @return           The associated source, or <code>null</code> if the file has not been founded
     * @throws TransformerException
     */
    public Source resolve(String href, String base) throws TransformerException {
            InputStream is = ClassLoaderURIResolver.class.getClassLoader()
                            .getResourceAsStream(href);
            if (is != null) {
                    return new StreamSource(is);
            } else {
                    try {
                            File f = new File(base, href);
                            if (!f.canRead())
                                    return null;
                            return new StreamSource(new FileInputStream(f));
                    } catch (FileNotFoundException e) {
                            return null;
                    }
            }
    }

}
