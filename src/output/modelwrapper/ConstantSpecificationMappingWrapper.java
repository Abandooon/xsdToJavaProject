package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class ConstantSpecificationMappingWrapper {

    
    private ConstantSpecificationMapping constantSpecificationMapping;

    public ConstantSpecificationMappingWrapper(ConstantSpecificationMapping constantSpecificationMapping) {
        this.constantSpecificationMapping = constantSpecificationMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMapping.getS())) {
            
            return constantSpecificationMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMapping.getT())) {
            
            return constantSpecificationMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public ApplConstantRefWrapper getApplConstantRef() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMapping.getApplConstantRef())) {
            
            return new ApplConstantRefWrapper(constantSpecificationMapping.getApplConstantRef());
            
        } else {
            return null;
        }
        
    }

    public ImplConstantRefWrapper getImplConstantRef() {
        
        if (CollUtil.isNotEmpty(constantSpecificationMapping.getImplConstantRef())) {
            
            return new ImplConstantRefWrapper(constantSpecificationMapping.getImplConstantRef());
            
        } else {
            return null;
        }
        
    }




    


    
}