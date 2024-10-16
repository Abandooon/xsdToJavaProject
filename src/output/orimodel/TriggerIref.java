package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TriggerIref {

    
    
    protected PTriggerInAtomicSwcTypeInstanceRef pTriggerInAtomicSwcTypeInstanceRef;
    
    

    
    
    @XmlElement(name="P-TRIGGER-IN-ATOMIC-SWC-TYPE-INSTANCE-REF")
    public PTriggerInAtomicSwcTypeInstanceRef getPTriggerInAtomicSwcTypeInstanceRef() {
    return this.pTriggerInAtomicSwcTypeInstanceRef;
}

    public void setPTriggerInAtomicSwcTypeInstanceRef(PTriggerInAtomicSwcTypeInstanceRef value) {
        this.pTriggerInAtomicSwcTypeInstanceRef = value;
    }
    
    
}