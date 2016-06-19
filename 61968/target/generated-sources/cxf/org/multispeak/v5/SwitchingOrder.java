
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for switchingOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="switchingOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="documentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="switchingSchedule" type="{http://www.multispeak.org/V5.0}switchingSchedule" minOccurs="0"/>
 *         &lt;element name="switchingOrderEvents" type="{http://www.multispeak.org/V5.0}switchingOrderEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "switchingOrder", propOrder = {
    "title",
    "description",
    "purpose",
    "revision",
    "lastModifiedDateTime",
    "documentStatus",
    "switchingSchedule",
    "switchingOrderEvents"
})
public class SwitchingOrder
    extends MspObject
{

    protected String title;
    protected String description;
    protected String purpose;
    protected String revision;
    protected XMLGregorianCalendar lastModifiedDateTime;
    protected String documentStatus;
    protected SwitchingSchedule switchingSchedule;
    protected SwitchingOrderEvents switchingOrderEvents;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDateTime(XMLGregorianCalendar value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the documentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentStatus() {
        return documentStatus;
    }

    /**
     * Sets the value of the documentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentStatus(String value) {
        this.documentStatus = value;
    }

    /**
     * Gets the value of the switchingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingSchedule }
     *     
     */
    public SwitchingSchedule getSwitchingSchedule() {
        return switchingSchedule;
    }

    /**
     * Sets the value of the switchingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingSchedule }
     *     
     */
    public void setSwitchingSchedule(SwitchingSchedule value) {
        this.switchingSchedule = value;
    }

    /**
     * Gets the value of the switchingOrderEvents property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchingOrderEvents }
     *     
     */
    public SwitchingOrderEvents getSwitchingOrderEvents() {
        return switchingOrderEvents;
    }

    /**
     * Sets the value of the switchingOrderEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchingOrderEvents }
     *     
     */
    public void setSwitchingOrderEvents(SwitchingOrderEvents value) {
        this.switchingOrderEvents = value;
    }

}
