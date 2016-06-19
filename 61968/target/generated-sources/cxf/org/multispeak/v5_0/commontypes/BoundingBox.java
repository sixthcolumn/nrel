
package org.multispeak.v5_0.commontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A geographic bounding box defined by two coordinates: (Xmin, Ymin)  and (Xmax, Ymax).
 * 
 * <p>Java class for boundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="boundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Xmin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ymin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Xmax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ymax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "boundingBox", propOrder = {
    "xmin",
    "ymin",
    "xmax",
    "ymax"
})
public class BoundingBox {

    @XmlElement(name = "Xmin")
    protected double xmin;
    @XmlElement(name = "Ymin")
    protected double ymin;
    @XmlElement(name = "Xmax")
    protected double xmax;
    @XmlElement(name = "Ymax")
    protected double ymax;

    /**
     * Gets the value of the xmin property.
     * 
     */
    public double getXmin() {
        return xmin;
    }

    /**
     * Sets the value of the xmin property.
     * 
     */
    public void setXmin(double value) {
        this.xmin = value;
    }

    /**
     * Gets the value of the ymin property.
     * 
     */
    public double getYmin() {
        return ymin;
    }

    /**
     * Sets the value of the ymin property.
     * 
     */
    public void setYmin(double value) {
        this.ymin = value;
    }

    /**
     * Gets the value of the xmax property.
     * 
     */
    public double getXmax() {
        return xmax;
    }

    /**
     * Sets the value of the xmax property.
     * 
     */
    public void setXmax(double value) {
        this.xmax = value;
    }

    /**
     * Gets the value of the ymax property.
     * 
     */
    public double getYmax() {
        return ymax;
    }

    /**
     * Sets the value of the ymax property.
     * 
     */
    public void setYmax(double value) {
        this.ymax = value;
    }

}
