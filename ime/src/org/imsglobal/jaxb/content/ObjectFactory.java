//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.24 at 07:56:15 PM BRT 
//


package org.imsglobal.jaxb.content;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext.Scope;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.imsglobal.jaxb.content package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Manifest_QNAME = new QName("http://www.imsglobal.org/xsd/imscp_v1p1", "manifest", "imscp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.imsglobal.jaxb.content
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Metadata }
     * 
     */
    public Metadata createMetadata() {
        return new Metadata();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link ManifestMetadata }
     * 
     */
    public ManifestMetadata createManifestMetadata() {
        return new ManifestMetadata();
    }

    /**
     * Create an instance of {@link Resources }
     * 
     */
    public Resources createResources() {
        return new Resources();
    }

    /**
     * Create an instance of {@link Dependency }
     * 
     */
    public Dependency createDependency() {
        return new Dependency();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Organizations }
     * 
     */
    public Organizations createOrganizations() {
        return new Organizations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Manifest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.imsglobal.org/xsd/imscp_v1p1", name = "manifest")
    public JAXBElement<Manifest> createManifestJaxbElement(Manifest value) {
        return new JAXBElement<Manifest>(_Manifest_QNAME, Manifest.class, null, value);
    }

}
