package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EcuResourceEstimationWrapper {

    
    private EcuResourceEstimation ecuResourceEstimation;

    public EcuResourceEstimationWrapper(EcuResourceEstimation ecuResourceEstimation) {
        this.ecuResourceEstimation = ecuResourceEstimation;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getS())) {
            
            return ecuResourceEstimation.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getT())) {
            
            return ecuResourceEstimation.getT();
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuResourceEstimation.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ResourceConsumptionWrapper getBswResourceEstimation() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getBswResourceEstimation())) {
            
            return new ResourceConsumptionWrapper(ecuResourceEstimation.getBswResourceEstimation());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(ecuResourceEstimation.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public ResourceConsumptionWrapper getRteResourceEstimation() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getRteResourceEstimation())) {
            
            return new ResourceConsumptionWrapper(ecuResourceEstimation.getRteResourceEstimation());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwCompToEcuMappingRefWrapper> getSwCompToEcuMappingRefs() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getSwCompToEcuMappingRefs())) {
            ArrayList<SwCompToEcuMappingRef> originalList = ecuResourceEstimation.getSwCompToEcuMappingRefs();
            ArrayList<SwCompToEcuMappingRefWrapper> wrapperList = (ArrayList<SwCompToEcuMappingRefWrapper>)originalList.stream()
                .map(item -> new SwCompToEcuMappingRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecuResourceEstimation.getVariationPoint())) {
            
            return new VariationPointWrapper(ecuResourceEstimation.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}