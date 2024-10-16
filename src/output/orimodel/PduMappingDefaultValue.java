package stdgui.data.model.orimodel;
@XmlRootElement(name = "PDU-MAPPING-DEFAULT-VALUE")
public class PduMappingDefaultValue {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<DefaultValueElement> defaultValueElements;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElementWrapper(name="DEFAULT-VALUE-ELEMENTS")
@XmlElement(name="DEFAULT-VALUE-ELEMENT")
    public ArrayList<DefaultValueElement> getDefaultValueElements() {
    return this.defaultValueElements;
}

    public void setDefaultValueElements(ArrayList<DefaultValueElement> value) {
        this.defaultValueElements = value;
    }
    
    
}