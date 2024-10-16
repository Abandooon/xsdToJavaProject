package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class McSwEmulationMethodSupportWrapper {

    
    private McSwEmulationMethodSupport mcSwEmulationMethodSupport;

    public McSwEmulationMethodSupportWrapper(McSwEmulationMethodSupport mcSwEmulationMethodSupport) {
        this.mcSwEmulationMethodSupport = mcSwEmulationMethodSupport;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getS())) {
            
            return mcSwEmulationMethodSupport.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getT())) {
            
            return mcSwEmulationMethodSupport.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getShortLabel())) {
            
            return new IdentifierWrapper(mcSwEmulationMethodSupport.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getCategory())) {
            
            return new IdentifierWrapper(mcSwEmulationMethodSupport.getCategory());
            
        } else {
            return null;
        }
        
    }

    public BaseReferenceRefWrapper getBaseReferenceRef() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getBaseReferenceRef())) {
            
            return new BaseReferenceRefWrapper(mcSwEmulationMethodSupport.getBaseReferenceRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<McParameterElementGroupWrapper> getElementGroups() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getElementGroups())) {
            ArrayList<McParameterElementGroup> originalList = mcSwEmulationMethodSupport.getElementGroups();
            ArrayList<McParameterElementGroupWrapper> wrapperList = (ArrayList<McParameterElementGroupWrapper>)originalList.stream()
                .map(item -> new McParameterElementGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ReferenceTableRefWrapper getReferenceTableRef() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getReferenceTableRef())) {
            
            return new ReferenceTableRefWrapper(mcSwEmulationMethodSupport.getReferenceTableRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(mcSwEmulationMethodSupport.getVariationPoint())) {
            
            return new VariationPointWrapper(mcSwEmulationMethodSupport.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}