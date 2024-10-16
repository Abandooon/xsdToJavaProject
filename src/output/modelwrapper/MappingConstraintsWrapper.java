package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class MappingConstraintsWrapper {

    
    private MappingConstraints mappingConstraints;

    public MappingConstraintsWrapper(MappingConstraints mappingConstraints) {
        this.mappingConstraints = mappingConstraints;
    }

   
    public ArrayList<ComponentClusteringWrapper> getComponentClustering() {
        
        if (CollUtil.isNotEmpty(mappingConstraints.getComponentClustering())) {
            ArrayList<ComponentClustering> originalList = mappingConstraints.getComponentClustering();
            ArrayList<ComponentClusteringWrapper> wrapperList = (ArrayList<ComponentClusteringWrapper>)originalList.stream()
                .map(item -> new ComponentClusteringWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ComponentSeparationWrapper> getComponentSeparation() {
        
        if (CollUtil.isNotEmpty(mappingConstraints.getComponentSeparation())) {
            ArrayList<ComponentSeparation> originalList = mappingConstraints.getComponentSeparation();
            ArrayList<ComponentSeparationWrapper> wrapperList = (ArrayList<ComponentSeparationWrapper>)originalList.stream()
                .map(item -> new ComponentSeparationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwcToEcuMappingConstraintWrapper> getSwcToEcuMappingConstraint() {
        
        if (CollUtil.isNotEmpty(mappingConstraints.getSwcToEcuMappingConstraint())) {
            ArrayList<SwcToEcuMappingConstraint> originalList = mappingConstraints.getSwcToEcuMappingConstraint();
            ArrayList<SwcToEcuMappingConstraintWrapper> wrapperList = (ArrayList<SwcToEcuMappingConstraintWrapper>)originalList.stream()
                .map(item -> new SwcToEcuMappingConstraintWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}