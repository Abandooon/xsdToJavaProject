package stdgui.data.model.orimodel;
@XmlRootElement(name = "FM-CONDITION-BY-FEATURES-AND-SW-SYSTEMCONSTS")
public class FmConditionByFeaturesAndSwSystemconsts {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
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
    
    
    
    @XmlElementRefs({
        @XmlElementRef(name="SYSC-STRING-REF", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="SYSC-REF", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false),
        @XmlElementRef(name="FEATURE-REF", namespace="http://autosar.org/schema/r4.0", type=JAXBElement.class, required=false)
    })
    @XmlMixed
    public ArrayList<Serializable> getContent() {
    return this.content;
}

    public void setContent(ArrayList<Serializable> value) {
        this.content = value;
    }
    
    
}