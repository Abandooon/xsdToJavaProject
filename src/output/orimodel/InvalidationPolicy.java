package stdgui.data.model.orimodel;
@XmlRootElement(name = "INVALIDATION-POLICY")
public class InvalidationPolicy {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DataElementRef_InvalidationPolicy dataElementRef;
    
    
    
    protected HandleInvalidEnum handleInvalid;
    
    

    
    
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
    
    
    
    @XmlElement(name="DATA-ELEMENT-REF")
    public DataElementRef_InvalidationPolicy getDataElementRef() {
    return this.dataElementRef;
}

    public void setDataElementRef(DataElementRef_InvalidationPolicy value) {
        this.dataElementRef = value;
    }
    
    
    
    @XmlElement(name="HANDLE-INVALID")
    public HandleInvalidEnum getHandleInvalid() {
    return this.handleInvalid;
}

    public void setHandleInvalid(HandleInvalidEnum value) {
        this.handleInvalid = value;
    }
    
    
}