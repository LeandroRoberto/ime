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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for role-partType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="role-partType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}role-ref"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}learning-activity-ref"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}support-activity-ref"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}unit-of-learning-href"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}activity-structure-ref"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}environment-ref"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}metadata" minOccurs="0"/>
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
@XmlType(name = "role-partType", propOrder = {
    "title",
    "roleRef",
    "learningActivityRef",
    "supportActivityRef",
    "unitOfLearningHref",
    "activityStructureRef",
    "environmentRef",
    "metadata"
})
public class RolePart extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    protected String title;
    @XmlElement(name = "role-ref", required = true)
    protected RoleRef roleRef;
    @XmlElement(name = "learning-activity-ref")
    protected LearningActivityRef learningActivityRef;
    @XmlElement(name = "support-activity-ref")
    protected SupportActivityRef supportActivityRef;
    @XmlElement(name = "unit-of-learning-href")
    protected UnitOfLearningHref unitOfLearningHref;
    @XmlElement(name = "activity-structure-ref")
    protected ActivityStructureRef activityStructureRef;
    @XmlElement(name = "environment-ref")
    protected EnvironmentRef environmentRef;
    protected Extend metadata;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String identifier;

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
     * Gets the value of the learningActivityRef property.
     * 
     * @return
     *     possible object is
     *     {@link LearningActivityRef }
     *     
     */
    public LearningActivityRef getLearningActivityRef() {
        return learningActivityRef;
    }

    /**
     * Sets the value of the learningActivityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningActivityRef }
     *     
     */
    public void setLearningActivityRef(LearningActivityRef value) {
        this.learningActivityRef = value;
    }

    /**
     * Gets the value of the supportActivityRef property.
     * 
     * @return
     *     possible object is
     *     {@link SupportActivityRef }
     *     
     */
    public SupportActivityRef getSupportActivityRef() {
        return supportActivityRef;
    }

    /**
     * Sets the value of the supportActivityRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportActivityRef }
     *     
     */
    public void setSupportActivityRef(SupportActivityRef value) {
        this.supportActivityRef = value;
    }

    /**
     * Gets the value of the unitOfLearningHref property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfLearningHref }
     *     
     */
    public UnitOfLearningHref getUnitOfLearningHref() {
        return unitOfLearningHref;
    }

    /**
     * Sets the value of the unitOfLearningHref property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfLearningHref }
     *     
     */
    public void setUnitOfLearningHref(UnitOfLearningHref value) {
        this.unitOfLearningHref = value;
    }

    /**
     * Gets the value of the activityStructureRef property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityStructureRef }
     *     
     */
    public ActivityStructureRef getActivityStructureRef() {
        return activityStructureRef;
    }

    /**
     * Sets the value of the activityStructureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityStructureRef }
     *     
     */
    public void setActivityStructureRef(ActivityStructureRef value) {
        this.activityStructureRef = value;
    }

    /**
     * Gets the value of the environmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentRef }
     *     
     */
    public EnvironmentRef getEnvironmentRef() {
        return environmentRef;
    }

    /**
     * Sets the value of the environmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentRef }
     *     
     */
    public void setEnvironmentRef(EnvironmentRef value) {
        this.environmentRef = value;
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

    public Object getObjectRef() {
    	return getEnvironmentRef() != null
				&& getEnvironmentRef().getRef() != null ?
				getEnvironmentRef().getRef()
				: getLearningActivityRef() != null
						&& getLearningActivityRef()
								.getRef() != null ? 
						getLearningActivityRef()
						.getRef()
						: getSupportActivityRef() != null
								&& getSupportActivityRef()
										.getRef() != null ? 
								getSupportActivityRef()
								.getRef()
								: getActivityStructureRef() != null
										&& getActivityStructureRef()
												.getRef() != null ? 
										getActivityStructureRef()
										.getRef()
										: null;
    }
    
	@Override
	public void validateImsLd() {

		clearStructureOfValidationMessages();
		
		if (title == null || title.length() == 0)
		    putWARNING("*RolePart sem título.");
		
		if (getObjectRef() == null)
			putERROR("Nenhum ambiente ou atividade foi associado a RolePart "+title);

		if (roleRef == null)
			putERROR("Nenhum papel foi associado a RolePart "+title);
		
	}

}
