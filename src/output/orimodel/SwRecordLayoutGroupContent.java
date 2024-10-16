package stdgui.data.model.orimodel;
@XmlRootElement(name = "SW-RECORD-LAYOUT-GROUP-CONTENT")
public class SwRecordLayoutGroupContent {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<SwRecordLayoutRef> swRecordLayoutRef;
    
    
    
    protected ArrayList<SwRecordLayoutV> swRecordLayoutV;
    
    
    
    protected ArrayList<SwRecordLayoutGroup> swRecordLayoutGroup;
    
    

    
    
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
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-REF")
    public ArrayList<SwRecordLayoutRef> getSwRecordLayoutRef() {
    return this.swRecordLayoutRef;
}

    public void setSwRecordLayoutRef(ArrayList<SwRecordLayoutRef> value) {
        this.swRecordLayoutRef = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-V")
    public ArrayList<SwRecordLayoutV> getSwRecordLayoutV() {
    return this.swRecordLayoutV;
}

    public void setSwRecordLayoutV(ArrayList<SwRecordLayoutV> value) {
        this.swRecordLayoutV = value;
    }
    
    
    
    @XmlElement(name="SW-RECORD-LAYOUT-GROUP")
    public ArrayList<SwRecordLayoutGroup> getSwRecordLayoutGroup() {
    return this.swRecordLayoutGroup;
}

    public void setSwRecordLayoutGroup(ArrayList<SwRecordLayoutGroup> value) {
        this.swRecordLayoutGroup = value;
    }
    
    
}