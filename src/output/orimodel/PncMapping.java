package stdgui.data.model.orimodel;
@XmlRootElement(name = "PNC-MAPPING")
public class PncMapping {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected ArrayList<PncGroupRef> pncGroupRefs;
    
    
    
    protected PositiveInteger pncIdentifier;
    
    
    
    protected Identifier shortLabel;
    
    
    
    protected ArrayList<PortGroupInSystemInstanceRef> vfcIrefs;
    
    
    
    protected ArrayList<WakeupFrameRef> wakeupFrameRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    

    
    
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
    
    
    
    @XmlElement(name="DESC")
    public MultiLanguageOverviewParagraph getDesc() {
    return this.desc;
}

    public void setDesc(MultiLanguageOverviewParagraph value) {
        this.desc = value;
    }
    
    
    
    @XmlElement(name="CATEGORY")
    public CategoryString getCategory() {
    return this.category;
}

    public void setCategory(CategoryString value) {
        this.category = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElementWrapper(name="PNC-GROUP-REFS")
@XmlElement(name="PNC-GROUP-REF")
    public ArrayList<PncGroupRef> getPncGroupRefs() {
    return this.pncGroupRefs;
}

    public void setPncGroupRefs(ArrayList<PncGroupRef> value) {
        this.pncGroupRefs = value;
    }
    
    
    
    @XmlElement(name="PNC-IDENTIFIER")
    public PositiveInteger getPncIdentifier() {
    return this.pncIdentifier;
}

    public void setPncIdentifier(PositiveInteger value) {
        this.pncIdentifier = value;
    }
    
    
    
    @XmlElement(name="SHORT-LABEL")
    public Identifier getShortLabel() {
    return this.shortLabel;
}

    public void setShortLabel(Identifier value) {
        this.shortLabel = value;
    }
    
    
    
    @XmlElementWrapper(name="VFC-IREFS")
@XmlElement(name="VFC-IREF")
    public ArrayList<PortGroupInSystemInstanceRef> getVfcIrefs() {
    return this.vfcIrefs;
}

    public void setVfcIrefs(ArrayList<PortGroupInSystemInstanceRef> value) {
        this.vfcIrefs = value;
    }
    
    
    
    @XmlElementWrapper(name="WAKEUP-FRAME-REFS")
@XmlElement(name="WAKEUP-FRAME-REF")
    public ArrayList<WakeupFrameRef> getWakeupFrameRefs() {
    return this.wakeupFrameRefs;
}

    public void setWakeupFrameRefs(ArrayList<WakeupFrameRef> value) {
        this.wakeupFrameRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}