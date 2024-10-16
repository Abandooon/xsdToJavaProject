package stdgui.data.model.orimodel;
@XmlRootElement(name = "BUILD-ACTION-INVOCATOR")
public class BuildActionInvocator {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected VerbatimString command;
    
    
    
    protected ArrayList<Sdg> sdgs;
    
    

    
    
    @XmlAttribute(name="S")
    public java.lang.String getS() {
    return this.s;
}

    public void setS(java.lang.String value) {
        this.s = value;
    }
    
    
    
    @XmlAttribute(name="T")
    public java.lang.String getT() {
    return this.t;
}

    public void setT(java.lang.String value) {
        this.t = value;
    }
    
    
    
    @XmlElement(name="COMMAND")
    public VerbatimString getCommand() {
    return this.command;
}

    public void setCommand(VerbatimString value) {
        this.command = value;
    }
    
    
    
    @XmlElementWrapper(name="SDGS")
@XmlElement(name="SDG")
    public ArrayList<Sdg> getSdgs() {
    return this.sdgs;
}

    public void setSdgs(ArrayList<Sdg> value) {
        this.sdgs = value;
    }
    
    
}