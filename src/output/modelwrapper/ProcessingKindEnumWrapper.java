package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ProcessingKindEnumWrapper {

    
    private ProcessingKindEnum processingKindEnum;

    public ProcessingKindEnumWrapper(ProcessingKindEnum processingKindEnum) {
        this.processingKindEnum = processingKindEnum;
    }

   
    public ProcessingKindEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(processingKindEnum.getValue())) {
            
            return processingKindEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(processingKindEnum.getS())) {
            
            return processingKindEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(processingKindEnum.getT())) {
            
            return processingKindEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}