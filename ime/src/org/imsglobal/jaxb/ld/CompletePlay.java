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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for complete-playType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="complete-playType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}when-last-act-completed"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}time-limit"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}when-property-value-is-set" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "complete-playType", propOrder = {
    "whenLastActCompleted",
    "timeLimit",
    "whenPropertyValueIsSetList"
})
public class CompletePlay extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "when-last-act-completed")
    protected WhenLastActCompleted whenLastActCompleted;
    @XmlElement(name = "time-limit")
    protected TimeLimit timeLimit;
    @XmlElement(name = "when-property-value-is-set")
    protected List<WhenPropertyValueIsSet> whenPropertyValueIsSetList;

    /**
     * Gets the value of the whenLastActCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link WhenLastActCompleted }
     *     
     */
    public WhenLastActCompleted getWhenLastActCompleted() {
        return whenLastActCompleted;
    }

    /**
     * Sets the value of the whenLastActCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenLastActCompleted }
     *     
     */
    public void setWhenLastActCompleted(WhenLastActCompleted value) {
        this.whenLastActCompleted = value;
    }

    /**
     * Gets the value of the timeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLimit }
     *     
     */
    public TimeLimit getTimeLimit() {
        return timeLimit;
    }

    /**
     * Sets the value of the timeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLimit }
     *     
     */
    public void setTimeLimit(TimeLimit value) {
        this.timeLimit = value;
    }

    /**
     * Gets the value of the whenPropertyValueIsSetList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the whenPropertyValueIsSetList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhenPropertyValueIsSetList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WhenPropertyValueIsSet }
     * 
     * 
     */
    public List<WhenPropertyValueIsSet> getWhenPropertyValueIsSetList() {
        if (whenPropertyValueIsSetList == null) {
            whenPropertyValueIsSetList = new ArrayList<WhenPropertyValueIsSet>();
        }
        return this.whenPropertyValueIsSetList;
    }

	@Override
	public void validateImsLd() {
		// TODO Auto-generated method stub
		
	}

}
