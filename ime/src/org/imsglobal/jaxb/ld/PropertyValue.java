//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.08 at 10:43:46 AM BRST 
//


package org.imsglobal.jaxb.ld;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for property-valueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="property-valueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}langstring"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}calculate"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}property-ref"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "property-valueType", propOrder = {
    "content"
})
public class PropertyValue extends ImeObject implements Serializable
{

    private final static long serialVersionUID = 12345L;
    @XmlElementRefs({
        @XmlElementRef(name = "property-ref", namespace = "http://www.imsglobal.org/xsd/imsld_v1p0", type = PropertyRef.class),
        @XmlElementRef(name = "calculate", namespace = "http://www.imsglobal.org/xsd/imsld_v1p0", type = JAXBElement.class),
        @XmlElementRef(name = "langstring", namespace = "http://www.imsglobal.org/xsd/imsld_v1p0", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link PropertyRef }
     * {@link JAXBElement }{@code <}{@link Expression }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

	@Override
	public void validateImsLd() {
		// TODO Auto-generated method stub
		
	}

}
