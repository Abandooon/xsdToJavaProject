package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class TransformationDescriptions {

    
    
    protected ArrayList<EndToEndTransformationDescription> endToEndTransformationDescription;
    
    
    
    protected ArrayList<SomeipTransformationDescription> someipTransformationDescription;
    
    
    
    protected ArrayList<UserDefinedTransformationDescription> userDefinedTransformationDescription;
    
    

    
    
    @XmlElement(name="END-TO-END-TRANSFORMATION-DESCRIPTION")
    public ArrayList<EndToEndTransformationDescription> getEndToEndTransformationDescription() {
    return this.endToEndTransformationDescription;
}

    public void setEndToEndTransformationDescription(ArrayList<EndToEndTransformationDescription> value) {
        this.endToEndTransformationDescription = value;
    }
    
    
    
    @XmlElement(name="SOMEIP-TRANSFORMATION-DESCRIPTION")
    public ArrayList<SomeipTransformationDescription> getSomeipTransformationDescription() {
    return this.someipTransformationDescription;
}

    public void setSomeipTransformationDescription(ArrayList<SomeipTransformationDescription> value) {
        this.someipTransformationDescription = value;
    }
    
    
    
    @XmlElement(name="USER-DEFINED-TRANSFORMATION-DESCRIPTION")
    public ArrayList<UserDefinedTransformationDescription> getUserDefinedTransformationDescription() {
    return this.userDefinedTransformationDescription;
}

    public void setUserDefinedTransformationDescription(ArrayList<UserDefinedTransformationDescription> value) {
        this.userDefinedTransformationDescription = value;
    }
    
    
}