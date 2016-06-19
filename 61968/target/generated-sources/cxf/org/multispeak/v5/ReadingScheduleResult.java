
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.ReadingSchedulingResult;


/**
 * This object reports back to the requester on the success of or failure to establish a new meter readingSchedule as requested. 
 * 
 * <p>Java class for readingScheduleResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingScheduleResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0}mspReferable">
 *       &lt;sequence>
 *         &lt;element name="readingScheduleID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="result" type="{http://www.multispeak.org/V5.0/enumerations}readingSchedulingResult"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingScheduleResult", propOrder = {
    "readingScheduleID",
    "result",
    "reason"
})
public class ReadingScheduleResult
    extends MspReferable
{

    @XmlElement(required = true)
    protected ObjectID readingScheduleID;
    @XmlElement(required = true)
    protected ReadingSchedulingResult result;
    protected String reason;

    /**
     * Gets the value of the readingScheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getReadingScheduleID() {
        return readingScheduleID;
    }

    /**
     * Sets the value of the readingScheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setReadingScheduleID(ObjectID value) {
        this.readingScheduleID = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ReadingSchedulingResult }
     *     
     */
    public ReadingSchedulingResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadingSchedulingResult }
     *     
     */
    public void setResult(ReadingSchedulingResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
