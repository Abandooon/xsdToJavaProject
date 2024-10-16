package stdgui.data.model.orimodel;
@XmlRootElement(name = "AUTOSAR-PARAMETER-REF")
public class AutosarParameterRef {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ParameterInAtomicSwcTypeInstanceRef autosarParameterIref;
    
    
    
    protected LocalParameterRef localParameterRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="AUTOSAR-PARAMETER-IREF")
    public ParameterInAtomicSwcTypeInstanceRef getAutosarParameterIref() {
    return this.autosarParameterIref;
}

    public void setAutosarParameterIref(ParameterInAtomicSwcTypeInstanceRef value) {
        this.autosarParameterIref = value;
    }
    
    
    
    @XmlElement(name="LOCAL-PARAMETER-REF")
    public LocalParameterRef getLocalParameterRef() {
    return this.localParameterRef;
}

    public void setLocalParameterRef(LocalParameterRef value) {
        this.localParameterRef = value;
    }
    
    
}