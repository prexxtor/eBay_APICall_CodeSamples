//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Complex type that defines the <b>eBayPaymentMismatchDetails</b> container, which
 * 				is returned when a buyer's payment does not match the total cost of an order going through
 * 				the new eBay payment process. This type is only applicable for German and Austrian orders going
 * 				through the new eBay payment process.
 * 			
 * 
 * <p>Java class for eBayPaymentMismatchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBayPaymentMismatchDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MismatchType" type="{urn:ebay:apis:eBLBaseComponents}MismatchTypeCodeType" minOccurs="0"/>
 *         &lt;element name="ActionRequiredBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MismatchAmount" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBayPaymentMismatchDetailsType", propOrder = {
    "mismatchType",
    "actionRequiredBy",
    "mismatchAmount"
})
public class EBayPaymentMismatchDetailsType {

    @XmlElement(name = "MismatchType")
    protected MismatchTypeCodeType mismatchType;
    @XmlElement(name = "ActionRequiredBy")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionRequiredBy;
    @XmlElement(name = "MismatchAmount")
    protected AmountType mismatchAmount;

    /**
     * Gets the value of the mismatchType property.
     * 
     * @return
     *     possible object is
     *     {@link MismatchTypeCodeType }
     *     
     */
    public MismatchTypeCodeType getMismatchType() {
        return mismatchType;
    }

    /**
     * Sets the value of the mismatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MismatchTypeCodeType }
     *     
     */
    public void setMismatchType(MismatchTypeCodeType value) {
        this.mismatchType = value;
    }

    /**
     * Gets the value of the actionRequiredBy property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionRequiredBy() {
        return actionRequiredBy;
    }

    /**
     * Sets the value of the actionRequiredBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionRequiredBy(XMLGregorianCalendar value) {
        this.actionRequiredBy = value;
    }

    /**
     * Gets the value of the mismatchAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMismatchAmount() {
        return mismatchAmount;
    }

    /**
     * Sets the value of the mismatchAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMismatchAmount(AmountType value) {
        this.mismatchAmount = value;
    }

}
