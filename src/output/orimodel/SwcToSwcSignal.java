package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-TO-SWC-SIGNAL")
public class SwcToSwcSignal {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<VariableDataPrototypeInSystemInstanceRef> dataElementIrefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="DATA-ELEMENT-IREFS")
@XmlElement(name="DATA-ELEMENT-IREF")
    public ArrayList<VariableDataPrototypeInSystemInstanceRef> getDataElementIrefs() {
    return this.dataElementIrefs;
}

    public void setDataElementIrefs(ArrayList<VariableDataPrototypeInSystemInstanceRef> value) {
        this.dataElementIrefs = value;
    }
    
    
}