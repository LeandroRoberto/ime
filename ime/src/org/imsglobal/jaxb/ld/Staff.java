//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.08 at 10:43:46 AM BRST 
//


package org.imsglobal.jaxb.ld;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.edu.ifg.ime.ld.ImeObject;
import br.edu.ifg.ime.ld.interfaces.Role;


/**
 * <p>Java class for staffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staffType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}information" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}staff" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}metadata" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.role"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staffType", propOrder = {
    "title",
    "information",
    "staffList",
    "metadata"
})
public class Staff extends ImeObject
    implements Serializable, Role
{

    private final static long serialVersionUID = 12345L;
    protected String title;
    protected ItemModel information;
    @XmlElement(name = "staff")
    protected List<Staff> staffList;
    protected Extend metadata;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String identifier;
    @XmlAttribute(name = "max-persons")
    protected BigInteger maxPersons;
    @XmlAttribute
    protected String href;
    @XmlAttribute(name = "create-new")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String createNew;
    @XmlAttribute(name = "min-persons")
    protected BigInteger minPersons;
    @XmlAttribute(name = "match-persons")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String matchPersons;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link ItemModel }
     *     
     */
    public ItemModel getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemModel }
     *     
     */
    public void setInformation(ItemModel value) {
        this.information = value;
    }

    /**
     * Gets the value of the staffList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Staff }
     * 
     * 
     */
    public List<Staff> getStaffList() {
        if (staffList == null) {
            staffList = new ArrayList<Staff>();
        }
        return this.staffList;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link Extend }
     *     
     */
    public Extend getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extend }
     *     
     */
    public void setMetadata(Extend value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the maxPersons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPersons() {
        return maxPersons;
    }

    /**
     * Sets the value of the maxPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPersons(BigInteger value) {
        this.maxPersons = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the createNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateNew() {
        if (createNew == null) {
            return "allowed";
        } else {
            return createNew;
        }
    }

    /**
     * Sets the value of the createNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateNew(String value) {
        this.createNew = value;
    }

    /**
     * Gets the value of the minPersons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinPersons() {
        return minPersons;
    }

    /**
     * Sets the value of the minPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinPersons(BigInteger value) {
        this.minPersons = value;
    }

    /**
     * Gets the value of the matchPersons property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchPersons() {
        return matchPersons;
    }

    /**
     * Sets the value of the matchPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchPersons(String value) {
        this.matchPersons = value;
    }

	@Override
	public void validateImsLd() {
		clearStructureOfValidationMessages();
		
		if (title == null || title.length() == 0)
		    putWARNING("*Papel de Equipe de Apoio sem título.");
		

		if (information != null && information.isEmpty()) {
			information = null;
		} else if (information != null) {
			information.validateImsLd();
			putERRORs(information.getERRORs());
			putWARNINGs(information.getWARNINGs());
		}
		
		for (Staff staff: getStaffList()) {
			staff.validateImsLd();
			putERRORs(staff.getERRORs());
			putWARNINGs(staff.getWARNINGs());
		}
		
		
	}

}
