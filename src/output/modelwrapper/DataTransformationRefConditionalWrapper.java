package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DataTransformationRefConditionalWrapper {

    
    private DataTransformationRefConditional dataTransformationRefConditional;

    public DataTransformationRefConditionalWrapper(DataTransformationRefConditional dataTransformationRefConditional) {
        this.dataTransformationRefConditional = dataTransformationRefConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTransformationRefConditional.getS())) {
            
            return dataTransformationRefConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTransformationRefConditional.getT())) {
            
            return dataTransformationRefConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public DataTransformationRefWrapper getDataTransformationRef() {
        
        if (CollUtil.isNotEmpty(dataTransformationRefConditional.getDataTransformationRef())) {
            
            return new DataTransformationRefWrapper(dataTransformationRefConditional.getDataTransformationRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(dataTransformationRefConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(dataTransformationRefConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}