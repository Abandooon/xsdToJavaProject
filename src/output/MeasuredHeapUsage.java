package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MeasuredHeapUsage {

    
    
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
    
    
    
    protected HardwareConfiguration hardwareConfiguration;
    
    
    
    protected HwElementRef hwElementRef;
    
    
    
    protected SoftwareContext softwareContext;
    
    
    
    protected VariationPoint variationPoint;
    
    
    
    protected PositiveInteger averageMemoryConsumption;
    
    
    
    protected PositiveInteger maximumMemoryConsumption;
    
    
    
    protected PositiveInteger minimumMemoryConsumption;
    
    
    
    protected String testPattern;
    
    

    
    
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
    
    
    
    @XmlElement(name="HARDWARE-CONFIGURATION")
    public HardwareConfiguration getHardwareConfiguration() {
        return this.hardwareConfiguration;
    }

    public void setHardwareConfiguration(HardwareConfiguration value) {
        this.hardwareConfiguration = value;
    }
    
    
    
    @XmlElement(name="HW-ELEMENT-REF")
    public HwElementRef getHwElementRef() {
        return this.hwElementRef;
    }

    public void setHwElementRef(HwElementRef value) {
        this.hwElementRef = value;
    }
    
    
    
    @XmlElement(name="SOFTWARE-CONTEXT")
    public SoftwareContext getSoftwareContext() {
        return this.softwareContext;
    }

    public void setSoftwareContext(SoftwareContext value) {
        this.softwareContext = value;
    }
    
    
    
    @XmlElement(name="VARIATION-POINT")
    public VariationPoint getVariationPoint() {
        return this.variationPoint;
    }

    public void setVariationPoint(VariationPoint value) {
        this.variationPoint = value;
    }
    
    
    
    @XmlElement(name="AVERAGE-MEMORY-CONSUMPTION")
    public PositiveInteger getAverageMemoryConsumption() {
        return this.averageMemoryConsumption;
    }

    public void setAverageMemoryConsumption(PositiveInteger value) {
        this.averageMemoryConsumption = value;
    }
    
    
    
    @XmlElement(name="MAXIMUM-MEMORY-CONSUMPTION")
    public PositiveInteger getMaximumMemoryConsumption() {
        return this.maximumMemoryConsumption;
    }

    public void setMaximumMemoryConsumption(PositiveInteger value) {
        this.maximumMemoryConsumption = value;
    }
    
    
    
    @XmlElement(name="MINIMUM-MEMORY-CONSUMPTION")
    public PositiveInteger getMinimumMemoryConsumption() {
        return this.minimumMemoryConsumption;
    }

    public void setMinimumMemoryConsumption(PositiveInteger value) {
        this.minimumMemoryConsumption = value;
    }
    
    
    
    @XmlElement(name="TEST-PATTERN")
    public String getTestPattern() {
        return this.testPattern;
    }

    public void setTestPattern(String value) {
        this.testPattern = value;
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
    
    public static class HwElementRef extends Ref {
        
        protected HwElementSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public HwElementSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(HwElementSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}