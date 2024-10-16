package stdgui.data.model.orimodel;
@XmlRootElement(name = "END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS")
public class EndToEndTransformationISignalProps {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected AdminData adminData;
    
    
    
    protected ArrayList<EndToEndTransformationISignalPropsConditional> endToEndTransformationISignalPropsVariants;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-VARIANTS")
@XmlElement(name="END-TO-END-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL")
    public ArrayList<EndToEndTransformationISignalPropsConditional> getEndToEndTransformationISignalPropsVariants() {
    return this.endToEndTransformationISignalPropsVariants;
}

    public void setEndToEndTransformationISignalPropsVariants(ArrayList<EndToEndTransformationISignalPropsConditional> value) {
        this.endToEndTransformationISignalPropsVariants = value;
    }
    
    
}