package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-SERVER-ARRAY-TYPE-MAPPING")
public class ClientServerArrayTypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArgumentRef argumentRef;
    
    
    
    protected ArrayList<ClientServerArrayElementMapping> arrayElementMappings;
    
    

    
    
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
    
    
    
    @XmlElement(name="ARGUMENT-REF")
    public ArgumentRef getArgumentRef() {
    return this.argumentRef;
}

    public void setArgumentRef(ArgumentRef value) {
        this.argumentRef = value;
    }
    
    
    
    @XmlElementWrapper(name="ARRAY-ELEMENT-MAPPINGS")
@XmlElement(name="CLIENT-SERVER-ARRAY-ELEMENT-MAPPING")
    public ArrayList<ClientServerArrayElementMapping> getArrayElementMappings() {
    return this.arrayElementMappings;
}

    public void setArrayElementMappings(ArrayList<ClientServerArrayElementMapping> value) {
        this.arrayElementMappings = value;
    }
    
    
}