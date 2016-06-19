
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.QualityDescription;
import org.multispeak.v5_0.enumerations.StatusIdentifierType;


/**
 * <p>Java class for scadaStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="scadaPointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="status" type="{http://www.multispeak.org/V5.0/enumerations}statusIdentifierType"/>
 *         &lt;element name="quality" type="{http://www.multispeak.org/V5.0/enumerations}qualityDescription" minOccurs="0"/>
 *         &lt;element name="changeCounter" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scadaStatus", propOrder = {
    "scadaPointID",
    "status",
    "quality",
    "changeCounter"
})
public class ScadaStatus
    extends MspEvent
{

    @XmlElement(required = true)
    protected ObjectID scadaPointID;
    @XmlElement(required = true)
    protected StatusIdentifierType status;
    protected QualityDescription quality;
    protected Long changeCounter;

    /**
     * Gets the value of the scadaPointID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getScadaPointID() {
        return scadaPointID;
    }

    /**
     * Sets the value of the scadaPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setScadaPointID(ObjectID value) {
        this.scadaPointID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusIdentifierType }
     *     
     */
    public StatusIdentifierType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusIdentifierType }
     *     
     */
    public void setStatus(StatusIdentifierType value) {
        this.status = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDescription }
     *     
     */
    public QualityDescription getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDescription }
     *     
     */
    public void setQuality(QualityDescription value) {
        this.quality = value;
    }

    /**
     * Gets the value of the changeCounter property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getChangeCounter() {
        return changeCounter;
    }

    /**
     * Sets the value of the changeCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setChangeCounter(Long value) {
        this.changeCounter = value;
    }

}
