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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for rolesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rolesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}learner" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}staff" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.identifier"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rolesType", propOrder = {
		"learnerList",
		"staffList"
})
public class Roles extends ImeObject
implements Serializable
{

	private final static long serialVersionUID = 12345L;
	@XmlElement(name = "learner", required = true)
	protected List<Learner> learnerList;
	@XmlElement(name = "staff")
	protected List<Staff> staffList;
	@XmlAttribute
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlID
	protected String identifier;

	/**
	 * Gets the value of the learnerList property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the learnerList property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getLearnerList().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Learner }
	 * 
	 * 
	 */
	public List<Learner> getLearnerList() {
		if (learnerList == null) {
			learnerList = new ArrayList<Learner>();
		}
		return this.learnerList;
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

	public void validateImsLd() {
		
		clearStructureOfValidationMessages();

		
		if (getLearnerList().size() > 0)
			for (Learner learner : getLearnerList()) {	
				if (learner != null) {
					learner.validateImsLd();
					putERRORs(learner.getERRORs());
					putWARNINGs(learner.getWARNINGs());
				}
			}
		else 
			putERROR("*Deve existir ao menos um papel aprendiz cadastrado.");

		for (Staff staff : getStaffList()) {	
			if (staff != null) {
				//learner.validateImsLd();
				putERRORs(staff.getERRORs());
				putWARNINGs(staff.getWARNINGs());
			}
		}


	}

}
