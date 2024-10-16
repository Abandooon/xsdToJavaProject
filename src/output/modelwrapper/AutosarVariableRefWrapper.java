package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class AutosarVariableRefWrapper {

    
    private AutosarVariableRef autosarVariableRef;

    public AutosarVariableRefWrapper(AutosarVariableRef autosarVariableRef) {
        this.autosarVariableRef = autosarVariableRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(autosarVariableRef.getS())) {
            
            return autosarVariableRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(autosarVariableRef.getT())) {
            
            return autosarVariableRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ArVariableInImplementationDataInstanceRefWrapper getAutosarVariableInImplDatatype() {
        
        if (CollUtil.isNotEmpty(autosarVariableRef.getAutosarVariableInImplDatatype())) {
            
            return new ArVariableInImplementationDataInstanceRefWrapper(autosarVariableRef.getAutosarVariableInImplDatatype());
            
        } else {
            return null;
        }
        
    }

    public VariableInAtomicSwcTypeInstanceRefWrapper getAutosarVariableIref() {
        
        if (CollUtil.isNotEmpty(autosarVariableRef.getAutosarVariableIref())) {
            
            return new VariableInAtomicSwcTypeInstanceRefWrapper(autosarVariableRef.getAutosarVariableIref());
            
        } else {
            return null;
        }
        
    }

    public LocalVariableRefWrapper getLocalVariableRef() {
        
        if (CollUtil.isNotEmpty(autosarVariableRef.getLocalVariableRef())) {
            
            return new LocalVariableRefWrapper(autosarVariableRef.getLocalVariableRef());
            
        } else {
            return null;
        }
        
    }




    


    
}