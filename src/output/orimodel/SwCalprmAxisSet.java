package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-CALPRM-AXIS-SET")
public class SwCalprmAxisSet {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SwCalprmAxis> swCalprmAxis;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-CALPRM-AXIS")
    public ArrayList<SwCalprmAxis> getSwCalprmAxis() {
    return this.swCalprmAxis;
}

    public void setSwCalprmAxis(ArrayList<SwCalprmAxis> value) {
        this.swCalprmAxis = value;
    }
    
    
}