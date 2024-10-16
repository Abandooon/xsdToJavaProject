package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class ReadDataClassRef extends Ref {

    
    
    protected DiagnosticReadDataByPeriodicIdClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticReadDataByPeriodicIdClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticReadDataByPeriodicIdClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}