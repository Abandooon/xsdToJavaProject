package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class SwPointerTargetPropsWrapper {

    
    private SwPointerTargetProps swPointerTargetProps;

    public SwPointerTargetPropsWrapper(SwPointerTargetProps swPointerTargetProps) {
        this.swPointerTargetProps = swPointerTargetProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swPointerTargetProps.getS())) {
            
            return swPointerTargetProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swPointerTargetProps.getT())) {
            
            return swPointerTargetProps.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getTargetCategory() {
        
        if (CollUtil.isNotEmpty(swPointerTargetProps.getTargetCategory())) {
            
            return new IdentifierWrapper(swPointerTargetProps.getTargetCategory());
            
        } else {
            return null;
        }
        
    }

    public SwDataDefPropsWrapper getSwDataDefProps() {
        
        if (CollUtil.isNotEmpty(swPointerTargetProps.getSwDataDefProps())) {
            
            return new SwDataDefPropsWrapper(swPointerTargetProps.getSwDataDefProps());
            
        } else {
            return null;
        }
        
    }

    public FunctionPointerSignatureRefWrapper getFunctionPointerSignatureRef() {
        
        if (CollUtil.isNotEmpty(swPointerTargetProps.getFunctionPointerSignatureRef())) {
            
            return new FunctionPointerSignatureRefWrapper(swPointerTargetProps.getFunctionPointerSignatureRef());
            
        } else {
            return null;
        }
        
    }




    


    
}