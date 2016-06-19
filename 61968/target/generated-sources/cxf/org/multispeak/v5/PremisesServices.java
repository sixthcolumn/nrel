
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an optional list of the service locations that are contained in this premises.  For instance, many serviceLocations may be contained in an apartment complex, which would be one premise.  It is also possible that the service locations listed here are for multiple service types (i.e., electric, gas, water, etc).
 * 
 * <p>Java class for premisesServices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="premisesServices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premisesService" type="{http://www.multispeak.org/V5.0}premisesService" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "premisesServices", propOrder = {
    "premisesService"
})
public class PremisesServices {

    @XmlElement(required = true)
    protected List<PremisesService> premisesService;

    /**
     * Gets the value of the premisesService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesService }
     * 
     * 
     */
    public List<PremisesService> getPremisesService() {
        if (premisesService == null) {
            premisesService = new ArrayList<PremisesService>();
        }
        return this.premisesService;
    }

}
