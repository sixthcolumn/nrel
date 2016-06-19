
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container to hold references to meters and/or service locations affected by this outage event.
 * 
 * <p>Java class for affectedMeters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="affectedMeters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affectedMeter" type="{http://www.multispeak.org/V5.0}affectedMeter" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "affectedMeters", propOrder = {
    "affectedMeter"
})
public class AffectedMeters {

    @XmlElement(required = true)
    protected List<AffectedMeter> affectedMeter;

    /**
     * Gets the value of the affectedMeter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedMeter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedMeter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedMeter }
     * 
     * 
     */
    public List<AffectedMeter> getAffectedMeter() {
        if (affectedMeter == null) {
            affectedMeter = new ArrayList<AffectedMeter>();
        }
        return this.affectedMeter;
    }

}
