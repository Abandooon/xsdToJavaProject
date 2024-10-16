package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class PPortInCompositionInstanceRefWrapper {

    
    private PPortInCompositionInstanceRef pPortInCompositionInstanceRef;

    public PPortInCompositionInstanceRefWrapper(PPortInCompositionInstanceRef pPortInCompositionInstanceRef) {
        this.pPortInCompositionInstanceRef = pPortInCompositionInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(pPortInCompositionInstanceRef.getS())) {
            
            return pPortInCompositionInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(pPortInCompositionInstanceRef.getT())) {
            
            return pPortInCompositionInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextComponentRefWrapper getContextComponentRef() {
        
        if (CollUtil.isNotEmpty(pPortInCompositionInstanceRef.getContextComponentRef())) {
            
            return new ContextComponentRefWrapper(pPortInCompositionInstanceRef.getContextComponentRef());
            
        } else {
            return null;
        }
        
    }

    public TargetPPortRefWrapper getTargetPPortRef() {
        
        if (CollUtil.isNotEmpty(pPortInCompositionInstanceRef.getTargetPPortRef())) {
            
            return new TargetPPortRefWrapper(pPortInCompositionInstanceRef.getTargetPPortRef());
            
        } else {
            return null;
        }
        
    }




    


    
}