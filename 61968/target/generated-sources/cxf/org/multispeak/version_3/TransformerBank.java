
package org.multispeak.version_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transformerBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transformerBank">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.multispeak.org/Version_3.0}mspBankObject">
 *       &lt;sequence>
 *         &lt;element name="wdgCode" type="{http://www.multispeak.org/Version_3.0}wdgCode" minOccurs="0"/>
 *         &lt;element name="transDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mounting" type="{http://www.multispeak.org/Version_3.0}mounting" minOccurs="0"/>
 *         &lt;element name="vInput" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="vOut" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="sourceSideConfig" type="{http://www.multispeak.org/Version_3.0}config" minOccurs="0"/>
 *         &lt;element name="tertVolts" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="tertChild" type="{http://www.multispeak.org/Version_3.0}objectRef" minOccurs="0"/>
 *         &lt;element name="vOutNom" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="vOutNomTertiary" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="secProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secVolt" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ratedVolt" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="priProt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformerList" type="{http://www.multispeak.org/Version_3.0}ArrayOfTransformer" minOccurs="0"/>
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
@XmlType(name = "transformerBank", propOrder = {
    "wdgCode",
    "transDescr",
    "mounting",
    "vInput",
    "vOut",
    "sourceSideConfig",
    "tertVolts",
    "tertChild",
    "vOutNom",
    "vOutNomTertiary",
    "secProt",
    "secVolt",
    "ratedVolt",
    "priProt",
    "transformerList"
})
public class TransformerBank
    extends MspBankObject
{

    protected WdgCode wdgCode;
    protected String transDescr;
    protected Mounting mounting;
    protected Float vInput;
    protected Float vOut;
    protected Config sourceSideConfig;
    protected Float tertVolts;
    protected ObjectRef tertChild;
    protected Float vOutNom;
    protected Float vOutNomTertiary;
    protected String secProt;
    protected Float secVolt;
    protected Float ratedVolt;
    protected String priProt;
    protected ArrayOfTransformer transformerList;

    /**
     * Gets the value of the wdgCode property.
     * 
     * @return
     *     possible object is
     *     {@link WdgCode }
     *     
     */
    public WdgCode getWdgCode() {
        return wdgCode;
    }

    /**
     * Sets the value of the wdgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WdgCode }
     *     
     */
    public void setWdgCode(WdgCode value) {
        this.wdgCode = value;
    }

    /**
     * Gets the value of the transDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDescr() {
        return transDescr;
    }

    /**
     * Sets the value of the transDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDescr(String value) {
        this.transDescr = value;
    }

    /**
     * Gets the value of the mounting property.
     * 
     * @return
     *     possible object is
     *     {@link Mounting }
     *     
     */
    public Mounting getMounting() {
        return mounting;
    }

    /**
     * Sets the value of the mounting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mounting }
     *     
     */
    public void setMounting(Mounting value) {
        this.mounting = value;
    }

    /**
     * Gets the value of the vInput property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVInput() {
        return vInput;
    }

    /**
     * Sets the value of the vInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVInput(Float value) {
        this.vInput = value;
    }

    /**
     * Gets the value of the vOut property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVOut() {
        return vOut;
    }

    /**
     * Sets the value of the vOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVOut(Float value) {
        this.vOut = value;
    }

    /**
     * Gets the value of the sourceSideConfig property.
     * 
     * @return
     *     possible object is
     *     {@link Config }
     *     
     */
    public Config getSourceSideConfig() {
        return sourceSideConfig;
    }

    /**
     * Sets the value of the sourceSideConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link Config }
     *     
     */
    public void setSourceSideConfig(Config value) {
        this.sourceSideConfig = value;
    }

    /**
     * Gets the value of the tertVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTertVolts() {
        return tertVolts;
    }

    /**
     * Sets the value of the tertVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTertVolts(Float value) {
        this.tertVolts = value;
    }

    /**
     * Gets the value of the tertChild property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectRef }
     *     
     */
    public ObjectRef getTertChild() {
        return tertChild;
    }

    /**
     * Sets the value of the tertChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectRef }
     *     
     */
    public void setTertChild(ObjectRef value) {
        this.tertChild = value;
    }

    /**
     * Gets the value of the vOutNom property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVOutNom() {
        return vOutNom;
    }

    /**
     * Sets the value of the vOutNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVOutNom(Float value) {
        this.vOutNom = value;
    }

    /**
     * Gets the value of the vOutNomTertiary property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVOutNomTertiary() {
        return vOutNomTertiary;
    }

    /**
     * Sets the value of the vOutNomTertiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVOutNomTertiary(Float value) {
        this.vOutNomTertiary = value;
    }

    /**
     * Gets the value of the secProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecProt() {
        return secProt;
    }

    /**
     * Sets the value of the secProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecProt(String value) {
        this.secProt = value;
    }

    /**
     * Gets the value of the secVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSecVolt() {
        return secVolt;
    }

    /**
     * Sets the value of the secVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSecVolt(Float value) {
        this.secVolt = value;
    }

    /**
     * Gets the value of the ratedVolt property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRatedVolt() {
        return ratedVolt;
    }

    /**
     * Sets the value of the ratedVolt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRatedVolt(Float value) {
        this.ratedVolt = value;
    }

    /**
     * Gets the value of the priProt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriProt() {
        return priProt;
    }

    /**
     * Sets the value of the priProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriProt(String value) {
        this.priProt = value;
    }

    /**
     * Gets the value of the transformerList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransformer }
     *     
     */
    public ArrayOfTransformer getTransformerList() {
        return transformerList;
    }

    /**
     * Sets the value of the transformerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransformer }
     *     
     */
    public void setTransformerList(ArrayOfTransformer value) {
        this.transformerList = value;
    }

}
