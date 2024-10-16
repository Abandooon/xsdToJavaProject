package stdgui.data.model.orimodel;
@XmlRootElement(name = "MODE-PORT-ANNOTATION")
public class ModePortAnnotation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultilanguageLongName label;
    
    
    
    protected String annotationOrigin;
    
    
    
    protected DocumentationBlock annotationText;
    
    
    
    protected ModeGroupRef modeGroupRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="MODE-GROUP-REF")
    public ModeGroupRef getModeGroupRef() {
    return this.modeGroupRef;
}

    public void setModeGroupRef(ModeGroupRef value) {
        this.modeGroupRef = value;
    }
    
    
}