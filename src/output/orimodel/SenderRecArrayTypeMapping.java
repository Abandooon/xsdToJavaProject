package stdgui.data.model.orimodel;
@XmlRootElement(name = "SENDER-REC-ARRAY-TYPE-MAPPING")
public class SenderRecArrayTypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SenderRecArrayElementMapping> arrayElementMappings;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="ARRAY-ELEMENT-MAPPINGS")
@XmlElement(name="SENDER-REC-ARRAY-ELEMENT-MAPPING")
    public ArrayList<SenderRecArrayElementMapping> getArrayElementMappings() {
    return this.arrayElementMappings;
}

    public void setArrayElementMappings(ArrayList<SenderRecArrayElementMapping> value) {
        this.arrayElementMappings = value;
    }
    
    
}