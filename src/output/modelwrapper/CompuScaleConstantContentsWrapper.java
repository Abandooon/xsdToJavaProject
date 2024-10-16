package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuScaleConstantContentsWrapper {

    
    private CompuScaleConstantContents compuScaleConstantContents;

    public CompuScaleConstantContentsWrapper(CompuScaleConstantContents compuScaleConstantContents) {
        this.compuScaleConstantContents = compuScaleConstantContents;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuScaleConstantContents.getS())) {
            
            return compuScaleConstantContents.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuScaleConstantContents.getT())) {
            
            return compuScaleConstantContents.getT();
            
        } else {
            return null;
        }
        
    }

    public CompuConstWrapper getCompuConst() {
        
        if (CollUtil.isNotEmpty(compuScaleConstantContents.getCompuConst())) {
            
            return new CompuConstWrapper(compuScaleConstantContents.getCompuConst());
            
        } else {
            return null;
        }
        
    }




    


    
}