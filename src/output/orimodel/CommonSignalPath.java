package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMMON-SIGNAL-PATH")
public class CommonSignalPath {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<SwcToSwcOperationArguments> operations;
    
    
    
    protected ArrayList<SwcToSwcSignal> signals;
    
    

    
    
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
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElementWrapper(name="OPERATIONS")
@XmlElement(name="SWC-TO-SWC-OPERATION-ARGUMENTS")
    public ArrayList<SwcToSwcOperationArguments> getOperations() {
    return this.operations;
}

    public void setOperations(ArrayList<SwcToSwcOperationArguments> value) {
        this.operations = value;
    }
    
    
    
    @XmlElementWrapper(name="SIGNALS")
@XmlElement(name="SWC-TO-SWC-SIGNAL")
    public ArrayList<SwcToSwcSignal> getSignals() {
    return this.signals;
}

    public void setSignals(ArrayList<SwcToSwcSignal> value) {
        this.signals = value;
    }
    
    
}