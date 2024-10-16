package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class DataTypeMapWrapper {

    
    private DataTypeMap dataTypeMap;

    public DataTypeMapWrapper(DataTypeMap dataTypeMap) {
        this.dataTypeMap = dataTypeMap;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dataTypeMap.getS())) {
            
            return dataTypeMap.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dataTypeMap.getT())) {
            
            return dataTypeMap.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplicationDataTypeRefWrapper getApplicationDataTypeRef() {
        
        if (CollUtil.isNotEmpty(dataTypeMap.getApplicationDataTypeRef())) {
            
            return new ApplicationDataTypeRefWrapper(dataTypeMap.getApplicationDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ImplementationDataTypeRefWrapper getImplementationDataTypeRef() {
        
        if (CollUtil.isNotEmpty(dataTypeMap.getImplementationDataTypeRef())) {
            
            return new ImplementationDataTypeRefWrapper(dataTypeMap.getImplementationDataTypeRef());
            
        } else {
            return null;
        }
        
    }




    


    
}