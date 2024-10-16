package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class DtcSettingClassRef extends Ref {

    
    
    protected DiagnosticControlDtcSettingClassSubtypesEnum dest;
    
    

    
    
    @XmlAttribute(name="DEST")
    public DiagnosticControlDtcSettingClassSubtypesEnum getDest() {
    return this.dest;
}

    public void setDest(DiagnosticControlDtcSettingClassSubtypesEnum value) {
        this.dest = value;
    }
    
    
}