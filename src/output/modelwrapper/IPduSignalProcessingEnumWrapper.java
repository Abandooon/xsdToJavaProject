package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class IPduSignalProcessingEnumWrapper {

    
    private IPduSignalProcessingEnum iPduSignalProcessingEnum;

    public IPduSignalProcessingEnumWrapper(IPduSignalProcessingEnum iPduSignalProcessingEnum) {
        this.iPduSignalProcessingEnum = iPduSignalProcessingEnum;
    }

   
    public IPduSignalProcessingEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(iPduSignalProcessingEnum.getValue())) {
            
            return iPduSignalProcessingEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iPduSignalProcessingEnum.getS())) {
            
            return iPduSignalProcessingEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iPduSignalProcessingEnum.getT())) {
            
            return iPduSignalProcessingEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}