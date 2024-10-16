package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class ComponentClusteringWrapper {

    
    private ComponentClustering componentClustering;

    public ComponentClusteringWrapper(ComponentClustering componentClustering) {
        this.componentClustering = componentClustering;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(componentClustering.getS())) {
            
            return componentClustering.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(componentClustering.getT())) {
            
            return componentClustering.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(componentClustering.getIntroduction())) {
            
            return new DocumentationBlockWrapper(componentClustering.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(componentClustering.getVariationPoint())) {
            
            return new VariationPointWrapper(componentClustering.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ComponentInSystemInstanceRefWrapper> getClusteredComponentIrefs() {
        
        if (CollUtil.isNotEmpty(componentClustering.getClusteredComponentIrefs())) {
            ArrayList<ComponentInSystemInstanceRef> originalList = componentClustering.getClusteredComponentIrefs();
            ArrayList<ComponentInSystemInstanceRefWrapper> wrapperList = (ArrayList<ComponentInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new ComponentInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MappingScopeEnumWrapper getMappingScope() {
        
        if (CollUtil.isNotEmpty(componentClustering.getMappingScope())) {
            
            return new MappingScopeEnumWrapper(componentClustering.getMappingScope());
            
        } else {
            return null;
        }
        
    }




    


    
}