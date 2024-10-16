package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class FirstElements {

    
    
    protected ArrayList<ApplicationCompositeDataTypeSubElementRef> applicationCompositeDataTypeSubElementRef;
    
    
    
    protected ArrayList<ImplementationDataTypeSubElementRef> implementationDataTypeSubElementRef;
    
    

    
    
    @XmlElement(name="APPLICATION-COMPOSITE-DATA-TYPE-SUB-ELEMENT-REF")
    public ArrayList<ApplicationCompositeDataTypeSubElementRef> getApplicationCompositeDataTypeSubElementRef() {
    return this.applicationCompositeDataTypeSubElementRef;
}

    public void setApplicationCompositeDataTypeSubElementRef(ArrayList<ApplicationCompositeDataTypeSubElementRef> value) {
        this.applicationCompositeDataTypeSubElementRef = value;
    }
    
    
    
    @XmlElement(name="IMPLEMENTATION-DATA-TYPE-SUB-ELEMENT-REF")
    public ArrayList<ImplementationDataTypeSubElementRef> getImplementationDataTypeSubElementRef() {
    return this.implementationDataTypeSubElementRef;
}

    public void setImplementationDataTypeSubElementRef(ArrayList<ImplementationDataTypeSubElementRef> value) {
        this.implementationDataTypeSubElementRef = value;
    }
    
    
}