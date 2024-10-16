package stdgui.data.model.orimodel;
@XmlRootElement(name = "INCLUDED-DATA-TYPE-SET")
public class IncludedDataTypeSet {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<DataTypeRef> dataTypeRefs;
    
    
    
    protected Identifier literalPrefix;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="DATA-TYPE-REFS")
@XmlElement(name="DATA-TYPE-REF")
    public ArrayList<DataTypeRef> getDataTypeRefs() {
    return this.dataTypeRefs;
}

    public void setDataTypeRefs(ArrayList<DataTypeRef> value) {
        this.dataTypeRefs = value;
    }
    
    
    
    @XmlElement(name="LITERAL-PREFIX")
    public Identifier getLiteralPrefix() {
    return this.literalPrefix;
}

    public void setLiteralPrefix(Identifier value) {
        this.literalPrefix = value;
    }
    
    
}