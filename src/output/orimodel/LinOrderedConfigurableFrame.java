package stdgui.data.model.orimodel;
@XmlRootElement(name = "LIN-ORDERED-CONFIGURABLE-FRAME")
public class LinOrderedConfigurableFrame {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FrameRef_LinConfigurableFrame frameRef;
    
    
    
    protected Integer index;
    
    

    
    
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
    
    
    
    @XmlElement(name="FRAME-REF")
    public FrameRef_LinConfigurableFrame getFrameRef() {
    return this.frameRef;
}

    public void setFrameRef(FrameRef_LinConfigurableFrame value) {
        this.frameRef = value;
    }
    
    
    
    @XmlElement(name="INDEX")
    public Integer getIndex() {
    return this.index;
}

    public void setIndex(Integer value) {
        this.index = value;
    }
    
    
}