package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-SERVER-PRIMITIVE-TYPE-MAPPING")
public class ClientServerPrimitiveTypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArgumentRef argumentRef;
    
    
    
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
    
    
    
    @XmlElement(name="ARGUMENT-REF")
    public ArgumentRef getArgumentRef() {
    return this.argumentRef;
}

    public void setArgumentRef(ArgumentRef value) {
        this.argumentRef = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-SIGNAL-REF")
    public SystemSignalRef getSystemSignalRef() {
    return this.systemSignalRef;
}

    public void setSystemSignalRef(SystemSignalRef value) {
        this.systemSignalRef = value;
    }
    
    
}