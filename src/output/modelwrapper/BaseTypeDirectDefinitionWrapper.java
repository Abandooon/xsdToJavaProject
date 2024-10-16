package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BaseTypeDirectDefinitionWrapper {

    
    private BaseTypeDirectDefinition baseTypeDirectDefinition;

    public BaseTypeDirectDefinitionWrapper(BaseTypeDirectDefinition baseTypeDirectDefinition) {
        this.baseTypeDirectDefinition = baseTypeDirectDefinition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getS())) {
            
            return baseTypeDirectDefinition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getT())) {
            
            return baseTypeDirectDefinition.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getBaseTypeSize() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getBaseTypeSize())) {
            
            return new PositiveIntegerWrapper(baseTypeDirectDefinition.getBaseTypeSize());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxBaseTypeSize() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getMaxBaseTypeSize())) {
            
            return new PositiveIntegerWrapper(baseTypeDirectDefinition.getMaxBaseTypeSize());
            
        } else {
            return null;
        }
        
    }

    public BaseTypeEncodingStringWrapper getBaseTypeEncoding() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getBaseTypeEncoding())) {
            
            return new BaseTypeEncodingStringWrapper(baseTypeDirectDefinition.getBaseTypeEncoding());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemAlignment() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getMemAlignment())) {
            
            return new PositiveIntegerWrapper(baseTypeDirectDefinition.getMemAlignment());
            
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getByteOrder() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getByteOrder())) {
            
            return new ByteOrderEnumWrapper(baseTypeDirectDefinition.getByteOrder());
            
        } else {
            return null;
        }
        
    }

    public NativeDeclarationStringWrapper getNativeDeclaration() {
        
        if (CollUtil.isNotEmpty(baseTypeDirectDefinition.getNativeDeclaration())) {
            
            return new NativeDeclarationStringWrapper(baseTypeDirectDefinition.getNativeDeclaration());
            
        } else {
            return null;
        }
        
    }




    


    
}