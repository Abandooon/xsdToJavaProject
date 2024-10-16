package stdgui.data.model.orimodel;
@XmlRootElement(name = "SWC-BSW-MAPPING")
public class SwcBswMapping {

    
    
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
    
    
    
    protected BswBehaviorRef bswBehaviorRef;
    
    
    
    protected ArrayList<SwcBswRunnableMapping> runnableMappings;
    
    
    
    protected SwcBehaviorRef swcBehaviorRef;
    
    
    
    protected ArrayList<SwcBswSynchronizedModeGroupPrototype> synchronizedModeGroups;
    
    
    
    protected ArrayList<SwcBswSynchronizedTrigger> synchronizedTriggers;
    
    

    
    
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
    
    
    
    @XmlElement(name="BSW-BEHAVIOR-REF")
    public BswBehaviorRef getBswBehaviorRef() {
    return this.bswBehaviorRef;
}

    public void setBswBehaviorRef(BswBehaviorRef value) {
        this.bswBehaviorRef = value;
    }
    
    
    
    @XmlElementWrapper(name="RUNNABLE-MAPPINGS")
@XmlElement(name="SWC-BSW-RUNNABLE-MAPPING")
    public ArrayList<SwcBswRunnableMapping> getRunnableMappings() {
    return this.runnableMappings;
}

    public void setRunnableMappings(ArrayList<SwcBswRunnableMapping> value) {
        this.runnableMappings = value;
    }
    
    
    
    @XmlElement(name="SWC-BEHAVIOR-REF")
    public SwcBehaviorRef getSwcBehaviorRef() {
    return this.swcBehaviorRef;
}

    public void setSwcBehaviorRef(SwcBehaviorRef value) {
        this.swcBehaviorRef = value;
    }
    
    
    
    @XmlElementWrapper(name="SYNCHRONIZED-MODE-GROUPS")
@XmlElement(name="SWC-BSW-SYNCHRONIZED-MODE-GROUP-PROTOTYPE")
    public ArrayList<SwcBswSynchronizedModeGroupPrototype> getSynchronizedModeGroups() {
    return this.synchronizedModeGroups;
}

    public void setSynchronizedModeGroups(ArrayList<SwcBswSynchronizedModeGroupPrototype> value) {
        this.synchronizedModeGroups = value;
    }
    
    
    
    @XmlElementWrapper(name="SYNCHRONIZED-TRIGGERS")
@XmlElement(name="SWC-BSW-SYNCHRONIZED-TRIGGER")
    public ArrayList<SwcBswSynchronizedTrigger> getSynchronizedTriggers() {
    return this.synchronizedTriggers;
}

    public void setSynchronizedTriggers(ArrayList<SwcBswSynchronizedTrigger> value) {
        this.synchronizedTriggers = value;
    }
    
    
}