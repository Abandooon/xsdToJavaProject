package stdgui.data.model.orimodel;
@XmlRootElement(name = "MC-DATA-ACCESS-DETAILS")
public class McDataAccessDetails {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<RteEventInEcuInstanceRef> rteEventIrefs;
    
    
    
    protected ArrayList<VariableAccessInEcuInstanceRef> variableAccessIrefs;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="RTE-EVENT-IREFS")
@XmlElement(name="RTE-EVENT-IREF")
    public ArrayList<RteEventInEcuInstanceRef> getRteEventIrefs() {
    return this.rteEventIrefs;
}

    public void setRteEventIrefs(ArrayList<RteEventInEcuInstanceRef> value) {
        this.rteEventIrefs = value;
    }
    
    
    
    @XmlElementWrapper(name="VARIABLE-ACCESS-IREFS")
@XmlElement(name="VARIABLE-ACCESS-IREF")
    public ArrayList<VariableAccessInEcuInstanceRef> getVariableAccessIrefs() {
    return this.variableAccessIrefs;
}

    public void setVariableAccessIrefs(ArrayList<VariableAccessInEcuInstanceRef> value) {
        this.variableAccessIrefs = value;
    }
    
    
}