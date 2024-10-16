package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SwAxisGroupedWrapper {

    
    private SwAxisGrouped swAxisGrouped;

    public SwAxisGroupedWrapper(SwAxisGrouped swAxisGrouped) {
        this.swAxisGrouped = swAxisGrouped;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swAxisGrouped.getS())) {
            
            return swAxisGrouped.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swAxisGrouped.getT())) {
            
            return swAxisGrouped.getT();
            
        } else {
            return null;
        }
        
    }

    public SharedAxisTypeRefWrapper getSharedAxisTypeRef() {
        
        if (CollUtil.isNotEmpty(swAxisGrouped.getSharedAxisTypeRef())) {
            
            return new SharedAxisTypeRefWrapper(swAxisGrouped.getSharedAxisTypeRef());
            
        } else {
            return null;
        }
        
    }

    public AxisIndexTypeWrapper getSwAxisIndex() {
        
        if (CollUtil.isNotEmpty(swAxisGrouped.getSwAxisIndex())) {
            
            return new AxisIndexTypeWrapper(swAxisGrouped.getSwAxisIndex());
            
        } else {
            return null;
        }
        
    }

    public AutosarParameterRefWrapper getArParameter() {
        
        if (CollUtil.isNotEmpty(swAxisGrouped.getArParameter())) {
            
            return new AutosarParameterRefWrapper(swAxisGrouped.getArParameter());
            
        } else {
            return null;
        }
        
    }

    public McDataInstanceRefWrapper getMcDataInstanceRef() {
        
        if (CollUtil.isNotEmpty(swAxisGrouped.getMcDataInstanceRef())) {
            
            return new McDataInstanceRefWrapper(swAxisGrouped.getMcDataInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}