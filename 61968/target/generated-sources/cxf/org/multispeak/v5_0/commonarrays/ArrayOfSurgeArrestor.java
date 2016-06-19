
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.SurgeArrestor;


/**
 * <p>Java class for ArrayOfSurgeArrestor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSurgeArrestor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surgeArrestor" type="{http://www.multispeak.org/V5.0}surgeArrestor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSurgeArrestor", propOrder = {
    "surgeArrestor"
})
public class ArrayOfSurgeArrestor {

    @XmlElement(nillable = true)
    protected List<SurgeArrestor> surgeArrestor;

    /**
     * Gets the value of the surgeArrestor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surgeArrestor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurgeArrestor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurgeArrestor }
     * 
     * 
     */
    public List<SurgeArrestor> getSurgeArrestor() {
        if (surgeArrestor == null) {
            surgeArrestor = new ArrayList<SurgeArrestor>();
        }
        return this.surgeArrestor;
    }

}
