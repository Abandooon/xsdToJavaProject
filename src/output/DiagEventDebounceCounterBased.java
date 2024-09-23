package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class DiagEventDebounceCounterBased {

    
    
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
    
    
    
    protected Integer counterDecrementStepSize;
    
    
    
    protected Integer counterFailedThreshold;
    
    
    
    protected Integer counterIncrementStepSize;
    
    
    
    protected Boolean counterJumpDown;
    
    
    
    protected Integer counterJumpDownValue;
    
    
    
    protected Boolean counterJumpUp;
    
    
    
    protected Integer counterJumpUpValue;
    
    
    
    protected Integer counterPassedThreshold;
    
    

    
    
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
    
    
    
    @XmlElement(name="COUNTER-DECREMENT-STEP-SIZE")
    public Integer getCounterDecrementStepSize() {
        return this.counterDecrementStepSize;
    }

    public void setCounterDecrementStepSize(Integer value) {
        this.counterDecrementStepSize = value;
    }
    
    
    
    @XmlElement(name="COUNTER-FAILED-THRESHOLD")
    public Integer getCounterFailedThreshold() {
        return this.counterFailedThreshold;
    }

    public void setCounterFailedThreshold(Integer value) {
        this.counterFailedThreshold = value;
    }
    
    
    
    @XmlElement(name="COUNTER-INCREMENT-STEP-SIZE")
    public Integer getCounterIncrementStepSize() {
        return this.counterIncrementStepSize;
    }

    public void setCounterIncrementStepSize(Integer value) {
        this.counterIncrementStepSize = value;
    }
    
    
    
    @XmlElement(name="COUNTER-JUMP-DOWN")
    public Boolean getCounterJumpDown() {
        return this.counterJumpDown;
    }

    public void setCounterJumpDown(Boolean value) {
        this.counterJumpDown = value;
    }
    
    
    
    @XmlElement(name="COUNTER-JUMP-DOWN-VALUE")
    public Integer getCounterJumpDownValue() {
        return this.counterJumpDownValue;
    }

    public void setCounterJumpDownValue(Integer value) {
        this.counterJumpDownValue = value;
    }
    
    
    
    @XmlElement(name="COUNTER-JUMP-UP")
    public Boolean getCounterJumpUp() {
        return this.counterJumpUp;
    }

    public void setCounterJumpUp(Boolean value) {
        this.counterJumpUp = value;
    }
    
    
    
    @XmlElement(name="COUNTER-JUMP-UP-VALUE")
    public Integer getCounterJumpUpValue() {
        return this.counterJumpUpValue;
    }

    public void setCounterJumpUpValue(Integer value) {
        this.counterJumpUpValue = value;
    }
    
    
    
    @XmlElement(name="COUNTER-PASSED-THRESHOLD")
    public Integer getCounterPassedThreshold() {
        return this.counterPassedThreshold;
    }

    public void setCounterPassedThreshold(Integer value) {
        this.counterPassedThreshold = value;
    }
    
    
}