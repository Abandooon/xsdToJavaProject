package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwElement {

    
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
    
    protected HwTypeRef hwTypeRef;
    
    protected HwCategoryRefs hwCategoryRefs;
    
    protected HwAttributeValues hwAttributeValues;
    
    protected NestedElements nestedElements;
    
    protected HwPinGroups hwPinGroups;
    
    protected HwElementConnections hwElementConnections;
    

    
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
    
    @XmlElement(name="HW-TYPE-REF")
    public HwTypeRef getHwTypeRef() {
        return this.hwTypeRef;
    }

    public void setHwTypeRef(HwTypeRef value) {
        this.hwTypeRef = value;
    }
    
    @XmlElement(name="HW-CATEGORY-REFS")
    public HwCategoryRefs getHwCategoryRefs() {
        return this.hwCategoryRefs;
    }

    public void setHwCategoryRefs(HwCategoryRefs value) {
        this.hwCategoryRefs = value;
    }
    
    @XmlElement(name="HW-ATTRIBUTE-VALUES")
    public HwAttributeValues getHwAttributeValues() {
        return this.hwAttributeValues;
    }

    public void setHwAttributeValues(HwAttributeValues value) {
        this.hwAttributeValues = value;
    }
    
    @XmlElement(name="NESTED-ELEMENTS")
    public NestedElements getNestedElements() {
        return this.nestedElements;
    }

    public void setNestedElements(NestedElements value) {
        this.nestedElements = value;
    }
    
    @XmlElement(name="HW-PIN-GROUPS")
    public HwPinGroups getHwPinGroups() {
        return this.hwPinGroups;
    }

    public void setHwPinGroups(HwPinGroups value) {
        this.hwPinGroups = value;
    }
    
    @XmlElement(name="HW-ELEMENT-CONNECTIONS")
    public HwElementConnections getHwElementConnections() {
        return this.hwElementConnections;
    }

    public void setHwElementConnections(HwElementConnections value) {
        this.hwElementConnections = value;
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
    
    public static class HwTypeRef extends Ref {
        
        protected HwTypeSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public HwTypeSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(HwTypeSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class HwCategoryRefs {
        
        protected ArrayList<HwCategoryRef> hwCategoryRef;
        

        
        @XmlElement(name="HW-CATEGORY-REF")
        public ArrayList<HwCategoryRef> getHwCategoryRef() {
            return this.hwCategoryRef;
        }

        public void setHwCategoryRef(ArrayList<HwCategoryRef> value) {
            this.hwCategoryRef = value;
        }
        

        
        
        public static class HwCategoryRef extends Ref {
            
            protected HwCategorySubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public HwCategorySubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(HwCategorySubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
    public static class HwAttributeValues {
        
        protected ArrayList<HwAttributeValue> hwAttributeValue;
        

        
        @XmlElement(name="HW-ATTRIBUTE-VALUE")
        public ArrayList<HwAttributeValue> getHwAttributeValue() {
            return this.hwAttributeValue;
        }

        public void setHwAttributeValue(ArrayList<HwAttributeValue> value) {
            this.hwAttributeValue = value;
        }
        

        
    }
    
    public static class NestedElements {
        
        protected ArrayList<HwElementRefConditional> hwElementRefConditional;
        

        
        @XmlElement(name="HW-ELEMENT-REF-CONDITIONAL")
        public ArrayList<HwElementRefConditional> getHwElementRefConditional() {
            return this.hwElementRefConditional;
        }

        public void setHwElementRefConditional(ArrayList<HwElementRefConditional> value) {
            this.hwElementRefConditional = value;
        }
        

        
    }
    
    public static class HwPinGroups {
        
        protected ArrayList<HwPinGroup> hwPinGroup;
        

        
        @XmlElement(name="HW-PIN-GROUP")
        public ArrayList<HwPinGroup> getHwPinGroup() {
            return this.hwPinGroup;
        }

        public void setHwPinGroup(ArrayList<HwPinGroup> value) {
            this.hwPinGroup = value;
        }
        

        
    }
    
    public static class HwElementConnections {
        
        protected ArrayList<HwElementConnector> hwElementConnector;
        

        
        @XmlElement(name="HW-ELEMENT-CONNECTOR")
        public ArrayList<HwElementConnector> getHwElementConnector() {
            return this.hwElementConnector;
        }

        public void setHwElementConnector(ArrayList<HwElementConnector> value) {
            this.hwElementConnector = value;
        }
        

        
    }
    
}