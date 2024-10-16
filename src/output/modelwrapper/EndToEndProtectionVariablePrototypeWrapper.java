package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class EndToEndProtectionVariablePrototypeWrapper {

    
    private EndToEndProtectionVariablePrototype endToEndProtectionVariablePrototype;

    public EndToEndProtectionVariablePrototypeWrapper(EndToEndProtectionVariablePrototype endToEndProtectionVariablePrototype) {
        this.endToEndProtectionVariablePrototype = endToEndProtectionVariablePrototype;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionVariablePrototype.getS())) {
            
            return endToEndProtectionVariablePrototype.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionVariablePrototype.getT())) {
            
            return endToEndProtectionVariablePrototype.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeInSystemInstanceRefWrapper> getReceiverIrefs() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionVariablePrototype.getReceiverIrefs())) {
            ArrayList<VariableDataPrototypeInSystemInstanceRef> originalList = endToEndProtectionVariablePrototype.getReceiverIrefs();
            ArrayList<VariableDataPrototypeInSystemInstanceRefWrapper> wrapperList = (ArrayList<VariableDataPrototypeInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariableDataPrototypeInSystemInstanceRefWrapper getSenderIref() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionVariablePrototype.getSenderIref())) {
            
            return new VariableDataPrototypeInSystemInstanceRefWrapper(endToEndProtectionVariablePrototype.getSenderIref());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionVariablePrototype.getShortLabel())) {
            
            return new IdentifierWrapper(endToEndProtectionVariablePrototype.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionVariablePrototype.getVariationPoint())) {
            
            return new VariationPointWrapper(endToEndProtectionVariablePrototype.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}