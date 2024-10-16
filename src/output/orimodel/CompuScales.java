package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class CompuScales {

    
    
    protected ArrayList<CompuScale> compuScale;
    
    

    
    
    @XmlElementWrapper(name="COMPU-SCALES")
@XmlElement(name="COMPU-SCALE")
    public ArrayList<CompuScale> getCompuScale() {
    return this.compuScale;
}

    public void setCompuScale(ArrayList<CompuScale> value) {
        this.compuScale = value;
    }
    
    
}