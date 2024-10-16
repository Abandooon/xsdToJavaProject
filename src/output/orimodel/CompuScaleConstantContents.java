package stdgui.data.model.orimodel;
@XmlRootElement(name = "COMPU-SCALE-CONSTANT-CONTENTS")
public class CompuScaleConstantContents {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected CompuConst compuConst;
    
    

    
    
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
    
    
    
    @XmlElement(name="COMPU-CONST")
    public CompuConst getCompuConst() {
    return this.compuConst;
}

    public void setCompuConst(CompuConst value) {
        this.compuConst = value;
    }
    
    
}