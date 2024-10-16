package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-DATA-DEF-PROPS")
public class SwDataDefProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SwDataDefPropsConditional> swDataDefPropsVariants;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="SW-DATA-DEF-PROPS-VARIANTS")
@XmlElement(name="SW-DATA-DEF-PROPS-CONDITIONAL")
    public ArrayList<SwDataDefPropsConditional> getSwDataDefPropsVariants() {
    return this.swDataDefPropsVariants;
}

    public void setSwDataDefPropsVariants(ArrayList<SwDataDefPropsConditional> value) {
        this.swDataDefPropsVariants = value;
    }
    
    
}