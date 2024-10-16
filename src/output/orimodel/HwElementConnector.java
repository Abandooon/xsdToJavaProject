package stdgui.data.model.orimodel;
@XmlRootElement(name = "HW-ELEMENT-CONNECTOR")
public class HwElementConnector {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected ArrayList<HwElementRef> hwElementRefs;
    
    
    
    protected ArrayList<HwPinGroupConnector> hwPinGroupConnections;
    
    
    
    protected ArrayList<HwPinConnector> hwPinConnections;
    
    
    
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
    
    
    
    @XmlElementWrapper(name="HW-ELEMENT-REFS")
@XmlElement(name="HW-ELEMENT-REF")
    public ArrayList<HwElementRef> getHwElementRefs() {
    return this.hwElementRefs;
}

    public void setHwElementRefs(ArrayList<HwElementRef> value) {
        this.hwElementRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="HW-PIN-GROUP-CONNECTIONS")
@XmlElement(name="HW-PIN-GROUP-CONNECTOR")
    public ArrayList<HwPinGroupConnector> getHwPinGroupConnections() {
    return this.hwPinGroupConnections;
}

    public void setHwPinGroupConnections(ArrayList<HwPinGroupConnector> value) {
        this.hwPinGroupConnections = value;
    }
    
    
    
    @XmlElementWrapper(name="HW-PIN-CONNECTIONS")
@XmlElement(name="HW-PIN-CONNECTOR")
    public ArrayList<HwPinConnector> getHwPinConnections() {
    return this.hwPinConnections;
}

    public void setHwPinConnections(ArrayList<HwPinConnector> value) {
        this.hwPinConnections = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}