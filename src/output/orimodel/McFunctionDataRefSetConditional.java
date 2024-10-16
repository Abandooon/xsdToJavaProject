package stdgui.data.model.orimodel;
@XmlRootElement(name = "MC-FUNCTION-DATA-REF-SET-CONDITIONAL")
public class McFunctionDataRefSetConditional {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<FlatMapEntryRef> flatMapEntryRefs;
    
    
    
    protected ArrayList<McDataInstanceRef> mcDataInstanceRefs;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="FLAT-MAP-ENTRY-REFS")
@XmlElement(name="FLAT-MAP-ENTRY-REF")
    public ArrayList<FlatMapEntryRef> getFlatMapEntryRefs() {
    return this.flatMapEntryRefs;
}

    public void setFlatMapEntryRefs(ArrayList<FlatMapEntryRef> value) {
        this.flatMapEntryRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="MC-DATA-INSTANCE-REFS")
@XmlElement(name="MC-DATA-INSTANCE-REF")
    public ArrayList<McDataInstanceRef> getMcDataInstanceRefs() {
    return this.mcDataInstanceRefs;
}

    public void setMcDataInstanceRefs(ArrayList<McDataInstanceRef> value) {
        this.mcDataInstanceRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}