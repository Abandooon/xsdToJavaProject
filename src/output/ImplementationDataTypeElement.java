package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ImplementationDataTypeElement {

    
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
    
    protected PositiveIntegerValueVariationPoint arraySize;
    
    protected ArraySizeHandlingEnum arraySizeHandling;
    
    protected ArraySizeSemanticsEnum arraySizeSemantics;
    
    protected SubElements subElements;
    
    protected SwDataDefProps swDataDefProps;
    
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
    public PositiveIntegerValueVariationPoint getArraySize() {
        return this.arraySize;
    }

    public void setArraySize(PositiveIntegerValueVariationPoint value) {
        this.arraySize = value;
    }
    
    @XmlElement(name="ARRAY-SIZE-HANDLING")
    public ArraySizeHandlingEnum getArraySizeHandling() {
        return this.arraySizeHandling;
    }

    public void setArraySizeHandling(ArraySizeHandlingEnum value) {
        this.arraySizeHandling = value;
    }
    
    @XmlElement(name="ARRAY-SIZE-SEMANTICS")
    public ArraySizeSemanticsEnum getArraySizeSemantics() {
        return this.arraySizeSemantics;
    }

    public void setArraySizeSemantics(ArraySizeSemanticsEnum value) {
        this.arraySizeSemantics = value;
    }
    
    @XmlElement(name="SUB-ELEMENTS")
    public SubElements getSubElements() {
        return this.subElements;
    }

    public void setSubElements(SubElements value) {
        this.subElements = value;
    }
    
    @XmlElement(name="SW-DATA-DEF-PROPS")
    public SwDataDefProps getSwDataDefProps() {
        return this.swDataDefProps;
    }

    public void setSwDataDefProps(SwDataDefProps value) {
        this.swDataDefProps = value;
    }
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    

    
    public static class ShortNameFragments {
        
        protected ArrayList<ShortNameFragment> shortNameFragment;
        

        
        @XmlElement(name="SHORT-NAME-FRAGMENT")
        public ArrayList<ShortNameFragment> getShortNameFragment() {
            return this.shortNameFragment;
        }

        public void setShortNameFragment(ArrayList<ShortNameFragment> value) {
            this.shortNameFragment = value;
        }
        

        
    }
    
    public static class Annotations {
        
        protected ArrayList<Annotation> annotation;
        

        
        @XmlElement(name="ANNOTATION")
        public ArrayList<Annotation> getAnnotation() {
            return this.annotation;
        }

        public void setAnnotation(ArrayList<Annotation> value) {
            this.annotation = value;
        }
        

        
    }
    
    public static class SubElements {
        
        protected ArrayList<ImplementationDataTypeElement> implementationDataTypeElement;
        

        
        @XmlElement(name="IMPLEMENTATION-DATA-TYPE-ELEMENT")
        public ArrayList<ImplementationDataTypeElement> getImplementationDataTypeElement() {
            return this.implementationDataTypeElement;
        }

        public void setImplementationDataTypeElement(ArrayList<ImplementationDataTypeElement> value) {
            this.implementationDataTypeElement = value;
        }
        

        
    }
    
}