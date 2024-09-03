package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BswModuleClientServerEntry {

    
    protected java.lang.String s;
    
    protected java.lang.String t;
    
    protected EncapsulatedEntryRef encapsulatedEntryRef;
    
    protected Boolean isReentrant;
    
    protected Boolean isSynchronous;
    
    protected AllChannelsRefs allChannelsRefs;
    

    
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
    
    @XmlElement(name="ENCAPSULATED-ENTRY-REF")
    public EncapsulatedEntryRef getEncapsulatedentryref() {
        return this.encapsulatedEntryRef;
    }

    public void setEncapsulatedentryref(EncapsulatedEntryRef value) {
        this.encapsulatedEntryRef = value;
    }
    
    @XmlElement(name="IS-REENTRANT")
    public Boolean getIsreentrant() {
        return this.isReentrant;
    }

    public void setIsreentrant(Boolean value) {
        this.isReentrant = value;
    }
    
    @XmlElement(name="IS-SYNCHRONOUS")
    public Boolean getIssynchronous() {
        return this.isSynchronous;
    }

    public void setIssynchronous(Boolean value) {
        this.isSynchronous = value;
    }
    
    @XmlElement(name="ALL-CHANNELS-REFS")
    public AllChannelsRefs getAllchannelsrefs() {
        return this.allChannelsRefs;
    }

    public void setAllchannelsrefs(AllChannelsRefs value) {
        this.allChannelsRefs = value;
    }
    

    
    public static class EncapsulatedEntryRef extends Ref {
        
        protected BswModuleEntrySubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public BswModuleEntrySubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(BswModuleEntrySubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class AllChannelsRefs {
        
        protected AllChannelsRef allChannelsRef;
        

        
        @XmlElement(name="ALL-CHANNELS-REF")
        public AllChannelsRef getAllchannelsref() {
            return this.allChannelsRef;
        }

        public void setAllchannelsref(AllChannelsRef value) {
            this.allChannelsRef = value;
        }
        

        
        
        public static class AllChannelsRef extends Ref {
            
            protected CommunicationClusterSubtypesEnum dest;
            

            
            @XmlAttribute(name="DEST")
            public CommunicationClusterSubtypesEnum getDest() {
                return this.dest;
            }

            public void setDest(CommunicationClusterSubtypesEnum value) {
                this.dest = value;
            }
            
        }
        
        
    }
    
}