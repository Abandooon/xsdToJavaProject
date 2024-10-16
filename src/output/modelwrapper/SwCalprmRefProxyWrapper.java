package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class SwCalprmRefProxyWrapper {

    
    private SwCalprmRefProxy swCalprmRefProxy;

    public SwCalprmRefProxyWrapper(SwCalprmRefProxy swCalprmRefProxy) {
        this.swCalprmRefProxy = swCalprmRefProxy;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swCalprmRefProxy.getS())) {
            
            return swCalprmRefProxy.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swCalprmRefProxy.getT())) {
            
            return swCalprmRefProxy.getT();
            
        } else {
            return null;
        }
        
    }

    public AutosarParameterRefWrapper getArParameter() {
        
        if (CollUtil.isNotEmpty(swCalprmRefProxy.getArParameter())) {
            
            return new AutosarParameterRefWrapper(swCalprmRefProxy.getArParameter());
            
        } else {
            return null;
        }
        
    }

    public McDataInstanceRefWrapper getMcDataInstanceRef() {
        
        if (CollUtil.isNotEmpty(swCalprmRefProxy.getMcDataInstanceRef())) {
            
            return new McDataInstanceRefWrapper(swCalprmRefProxy.getMcDataInstanceRef());
            
        } else {
            return null;
        }
        
    }




    


    
}