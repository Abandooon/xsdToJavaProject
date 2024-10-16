package stdgui.data.model.orimodel;
@XmlRootElement(name = "MC-FUNCTION-DATA-REF-SET")
public class McFunctionDataRefSet {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<McFunctionDataRefSetConditional> mcFunctionDataRefSetVariants;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="MC-FUNCTION-DATA-REF-SET-VARIANTS")
@XmlElement(name="MC-FUNCTION-DATA-REF-SET-CONDITIONAL")
    public ArrayList<McFunctionDataRefSetConditional> getMcFunctionDataRefSetVariants() {
    return this.mcFunctionDataRefSetVariants;
}

    public void setMcFunctionDataRefSetVariants(ArrayList<McFunctionDataRefSetConditional> value) {
        this.mcFunctionDataRefSetVariants = value;
    }
    
    
}