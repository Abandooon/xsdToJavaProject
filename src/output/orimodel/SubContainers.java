package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class SubContainers {

    
    
    protected ArrayList<EcucChoiceContainerDef> ecucChoiceContainerDef;
    
    
    
    protected ArrayList<EcucParamConfContainerDef> ecucParamConfContainerDef;
    
    

    
    
    @XmlElement(name="ECUC-CHOICE-CONTAINER-DEF")
    public ArrayList<EcucChoiceContainerDef> getEcucChoiceContainerDef() {
    return this.ecucChoiceContainerDef;
}

    public void setEcucChoiceContainerDef(ArrayList<EcucChoiceContainerDef> value) {
        this.ecucChoiceContainerDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-PARAM-CONF-CONTAINER-DEF")
    public ArrayList<EcucParamConfContainerDef> getEcucParamConfContainerDef() {
    return this.ecucParamConfContainerDef;
}

    public void setEcucParamConfContainerDef(ArrayList<EcucParamConfContainerDef> value) {
        this.ecucParamConfContainerDef = value;
    }
    
    
}