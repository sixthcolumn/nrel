
package org.multispeak.v5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherServicePoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="otherServicePoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherServicePoint" type="{http://www.multispeak.org/V5.0}otherServicePoint" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherServicePoints", propOrder = {
    "otherServicePoint"
})
public class OtherServicePoints {

    @XmlElement(required = true)
    protected List<OtherServicePoint> otherServicePoint;

    /**
     * Gets the value of the otherServicePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherServicePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherServicePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherServicePoint }
     * 
     * 
     */
    public List<OtherServicePoint> getOtherServicePoint() {
        if (otherServicePoint == null) {
            otherServicePoint = new ArrayList<OtherServicePoint>();
        }
        return this.otherServicePoint;
    }

}
