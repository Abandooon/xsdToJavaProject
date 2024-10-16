package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-VALUE-CONT")
public class SwValueCont {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected UnitRef unitRef;
    
    
    
    protected SingleLanguageUnitNames unitDisplayName;
    
    
    
    protected ValueList swArraysize;
    
    
    
    protected SwValues swValuesPhys;
    
    

    
    
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
    
    
    
    @XmlElement(name="UNIT-REF")
    public UnitRef getUnitRef() {
    return this.unitRef;
}

    public void setUnitRef(UnitRef value) {
        this.unitRef = value;
    }
    
    
    
    @XmlElement(name="UNIT-DISPLAY-NAME")
    public SingleLanguageUnitNames getUnitDisplayName() {
    return this.unitDisplayName;
}

    public void setUnitDisplayName(SingleLanguageUnitNames value) {
        this.unitDisplayName = value;
    }
    
    
    
    @XmlElement(name="SW-ARRAYSIZE")
    public ValueList getSwArraysize() {
    return this.swArraysize;
}

    public void setSwArraysize(ValueList value) {
        this.swArraysize = value;
    }
    
    
    
    @XmlElement(name="SW-VALUES-PHYS")
    public SwValues getSwValuesPhys() {
    return this.swValuesPhys;
}

    public void setSwValuesPhys(SwValues value) {
        this.swValuesPhys = value;
    }
    
    
}