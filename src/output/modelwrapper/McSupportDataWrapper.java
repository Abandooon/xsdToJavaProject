package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class McSupportDataWrapper {

    
    private McSupportData mcSupportData;

    public McSupportDataWrapper(McSupportData mcSupportData) {
        this.mcSupportData = mcSupportData;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(mcSupportData.getS())) {
            
            return mcSupportData.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(mcSupportData.getT())) {
            
            return mcSupportData.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<McSwEmulationMethodSupportWrapper> getEmulationSupports() {
        
        if (CollUtil.isNotEmpty(mcSupportData.getEmulationSupports())) {
            ArrayList<McSwEmulationMethodSupport> originalList = mcSupportData.getEmulationSupports();
            ArrayList<McSwEmulationMethodSupportWrapper> wrapperList = (ArrayList<McSwEmulationMethodSupportWrapper>)originalList.stream()
                .map(item -> new McSwEmulationMethodSupportWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceWrapper> getMcParameterInstances() {
        
        if (CollUtil.isNotEmpty(mcSupportData.getMcParameterInstances())) {
            ArrayList<McDataInstance> originalList = mcSupportData.getMcParameterInstances();
            ArrayList<McDataInstanceWrapper> wrapperList = (ArrayList<McDataInstanceWrapper>)originalList.stream()
                .map(item -> new McDataInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceWrapper> getMcVariableInstances() {
        
        if (CollUtil.isNotEmpty(mcSupportData.getMcVariableInstances())) {
            ArrayList<McDataInstance> originalList = mcSupportData.getMcVariableInstances();
            ArrayList<McDataInstanceWrapper> wrapperList = (ArrayList<McDataInstanceWrapper>)originalList.stream()
                .map(item -> new McDataInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<MeasurableSystemConstantValuesRefWrapper> getMeasurableSystemConstantValuesRefs() {
        
        if (CollUtil.isNotEmpty(mcSupportData.getMeasurableSystemConstantValuesRefs())) {
            ArrayList<MeasurableSystemConstantValuesRef> originalList = mcSupportData.getMeasurableSystemConstantValuesRefs();
            ArrayList<MeasurableSystemConstantValuesRefWrapper> wrapperList = (ArrayList<MeasurableSystemConstantValuesRefWrapper>)originalList.stream()
                .map(item -> new MeasurableSystemConstantValuesRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}