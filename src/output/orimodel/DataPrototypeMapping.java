package stdgui.data.model.orimodel;
@XmlRootElement(name = "DATA-PROTOTYPE-MAPPING")
public class DataPrototypeMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstDataPrototypeRef firstDataPrototypeRef;
    
    
    
    protected FirstToSecondDataTransformationRef firstToSecondDataTransformationRef;
    
    
    
    protected SecondDataPrototypeRef secondDataPrototypeRef;
    
    
    
    protected ArrayList<SubElementMapping> subElementMappings;
    
    
    
    protected ArrayList<TextTableMapping> textTableMappings;
    
    

    
    
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
    
    
    
    @XmlElement(name="FIRST-DATA-PROTOTYPE-REF")
    public FirstDataPrototypeRef getFirstDataPrototypeRef() {
    return this.firstDataPrototypeRef;
}

    public void setFirstDataPrototypeRef(FirstDataPrototypeRef value) {
        this.firstDataPrototypeRef = value;
    }
    
    
    
    @XmlElement(name="FIRST-TO-SECOND-DATA-TRANSFORMATION-REF")
    public FirstToSecondDataTransformationRef getFirstToSecondDataTransformationRef() {
    return this.firstToSecondDataTransformationRef;
}

    public void setFirstToSecondDataTransformationRef(FirstToSecondDataTransformationRef value) {
        this.firstToSecondDataTransformationRef = value;
    }
    
    
    
    @XmlElement(name="SECOND-DATA-PROTOTYPE-REF")
    public SecondDataPrototypeRef getSecondDataPrototypeRef() {
    return this.secondDataPrototypeRef;
}

    public void setSecondDataPrototypeRef(SecondDataPrototypeRef value) {
        this.secondDataPrototypeRef = value;
    }
    
    
    
    @XmlElementWrapper(name="SUB-ELEMENT-MAPPINGS")
@XmlElement(name="SUB-ELEMENT-MAPPING")
    public ArrayList<SubElementMapping> getSubElementMappings() {
    return this.subElementMappings;
}

    public void setSubElementMappings(ArrayList<SubElementMapping> value) {
        this.subElementMappings = value;
    }
    
    
    
    @XmlElementWrapper(name="TEXT-TABLE-MAPPINGS")
@XmlElement(name="TEXT-TABLE-MAPPING")
    public ArrayList<TextTableMapping> getTextTableMappings() {
    return this.textTableMappings;
}

    public void setTextTableMappings(ArrayList<TextTableMapping> value) {
        this.textTableMappings = value;
    }
    
    
}