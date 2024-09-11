package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ResourceConsumption {

    
    
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
    
    
    
    protected ExecutionTimes executionTimes;
    
    
    
    protected HeapUsages heapUsages;
    
    
    
    protected MemorySections memorySections;
    
    
    
    protected SectionNamePrefixs sectionNamePrefixs;
    
    
    
    protected StackUsages stackUsages;
    
    

    
    
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
    
    
    
    @XmlElement(name="EXECUTION-TIMES")
    public ExecutionTimes getExecutionTimes() {
        return this.executionTimes;
    }

    public void setExecutionTimes(ExecutionTimes value) {
        this.executionTimes = value;
    }
    
    
    
    @XmlElement(name="HEAP-USAGES")
    public HeapUsages getHeapUsages() {
        return this.heapUsages;
    }

    public void setHeapUsages(HeapUsages value) {
        this.heapUsages = value;
    }
    
    
    
    @XmlElement(name="MEMORY-SECTIONS")
    public MemorySections getMemorySections() {
        return this.memorySections;
    }

    public void setMemorySections(MemorySections value) {
        this.memorySections = value;
    }
    
    
    
    @XmlElement(name="SECTION-NAME-PREFIXS")
    public SectionNamePrefixs getSectionNamePrefixs() {
        return this.sectionNamePrefixs;
    }

    public void setSectionNamePrefixs(SectionNamePrefixs value) {
        this.sectionNamePrefixs = value;
    }
    
    
    
    @XmlElement(name="STACK-USAGES")
    public StackUsages getStackUsages() {
        return this.stackUsages;
    }

    public void setStackUsages(StackUsages value) {
        this.stackUsages = value;
    }
    
    


    
    public static class ShortNameFragments {
        

        

        
    }
    
    public static class Annotations {
        

        

        
    }
    
    public static class ExecutionTimes {
        

        

        
    }
    
    public static class HeapUsages {
        

        

        
    }
    
    public static class MemorySections {
        

        

        
    }
    
    public static class SectionNamePrefixs {
        

        

        
    }
    
    public static class StackUsages {
        

        

        
    }
    
}