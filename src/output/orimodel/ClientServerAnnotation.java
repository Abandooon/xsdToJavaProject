package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-SERVER-ANNOTATION")
public class ClientServerAnnotation {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultilanguageLongName label;
    
    
    
    protected String annotationOrigin;
    
    
    
    protected DocumentationBlock annotationText;
    
    
    
    protected OperationRef operationRef;
    
    

    
    
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
    
    
    
    @XmlElement(name="OPERATION-REF")
    public OperationRef getOperationRef() {
    return this.operationRef;
}

    public void setOperationRef(OperationRef value) {
        this.operationRef = value;
    }
    
    
}