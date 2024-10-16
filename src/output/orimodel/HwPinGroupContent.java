package stdgui.data.model.orimodel;
@XmlRootElement(name = "HW-PIN-GROUP-CONTENT")
public class HwPinGroupContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<HwPin> hwPin;
    
    
    
    protected ArrayList<HwPinGroup> hwPinGroup;
    
    

    
    
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
    
    
    
    @XmlElement(name="HW-PIN")
    public ArrayList<HwPin> getHwPin() {
    return this.hwPin;
}

    public void setHwPin(ArrayList<HwPin> value) {
        this.hwPin = value;
    }
    
    
    
    @XmlElement(name="HW-PIN-GROUP")
    public ArrayList<HwPinGroup> getHwPinGroup() {
    return this.hwPinGroup;
}

    public void setHwPinGroup(ArrayList<HwPinGroup> value) {
        this.hwPinGroup = value;
    }
    
    
}