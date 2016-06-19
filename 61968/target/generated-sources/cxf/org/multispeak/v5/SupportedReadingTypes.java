
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This list contains a list of the types of readings that this meter can read. Types of readings are expressed as fieldNames as listed in the latest version of the FormattedBlock Implementations Guidelines Document, published by the MultiSpeak Initiative.  Note, this list contains the types of readings that this meter can read; it might not necessarily be programmed currently to read all of these reading types. 
 * 
 * <p>Java class for supportedReadingTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supportedReadingTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="supportedReadingType" type="{http://www.multispeak.org/V5.0}supportedReadingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supportedReadingTypes", propOrder = {
    "supportedReadingType"
})
public class SupportedReadingTypes {

    protected List<SupportedReadingType> supportedReadingType;

    /**
     * Gets the value of the supportedReadingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedReadingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedReadingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedReadingType }
     * 
     * 
     */
    public List<SupportedReadingType> getSupportedReadingType() {
        if (supportedReadingType == null) {
            supportedReadingType = new ArrayList<SupportedReadingType>();
        }
        return this.supportedReadingType;
    }

}
