package stdgui.data.model.orimodel;
@XmlRootElement(name = "EOC-EXECUTABLE-ENTITY-REF-GROUP")
public class EocExecutableEntityRefGroup {

    
    
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
    
    
    
    protected ArrayList<DirectSuccessorRef> directSuccessorRefs;
    
    
    
    protected Integer maxCycles;
    
    
    
    protected Integer maxSlots;
    
    
    
    protected ArrayList<NestedElementRef> nestedElementRefs;
    
    
    
    protected ArrayList<SuccessorRef> successorRefs;
    
    
    
    protected TriggeringEventRef triggeringEventRef;
    
    

    
    
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
    
    
    
    @XmlElementWrapper(name="DIRECT-SUCCESSOR-REFS")
@XmlElement(name="DIRECT-SUCCESSOR-REF")
    public ArrayList<DirectSuccessorRef> getDirectSuccessorRefs() {
    return this.directSuccessorRefs;
}

    public void setDirectSuccessorRefs(ArrayList<DirectSuccessorRef> value) {
        this.directSuccessorRefs = value;
    }
    
    
    
    @XmlElement(name="MAX-CYCLES")
    public Integer getMaxCycles() {
    return this.maxCycles;
}

    public void setMaxCycles(Integer value) {
        this.maxCycles = value;
    }
    
    
    
    @XmlElement(name="MAX-SLOTS")
    public Integer getMaxSlots() {
    return this.maxSlots;
}

    public void setMaxSlots(Integer value) {
        this.maxSlots = value;
    }
    
    
    
    @XmlElementWrapper(name="NESTED-ELEMENT-REFS")
@XmlElement(name="NESTED-ELEMENT-REF")
    public ArrayList<NestedElementRef> getNestedElementRefs() {
    return this.nestedElementRefs;
}

    public void setNestedElementRefs(ArrayList<NestedElementRef> value) {
        this.nestedElementRefs = value;
    }
    
    
    
    @XmlElementWrapper(name="SUCCESSOR-REFS")
@XmlElement(name="SUCCESSOR-REF")
    public ArrayList<SuccessorRef> getSuccessorRefs() {
    return this.successorRefs;
}

    public void setSuccessorRefs(ArrayList<SuccessorRef> value) {
        this.successorRefs = value;
    }
    
    
    
    @XmlElement(name="TRIGGERING-EVENT-REF")
    public TriggeringEventRef getTriggeringEventRef() {
    return this.triggeringEventRef;
}

    public void setTriggeringEventRef(TriggeringEventRef value) {
        this.triggeringEventRef = value;
    }
    
    
}