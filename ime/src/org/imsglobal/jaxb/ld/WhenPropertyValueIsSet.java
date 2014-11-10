//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.08 at 10:43:46 AM BRST 
//


package org.imsglobal.jaxb.ld;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for when-property-value-is-setType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="when-property-value-is-setType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}property-ref"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}property-value" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "when-property-value-is-setType", propOrder = {
    "propertyRef",
    "propertyValue"
})
public class WhenPropertyValueIsSet extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "property-ref", required = true)
    protected PropertyRef propertyRef;
    @XmlElement(name = "property-value")
    protected PropertyValue propertyValue;

    /**
     * Gets the value of the propertyRef property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyRef }
     *     
     */
    public PropertyRef getPropertyRef() {
        return propertyRef;
    }

    /**
     * Sets the value of the propertyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyRef }
     *     
     */
    public void setPropertyRef(PropertyRef value) {
        this.propertyRef = value;
    }

    /**
     * Gets the value of the propertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyValue }
     *     
     */
    public PropertyValue getPropertyValue() {
        return propertyValue;
    }

    /**
     * Sets the value of the propertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyValue }
     *     
     */
    public void setPropertyValue(PropertyValue value) {
        this.propertyValue = value;
    }

	@Override
	public void validateImsLd() {
		// TODO Auto-generated method stub
		
	}

}
