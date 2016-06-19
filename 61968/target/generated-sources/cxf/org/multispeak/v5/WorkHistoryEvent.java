
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.enumerations.HistoryEventType;


/**
 * These events constitute a detailed history of all transactions on the related workItem.
 * 
 * <p>Java class for workHistoryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workHistoryEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="historyEventType" type="{http://www.multispeak.org/V5.0/enumerations}historyEventType"/>
 *         &lt;element name="responsibleParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="electronicAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workHistoryEvent", propOrder = {
    "historyEventType",
    "responsibleParty",
    "electronicAddress"
})
public class WorkHistoryEvent
    extends MspEvent
{

    @XmlElement(required = true)
    protected HistoryEventType historyEventType;
    protected String responsibleParty;
    protected String electronicAddress;

    /**
     * Gets the value of the historyEventType property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryEventType }
     *     
     */
    public HistoryEventType getHistoryEventType() {
        return historyEventType;
    }

    /**
     * Sets the value of the historyEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryEventType }
     *     
     */
    public void setHistoryEventType(HistoryEventType value) {
        this.historyEventType = value;
    }

    /**
     * Gets the value of the responsibleParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleParty() {
        return responsibleParty;
    }

    /**
     * Sets the value of the responsibleParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleParty(String value) {
        this.responsibleParty = value;
    }

    /**
     * Gets the value of the electronicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * Sets the value of the electronicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAddress(String value) {
        this.electronicAddress = value;
    }

}
