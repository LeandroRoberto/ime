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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.edu.ifg.ime.ld.ImeObject;
import br.edu.ifg.ime.ld.LdProject;
import br.edu.ifg.ime.ld.LearningDesignRef;


/**
 * <p>Java class for playType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="playType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}act" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}complete-play" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}on-completion" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}metadata" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.isvisible"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.identifier"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "playType", propOrder = {
    "title",
    "actList",
    "completePlay",
    "onCompletion",
    "metadata"
})
public class Play extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    protected String title;
    @XmlElement(name = "act", required = true)
    protected List<Act> actList;
    @XmlElement(name = "complete-play")
    protected CompletePlay completePlay;
    @XmlElement(name = "on-completion")
    protected OnCompletion onCompletion;
    protected Extend metadata;
    @XmlAttribute
    protected Boolean isvisible;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String identifier;
    /*
    @XmlElement(name="learning-design-ref")
    protected List<LearningDesignRef> learningDesignRef;
    
    //ALTERAÇÃO DOS OBJETOS DA ESPECIFICAÇÃO - Controle externo para construção estruturas em multicamadas
    public List<LearningDesignRef> getLearningDesignRef() {
    	
    	if (learningDesignRef == null)
    		learningDesignRef = new ArrayList<LearningDesignRef>();
    	
		return learningDesignRef;
	}*/

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
     * Gets the value of the actList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Act }
     * 
     * 
     */
    public List<Act> getActList() {
        if (actList == null) {
            actList = new ArrayList<Act>();
        }
        return this.actList;
    }

    /**
     * Gets the value of the completePlay property.
     * 
     * @return
     *     possible object is
     *     {@link CompletePlay }
     *     
     */
    public CompletePlay getCompletePlay() {
        return completePlay;
    }

    /**
     * Sets the value of the completePlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletePlay }
     *     
     */
    public void setCompletePlay(CompletePlay value) {
        this.completePlay = value;
    }

    /**
     * Gets the value of the onCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link OnCompletion }
     *     
     */
    public OnCompletion getOnCompletion() {
        return onCompletion;
    }

    /**
     * Sets the value of the onCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnCompletion }
     *     
     */
    public void setOnCompletion(OnCompletion value) {
        this.onCompletion = value;
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
     * Gets the value of the isvisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsvisible() {
        if (isvisible == null) {
            return true;
        } else {
            return isvisible;
        }
    }

    /**
     * Sets the value of the isvisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsvisible(Boolean value) {
        this.isvisible = value;
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
    
    public String toString() {
    	return title;
    }

	@Override
	public void validateImsLd() {
		clearStructureOfValidationMessages();

		if (title == null || title.length() == 0)
		    putWARNING("*Play sem título.");
		
		if (onCompletion != null) {
			onCompletion.validateImsLd();
			putERRORs(onCompletion.getERRORs());
			putWARNINGs(onCompletion.getWARNINGs());
		}

		if (!isIsvisible())
			putWARNING("*Play "+title+" não está visível!");
		
		if (getActList().size() == 0) {
			putERROR("*Nenhum Ato Cadastrado...");
		}
		else {
			for (Act act: getActList()) {
				act.validateImsLd();
				putERRORs(act.getERRORs());
				putWARNINGs(act.getWARNINGs());
			}
		}
		 
	}

}
