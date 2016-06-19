
package org.multispeak.version_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mspOverCurrentDeviceList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mspOverCurrentDeviceList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mspOverCurrentDevice" type="{http://www.multispeak.org/Version_3.0}mspOverCurrentDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mspOverCurrentDeviceList", propOrder = {
    "mspOverCurrentDevice"
})
public class MspOverCurrentDeviceList {

    protected List<MspOverCurrentDevice> mspOverCurrentDevice;

    /**
     * Gets the value of the mspOverCurrentDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mspOverCurrentDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMspOverCurrentDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MspOverCurrentDevice }
     * 
     * 
     */
    public List<MspOverCurrentDevice> getMspOverCurrentDevice() {
        if (mspOverCurrentDevice == null) {
            mspOverCurrentDevice = new ArrayList<MspOverCurrentDevice>();
        }
        return this.mspOverCurrentDevice;
    }

}
