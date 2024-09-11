package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class McDataInstance {

    
    
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
    
    
    
    protected PositiveInteger arraySize;
    
    
    
    protected McdIdentifier displayIdentifier;
    
    
    
    protected FlatMapEntryRef flatMapEntryRef;
    
    
    
    protected ImplementationElementInParameterInstanceRef instanceInMemory;
    
    
    
    protected McDataAccessDetails mcDataAccessDetails;
    
    
    
    protected McDataAssignments mcDataAssignments;
    
    
    
    protected SwDataDefProps resultingProperties;
    
    
    
    protected Identifier role;
    
    
    
    protected SubElements subElements;
    
    
    
    protected SymbolString symbol;
    
    
    
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
    
    
    
    @XmlElement(name="ARRAY-SIZE")
    public PositiveInteger getArraySize() {
        return this.arraySize;
    }

    public void setArraySize(PositiveInteger value) {
        this.arraySize = value;
    }
    
    
    
    @XmlElement(name="DISPLAY-IDENTIFIER")
    public McdIdentifier getDisplayIdentifier() {
        return this.displayIdentifier;
    }

    public void setDisplayIdentifier(McdIdentifier value) {
        this.displayIdentifier = value;
    }
    
    
    
    @XmlElement(name="FLAT-MAP-ENTRY-REF")
    public FlatMapEntryRef getFlatMapEntryRef() {
        return this.flatMapEntryRef;
    }

    public void setFlatMapEntryRef(FlatMapEntryRef value) {
        this.flatMapEntryRef = value;
    }
    
    
    
    @XmlElement(name="INSTANCE-IN-MEMORY")
    public ImplementationElementInParameterInstanceRef getInstanceInMemory() {
        return this.instanceInMemory;
    }

    public void setInstanceInMemory(ImplementationElementInParameterInstanceRef value) {
        this.instanceInMemory = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-ACCESS-DETAILS")
    public McDataAccessDetails getMcDataAccessDetails() {
        return this.mcDataAccessDetails;
    }

    public void setMcDataAccessDetails(McDataAccessDetails value) {
        this.mcDataAccessDetails = value;
    }
    
    
    
    @XmlElement(name="MC-DATA-ASSIGNMENTS")
    public McDataAssignments getMcDataAssignments() {
        return this.mcDataAssignments;
    }

    public void setMcDataAssignments(McDataAssignments value) {
        this.mcDataAssignments = value;
    }
    
    
    
    @XmlElement(name="RESULTING-PROPERTIES")
    public SwDataDefProps getResultingProperties() {
        return this.resultingProperties;
    }

    public void setResultingProperties(SwDataDefProps value) {
        this.resultingProperties = value;
    }
    
    
    
    @XmlElement(name="ROLE")
    public Identifier getRole() {
        return this.role;
    }

    public void setRole(Identifier value) {
        this.role = value;
    }
    
    
    
    @XmlElement(name="SUB-ELEMENTS")
    public SubElements getSubElements() {
        return this.subElements;
    }

    public void setSubElements(SubElements value) {
        this.subElements = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public SymbolString getSymbol() {
        return this.symbol;
    }

    public void setSymbol(SymbolString value) {
        this.symbol = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    


    
    public static class ShortNameFragments {
        

        

        
    }
    
    public static class Annotations {
        

        

        
    }
    
    public static class FlatMapEntryRef extends Ref {
        
        protected FlatInstanceDescriptorSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public FlatInstanceDescriptorSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(FlatInstanceDescriptorSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class McDataAssignments {
        

        

        
    }
    
    public static class SubElements {
        

        

        
    }
    
}