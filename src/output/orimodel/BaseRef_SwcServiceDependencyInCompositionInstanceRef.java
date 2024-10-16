package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class BaseRef_SwcServiceDependencyInCompositionInstanceRef extends Ref {

    
    
    protected CompositionSwComponentTypeSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public CompositionSwComponentTypeSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(CompositionSwComponentTypeSubtypesEnum value) {
        this.dest = value;
    }
    
    
}