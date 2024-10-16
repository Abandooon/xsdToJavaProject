package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ServiceInstanceRef_DiagnosticServiceTable extends Ref {

    
    
    protected DiagnosticServiceInstanceSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticServiceInstanceSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticServiceInstanceSubtypesEnum value) {
        this.dest = value;
    }
    
    
}