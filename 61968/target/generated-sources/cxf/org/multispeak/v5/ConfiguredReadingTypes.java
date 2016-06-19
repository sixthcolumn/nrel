
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the list of reading types that meters in this configuration group are programmed to read.
 * 
 * <p>Java class for configuredReadingTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuredReadingTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="configuredReadingType" type="{http://www.multispeak.org/V5.0}configuredReadingType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuredReadingTypes", propOrder = {
    "configuredReadingType"
})
public class ConfiguredReadingTypes {

    protected List<ConfiguredReadingType> configuredReadingType;

    /**
     * Gets the value of the configuredReadingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuredReadingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguredReadingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfiguredReadingType }
     * 
     * 
     */
    public List<ConfiguredReadingType> getConfiguredReadingType() {
        if (configuredReadingType == null) {
            configuredReadingType = new ArrayList<ConfiguredReadingType>();
        }
        return this.configuredReadingType;
    }

}
