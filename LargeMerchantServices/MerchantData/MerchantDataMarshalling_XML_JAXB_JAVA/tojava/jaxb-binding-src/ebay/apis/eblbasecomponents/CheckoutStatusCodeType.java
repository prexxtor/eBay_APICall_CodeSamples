//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckoutStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CheckoutStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CheckoutComplete"/>
 *     &lt;enumeration value="CheckoutIncomplete"/>
 *     &lt;enumeration value="BuyerRequestsTotal"/>
 *     &lt;enumeration value="SellerResponded"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CheckoutStatusCodeType")
@XmlEnum
public enum CheckoutStatusCodeType {


    /**
     * 
     * 						(out) Checkout complete.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutComplete")
    CHECKOUT_COMPLETE("CheckoutComplete"),

    /**
     * 
     * 						(out) Checkout incomplete.
     * 					
     * 
     */
    @XmlEnumValue("CheckoutIncomplete")
    CHECKOUT_INCOMPLETE("CheckoutIncomplete"),

    /**
     * 
     * 						(out) Buyer requests total from seller.
     * 					
     * 
     */
    @XmlEnumValue("BuyerRequestsTotal")
    BUYER_REQUESTS_TOTAL("BuyerRequestsTotal"),

    /**
     * 
     * 						(out) Seller responded to buyer's request.
     * 					
     * 
     */
    @XmlEnumValue("SellerResponded")
    SELLER_RESPONDED("SellerResponded"),

    /**
     * 
     * 						(out) Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CheckoutStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CheckoutStatusCodeType fromValue(String v) {
        for (CheckoutStatusCodeType c: CheckoutStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
