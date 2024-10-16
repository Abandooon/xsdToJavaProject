package stdgui.data.model.orimodel;
@XmlRootElement(name = "FM-FEATURE")
public class FmFeature {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected ArrayList<FmAttributeDef> attributeDefs;
    
    
    
    protected ArrayList<FmFeatureDecomposition> decompositions;
    
    
    
    protected BindingTimeEnum maximumIntendedBindingTime;
    
    
    
    protected BindingTimeEnum minimumIntendedBindingTime;
    
    
    
    protected ArrayList<FmFeatureRelation> relations;
    
    
    
    protected ArrayList<FmFeatureRestriction> restrictions;
    
    

    
    
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
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
    return this.uuid;
}

    public void setUuid(java.lang.String value) {
        this.uuid = value;
    }
    
    
    
    @XmlElement(name="SHORT-NAME")
    public Identifier getShortName() {
    return this.shortName;
}

    public void setShortName(Identifier value) {
        this.shortName = value;
    }
    
    
    
    @XmlElementWrapper(name="SHORT-NAME-FRAGMENTS")
@XmlElement(name="SHORT-NAME-FRAGMENT")
    public ArrayList<ShortNameFragment> getShortNameFragments() {
    return this.shortNameFragments;
}

    public void setShortNameFragments(ArrayList<ShortNameFragment> value) {
        this.shortNameFragments = value;
    }
    
    
    
    @XmlElement(name="LONG-NAME")
    public MultilanguageLongName getLongName() {
    return this.longName;
}

    public void setLongName(MultilanguageLongName value) {
        this.longName = value;
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
    
    
    
    @XmlElement(name="ADMIN-DATA")
    public AdminData getAdminData() {
    return this.adminData;
}

    public void setAdminData(AdminData value) {
        this.adminData = value;
    }
    
    
    
    @XmlElement(name="INTRODUCTION")
    public DocumentationBlock getIntroduction() {
    return this.introduction;
}

    public void setIntroduction(DocumentationBlock value) {
        this.introduction = value;
    }
    
    
    
    @XmlElementWrapper(name="ANNOTATIONS")
@XmlElement(name="ANNOTATION")
    public ArrayList<Annotation> getAnnotations() {
    return this.annotations;
}

    public void setAnnotations(ArrayList<Annotation> value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElementWrapper(name="ATTRIBUTE-DEFS")
@XmlElement(name="FM-ATTRIBUTE-DEF")
    public ArrayList<FmAttributeDef> getAttributeDefs() {
    return this.attributeDefs;
}

    public void setAttributeDefs(ArrayList<FmAttributeDef> value) {
        this.attributeDefs = value;
    }
    
    
    
    @XmlElementWrapper(name="DECOMPOSITIONS")
@XmlElement(name="FM-FEATURE-DECOMPOSITION")
    public ArrayList<FmFeatureDecomposition> getDecompositions() {
    return this.decompositions;
}

    public void setDecompositions(ArrayList<FmFeatureDecomposition> value) {
        this.decompositions = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-INTENDED-BINDING-TIME")
    public BindingTimeEnum getMaximumIntendedBindingTime() {
    return this.maximumIntendedBindingTime;
}

    public void setMaximumIntendedBindingTime(BindingTimeEnum value) {
        this.maximumIntendedBindingTime = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-INTENDED-BINDING-TIME")
    public BindingTimeEnum getMinimumIntendedBindingTime() {
    return this.minimumIntendedBindingTime;
}

    public void setMinimumIntendedBindingTime(BindingTimeEnum value) {
        this.minimumIntendedBindingTime = value;
    }
    
    
    
    @XmlElementWrapper(name="RELATIONS")
@XmlElement(name="FM-FEATURE-RELATION")
    public ArrayList<FmFeatureRelation> getRelations() {
    return this.relations;
}

    public void setRelations(ArrayList<FmFeatureRelation> value) {
        this.relations = value;
    }
    
    
    
    @XmlElementWrapper(name="RESTRICTIONS")
@XmlElement(name="FM-FEATURE-RESTRICTION")
    public ArrayList<FmFeatureRestriction> getRestrictions() {
    return this.restrictions;
}

    public void setRestrictions(ArrayList<FmFeatureRestriction> value) {
        this.restrictions = value;
    }
    
    
}