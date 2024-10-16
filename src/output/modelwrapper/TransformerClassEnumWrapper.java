package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TransformerClassEnumWrapper {

    
    private TransformerClassEnum transformerClassEnum;

    public TransformerClassEnumWrapper(TransformerClassEnum transformerClassEnum) {
        this.transformerClassEnum = transformerClassEnum;
    }

   
    public TransformerClassEnumSimple getValue() {
        
        if (CollUtil.isNotEmpty(transformerClassEnum.getValue())) {
            
            return transformerClassEnum.getValue();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(transformerClassEnum.getS())) {
            
            return transformerClassEnum.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(transformerClassEnum.getT())) {
            
            return transformerClassEnum.getT();
            
        } else {
            return null;
        }
        
    }




    


    
}