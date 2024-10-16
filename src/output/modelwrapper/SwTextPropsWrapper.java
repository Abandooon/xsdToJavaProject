package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class SwTextPropsWrapper {

    
    private SwTextProps swTextProps;

    public SwTextPropsWrapper(SwTextProps swTextProps) {
        this.swTextProps = swTextProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swTextProps.getS())) {
            
            return swTextProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swTextProps.getT())) {
            
            return swTextProps.getT();
            
        } else {
            return null;
        }
        
    }

    public ArraySizeSemanticsEnumWrapper getArraySizeSemantics() {
        
        if (CollUtil.isNotEmpty(swTextProps.getArraySizeSemantics())) {
            
            return new ArraySizeSemanticsEnumWrapper(swTextProps.getArraySizeSemantics());
            
        } else {
            return null;
        }
        
    }

    public IntegerValueVariationPointWrapper getSwMaxTextSize() {
        
        if (CollUtil.isNotEmpty(swTextProps.getSwMaxTextSize())) {
            
            return new IntegerValueVariationPointWrapper(swTextProps.getSwMaxTextSize());
            
        } else {
            return null;
        }
        
    }

    public BaseTypeRefWrapper getBaseTypeRef() {
        
        if (CollUtil.isNotEmpty(swTextProps.getBaseTypeRef())) {
            
            return new BaseTypeRefWrapper(swTextProps.getBaseTypeRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSwFillCharacter() {
        
        if (CollUtil.isNotEmpty(swTextProps.getSwFillCharacter())) {
            
            return new IntegerWrapper(swTextProps.getSwFillCharacter());
            
        } else {
            return null;
        }
        
    }




    


    
}