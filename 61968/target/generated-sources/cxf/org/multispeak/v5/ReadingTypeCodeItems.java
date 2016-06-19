
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readingTypeCodeItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readingTypeCodeItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readingTypeCodeItem" type="{http://www.multispeak.org/V5.0}readingTypeCodeItem" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readingTypeCodeItems", propOrder = {
    "readingTypeCodeItem"
})
public class ReadingTypeCodeItems {

    @XmlElement(required = true)
    protected List<ReadingTypeCodeItem> readingTypeCodeItem;

    /**
     * Gets the value of the readingTypeCodeItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingTypeCodeItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingTypeCodeItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingTypeCodeItem }
     * 
     * 
     */
    public List<ReadingTypeCodeItem> getReadingTypeCodeItem() {
        if (readingTypeCodeItem == null) {
            readingTypeCodeItem = new ArrayList<ReadingTypeCodeItem>();
        }
        return this.readingTypeCodeItem;
    }

}
