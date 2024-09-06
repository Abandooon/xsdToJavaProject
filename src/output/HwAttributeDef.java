package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class HwAttributeDef {

    
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
    
    protected HwAttributeLiterals hwAttributeLiterals;
    
    protected Boolean isRequired;
    
    protected UnitRef unitRef;
    

    
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
    
    @XmlElement(name="HW-ATTRIBUTE-LITERALS")
    public HwAttributeLiterals getHwAttributeLiterals() {
        return this.hwAttributeLiterals;
    }

    public void setHwAttributeLiterals(HwAttributeLiterals value) {
        this.hwAttributeLiterals = value;
    }
    
    @XmlElement(name="IS-REQUIRED")
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }
    
    @XmlElement(name="UNIT-REF")
    public UnitRef getUnitRef() {
        return this.unitRef;
    }

    public void setUnitRef(UnitRef value) {
        this.unitRef = value;
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
    
    public static class HwAttributeLiterals {
        
        protected ArrayList<HwAttributeLiteralDef> hwAttributeLiteralDef;
        

        
        @XmlElement(name="HW-ATTRIBUTE-LITERAL-DEF")
        public ArrayList<HwAttributeLiteralDef> getHwAttributeLiteralDef() {
            return this.hwAttributeLiteralDef;
        }

        public void setHwAttributeLiteralDef(ArrayList<HwAttributeLiteralDef> value) {
            this.hwAttributeLiteralDef = value;
        }
        

        
    }
    
    public static class UnitRef extends Ref {
        
        protected UnitSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public UnitSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(UnitSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}