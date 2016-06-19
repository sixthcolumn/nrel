
package org.multispeak.v5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for strategyChoices complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="strategyChoices">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="strategy" type="{http://www.multispeak.org/V5.0}strategy"/>
 *         &lt;element name="closedLoopStrategy" type="{http://www.multispeak.org/V5.0}closedLoopStrategy"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "strategyChoices", propOrder = {
    "strategy",
    "closedLoopStrategy"
})
public class StrategyChoices {

    protected Strategy strategy;
    protected ClosedLoopStrategy closedLoopStrategy;

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link Strategy }
     *     
     */
    public Strategy getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strategy }
     *     
     */
    public void setStrategy(Strategy value) {
        this.strategy = value;
    }

    /**
     * Gets the value of the closedLoopStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link ClosedLoopStrategy }
     *     
     */
    public ClosedLoopStrategy getClosedLoopStrategy() {
        return closedLoopStrategy;
    }

    /**
     * Sets the value of the closedLoopStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosedLoopStrategy }
     *     
     */
    public void setClosedLoopStrategy(ClosedLoopStrategy value) {
        this.closedLoopStrategy = value;
    }

}
