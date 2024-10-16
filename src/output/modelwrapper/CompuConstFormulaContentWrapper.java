package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuConstFormulaContentWrapper {

    
    private CompuConstFormulaContent compuConstFormulaContent;

    public CompuConstFormulaContentWrapper(CompuConstFormulaContent compuConstFormulaContent) {
        this.compuConstFormulaContent = compuConstFormulaContent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuConstFormulaContent.getS())) {
            
            return compuConstFormulaContent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuConstFormulaContent.getT())) {
            
            return compuConstFormulaContent.getT();
            
        } else {
            return null;
        }
        
    }

    public NumericalValueVariationPointWrapper getVf() {
        
        if (CollUtil.isNotEmpty(compuConstFormulaContent.getVf())) {
            
            return new NumericalValueVariationPointWrapper(compuConstFormulaContent.getVf());
            
        } else {
            return null;
        }
        
    }




    


    
}