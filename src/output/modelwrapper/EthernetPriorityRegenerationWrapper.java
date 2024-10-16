package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class EthernetPriorityRegenerationWrapper {

    
    private EthernetPriorityRegeneration ethernetPriorityRegeneration;

    public EthernetPriorityRegenerationWrapper(EthernetPriorityRegeneration ethernetPriorityRegeneration) {
        this.ethernetPriorityRegeneration = ethernetPriorityRegeneration;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ethernetPriorityRegeneration.getS())) {
            
            return ethernetPriorityRegeneration.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ethernetPriorityRegeneration.getT())) {
            
            return ethernetPriorityRegeneration.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ethernetPriorityRegeneration.getShortName())) {
            
            return new IdentifierWrapper(ethernetPriorityRegeneration.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ethernetPriorityRegeneration.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ethernetPriorityRegeneration.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getIngressPriority() {
        
        if (CollUtil.isNotEmpty(ethernetPriorityRegeneration.getIngressPriority())) {
            
            return new PositiveIntegerWrapper(ethernetPriorityRegeneration.getIngressPriority());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getRegeneratedPriority() {
        
        if (CollUtil.isNotEmpty(ethernetPriorityRegeneration.getRegeneratedPriority())) {
            
            return new PositiveIntegerWrapper(ethernetPriorityRegeneration.getRegeneratedPriority());
            
        } else {
            return null;
        }
        
    }




    


    
}