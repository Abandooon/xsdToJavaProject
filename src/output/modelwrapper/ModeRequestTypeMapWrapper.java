package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ModeRequestTypeMapWrapper {

    
    private ModeRequestTypeMap modeRequestTypeMap;

    public ModeRequestTypeMapWrapper(ModeRequestTypeMap modeRequestTypeMap) {
        this.modeRequestTypeMap = modeRequestTypeMap;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(modeRequestTypeMap.getS())) {
            
            return modeRequestTypeMap.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(modeRequestTypeMap.getT())) {
            
            return modeRequestTypeMap.getT();
            
        } else {
            return null;
        }
        
    }

    public ImplementationDataTypeRefWrapper getImplementationDataTypeRef() {
        
        if (CollUtil.isNotEmpty(modeRequestTypeMap.getImplementationDataTypeRef())) {
            
            return new ImplementationDataTypeRefWrapper(modeRequestTypeMap.getImplementationDataTypeRef());
            
        } else {
            return null;
        }
        
    }

    public ModeGroupRef_ModeRequestTypeMapWrapper getModeGroupRef() {
        
        if (CollUtil.isNotEmpty(modeRequestTypeMap.getModeGroupRef())) {
            
            return new ModeGroupRef_ModeRequestTypeMapWrapper(modeRequestTypeMap.getModeGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}