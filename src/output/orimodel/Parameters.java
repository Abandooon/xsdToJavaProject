package stdgui.data.model.orimodel;
@XmlRootElement(name = "")
public class Parameters {

    
    
    protected ArrayList<EcucAddInfoParamDef> ecucAddInfoParamDef;
    
    
    
    protected ArrayList<EcucBooleanParamDef> ecucBooleanParamDef;
    
    
    
    protected ArrayList<EcucEnumerationParamDef> ecucEnumerationParamDef;
    
    
    
    protected ArrayList<EcucFloatParamDef> ecucFloatParamDef;
    
    
    
    protected ArrayList<EcucFunctionNameDef> ecucFunctionNameDef;
    
    
    
    protected ArrayList<EcucIntegerParamDef> ecucIntegerParamDef;
    
    
    
    protected ArrayList<EcucLinkerSymbolDef> ecucLinkerSymbolDef;
    
    
    
    protected ArrayList<EcucMultilineStringParamDef> ecucMultilineStringParamDef;
    
    
    
    protected ArrayList<EcucStringParamDef> ecucStringParamDef;
    
    

    
    
    @XmlElement(name="ECUC-ADD-INFO-PARAM-DEF")
    public ArrayList<EcucAddInfoParamDef> getEcucAddInfoParamDef() {
    return this.ecucAddInfoParamDef;
}

    public void setEcucAddInfoParamDef(ArrayList<EcucAddInfoParamDef> value) {
        this.ecucAddInfoParamDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-BOOLEAN-PARAM-DEF")
    public ArrayList<EcucBooleanParamDef> getEcucBooleanParamDef() {
    return this.ecucBooleanParamDef;
}

    public void setEcucBooleanParamDef(ArrayList<EcucBooleanParamDef> value) {
        this.ecucBooleanParamDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-ENUMERATION-PARAM-DEF")
    public ArrayList<EcucEnumerationParamDef> getEcucEnumerationParamDef() {
    return this.ecucEnumerationParamDef;
}

    public void setEcucEnumerationParamDef(ArrayList<EcucEnumerationParamDef> value) {
        this.ecucEnumerationParamDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-FLOAT-PARAM-DEF")
    public ArrayList<EcucFloatParamDef> getEcucFloatParamDef() {
    return this.ecucFloatParamDef;
}

    public void setEcucFloatParamDef(ArrayList<EcucFloatParamDef> value) {
        this.ecucFloatParamDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-FUNCTION-NAME-DEF")
    public ArrayList<EcucFunctionNameDef> getEcucFunctionNameDef() {
    return this.ecucFunctionNameDef;
}

    public void setEcucFunctionNameDef(ArrayList<EcucFunctionNameDef> value) {
        this.ecucFunctionNameDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-INTEGER-PARAM-DEF")
    public ArrayList<EcucIntegerParamDef> getEcucIntegerParamDef() {
    return this.ecucIntegerParamDef;
}

    public void setEcucIntegerParamDef(ArrayList<EcucIntegerParamDef> value) {
        this.ecucIntegerParamDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-LINKER-SYMBOL-DEF")
    public ArrayList<EcucLinkerSymbolDef> getEcucLinkerSymbolDef() {
    return this.ecucLinkerSymbolDef;
}

    public void setEcucLinkerSymbolDef(ArrayList<EcucLinkerSymbolDef> value) {
        this.ecucLinkerSymbolDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-MULTILINE-STRING-PARAM-DEF")
    public ArrayList<EcucMultilineStringParamDef> getEcucMultilineStringParamDef() {
    return this.ecucMultilineStringParamDef;
}

    public void setEcucMultilineStringParamDef(ArrayList<EcucMultilineStringParamDef> value) {
        this.ecucMultilineStringParamDef = value;
    }
    
    
    
    @XmlElement(name="ECUC-STRING-PARAM-DEF")
    public ArrayList<EcucStringParamDef> getEcucStringParamDef() {
    return this.ecucStringParamDef;
}

    public void setEcucStringParamDef(ArrayList<EcucStringParamDef> value) {
        this.ecucStringParamDef = value;
    }
    
    
}