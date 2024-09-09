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
    
    public static class ExecutionTimes {
        
        protected ArrayList<AnalyzedExecutionTime> analyzedExecutionTime;
        
        protected ArrayList<MeasuredExecutionTime> measuredExecutionTime;
        
        protected ArrayList<RoughEstimateOfExecutionTime> roughEstimateOfExecutionTime;
        
        protected ArrayList<SimulatedExecutionTime> simulatedExecutionTime;
        

        
        @XmlElement(name="ANALYZED-EXECUTION-TIME")
        public ArrayList<AnalyzedExecutionTime> getAnalyzedExecutionTime() {
            return this.analyzedExecutionTime;
        }

        public void setAnalyzedExecutionTime(ArrayList<AnalyzedExecutionTime> value) {
            this.analyzedExecutionTime = value;
        }
        
        @XmlElement(name="MEASURED-EXECUTION-TIME")
        public ArrayList<MeasuredExecutionTime> getMeasuredExecutionTime() {
            return this.measuredExecutionTime;
        }

        public void setMeasuredExecutionTime(ArrayList<MeasuredExecutionTime> value) {
            this.measuredExecutionTime = value;
        }
        
        @XmlElement(name="ROUGH-ESTIMATE-OF-EXECUTION-TIME")
        public ArrayList<RoughEstimateOfExecutionTime> getRoughEstimateOfExecutionTime() {
            return this.roughEstimateOfExecutionTime;
        }

        public void setRoughEstimateOfExecutionTime(ArrayList<RoughEstimateOfExecutionTime> value) {
            this.roughEstimateOfExecutionTime = value;
        }
        
        @XmlElement(name="SIMULATED-EXECUTION-TIME")
        public ArrayList<SimulatedExecutionTime> getSimulatedExecutionTime() {
            return this.simulatedExecutionTime;
        }

        public void setSimulatedExecutionTime(ArrayList<SimulatedExecutionTime> value) {
            this.simulatedExecutionTime = value;
        }
        

        
    }
    
    public static class HeapUsages {
        
        protected ArrayList<MeasuredHeapUsage> measuredHeapUsage;
        
        protected ArrayList<RoughEstimateHeapUsage> roughEstimateHeapUsage;
        
        protected ArrayList<WorstCaseHeapUsage> worstCaseHeapUsage;
        

        
        @XmlElement(name="MEASURED-HEAP-USAGE")
        public ArrayList<MeasuredHeapUsage> getMeasuredHeapUsage() {
            return this.measuredHeapUsage;
        }

        public void setMeasuredHeapUsage(ArrayList<MeasuredHeapUsage> value) {
            this.measuredHeapUsage = value;
        }
        
        @XmlElement(name="ROUGH-ESTIMATE-HEAP-USAGE")
        public ArrayList<RoughEstimateHeapUsage> getRoughEstimateHeapUsage() {
            return this.roughEstimateHeapUsage;
        }

        public void setRoughEstimateHeapUsage(ArrayList<RoughEstimateHeapUsage> value) {
            this.roughEstimateHeapUsage = value;
        }
        
        @XmlElement(name="WORST-CASE-HEAP-USAGE")
        public ArrayList<WorstCaseHeapUsage> getWorstCaseHeapUsage() {
            return this.worstCaseHeapUsage;
        }

        public void setWorstCaseHeapUsage(ArrayList<WorstCaseHeapUsage> value) {
            this.worstCaseHeapUsage = value;
        }
        

        
    }
    
    public static class MemorySections {
        
        protected ArrayList<MemorySection> memorySection;
        

        
        @XmlElement(name="MEMORY-SECTION")
        public ArrayList<MemorySection> getMemorySection() {
            return this.memorySection;
        }

        public void setMemorySection(ArrayList<MemorySection> value) {
            this.memorySection = value;
        }
        

        
    }
    
    public static class SectionNamePrefixs {
        
        protected ArrayList<SectionNamePrefix> sectionNamePrefix;
        

        
        @XmlElement(name="SECTION-NAME-PREFIX")
        public ArrayList<SectionNamePrefix> getSectionNamePrefix() {
            return this.sectionNamePrefix;
        }

        public void setSectionNamePrefix(ArrayList<SectionNamePrefix> value) {
            this.sectionNamePrefix = value;
        }
        

        
    }
    
    public static class StackUsages {
        
        protected ArrayList<MeasuredStackUsage> measuredStackUsage;
        
        protected ArrayList<RoughEstimateStackUsage> roughEstimateStackUsage;
        
        protected ArrayList<WorstCaseStackUsage> worstCaseStackUsage;
        

        
        @XmlElement(name="MEASURED-STACK-USAGE")
        public ArrayList<MeasuredStackUsage> getMeasuredStackUsage() {
            return this.measuredStackUsage;
        }

        public void setMeasuredStackUsage(ArrayList<MeasuredStackUsage> value) {
            this.measuredStackUsage = value;
        }
        
        @XmlElement(name="ROUGH-ESTIMATE-STACK-USAGE")
        public ArrayList<RoughEstimateStackUsage> getRoughEstimateStackUsage() {
            return this.roughEstimateStackUsage;
        }

        public void setRoughEstimateStackUsage(ArrayList<RoughEstimateStackUsage> value) {
            this.roughEstimateStackUsage = value;
        }
        
        @XmlElement(name="WORST-CASE-STACK-USAGE")
        public ArrayList<WorstCaseStackUsage> getWorstCaseStackUsage() {
            return this.worstCaseStackUsage;
        }

        public void setWorstCaseStackUsage(ArrayList<WorstCaseStackUsage> value) {
            this.worstCaseStackUsage = value;
        }
        

        
    }
    
}