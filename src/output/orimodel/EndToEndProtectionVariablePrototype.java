package stdgui.data.model.orimodel;
@XmlRootElement(name = "END-TO-END-PROTECTION-VARIABLE-PROTOTYPE")
public class EndToEndProtectionVariablePrototype {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<VariableDataPrototypeInSystemInstanceRef> receiverIrefs;
    
    
    
    protected VariableDataPrototypeInSystemInstanceRef senderIref;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="RECEIVER-IREFS")
@XmlElement(name="RECEIVER-IREF")
    public ArrayList<VariableDataPrototypeInSystemInstanceRef> getReceiverIrefs() {
    return this.receiverIrefs;
}

    public void setReceiverIrefs(ArrayList<VariableDataPrototypeInSystemInstanceRef> value) {
        this.receiverIrefs = value;
    }
    
    
    
    @XmlElement(name="SENDER-IREF")
    public VariableDataPrototypeInSystemInstanceRef getSenderIref() {
    return this.senderIref;
}

    public void setSenderIref(VariableDataPrototypeInSystemInstanceRef value) {
        this.senderIref = value;
    }
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}