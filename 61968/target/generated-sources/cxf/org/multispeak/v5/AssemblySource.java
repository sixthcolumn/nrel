
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assemblySource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assemblySource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="stationAssemblyDetails" type="{http://www.multispeak.org/V5.0}stationAssemblyDetails" minOccurs="0"/>
 *         &lt;element name="assemblies" type="{http://www.multispeak.org/V5.0}assemblies" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assemblySource", propOrder = {
    "stationAssemblyDetails",
    "assemblies"
})
public class AssemblySource {

    protected StationAssemblyDetails stationAssemblyDetails;
    protected Assemblies assemblies;

    /**
     * Gets the value of the stationAssemblyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StationAssemblyDetails }
     *     
     */
    public StationAssemblyDetails getStationAssemblyDetails() {
        return stationAssemblyDetails;
    }

    /**
     * Sets the value of the stationAssemblyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationAssemblyDetails }
     *     
     */
    public void setStationAssemblyDetails(StationAssemblyDetails value) {
        this.stationAssemblyDetails = value;
    }

    /**
     * Gets the value of the assemblies property.
     * 
     * @return
     *     possible object is
     *     {@link Assemblies }
     *     
     */
    public Assemblies getAssemblies() {
        return assemblies;
    }

    /**
     * Sets the value of the assemblies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assemblies }
     *     
     */
    public void setAssemblies(Assemblies value) {
        this.assemblies = value;
    }

}
