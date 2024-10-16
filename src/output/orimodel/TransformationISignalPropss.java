package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransformationISignalPropss {

    
    
    protected ArrayList<EndToEndTransformationISignalProps> endToEndTransformationISignalProps;
    
    
    
    protected ArrayList<SomeipTransformationISignalProps> someipTransformationISignalProps;
    
    
    
    protected ArrayList<UserDefinedTransformationISignalProps> userDefinedTransformationISignalProps;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS")
    public ArrayList<EndToEndTransformationISignalProps> getEndToEndTransformationISignalProps() {
    return this.endToEndTransformationISignalProps;
}

    public void setEndToEndTransformationISignalProps(ArrayList<EndToEndTransformationISignalProps> value) {
        this.endToEndTransformationISignalProps = value;
    }
    
    
    
    @XmlElement(name="SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS")
    public ArrayList<SomeipTransformationISignalProps> getSomeipTransformationISignalProps() {
    return this.someipTransformationISignalProps;
}

    public void setSomeipTransformationISignalProps(ArrayList<SomeipTransformationISignalProps> value) {
        this.someipTransformationISignalProps = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-I-SIGNAL-PROPS")
    public ArrayList<UserDefinedTransformationISignalProps> getUserDefinedTransformationISignalProps() {
    return this.userDefinedTransformationISignalProps;
}

    public void setUserDefinedTransformationISignalProps(ArrayList<UserDefinedTransformationISignalProps> value) {
        this.userDefinedTransformationISignalProps = value;
    }
    
    
}