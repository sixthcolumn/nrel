
package org.multispeak.v5_0.commontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMLLines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLLines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GMLLine" type="{http://www.multispeak.org/V5.0/commonTypes}GMLLine" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLLines", propOrder = {
    "gmlLine"
})
public class GMLLines {

    @XmlElement(name = "GMLLine", required = true)
    protected List<GMLLine> gmlLine;

    /**
     * Gets the value of the gmlLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gmlLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGMLLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMLLine }
     * 
     * 
     */
    public List<GMLLine> getGMLLine() {
        if (gmlLine == null) {
            gmlLine = new ArrayList<GMLLine>();
        }
        return this.gmlLine;
    }

}
