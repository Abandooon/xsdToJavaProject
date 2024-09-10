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
    public EncapsulatedEntryRef getEncapsulatedEntryRef() {
        return this.encapsulatedEntryRef;
    }

    public void setEncapsulatedEntryRef(EncapsulatedEntryRef value) {
        this.encapsulatedEntryRef = value;
    }
    
    
    
    @XmlElement(name="IS-REENTRANT")
    public Boolean getIsReentrant() {
        return this.isReentrant;
    }

    public void setIsReentrant(Boolean value) {
        this.isReentrant = value;
    }
    
    
    
    @XmlElement(name="IS-SYNCHRONOUS")
    public Boolean getIsSynchronous() {
        return this.isSynchronous;
    }

    public void setIsSynchronous(Boolean value) {
        this.isSynchronous = value;
    }
    
    
    
    @XmlElement(name="ALL-CHANNELS-REFS")
    public AllChannelsRefs getAllChannelsRefs() {
        return this.allChannelsRefs;
    }

    public void setAllChannelsRefs(AllChannelsRefs value) {
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
        
        protected ArrayList<AllChannelsRef> allChannelsRef;
        

        
        @XmlElement(name="ALL-CHANNELS-REF")
        public ArrayList<AllChannelsRef> getAllChannelsRef() {
            return this.allChannelsRef;
        }

        public void setAllChannelsRef(ArrayList<AllChannelsRef> value) {
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