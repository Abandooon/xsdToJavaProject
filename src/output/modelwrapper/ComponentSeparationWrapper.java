package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ComponentSeparationWrapper {

    
    private ComponentSeparation componentSeparation;

    public ComponentSeparationWrapper(ComponentSeparation componentSeparation) {
        this.componentSeparation = componentSeparation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(componentSeparation.getS())) {
            
            return componentSeparation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(componentSeparation.getT())) {
            
            return componentSeparation.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(componentSeparation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(componentSeparation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(componentSeparation.getVariationPoint())) {
            
            return new VariationPointWrapper(componentSeparation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public MappingScopeEnumWrapper getMappingScope() {
        
        if (CollUtil.isNotEmpty(componentSeparation.getMappingScope())) {
            
            return new MappingScopeEnumWrapper(componentSeparation.getMappingScope());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ComponentInSystemInstanceRefWrapper> getSeparatedComponentIrefs() {
        
        if (CollUtil.isNotEmpty(componentSeparation.getSeparatedComponentIrefs())) {
            ArrayList<ComponentInSystemInstanceRef> originalList = componentSeparation.getSeparatedComponentIrefs();
            ArrayList<ComponentInSystemInstanceRefWrapper> wrapperList = (ArrayList<ComponentInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new ComponentInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}