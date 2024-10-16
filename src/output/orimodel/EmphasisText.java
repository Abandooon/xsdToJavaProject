package stdgui.data.model.orimodel;
@XmlRootElement(name = "EMPHASIS-TEXT")
public class EmphasisText {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String color;
    
    
    
    protected EEnumFontSimple font;
    
    
    
    protected EEnumSimple type;
    
    
    
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
    
    
    
    @XmlAttribute(name="COLOR")
    public java.lang.String getColor() {
    return this.color;
}

    public void setColor(java.lang.String value) {
        this.color = value;
    }
    
    
    
    @XmlAttribute(name="FONT")
    public EEnumFontSimple getFont() {
    return this.font;
}

    public void setFont(EEnumFontSimple value) {
        this.font = value;
    }
    
    
    
    @XmlAttribute(name="TYPE")
    public EEnumSimple getType() {
    return this.type;
}

    public void setType(EEnumSimple value) {
        this.type = value;
    }
    
    
    
    @XmlElementRefs({
        @XmlElementRef(name="SUB", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="SUP", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="TT", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false)
    })
    @XmlMixed
    public ArrayList<Serializable> getContent() {
    return this.content;
}

    public void setContent(ArrayList<Serializable> value) {
        this.content = value;
    }
    
    
}