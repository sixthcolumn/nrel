
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.multispeak.v5_0.commontypes.MspExtensible;
import org.multispeak.v5_0.commontypes.ObjectID;
import org.multispeak.v5_0.enumerations.Uom;


/**
 * This is an optional method to control load using a closed-loop feedback system.  The SCADA system sets a target on a specific analog point and requests the LM system maintain demand below this target level within its capability.
 * 
 * <p>Java class for closedLoopStrategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="closedLoopStrategy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/V5.0/commonTypes}mspExtensible">
 *       &lt;sequence>
 *         &lt;element name="pointID" type="{http://www.multispeak.org/V5.0/commonTypes}objectID"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="units" type="{http://www.multispeak.org/V5.0/enumerations}uom"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "closedLoopStrategy", propOrder = {
    "pointID",
    "target",
    "units"
})
public class ClosedLoopStrategy
    extends MspExtensible
{

    @XmlElement(required = true)
    protected ObjectID pointID;
    protected float target;
    @XmlElement(required = true)
    protected Uom units;

    /**
     * Gets the value of the pointID property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getPointID() {
        return pointID;
    }

    /**
     * Sets the value of the pointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setPointID(ObjectID value) {
        this.pointID = value;
    }

    /**
     * Gets the value of the target property.
     * 
     */
    public float getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     */
    public void setTarget(float value) {
        this.target = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Uom }
     *     
     */
    public Uom getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uom }
     *     
     */
    public void setUnits(Uom value) {
        this.units = value;
    }

}
