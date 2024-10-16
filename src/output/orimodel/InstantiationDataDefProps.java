package stdgui.data.model.orimodel;
@XmlRootElement(name = "INSTANTIATION-DATA-DEF-PROPS")
public class InstantiationDataDefProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected AutosarParameterRef parameterInstance;
    
    
    
    protected SwDataDefProps swDataDefProps;
    
    
    
    protected AutosarVariableRef variableInstance;
    
    
    
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
    
    
    
    @XmlElement(name="PARAMETER-INSTANCE")
    public AutosarParameterRef getParameterInstance() {
    return this.parameterInstance;
}

    public void setParameterInstance(AutosarParameterRef value) {
        this.parameterInstance = value;
    }
    
    
    
    @XmlElement(name="SW-DATA-DEF-PROPS")
    public SwDataDefProps getSwDataDefProps() {
    return this.swDataDefProps;
}

    public void setSwDataDefProps(SwDataDefProps value) {
        this.swDataDefProps = value;
    }
    
    
    
    @XmlElement(name="VARIABLE-INSTANCE")
    public AutosarVariableRef getVariableInstance() {
    return this.variableInstance;
}

    public void setVariableInstance(AutosarVariableRef value) {
        this.variableInstance = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}