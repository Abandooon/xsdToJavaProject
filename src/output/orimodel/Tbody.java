package stdgui.data.model.orimodel;
@XmlRootElement(name = "TBODY")
public class Tbody {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ValignEnumSimple valign;
    
    
    
    protected ArrayList<Row> row;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="VALIGN")
    public ValignEnumSimple getValign() {
    return this.valign;
}

    public void setValign(ValignEnumSimple value) {
        this.valign = value;
    }
    
    
    
    @XmlElement(name="ROW")
    public ArrayList<Row> getRow() {
    return this.row;
}

    public void setRow(ArrayList<Row> value) {
        this.row = value;
    }
    
    
}