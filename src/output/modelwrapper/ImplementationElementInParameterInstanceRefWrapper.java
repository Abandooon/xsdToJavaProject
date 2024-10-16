package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ImplementationElementInParameterInstanceRefWrapper {

    
    private ImplementationElementInParameterInstanceRef implementationElementInParameterInstanceRef;

    public ImplementationElementInParameterInstanceRefWrapper(ImplementationElementInParameterInstanceRef implementationElementInParameterInstanceRef) {
        this.implementationElementInParameterInstanceRef = implementationElementInParameterInstanceRef;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(implementationElementInParameterInstanceRef.getS())) {
            
            return implementationElementInParameterInstanceRef.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(implementationElementInParameterInstanceRef.getT())) {
            
            return implementationElementInParameterInstanceRef.getT();
            
        } else {
            return null;
        }
        
    }

    public ContextRefWrapper getContextRef() {
        
        if (CollUtil.isNotEmpty(implementationElementInParameterInstanceRef.getContextRef())) {
            
            return new ContextRefWrapper(implementationElementInParameterInstanceRef.getContextRef());
            
        } else {
            return null;
        }
        
    }

    public TargetRef_ImplementationElementInParameterInstanceRefWrapper getTargetRef() {
        
        if (CollUtil.isNotEmpty(implementationElementInParameterInstanceRef.getTargetRef())) {
            
            return new TargetRef_ImplementationElementInParameterInstanceRefWrapper(implementationElementInParameterInstanceRef.getTargetRef());
            
        } else {
            return null;
        }
        
    }




    


    
}