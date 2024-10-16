package stdgui.data.model.orimodel;
@XmlRootElement(name = "L-GRAPHIC")
public class LGraphic {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    protected Graphic graphic;
    
    
    
    protected Map map;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="L")
    public LEnumSimple getL() {
    return this.l;
}

    public void setL(LEnumSimple value) {
        this.l = value;
    }
    
    
    
    @XmlElement(name="GRAPHIC")
    public Graphic getGraphic() {
    return this.graphic;
}

    public void setGraphic(Graphic value) {
        this.graphic = value;
    }
    
    
    
    @XmlElement(name="MAP")
    public Map getMap() {
    return this.map;
}

    public void setMap(Map value) {
        this.map = value;
    }
    
    
}