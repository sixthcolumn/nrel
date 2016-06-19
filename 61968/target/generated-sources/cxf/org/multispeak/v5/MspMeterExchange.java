
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.commontypes.ServicePointID;


/**
 * <p>Java class for mspMeterExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspMeterExchange">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspEvent">
 *       &lt;sequence>
 *         &lt;element name="serviceLocationID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="servicePointID" type="{http://www.multispeak.org/V5.0/commonTypes}servicePointID"/>
 *         &lt;element name="outMeterReading" type="{http://www.multispeak.org/V5.0}meterReading" minOccurs="0"/>
 *         &lt;element name="inMeterReading" type="{http://www.multispeak.org/V5.0}meterReading" minOccurs="0"/>
 *         &lt;element name="lastReadDate" type="{http://www.multispeak.org/V5.0/primitives}mspDateTime" minOccurs="0"/>
 *         &lt;element name="lastReading" type="{http://www.multispeak.org/V5.0}meterReading" minOccurs="0"/>
 *         &lt;element name="averageConsumption" type="{http://www.multispeak.org/V5.0}averageConsumption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspMeterExchange", propOrder = {
    "serviceLocationID",
    "servicePointID",
    "outMeterReading",
    "inMeterReading",
    "lastReadDate",
    "lastReading",
    "averageConsumption"
})
@XmlSeeAlso({
    ElectricMeterExchange.class,
    GasMeterExchange.class,
    PpmMeterExchange.class,
    WaterMeterExchange.class,
    PropaneMeterExchange.class,
    OtherMeterExchange.class
})
public abstract class MspMeterExchange
    extends MspEvent
{

    @XmlElement(required = true)
    protected ObjectID serviceLocationID;
    @XmlElement(required = true)
    protected ServicePointID servicePointID;
    protected MeterReading outMeterReading;
    protected MeterReading inMeterReading;
    protected XMLGregorianCalendar lastReadDate;
    protected MeterReading lastReading;
    protected AverageConsumption averageConsumption;

    /**
     * Gets the value of the serviceLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getServiceLocationID() {
        return serviceLocationID;
    }

    /**
     * Sets the value of the serviceLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setServiceLocationID(ObjectID value) {
        this.serviceLocationID = value;
    }

    /**
     * Gets the value of the servicePointID property.
     * 
     * @return
     *     possible object is
     *     {@link ServicePointID }
     *     
     */
    public ServicePointID getServicePointID() {
        return servicePointID;
    }

    /**
     * Sets the value of the servicePointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePointID }
     *     
     */
    public void setServicePointID(ServicePointID value) {
        this.servicePointID = value;
    }

    /**
     * Gets the value of the outMeterReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getOutMeterReading() {
        return outMeterReading;
    }

    /**
     * Sets the value of the outMeterReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setOutMeterReading(MeterReading value) {
        this.outMeterReading = value;
    }

    /**
     * Gets the value of the inMeterReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getInMeterReading() {
        return inMeterReading;
    }

    /**
     * Sets the value of the inMeterReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setInMeterReading(MeterReading value) {
        this.inMeterReading = value;
    }

    /**
     * Gets the value of the lastReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReadDate() {
        return lastReadDate;
    }

    /**
     * Sets the value of the lastReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReadDate(XMLGregorianCalendar value) {
        this.lastReadDate = value;
    }

    /**
     * Gets the value of the lastReading property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReading }
     *     
     */
    public MeterReading getLastReading() {
        return lastReading;
    }

    /**
     * Sets the value of the lastReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReading }
     *     
     */
    public void setLastReading(MeterReading value) {
        this.lastReading = value;
    }

    /**
     * Gets the value of the averageConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link AverageConsumption }
     *     
     */
    public AverageConsumption getAverageConsumption() {
        return averageConsumption;
    }

    /**
     * Sets the value of the averageConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AverageConsumption }
     *     
     */
    public void setAverageConsumption(AverageConsumption value) {
        this.averageConsumption = value;
    }

}
