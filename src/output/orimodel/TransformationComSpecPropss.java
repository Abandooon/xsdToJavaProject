package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransformationComSpecPropss {

    
    
    protected ArrayList<EndToEndTransformationComSpecProps> endToEndTransformationComSpecProps;
    
    
    
    protected ArrayList<UserDefinedTransformationComSpecProps> userDefinedTransformationComSpecProps;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-COM-SPEC-PROPS")
    public ArrayList<EndToEndTransformationComSpecProps> getEndToEndTransformationComSpecProps() {
    return this.endToEndTransformationComSpecProps;
}

    public void setEndToEndTransformationComSpecProps(ArrayList<EndToEndTransformationComSpecProps> value) {
        this.endToEndTransformationComSpecProps = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-COM-SPEC-PROPS")
    public ArrayList<UserDefinedTransformationComSpecProps> getUserDefinedTransformationComSpecProps() {
    return this.userDefinedTransformationComSpecProps;
}

    public void setUserDefinedTransformationComSpecProps(ArrayList<UserDefinedTransformationComSpecProps> value) {
        this.userDefinedTransformationComSpecProps = value;
    }
    
    
}