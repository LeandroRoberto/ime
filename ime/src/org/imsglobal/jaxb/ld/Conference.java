//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.08 at 10:43:46 AM BRST 
//


package org.imsglobal.jaxb.ld;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for conferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}participant" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}observer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}conference-manager" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}moderator" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}item"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}metadata" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.conference-type"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conferenceType", propOrder = {
    "title",
    "participantList",
    "observerList",
    "conferenceManager",
    "moderator",
    "item",
    "metadata"
})
public class Conference extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    protected String title;
    @XmlElement(name = "participant", required = true)
    protected List<Participant> participantList;
    @XmlElement(name = "observer")
    protected List<Observer> observerList;
    @XmlElement(name = "conference-manager")
    protected ConferenceManager conferenceManager;
    protected Moderator moderator;
    @XmlElement(required = true)
    protected Item item;
    protected Extend metadata;
    @XmlAttribute(name = "conference-type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conferenceType;

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
     * Gets the value of the participantList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    public List<Participant> getParticipantList() {
        if (participantList == null) {
            participantList = new ArrayList<Participant>();
        }
        

        for (Iterator<Participant> it = participantList.iterator(); it.hasNext();) {
        	Participant p = it.next();
        	
        	if (p.getRoleRef() == null)
        		it.remove();
        }
        
        
        return this.participantList;
    }

    /**
     * Gets the value of the observerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the observerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObserverList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Observer }
     * 
     * 
     */
    public List<Observer> getObserverList() {
        if (observerList == null) {
            observerList = new ArrayList<Observer>();
        }
        


        for (Iterator<Observer> it = observerList.iterator(); it.hasNext();) {
        	Observer obs = it.next();
        	
        	if (obs.getRoleRef() == null)
        		it.remove();
        }
        
        
        return this.observerList;
    }

    /**
     * Gets the value of the conferenceManager property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceManager }
     *     
     */
    public ConferenceManager getConferenceManager() {
    	
    	if (conferenceManager != null && conferenceManager.getRoleRef() == null)
    		conferenceManager = null;
    	
    	
        return conferenceManager;
    }

    /**
     * Sets the value of the conferenceManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceManager }
     *     
     */
    public void setConferenceManager(ConferenceManager value) {
        this.conferenceManager = value;
    }

    /**
     * Gets the value of the moderator property.
     * 
     * @return
     *     possible object is
     *     {@link Moderator }
     *     
     */
    public Moderator getModerator() {

    	if (moderator != null && moderator.getRoleRef() == null)
    		moderator = null;
    	
        return moderator;
    }

    /**
     * Sets the value of the moderator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moderator }
     *     
     */
    public void setModerator(Moderator value) {
        this.moderator = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
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
     * Gets the value of the conferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceType() {
        return conferenceType;
    }

    /**
     * Sets the value of the conferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceType(String value) {
        this.conferenceType = value;
    }

	@Override
	public void validateImsLd() {

		clearStructureOfValidationMessages();
		
		if (item == null) {
			putERROR("*O item de serviço de conferência deve ser preenchido.");
		}
		else {
			item.validateImsLd();
			putERRORs(item.getERRORs());
			putWARNINGs(item.getWARNINGs());
		}
		
		if (getParticipantList().size() == 0) {
			putERROR("*Ao menos um participante de ser selecionado.");
		}
		if (getObserverList().size() == 0)
			observerList = null;
		
		
		
		
	}

}
