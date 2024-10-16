package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class DataTransformationErrorHandlingEnumWrapper {

    
    private DataTransformationErrorHandlingEnum dataTransformationErrorHandlingEnum;

    public DataTransformationErrorHandlingEnumWrapper(DataTransformationErrorHandlingEnum dataTransformationErrorHandlingEnum) {
        this.dataTransformationErrorHandlingEnum = dataTransformationErrorHandlingEnum;
    }

   
    public DataTransformationErrorHandlingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(dataTransformationErrorHandlingEnum.getValue())) {
            
            return dataTransformationErrorHandlingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTransformationErrorHandlingEnum.getS())) {
            
            return dataTransformationErrorHandlingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTransformationErrorHandlingEnum.getT())) {
            
            return dataTransformationErrorHandlingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}