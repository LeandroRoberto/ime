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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import br.edu.ifg.ime.ld.ImeObject;


/**
 * <p>Java class for game-serviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="game-serviceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}title" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}game-name" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}participant" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}tool" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}awayreness" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsld_v1p0}metadata" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsld_v1p0}attr.game-serviceType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "game-serviceType", propOrder = {
    "title",
    "gameName",
    "participantList",
    "tool",
    "awayreness",
    "metadata"
})
public class GameService extends ImeObject
    implements Serializable
{

    private final static long serialVersionUID = 12345L;
    protected String title;
    @XmlElement(name = "game-name")
    protected String gameName;
    @XmlElement(name = "participant", required = true)
    protected List<Participant> participantList;
    protected String tool;
    protected Awayreness awayreness;
    protected Extend metadata;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String interaction;
    @XmlAttribute(name = "didatic-kit")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String didaticKit;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String performance;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String skill;
    @XmlAttribute(name = "game-level")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gameLevel;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String control;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String workspace;
    @XmlAttribute(name = "game-use")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gameUse;

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
     * Gets the value of the gameName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * Sets the value of the gameName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameName(String value) {
        this.gameName = value;
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
        return this.participantList;
    }

    /**
     * Gets the value of the tool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTool() {
        return tool;
    }

    /**
     * Sets the value of the tool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTool(String value) {
        this.tool = value;
    }

    /**
     * Gets the value of the awayreness property.
     * 
     * @return
     *     possible object is
     *     {@link Awayreness }
     *     
     */
    public Awayreness getAwayreness() {
        return awayreness;
    }

    /**
     * Sets the value of the awayreness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Awayreness }
     *     
     */
    public void setAwayreness(Awayreness value) {
        this.awayreness = value;
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
     * Gets the value of the interaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteraction() {
        return interaction;
    }

    /**
     * Sets the value of the interaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteraction(String value) {
        this.interaction = value;
    }

    /**
     * Gets the value of the didaticKit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDidaticKit() {
        return didaticKit;
    }

    /**
     * Sets the value of the didaticKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDidaticKit(String value) {
        this.didaticKit = value;
    }

    /**
     * Gets the value of the performance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * Sets the value of the performance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformance(String value) {
        this.performance = value;
    }

    /**
     * Gets the value of the skill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkill() {
        return skill;
    }

    /**
     * Sets the value of the skill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkill(String value) {
        this.skill = value;
    }

    /**
     * Gets the value of the gameLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameLevel() {
        return gameLevel;
    }

    /**
     * Sets the value of the gameLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameLevel(String value) {
        this.gameLevel = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControl(String value) {
        this.control = value;
    }

    /**
     * Gets the value of the workspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkspace() {
        return workspace;
    }

    /**
     * Sets the value of the workspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkspace(String value) {
        this.workspace = value;
    }

    /**
     * Gets the value of the gameUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameUse() {
        return gameUse;
    }

    /**
     * Sets the value of the gameUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameUse(String value) {
        this.gameUse = value;
    }

	@Override
	public void validateImsLd() {
		// TODO Auto-generated method stub
		
	}

}
