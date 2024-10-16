package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-TO-SWC-OPERATION-ARGUMENTS")
public class SwcToSwcOperationArguments {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected SwcToSwcOperationArgumentsDirectionEnum direction;
    
    
    
    protected ArrayList<OperationInSystemInstanceRef> operationIrefs;
    
    

    
    
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
    
    
    
    @XmlElement(name="DIRECTION")
    public SwcToSwcOperationArgumentsDirectionEnum getDirection() {
    return this.direction;
}

    public void setDirection(SwcToSwcOperationArgumentsDirectionEnum value) {
        this.direction = value;
    }
    
    
    
    @XmlElementWrapper(name="OPERATION-IREFS")
@XmlElement(name="OPERATION-IREF")
    public ArrayList<OperationInSystemInstanceRef> getOperationIrefs() {
    return this.operationIrefs;
}

    public void setOperationIrefs(ArrayList<OperationInSystemInstanceRef> value) {
        this.operationIrefs = value;
    }
    
    
}