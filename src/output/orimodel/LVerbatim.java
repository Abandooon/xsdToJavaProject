package stdgui.data.model.orimodel;
@XmlRootElement(name = "L-VERBATIM")
public class LVerbatim {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected LEnumSimple l;
    
    
    
    
    
    protected ArrayList<Serializable> content;
    
    

    
    
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
    
    
    
    
    
    @XmlElementRefs({
        @XmlElementRef(name="TT", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="E", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="XREF", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="BR", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false)
    })
    @XmlMixed
    public ArrayList<Serializable> getContent() {
    return this.content;
}

    public void setContent(ArrayList<Serializable> value) {
        this.content = value;
    }
    
    
}