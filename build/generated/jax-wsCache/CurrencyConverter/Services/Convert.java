
package Services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for convert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="convert"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="inCurrency" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="outCurrency" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convert", propOrder = {
    "input",
    "inCurrency",
    "outCurrency"
})
public class Convert {

    protected double input;
    protected double inCurrency;
    protected double outCurrency;

    /**
     * Gets the value of the input property.
     * 
     */
    public double getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     */
    public void setInput(double value) {
        this.input = value;
    }

    /**
     * Gets the value of the inCurrency property.
     * 
     */
    public double getInCurrency() {
        return inCurrency;
    }

    /**
     * Sets the value of the inCurrency property.
     * 
     */
    public void setInCurrency(double value) {
        this.inCurrency = value;
    }

    /**
     * Gets the value of the outCurrency property.
     * 
     */
    public double getOutCurrency() {
        return outCurrency;
    }

    /**
     * Sets the value of the outCurrency property.
     * 
     */
    public void setOutCurrency(double value) {
        this.outCurrency = value;
    }

}
