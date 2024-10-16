package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU")
public class Compu {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompuConst compuDefaultValue;
    
    
    
    protected CompuScales_Compu compuScales;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPU-DEFAULT-VALUE")
    public CompuConst getCompuDefaultValue() {
    return this.compuDefaultValue;
}

    public void setCompuDefaultValue(CompuConst value) {
        this.compuDefaultValue = value;
    }
    
    
    
    @XmlElement(name="COMPU-SCALES")
    public CompuScales_Compu getCompuScales() {
    return this.compuScales;
}

    public void setCompuScales(CompuScales_Compu value) {
        this.compuScales = value;
    }
    
    
}