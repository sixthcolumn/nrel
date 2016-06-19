
package ch.iec.tc57._2011.meterreadschedulemessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.iec.tc57._2011.meterreadschedule.MeterReadSchedule;
import ch.iec.tc57._2011.schema.message.OperationSet;


/**
 * <p>Java class for MeterReadSchedulePayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeterReadSchedulePayloadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://iec.ch/TC57/2011/MeterReadSchedule#}MeterReadSchedule"/>
 *         &lt;element name="OperationSet" type="{http://www.iec.ch/TC57/2011/schema/message}OperationSet" minOccurs="0"/>
 *         &lt;element name="Compressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadSchedulePayloadType", propOrder = {
    "meterReadSchedule",
    "operationSet",
    "compressed",
    "format"
})
public class MeterReadSchedulePayloadType {

    @XmlElement(name = "MeterReadSchedule", namespace = "http://iec.ch/TC57/2011/MeterReadSchedule#", required = true)
    protected MeterReadSchedule meterReadSchedule;
    @XmlElement(name = "OperationSet")
    protected OperationSet operationSet;
    @XmlElement(name = "Compressed")
    protected String compressed;
    @XmlElement(name = "Format")
    protected String format;

    /**
     * Gets the value of the meterReadSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadSchedule }
     *     
     */
    public MeterReadSchedule getMeterReadSchedule() {
        return meterReadSchedule;
    }

    /**
     * Sets the value of the meterReadSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadSchedule }
     *     
     */
    public void setMeterReadSchedule(MeterReadSchedule value) {
        this.meterReadSchedule = value;
    }

    /**
     * Gets the value of the operationSet property.
     * 
     * @return
     *     possible object is
     *     {@link OperationSet }
     *     
     */
    public OperationSet getOperationSet() {
        return operationSet;
    }

    /**
     * Sets the value of the operationSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSet }
     *     
     */
    public void setOperationSet(OperationSet value) {
        this.operationSet = value;
    }

    /**
     * Gets the value of the compressed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressed() {
        return compressed;
    }

    /**
     * Sets the value of the compressed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressed(String value) {
        this.compressed = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
