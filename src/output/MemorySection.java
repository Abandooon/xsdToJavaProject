package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class MemorySection {

    
    
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
    
    
    
    protected AlignmentType alignment;
    
    
    
    protected ExecutableEntityRefs executableEntityRefs;
    
    
    
    protected CIdentifier memClassSymbol;
    
    
    
    protected Options options;
    
    
    
    protected PrefixRef prefixRef;
    
    
    
    protected PositiveInteger size;
    
    
    
    protected SwAddrmethodRef swAddrmethodRef;
    
    
    
    protected Identifier symbol;
    
    
    
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
    
    
    
    @XmlElement(name="ALIGNMENT")
    public AlignmentType getAlignment() {
        return this.alignment;
    }

    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }
    
    
    
    @XmlElement(name="EXECUTABLE-ENTITY-REFS")
    public ExecutableEntityRefs getExecutableEntityRefs() {
        return this.executableEntityRefs;
    }

    public void setExecutableEntityRefs(ExecutableEntityRefs value) {
        this.executableEntityRefs = value;
    }
    
    
    
    @XmlElement(name="MEM-CLASS-SYMBOL")
    public CIdentifier getMemClassSymbol() {
        return this.memClassSymbol;
    }

    public void setMemClassSymbol(CIdentifier value) {
        this.memClassSymbol = value;
    }
    
    
    
    @XmlElement(name="OPTIONS")
    public Options getOptions() {
        return this.options;
    }

    public void setOptions(Options value) {
        this.options = value;
    }
    
    
    
    @XmlElement(name="PREFIX-REF")
    public PrefixRef getPrefixRef() {
        return this.prefixRef;
    }

    public void setPrefixRef(PrefixRef value) {
        this.prefixRef = value;
    }
    
    
    
    @XmlElement(name="SIZE")
    public PositiveInteger getSize() {
        return this.size;
    }

    public void setSize(PositiveInteger value) {
        this.size = value;
    }
    
    
    
    @XmlElement(name="SW-ADDRMETHOD-REF")
    public SwAddrmethodRef getSwAddrmethodRef() {
        return this.swAddrmethodRef;
    }

    public void setSwAddrmethodRef(SwAddrmethodRef value) {
        this.swAddrmethodRef = value;
    }
    
    
    
    @XmlElement(name="SYMBOL")
    public Identifier getSymbol() {
        return this.symbol;
    }

    public void setSymbol(Identifier value) {
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
    
    public static class ExecutableEntityRefs {
        
        protected ArrayList<ExecutableEntityRef> executableEntityRef;
        

        
        @XmlElement(name="EXECUTABLE-ENTITY-REF")
        public ArrayList<ExecutableEntityRef> getExecutableEntityRef() {
            return this.executableEntityRef;
        }

        public void setExecutableEntityRef(ArrayList<ExecutableEntityRef> value) {
            this.executableEntityRef = value;
        }
        

        
        
        public static class ExecutableEntityRef extends Ref {
            
            protected ExecutableEntitySubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public ExecutableEntitySubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(ExecutableEntitySubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
    public static class Options {
        
        protected ArrayList<Identifier> option;
        

        
        @XmlElement(name="OPTION")
        public ArrayList<Identifier> getOption() {
            return this.option;
        }

        public void setOption(ArrayList<Identifier> value) {
            this.option = value;
        }
        

        
    }
    
    public static class PrefixRef extends Ref {
        
        protected SectionNamePrefixSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SectionNamePrefixSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SectionNamePrefixSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class SwAddrmethodRef extends Ref {
        
        protected SwAddrMethodSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwAddrMethodSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwAddrMethodSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}