package stdgui.data.model.orimodel;
@XmlRootElement(name = "TRIGGER-PORT-ANNOTATION")
public class TriggerPortAnnotation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultilanguageLongName label;
    
    
    
    protected String annotationOrigin;
    
    
    
    protected DocumentationBlock annotationText;
    
    
    
    protected TriggerRef triggerRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="LABEL")
    public MultilanguageLongName getLabel() {
    return this.label;
}

    public void setLabel(MultilanguageLongName value) {
        this.label = value;
    }
    
    
    
    @XmlElement(name="ANNOTATION-ORIGIN")
    public String getAnnotationOrigin() {
    return this.annotationOrigin;
}

    public void setAnnotationOrigin(String value) {
        this.annotationOrigin = value;
    }
    
    
    
    @XmlElement(name="ANNOTATION-TEXT")
    public DocumentationBlock getAnnotationText() {
    return this.annotationText;
}

    public void setAnnotationText(DocumentationBlock value) {
        this.annotationText = value;
    }
    
    
    
    @XmlElement(name="TRIGGER-REF")
    public TriggerRef getTriggerRef() {
    return this.triggerRef;
}

    public void setTriggerRef(TriggerRef value) {
        this.triggerRef = value;
    }
    
    
}