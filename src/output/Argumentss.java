package com.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlRootElement;

public class Argumentss {

    
    
    protected ArrayList<RuleArguments> ruleArgumentss;
    
    

    
    
    @XmlElement(name="RULE-ARGUMENTS")
    public ArrayList<RuleArguments> getRuleArgumentss() {
        return this.ruleArgumentss;
    }

    public void setRuleArgumentss(ArrayList<RuleArguments> value) {
        this.ruleArgumentss = value;
    }
    
    
}