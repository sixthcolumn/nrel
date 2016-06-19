
package org.multispeak.v5_0.commonarrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5.MaterialManagementAssembly;


/**
 * <p>Java class for ArrayOfMaterialManagementAssembly complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaterialManagementAssembly">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="materialManagementAssembly" type="{http://www.multispeak.org/V5.0}materialManagementAssembly" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaterialManagementAssembly", propOrder = {
    "materialManagementAssembly"
})
public class ArrayOfMaterialManagementAssembly {

    @XmlElement(nillable = true)
    protected List<MaterialManagementAssembly> materialManagementAssembly;

    /**
     * Gets the value of the materialManagementAssembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialManagementAssembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialManagementAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialManagementAssembly }
     * 
     * 
     */
    public List<MaterialManagementAssembly> getMaterialManagementAssembly() {
        if (materialManagementAssembly == null) {
            materialManagementAssembly = new ArrayList<MaterialManagementAssembly>();
        }
        return this.materialManagementAssembly;
    }

}
