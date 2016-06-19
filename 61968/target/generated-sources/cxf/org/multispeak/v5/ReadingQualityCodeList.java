
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of the codes used to describe the quality of meter readings and their meanings.  For additional details on these codes, see the definitions for QualityCode in IEC 61968-9, 2nd. Edition, Annex D.
 * 
 * <p>Java class for readingQualityCodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingQualityCodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingQualityCodeEntry" type="{http://www.multispeak.org/V5.0}readingQualityCodeEntry" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingQualityCodeList", propOrder = {
    "readingQualityCodeEntry"
})
public class ReadingQualityCodeList {

    @XmlElement(required = true)
    protected List<ReadingQualityCodeEntry> readingQualityCodeEntry;

    /**
     * Gets the value of the readingQualityCodeEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingQualityCodeEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingQualityCodeEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingQualityCodeEntry }
     * 
     * 
     */
    public List<ReadingQualityCodeEntry> getReadingQualityCodeEntry() {
        if (readingQualityCodeEntry == null) {
            readingQualityCodeEntry = new ArrayList<ReadingQualityCodeEntry>();
        }
        return this.readingQualityCodeEntry;
    }

}
