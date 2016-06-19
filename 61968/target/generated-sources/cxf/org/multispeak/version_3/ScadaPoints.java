
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scadaPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scadaPoints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspObject">
 *       &lt;sequence>
 *         &lt;element name="scadaPointList" type="{http://www.multispeak.org/Version_3.0}ArrayOfScadaPoint" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scadaPoints", propOrder = {
    "scadaPointList"
})
public class ScadaPoints
    extends MspObject
{

    protected ArrayOfScadaPoint scadaPointList;

    /**
     * Gets the value of the scadaPointList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfScadaPoint }
     *     
     */
    public ArrayOfScadaPoint getScadaPointList() {
        return scadaPointList;
    }

    /**
     * Sets the value of the scadaPointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfScadaPoint }
     *     
     */
    public void setScadaPointList(ArrayOfScadaPoint value) {
        this.scadaPointList = value;
    }

}
