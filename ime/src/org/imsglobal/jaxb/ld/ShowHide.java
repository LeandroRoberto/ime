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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for show-hideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="show-hideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsld_v1p0}grp.show-hide" maxOccurs="unbounded"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "show-hideType", propOrder = {
    "grpShowHide"
})
public class ShowHide extends ImeObject implements Serializable
{

    private final static long serialVersionUID = 12345L;
    @XmlElements({
        @XmlElement(name = "play-ref", type = PlayRef.class),
        @XmlElement(name = "learning-activity-ref", type = LearningActivityRef.class),
        @XmlElement(name = "item-ref", type = ItemRef.class),
        @XmlElement(name = "class", type = Class.class),
        @XmlElement(name = "unit-of-learning-href", type = UnitOfLearningHref.class),
        @XmlElement(name = "support-activity-ref", type = SupportActivityRef.class),
        @XmlElement(name = "environment-ref", type = EnvironmentRef.class),
        @XmlElement(name = "activity-structure-ref", type = ActivityStructureRef.class)
    })
    protected List<Object> grpShowHide;

    /**
     * Gets the value of the grpShowHide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grpShowHide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrpShowHide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlayRef }
     * {@link LearningActivityRef }
     * {@link ItemRef }
     * {@link Class }
     * {@link UnitOfLearningHref }
     * {@link SupportActivityRef }
     * {@link EnvironmentRef }
     * {@link ActivityStructureRef }
     * 
     * 
     */
    public List<Object> getGrpShowHide() {
        if (grpShowHide == null) {
            grpShowHide = new ArrayList<Object>();
        }
        return this.grpShowHide;
    }

	@Override
	public void validateImsLd() {
		// TODO Auto-generated method stub
		
	}

}
