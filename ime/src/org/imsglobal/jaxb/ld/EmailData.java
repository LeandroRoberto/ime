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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for email-dataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="email-dataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}role-ref"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.email-property-ref.req"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.username-property-ref"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "email-dataType", propOrder = {
    "roleRef"
})
public class EmailData extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    @XmlElement(name = "role-ref", required = true)
    protected RoleRef roleRef;
    @XmlAttribute(name = "email-property-ref", required = true)
    protected String emailPropertyRef;
    @XmlAttribute(name = "username-property-ref")
    protected String usernamePropertyRef;

    /**
     * Gets the value of the roleRef property.
     * 
     * @return
     *     possible object is
     *     {@link RoleRef }
     *     
     */
    public RoleRef getRoleRef() {
        return roleRef;
    }

    /**
     * Sets the value of the roleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleRef }
     *     
     */
    public void setRoleRef(RoleRef value) {
        this.roleRef = value;
    }

    /**
     * Gets the value of the emailPropertyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPropertyRef() {
        return emailPropertyRef;
    }

    /**
     * Sets the value of the emailPropertyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPropertyRef(String value) {
        this.emailPropertyRef = value;
    }

    /**
     * Gets the value of the usernamePropertyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsernamePropertyRef() {
        return usernamePropertyRef;
    }

    /**
     * Sets the value of the usernamePropertyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsernamePropertyRef(String value) {
        this.usernamePropertyRef = value;
    }

	@Override
	public void validateImsLd() { 

		clearStructureOfValidationMessages();
		if (roleRef == null)
			putERROR("Nenhum papel foi ao serviço de email");
	}

}
