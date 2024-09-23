package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ExecutionOrderConstraint {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected java.lang.String uuid;
    
    
    
    protected Identifier shortName;
    
    
    
    protected ShortNameFragments shortNameFragments;
    
    
    
    protected MultilanguageLongName longName;
    
    
    
    protected MultiLanguageOverviewParagraph desc;
    
    
    
    protected CategoryString category;
    
    
    
    protected AdminData adminData;
    
    
    
    protected DocumentationBlock introduction;
    
    
    
    protected Annotations annotations;
    
    
    
    protected TraceRefs traceRefs;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected BaseCompositionRef baseCompositionRef;
    
    
    
    protected ExecutionOrderConstraintTypeEnum executionOrderConstraintType;
    
    
    
    protected Boolean isEvent;
    
    
    
    protected OrderedElements orderedElements;
    
    
    
    protected Boolean permitMultipleReferencesToEe;
    
    

    
    
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
    
    
    
    @XmlElement(name="SHORT-NAME-FRAGMENTS")
    public ShortNameFragments getShortNameFragments() {
        return this.shortNameFragments;
    }

    public void setShortNameFragments(ShortNameFragments value) {
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
    
    
    
    @XmlElement(name="ANNOTATIONS")
    public Annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(Annotations value) {
        this.annotations = value;
    }
    
    
    
    @XmlElement(name="TRACE-REFS")
    public TraceRefs getTraceRefs() {
        return this.traceRefs;
    }

    public void setTraceRefs(TraceRefs value) {
        this.traceRefs = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="BASE-COMPOSITION-REF")
    public BaseCompositionRef getBaseCompositionRef() {
        return this.baseCompositionRef;
    }

    public void setBaseCompositionRef(BaseCompositionRef value) {
        this.baseCompositionRef = value;
    }
    
    
    
    @XmlElement(name="EXECUTION-ORDER-CONSTRAINT-TYPE")
    public ExecutionOrderConstraintTypeEnum getExecutionOrderConstraintType() {
        return this.executionOrderConstraintType;
    }

    public void setExecutionOrderConstraintType(ExecutionOrderConstraintTypeEnum value) {
        this.executionOrderConstraintType = value;
    }
    
    
    
    @XmlElement(name="IS-EVENT")
    public Boolean getIsEvent() {
        return this.isEvent;
    }

    public void setIsEvent(Boolean value) {
        this.isEvent = value;
    }
    
    
    
    @XmlElement(name="ORDERED-ELEMENTS")
    public OrderedElements getOrderedElements() {
        return this.orderedElements;
    }

    public void setOrderedElements(OrderedElements value) {
        this.orderedElements = value;
    }
    
    
    
    @XmlElement(name="PERMIT-MULTIPLE-REFERENCES-TO-EE")
    public Boolean getPermitMultipleReferencesToEe() {
        return this.permitMultipleReferencesToEe;
    }

    public void setPermitMultipleReferencesToEe(Boolean value) {
        this.permitMultipleReferencesToEe = value;
    }
    
    
}