package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class ProvidedServiceInstance {

    
    
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
    
    
    
    protected RoutingGroupRefs routingGroupRefs;
    
    
    
    protected EventHandlers eventHandlers;
    
    
    
    protected PositiveInteger instanceIdentifier;
    
    
    
    protected PositiveInteger priority;
    
    
    
    protected SdServerConfig sdServerConfig;
    
    
    
    protected PositiveInteger serviceIdentifier;
    
    

    
    
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
    
    
    
    @XmlElement(name="ROUTING-GROUP-REFS")
    public RoutingGroupRefs getRoutingGroupRefs() {
        return this.routingGroupRefs;
    }

    public void setRoutingGroupRefs(RoutingGroupRefs value) {
        this.routingGroupRefs = value;
    }
    
    
    
    @XmlElement(name="EVENT-HANDLERS")
    public EventHandlers getEventHandlers() {
        return this.eventHandlers;
    }

    public void setEventHandlers(EventHandlers value) {
        this.eventHandlers = value;
    }
    
    
    
    @XmlElement(name="INSTANCE-IDENTIFIER")
    public PositiveInteger getInstanceIdentifier() {
        return this.instanceIdentifier;
    }

    public void setInstanceIdentifier(PositiveInteger value) {
        this.instanceIdentifier = value;
    }
    
    
    
    @XmlElement(name="PRIORITY")
    public PositiveInteger getPriority() {
        return this.priority;
    }

    public void setPriority(PositiveInteger value) {
        this.priority = value;
    }
    
    
    
    @XmlElement(name="SD-SERVER-CONFIG")
    public SdServerConfig getSdServerConfig() {
        return this.sdServerConfig;
    }

    public void setSdServerConfig(SdServerConfig value) {
        this.sdServerConfig = value;
    }
    
    
    
    @XmlElement(name="SERVICE-IDENTIFIER")
    public PositiveInteger getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public void setServiceIdentifier(PositiveInteger value) {
        this.serviceIdentifier = value;
    }
    
    
}