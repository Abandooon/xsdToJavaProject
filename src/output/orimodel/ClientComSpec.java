package stdgui.data.model.orimodel;
@XmlRootElement(name = "CLIENT-COM-SPEC")
public class ClientComSpec {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected OperationRef operationRef;
    
    
    
    protected TransformationComSpecPropss transformationComSpecPropss;
    
    

    
    
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
    
    
    
    @XmlElement(name="OPERATION-REF")
    public OperationRef getOperationRef() {
    return this.operationRef;
}

    public void setOperationRef(OperationRef value) {
        this.operationRef = value;
    }
    
    
    
    @XmlElement(name="TRANSFORMATION-COM-SPEC-PROPSS")
    public TransformationComSpecPropss getTransformationComSpecPropss() {
    return this.transformationComSpecPropss;
}

    public void setTransformationComSpecPropss(TransformationComSpecPropss value) {
        this.transformationComSpecPropss = value;
    }
    
    
}