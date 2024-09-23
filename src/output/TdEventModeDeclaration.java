package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class TdEventModeDeclaration {

    
    
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
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected TdEventOccurrenceExpression occurrenceExpression;
    
    
    
    protected ComponentInCompositionInstanceRef componentIref;
    
    
    
    protected Boolean isExternal;
    
    
    
    protected PortPrototypeBlueprintRef portPrototypeBlueprintRef;
    
    
    
    protected PortRef portRef;
    
    
    
    protected EntryModeDeclarationRef entryModeDeclarationRef;
    
    
    
    protected ExitModeDeclarationRef exitModeDeclarationRef;
    
    
    
    protected ModeDeclarationRef modeDeclarationRef;
    
    
    
    protected TdEventModeDeclarationTypeEnum tdEventModeDeclarationType;
    
    

    
    
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
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="OCCURRENCE-EXPRESSION")
    public TdEventOccurrenceExpression getOccurrenceExpression() {
        return this.occurrenceExpression;
    }

    public void setOccurrenceExpression(TdEventOccurrenceExpression value) {
        this.occurrenceExpression = value;
    }
    
    
    
    @XmlElement(name="COMPONENT-IREF")
    public ComponentInCompositionInstanceRef getComponentIref() {
        return this.componentIref;
    }

    public void setComponentIref(ComponentInCompositionInstanceRef value) {
        this.componentIref = value;
    }
    
    
    
    @XmlElement(name="IS-EXTERNAL")
    public Boolean getIsExternal() {
        return this.isExternal;
    }

    public void setIsExternal(Boolean value) {
        this.isExternal = value;
    }
    
    
    
    @XmlElement(name="PORT-PROTOTYPE-BLUEPRINT-REF")
    public PortPrototypeBlueprintRef getPortPrototypeBlueprintRef() {
        return this.portPrototypeBlueprintRef;
    }

    public void setPortPrototypeBlueprintRef(PortPrototypeBlueprintRef value) {
        this.portPrototypeBlueprintRef = value;
    }
    
    
    
    @XmlElement(name="PORT-REF")
    public PortRef getPortRef() {
        return this.portRef;
    }

    public void setPortRef(PortRef value) {
        this.portRef = value;
    }
    
    
    
    @XmlElement(name="ENTRY-MODE-DECLARATION-REF")
    public EntryModeDeclarationRef getEntryModeDeclarationRef() {
        return this.entryModeDeclarationRef;
    }

    public void setEntryModeDeclarationRef(EntryModeDeclarationRef value) {
        this.entryModeDeclarationRef = value;
    }
    
    
    
    @XmlElement(name="EXIT-MODE-DECLARATION-REF")
    public ExitModeDeclarationRef getExitModeDeclarationRef() {
        return this.exitModeDeclarationRef;
    }

    public void setExitModeDeclarationRef(ExitModeDeclarationRef value) {
        this.exitModeDeclarationRef = value;
    }
    
    
    
    @XmlElement(name="MODE-DECLARATION-REF")
    public ModeDeclarationRef getModeDeclarationRef() {
        return this.modeDeclarationRef;
    }

    public void setModeDeclarationRef(ModeDeclarationRef value) {
        this.modeDeclarationRef = value;
    }
    
    
    
    @XmlElement(name="TD-EVENT-MODE-DECLARATION-TYPE")
    public TdEventModeDeclarationTypeEnum getTdEventModeDeclarationType() {
        return this.tdEventModeDeclarationType;
    }

    public void setTdEventModeDeclarationType(TdEventModeDeclarationTypeEnum value) {
        this.tdEventModeDeclarationType = value;
    }
    
    
}