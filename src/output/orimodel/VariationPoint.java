package stdgui.data.model.orimodel;
@XmlRootElement(name = "VARIATION-POINT")
public class VariationPoint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected DocumentationBlock blueprintCondition;
    
    
    
    protected BlueprintFormula formalBlueprintCondition;
    
    
    
    protected ConditionByFormula swSyscond;
    
    
    
    protected ArrayList<PostBuildVariantCondition> postBuildVariantConditions;
    
    
    
    protected Sdg sdg;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="BLUEPRINT-CONDITION")
    public DocumentationBlock getBlueprintCondition() {
    return this.blueprintCondition;
}

    public void setBlueprintCondition(DocumentationBlock value) {
        this.blueprintCondition = value;
    }
    
    
    
    @XmlElement(name="FORMAL-BLUEPRINT-CONDITION")
    public BlueprintFormula getFormalBlueprintCondition() {
    return this.formalBlueprintCondition;
}

    public void setFormalBlueprintCondition(BlueprintFormula value) {
        this.formalBlueprintCondition = value;
    }
    
    
    
    @XmlElement(name="SW-SYSCOND")
    public ConditionByFormula getSwSyscond() {
    return this.swSyscond;
}

    public void setSwSyscond(ConditionByFormula value) {
        this.swSyscond = value;
    }
    
    
    
    @XmlElementWrapper(name="POST-BUILD-VARIANT-CONDITIONS")
@XmlElement(name="POST-BUILD-VARIANT-CONDITION")
    public ArrayList<PostBuildVariantCondition> getPostBuildVariantConditions() {
    return this.postBuildVariantConditions;
}

    public void setPostBuildVariantConditions(ArrayList<PostBuildVariantCondition> value) {
        this.postBuildVariantConditions = value;
    }
    
    
    
    @XmlElement(name="SDG")
    public Sdg getSdg() {
    return this.sdg;
}

    public void setSdg(Sdg value) {
        this.sdg = value;
    }
    
    
}