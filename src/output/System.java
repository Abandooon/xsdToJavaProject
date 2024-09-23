package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class System {

    
    
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
    
    
    
    protected SystemDocumentations systemDocumentations;
    
    
    
    protected ClientIdDefinitionSetRefs clientIdDefinitionSetRefs;
    
    
    
    protected ByteOrderEnum containerIPduHeaderByteOrder;
    
    
    
    protected RevisionLabelString ecuExtractVersion;
    
    
    
    protected FibexElements fibexElements;
    
    
    
    protected Mappings mappings;
    
    
    
    protected PositiveInteger pncVectorLength;
    
    
    
    protected PositiveInteger pncVectorOffset;
    
    
    
    protected RootSoftwareCompositions rootSoftwareCompositions;
    
    
    
    protected RevisionLabelString systemVersion;
    
    

    
    
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
    
    
    
    @XmlElement(name="SYSTEM-DOCUMENTATIONS")
    public SystemDocumentations getSystemDocumentations() {
        return this.systemDocumentations;
    }

    public void setSystemDocumentations(SystemDocumentations value) {
        this.systemDocumentations = value;
    }
    
    
    
    @XmlElement(name="CLIENT-ID-DEFINITION-SET-REFS")
    public ClientIdDefinitionSetRefs getClientIdDefinitionSetRefs() {
        return this.clientIdDefinitionSetRefs;
    }

    public void setClientIdDefinitionSetRefs(ClientIdDefinitionSetRefs value) {
        this.clientIdDefinitionSetRefs = value;
    }
    
    
    
    @XmlElement(name="CONTAINER-I-PDU-HEADER-BYTE-ORDER")
    public ByteOrderEnum getContainerIPduHeaderByteOrder() {
        return this.containerIPduHeaderByteOrder;
    }

    public void setContainerIPduHeaderByteOrder(ByteOrderEnum value) {
        this.containerIPduHeaderByteOrder = value;
    }
    
    
    
    @XmlElement(name="ECU-EXTRACT-VERSION")
    public RevisionLabelString getEcuExtractVersion() {
        return this.ecuExtractVersion;
    }

    public void setEcuExtractVersion(RevisionLabelString value) {
        this.ecuExtractVersion = value;
    }
    
    
    
    @XmlElement(name="FIBEX-ELEMENTS")
    public FibexElements getFibexElements() {
        return this.fibexElements;
    }

    public void setFibexElements(FibexElements value) {
        this.fibexElements = value;
    }
    
    
    
    @XmlElement(name="MAPPINGS")
    public Mappings getMappings() {
        return this.mappings;
    }

    public void setMappings(Mappings value) {
        this.mappings = value;
    }
    
    
    
    @XmlElement(name="PNC-VECTOR-LENGTH")
    public PositiveInteger getPncVectorLength() {
        return this.pncVectorLength;
    }

    public void setPncVectorLength(PositiveInteger value) {
        this.pncVectorLength = value;
    }
    
    
    
    @XmlElement(name="PNC-VECTOR-OFFSET")
    public PositiveInteger getPncVectorOffset() {
        return this.pncVectorOffset;
    }

    public void setPncVectorOffset(PositiveInteger value) {
        this.pncVectorOffset = value;
    }
    
    
    
    @XmlElement(name="ROOT-SOFTWARE-COMPOSITIONS")
    public RootSoftwareCompositions getRootSoftwareCompositions() {
        return this.rootSoftwareCompositions;
    }

    public void setRootSoftwareCompositions(RootSoftwareCompositions value) {
        this.rootSoftwareCompositions = value;
    }
    
    
    
    @XmlElement(name="SYSTEM-VERSION")
    public RevisionLabelString getSystemVersion() {
        return this.systemVersion;
    }

    public void setSystemVersion(RevisionLabelString value) {
        this.systemVersion = value;
    }
    
    
}