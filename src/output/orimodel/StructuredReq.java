package stdgui.data.model.orimodel;
@XmlRootElement(name = "STRUCTURED-REQ")
public class StructuredReq {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected java.lang.String si;
    
    
    
    protected java.lang.String view;
    
    
    
    protected ChapterEnumBreakSimple break1;
    
    
    
    protected KeepWithPreviousEnumSimple keepWithPrevious;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ArrayList<ShortNameFragment> shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected ArrayList<Annotation> annotations;
    
    
    
    protected ArrayList<TraceRef> traceRefs;
    
    
    
    protected Date date;
    
    
    
    protected String issuedBy;
    
    
    
    protected String type;
    
    
    
    protected String importance;
    
    
    
    protected DocumentationBlock description;
    
    
    
    protected DocumentationBlock rationale;
    
    
    
    protected DocumentationBlock dependencies;
    
    
    
    protected DocumentationBlock useCase;
    
    
    
    protected DocumentationBlock conflicts;
    
    
    
    protected DocumentationBlock supportingMaterial;
    
    
    
    protected DocumentationBlock remark;
    
    
    
    protected ArrayList<TestedItemRef> testedItemRefs;
    
    
    
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
    
    
    
    @XmlAttribute(name="UUID")
    public java.lang.String getUuid() {
    return this.uuid;
}

    public void setUuid(java.lang.String value) {
        this.uuid = value;
    }
    
    
    
    @XmlAttribute(name="SI")
    public java.lang.String getSi() {
    return this.si;
}

    public void setSi(java.lang.String value) {
        this.si = value;
    }
    
    
    
    @XmlAttribute(name="VIEW")
    public java.lang.String getView() {
    return this.view;
}

    public void setView(java.lang.String value) {
        this.view = value;
    }
    
    
    
    @XmlAttribute(name="BREAK")
    public ChapterEnumBreakSimple getBreak() {
    return this.break1;
}

    public void setBreak(ChapterEnumBreakSimple value) {
        this.break1 = value;
    }
    
    
    
    @XmlAttribute(name="KEEP-WITH-PREVIOUS")
    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
    return this.keepWithPrevious;
}

    public void setKeepWithPrevious(KeepWithPreviousEnumSimple value) {
        this.keepWithPrevious = value;
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
    
    
    
    @XmlElementWrapper(name="TRACE-REFS")
@XmlElement(name="TRACE-REF")
    public ArrayList<TraceRef> getTraceRefs() {
    return this.traceRefs;
}

    public void setTraceRefs(ArrayList<TraceRef> value) {
        this.traceRefs = value;
    }
    
    
    
    @XmlElement(name="DATE")
    public Date getDate() {
    return this.date;
}

    public void setDate(Date value) {
        this.date = value;
    }
    
    
    
    @XmlElement(name="ISSUED-BY")
    public String getIssuedBy() {
    return this.issuedBy;
}

    public void setIssuedBy(String value) {
        this.issuedBy = value;
    }
    
    
    
    @XmlElement(name="TYPE")
    public String getType() {
    return this.type;
}

    public void setType(String value) {
        this.type = value;
    }
    
    
    
    @XmlElement(name="IMPORTANCE")
    public String getImportance() {
    return this.importance;
}

    public void setImportance(String value) {
        this.importance = value;
    }
    
    
    
    @XmlElement(name="DESCRIPTION")
    public DocumentationBlock getDescription() {
    return this.description;
}

    public void setDescription(DocumentationBlock value) {
        this.description = value;
    }
    
    
    
    @XmlElement(name="RATIONALE")
    public DocumentationBlock getRationale() {
    return this.rationale;
}

    public void setRationale(DocumentationBlock value) {
        this.rationale = value;
    }
    
    
    
    @XmlElement(name="DEPENDENCIES")
    public DocumentationBlock getDependencies() {
    return this.dependencies;
}

    public void setDependencies(DocumentationBlock value) {
        this.dependencies = value;
    }
    
    
    
    @XmlElement(name="USE-CASE")
    public DocumentationBlock getUseCase() {
    return this.useCase;
}

    public void setUseCase(DocumentationBlock value) {
        this.useCase = value;
    }
    
    
    
    @XmlElement(name="CONFLICTS")
    public DocumentationBlock getConflicts() {
    return this.conflicts;
}

    public void setConflicts(DocumentationBlock value) {
        this.conflicts = value;
    }
    
    
    
    @XmlElement(name="SUPPORTING-MATERIAL")
    public DocumentationBlock getSupportingMaterial() {
    return this.supportingMaterial;
}

    public void setSupportingMaterial(DocumentationBlock value) {
        this.supportingMaterial = value;
    }
    
    
    
    @XmlElement(name="REMARK")
    public DocumentationBlock getRemark() {
    return this.remark;
}

    public void setRemark(DocumentationBlock value) {
        this.remark = value;
    }
    
    
    
    @XmlElementWrapper(name="TESTED-ITEM-REFS")
@XmlElement(name="TESTED-ITEM-REF")
    public ArrayList<TestedItemRef> getTestedItemRefs() {
    return this.testedItemRefs;
}

    public void setTestedItemRefs(ArrayList<TestedItemRef> value) {
        this.testedItemRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
    return this.variationPoint;
}

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
}