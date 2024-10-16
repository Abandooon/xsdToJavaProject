package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwcToEcuMappingConstraintWrapper {

    
    private SwcToEcuMappingConstraint swcToEcuMappingConstraint;

    public SwcToEcuMappingConstraintWrapper(SwcToEcuMappingConstraint swcToEcuMappingConstraint) {
        this.swcToEcuMappingConstraint = swcToEcuMappingConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getS())) {
            
            return swcToEcuMappingConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getT())) {
            
            return swcToEcuMappingConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcToEcuMappingConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(swcToEcuMappingConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ComponentInSystemInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getComponentIref())) {
            
            return new ComponentInSystemInstanceRefWrapper(swcToEcuMappingConstraint.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuInstanceRefWrapper> getEcuInstanceRefs() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getEcuInstanceRefs())) {
            ArrayList<EcuInstanceRef> originalList = swcToEcuMappingConstraint.getEcuInstanceRefs();
            ArrayList<EcuInstanceRefWrapper> wrapperList = (ArrayList<EcuInstanceRefWrapper>)originalList.stream()
                .map(item -> new EcuInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SwcToEcuMappingConstraintTypeWrapper getSwcToEcuMappingConstraintType() {
        
        if (CollUtil.isNotEmpty(swcToEcuMappingConstraint.getSwcToEcuMappingConstraintType())) {
            
            return new SwcToEcuMappingConstraintTypeWrapper(swcToEcuMappingConstraint.getSwcToEcuMappingConstraintType());
            
        } else {
            return null;
        }
        
    }




    


    
}