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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Defines and lists a new fixed-price listing (not auction-style listings).
 * 				The main difference between AddFixedPriceItem and AddItem is that
 * 				AddFixedPriceItem supports the creation of fixed-price listings only,
 * 				whereas AddItem supports all listing formats.<br>
 * 				<br>
 * 				Also, only AddFixedPriceItem supports multi-variation listings
 * 				and tracking inventory by SKU. AddItem does not support
 * 				Variations or InventoryTrackingMethod.<br>
 * 				<br>
 * 				See the AddFixedPriceItem documentation for additional information.
 * 			
 * 
 * <p>Java class for AddFixedPriceItemRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddFixedPriceItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:ebay:apis:eBLBaseComponents}ItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddFixedPriceItemRequestType", propOrder = {
    "item"
})
public class AddFixedPriceItemRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "Item")
    protected ItemType item;

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

}
