package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuConstNumericContentWrapper {

    
    private CompuConstNumericContent compuConstNumericContent;

    public CompuConstNumericContentWrapper(CompuConstNumericContent compuConstNumericContent) {
        this.compuConstNumericContent = compuConstNumericContent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuConstNumericContent.getS())) {
            
            return compuConstNumericContent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuConstNumericContent.getT())) {
            
            return compuConstNumericContent.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getV() {
        
        if (CollUtil.isNotEmpty(compuConstNumericContent.getV())) {
            
            return new NumericalValueWrapper(compuConstNumericContent.getV());
            
        } else {
            return null;
        }
        
    }




    


    
}