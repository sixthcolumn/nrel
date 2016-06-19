
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterReadReadingValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterReadReadingValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingValue" type="{http://www.multispeak.org/Version_3.0}readingValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterReadReadingValues", propOrder = {
    "readingValue"
})
public class MeterReadReadingValues {

    protected List<ReadingValue> readingValue;

    /**
     * Gets the value of the readingValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingValue }
     * 
     * 
     */
    public List<ReadingValue> getReadingValue() {
        if (readingValue == null) {
            readingValue = new ArrayList<ReadingValue>();
        }
        return this.readingValue;
    }

}
