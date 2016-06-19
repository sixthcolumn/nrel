
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outageDetectionLogs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outageDetectionLogs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outageDetectionLog" type="{http://www.multispeak.org/V5.0}outageDetectionLog" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outageDetectionLogs", propOrder = {
    "outageDetectionLog"
})
public class OutageDetectionLogs {

    @XmlElement(required = true)
    protected List<OutageDetectionLog> outageDetectionLog;

    /**
     * Gets the value of the outageDetectionLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outageDetectionLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutageDetectionLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutageDetectionLog }
     * 
     * 
     */
    public List<OutageDetectionLog> getOutageDetectionLog() {
        if (outageDetectionLog == null) {
            outageDetectionLog = new ArrayList<OutageDetectionLog>();
        }
        return this.outageDetectionLog;
    }

}
