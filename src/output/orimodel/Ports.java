package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Ports {

    
    
    protected ArrayList<PPortPrototype> pPortPrototype;
    
    
    
    protected ArrayList<PrPortPrototype> prPortPrototype;
    
    
    
    protected ArrayList<RPortPrototype> rPortPrototype;
    
    

    
    
    @XmlElement(name="P-PORT-PROTOTYPE")
    public ArrayList<PPortPrototype> getPPortPrototype() {
    return this.pPortPrototype;
}

    public void setPPortPrototype(ArrayList<PPortPrototype> value) {
        this.pPortPrototype = value;
    }
    
    
    
    @XmlElement(name="PR-PORT-PROTOTYPE")
    public ArrayList<PrPortPrototype> getPrPortPrototype() {
    return this.prPortPrototype;
}

    public void setPrPortPrototype(ArrayList<PrPortPrototype> value) {
        this.prPortPrototype = value;
    }
    
    
    
    @XmlElement(name="R-PORT-PROTOTYPE")
    public ArrayList<RPortPrototype> getRPortPrototype() {
    return this.rPortPrototype;
}

    public void setRPortPrototype(ArrayList<RPortPrototype> value) {
        this.rPortPrototype = value;
    }
    
    
}