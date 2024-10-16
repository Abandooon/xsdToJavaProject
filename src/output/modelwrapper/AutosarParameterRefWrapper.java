package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class AutosarParameterRefWrapper {

    
    private AutosarParameterRef autosarParameterRef;

    public AutosarParameterRefWrapper(AutosarParameterRef autosarParameterRef) {
        this.autosarParameterRef = autosarParameterRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosarParameterRef.getS())) {
            
            return autosarParameterRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosarParameterRef.getT())) {
            
            return autosarParameterRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ParameterInAtomicSwcTypeInstanceRefWrapper getAutosarParameterIref() {
        
        if (CollUtil.isNotEmpty(autosarParameterRef.getAutosarParameterIref())) {
            
            return new ParameterInAtomicSwcTypeInstanceRefWrapper(autosarParameterRef.getAutosarParameterIref());
            
        } else {
            return null;
        }
        
    }

    public LocalParameterRefWrapper getLocalParameterRef() {
        
        if (CollUtil.isNotEmpty(autosarParameterRef.getLocalParameterRef())) {
            
            return new LocalParameterRefWrapper(autosarParameterRef.getLocalParameterRef());
            
        } else {
            return null;
        }
        
    }




    


    
}