package stdgui.data.model.orimodel;
@XmlRootElement(name = "SENDER-REC-ARRAY-ELEMENT-MAPPING")
public class SenderRecArrayElementMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ComplexTypeMapping_SenderRecArrayElementMapping complexTypeMapping;
    
    
    
    protected IndexedArrayElement indexedArrayElement;
    
    
    
    protected SystemSignalRef systemSignalRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPLEX-TYPE-MAPPING")
    public ComplexTypeMapping_SenderRecArrayElementMapping getComplexTypeMapping() {
    return this.complexTypeMapping;
}

    public void setComplexTypeMapping(ComplexTypeMapping_SenderRecArrayElementMapping value) {
        this.complexTypeMapping = value;
    }
    
    
    
    @XmlElement(name="INDEXED-ARRAY-ELEMENT")
    public IndexedArrayElement getIndexedArrayElement() {
    return this.indexedArrayElement;
}

    public void setIndexedArrayElement(IndexedArrayElement value) {
        this.indexedArrayElement = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-SIGNAL-REF")
    public SystemSignalRef getSystemSignalRef() {
    return this.systemSignalRef;
}

    public void setSystemSignalRef(SystemSignalRef value) {
        this.systemSignalRef = value;
    }
    
    
}