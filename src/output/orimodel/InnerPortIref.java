package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class InnerPortIref {

    
    
    protected PPortInCompositionInstanceRef pPortInCompositionInstanceRef;
    
    
    
    protected RPortInCompositionInstanceRef rPortInCompositionInstanceRef;
    
    

    
    
    @XmlElement(name="P-PORT-IN-COMPOSITION-INSTANCE-REF")
    public PPortInCompositionInstanceRef getPPortInCompositionInstanceRef() {
    return this.pPortInCompositionInstanceRef;
}

    public void setPPortInCompositionInstanceRef(PPortInCompositionInstanceRef value) {
        this.pPortInCompositionInstanceRef = value;
    }
    
    
    
    @XmlElement(name="R-PORT-IN-COMPOSITION-INSTANCE-REF")
    public RPortInCompositionInstanceRef getRPortInCompositionInstanceRef() {
    return this.rPortInCompositionInstanceRef;
}

    public void setRPortInCompositionInstanceRef(RPortInCompositionInstanceRef value) {
        this.rPortInCompositionInstanceRef = value;
    }
    
    
}