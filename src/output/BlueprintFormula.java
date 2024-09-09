package com.example.generated;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class BlueprintFormula {

    
    
    protected java.lang.String s;
    
    
    
    protected java.lang.String t;
    
    
    
    protected ArrayList<Syscstringref> syscStringRef;
    
    
    
    protected ArrayList<Syscref> syscRef;
    
    
    
    protected ArrayList<Ecucqueryref> ecucQueryRef;
    
    
    
    protected ArrayList<Ecucref> ecucRef;
    
    
    
    protected ArrayList<Verbatim> verbatim;
    
    

    
    
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
    
    
    
    @XmlElement(name="SYSC-STRING-REF")
    public ArrayList<Syscstringref> getSyscStringRef() {
        return this.syscStringRef;
    }

    public void setSyscStringRef(ArrayList<Syscstringref> value) {
        this.syscStringRef = value;
    }
    
    
    
    @XmlElement(name="SYSC-REF")
    public ArrayList<Syscref> getSyscRef() {
        return this.syscRef;
    }

    public void setSyscRef(ArrayList<Syscref> value) {
        this.syscRef = value;
    }
    
    
    
    @XmlElement(name="ECUC-QUERY-REF")
    public ArrayList<Ecucqueryref> getEcucQueryRef() {
        return this.ecucQueryRef;
    }

    public void setEcucQueryRef(ArrayList<Ecucqueryref> value) {
        this.ecucQueryRef = value;
    }
    
    
    
    @XmlElement(name="ECUC-REF")
    public ArrayList<Ecucref> getEcucRef() {
        return this.ecucRef;
    }

    public void setEcucRef(ArrayList<Ecucref> value) {
        this.ecucRef = value;
    }
    
    
    
    @XmlElement(name="VERBATIM")
    public ArrayList<Verbatim> getVerbatim() {
        return this.verbatim;
    }

    public void setVerbatim(ArrayList<Verbatim> value) {
        this.verbatim = value;
    }
    
    


    
    public static class SyscStringRef extends Ref {
        
        protected SwSystemconstSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwSystemconstSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwSystemconstSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class SyscRef extends Ref {
        
        protected SwSystemconstSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public SwSystemconstSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(SwSystemconstSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class EcucQueryRef extends Ref {
        
        protected EcucQuerySubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public EcucQuerySubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(EcucQuerySubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
    public static class EcucRef extends Ref {
        
        protected EcucDefinitionElementSubtypesEnum dest;
        

        
        @XmlAttribute(name="DEST")
        public EcucDefinitionElementSubtypesEnum getDest() {
            return this.dest;
        }

        public void setDest(EcucDefinitionElementSubtypesEnum value) {
            this.dest = value;
        }
        

        
    }
    
}