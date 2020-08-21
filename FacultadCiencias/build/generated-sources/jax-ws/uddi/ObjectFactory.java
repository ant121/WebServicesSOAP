
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Calculosueldo_QNAME = new QName("http://UDDI/", "calculosueldo");
    private final static QName _CalculosueldoResponse_QNAME = new QName("http://UDDI/", "calculosueldoResponse");
    private final static QName _Calculo_QNAME = new QName("http://UDDI/", "calculo");
    private final static QName _CalculoResponse_QNAME = new QName("http://UDDI/", "calculoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Calculosueldo }
     * 
     */
    public Calculosueldo createCalculosueldo() {
        return new Calculosueldo();
    }

    /**
     * Create an instance of {@link CalculoResponse }
     * 
     */
    public CalculoResponse createCalculoResponse() {
        return new CalculoResponse();
    }

    /**
     * Create an instance of {@link Calculo }
     * 
     */
    public Calculo createCalculo() {
        return new Calculo();
    }

    /**
     * Create an instance of {@link CalculosueldoResponse }
     * 
     */
    public CalculosueldoResponse createCalculosueldoResponse() {
        return new CalculosueldoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculosueldo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "calculosueldo")
    public JAXBElement<Calculosueldo> createCalculosueldo(Calculosueldo value) {
        return new JAXBElement<Calculosueldo>(_Calculosueldo_QNAME, Calculosueldo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculosueldoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "calculosueldoResponse")
    public JAXBElement<CalculosueldoResponse> createCalculosueldoResponse(CalculosueldoResponse value) {
        return new JAXBElement<CalculosueldoResponse>(_CalculosueldoResponse_QNAME, CalculosueldoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "calculo")
    public JAXBElement<Calculo> createCalculo(Calculo value) {
        return new JAXBElement<Calculo>(_Calculo_QNAME, Calculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "calculoResponse")
    public JAXBElement<CalculoResponse> createCalculoResponse(CalculoResponse value) {
        return new JAXBElement<CalculoResponse>(_CalculoResponse_QNAME, CalculoResponse.class, null, value);
    }

}
