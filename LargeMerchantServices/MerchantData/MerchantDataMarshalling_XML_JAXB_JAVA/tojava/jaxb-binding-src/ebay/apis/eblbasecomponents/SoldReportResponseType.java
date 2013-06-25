//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Lists all items that have been sold by this seller. If a buyer purchased multiple
 * 				items from a single listing, the sale will result in a single Order ID for the total purchase
 * 				with a separate Line Item ID for each of the purchased items. The SoldReport request returns
 * 				the data for all of your new orders (newly-sold items) with Order ID and Order Line Item ID.
 * 				The Sold Report includes all transactions for the past 30 days (from the transaction creation date).
 * 				<br><br>
 * 				The concept of an 'Order' is only used in the Trading API when a buyer makes combined payments.
 * 				Each payment is a transaction. But in the Large Merchant Services solution, every sale is considered
 * 				to be an Order. It is important to recognize these conceptual differences when you are working
 * 				with multiple APIs.
 * 				<br><br>
 * 				OrderLineItemID is a based upon the combination of the eBay Trading API's ItemID  and
 * 				TransactionID fields. The number before the hyphen is the Item ID and the number after the hyphen
 * 				is the Transaction ID. The Transaction field in the Trading API is a container that can include
 * 				many types of transaction information.
 * 				<br><br>
 * 				See <a href="http://developer.ebay.com/DevZone/XML/docs/Reference/eBay/GetSellerTransactions.html#Response.TransactionArray.Transaction.TransactionID" target="_blank">Trading API</a>
 * 				for more information.
 * 				<br><br>
 * 				The Sold Report includes all transactions for the past 30 days (from the transaction creation date),
 * 				but does not include items where the sale of the item has been acknowledged using the OrderAckRequest. See
 * 				<a href="http://developer.ebay.com/DevZone/large-merchant-services/Concepts/LMS_APIGuide.html#soldrpt"
 * 				target="_blank">Acknowledging Sales</a> for more information.
 * 				<br><br>
 * 				Sellers use the information in the SoldReport to make inventory updates and start order fulfillment.
 * 			  <br><br>
 * 			  Note: After release 637, a namespace is returned in the BulkDataExchangeResponseType (top level) of the
 * 				response. This container is not shown in the call output description, but you can see it in the call
 * 				samples at the end of this page. See <a href="http://developer.ebay.com/DevZone/large-merchant-services/Concepts/MakingACall.html" target="_blank">Making An API Call</a>
 * 				for more information about the BulkDataExchange Response container.
 * 			
 * 
 * <p>Java class for SoldReportResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoldReportResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="OrderDetails" type="{urn:ebay:apis:eBLBaseComponents}OrderDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoldReportResponseType", propOrder = {
    "orderDetails"
})
public class SoldReportResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "OrderDetails")
    protected List<OrderDetailsType> orderDetails;

    /**
     * Gets the value of the orderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderDetailsType }
     * 
     * 
     */
    public List<OrderDetailsType> getOrderDetails() {
        if (orderDetails == null) {
            orderDetails = new ArrayList<OrderDetailsType>();
        }
        return this.orderDetails;
    }

}
