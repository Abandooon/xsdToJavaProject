package stdgui.data.model.orimodel;
@XmlRootElement(name = "SUB-ELEMENT-MAPPING")
public class SubElementMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected FirstElements firstElements;
    
    
    
    protected SecondElements secondElements;
    
    
    
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
    
    
    
    @XmlElement(name="FIRST-ELEMENTS")
    public FirstElements getFirstElements() {
    return this.firstElements;
}

    public void setFirstElements(FirstElements value) {
        this.firstElements = value;
    }
    
    
    
    @XmlElement(name="SECOND-ELEMENTS")
    public SecondElements getSecondElements() {
    return this.secondElements;
}

    public void setSecondElements(SecondElements value) {
        this.secondElements = value;
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