package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class RPortInCompositionInstanceRefWrapper {

    
    private RPortInCompositionInstanceRef rPortInCompositionInstanceRef;

    public RPortInCompositionInstanceRefWrapper(RPortInCompositionInstanceRef rPortInCompositionInstanceRef) {
        this.rPortInCompositionInstanceRef = rPortInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(rPortInCompositionInstanceRef.getS())) {
            
            return rPortInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(rPortInCompositionInstanceRef.getT())) {
            
            return rPortInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextComponentRefWrapper getContextComponentRef() {
        
        if (CollUtil.isNotEmpty(rPortInCompositionInstanceRef.getContextComponentRef())) {
            
            return new ContextComponentRefWrapper(rPortInCompositionInstanceRef.getContextComponentRef());
            
        } else {
            return null;
        }
        
    }

    public TargetRPortRefWrapper getTargetRPortRef() {
        
        if (CollUtil.isNotEmpty(rPortInCompositionInstanceRef.getTargetRPortRef())) {
            
            return new TargetRPortRefWrapper(rPortInCompositionInstanceRef.getTargetRPortRef());
            
        } else {
            return null;
        }
        
    }




    


    
}