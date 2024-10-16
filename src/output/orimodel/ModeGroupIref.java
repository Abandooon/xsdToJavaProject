package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ModeGroupIref {

    
    
    protected PModeGroupInAtomicSwcInstanceRef pModeGroupInAtomicSwcInstanceRef;
    
    
    
    protected RModeGroupInAtomicSwcInstanceRef rModeGroupInAtomicSwcInstanceRef;
    
    

    
    
    @XmlElement(name="P-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF")
    public PModeGroupInAtomicSwcInstanceRef getPModeGroupInAtomicSwcInstanceRef() {
    return this.pModeGroupInAtomicSwcInstanceRef;
}

    public void setPModeGroupInAtomicSwcInstanceRef(PModeGroupInAtomicSwcInstanceRef value) {
        this.pModeGroupInAtomicSwcInstanceRef = value;
    }
    
    
    
    @XmlElement(name="R-MODE-GROUP-IN-ATOMIC-SWC-INSTANCE-REF")
    public RModeGroupInAtomicSwcInstanceRef getRModeGroupInAtomicSwcInstanceRef() {
    return this.rModeGroupInAtomicSwcInstanceRef;
}

    public void setRModeGroupInAtomicSwcInstanceRef(RModeGroupInAtomicSwcInstanceRef value) {
        this.rModeGroupInAtomicSwcInstanceRef = value;
    }
    
    
}