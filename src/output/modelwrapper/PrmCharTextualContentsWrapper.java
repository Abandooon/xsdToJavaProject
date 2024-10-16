package stdgui.data.model.modelwrapper;


    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class PrmCharTextualContentsWrapper {

    
    private PrmCharTextualContents prmCharTextualContents;

    public PrmCharTextualContentsWrapper(PrmCharTextualContents prmCharTextualContents) {
        this.prmCharTextualContents = prmCharTextualContents;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(prmCharTextualContents.getS())) {
            
            return prmCharTextualContents.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(prmCharTextualContents.getT())) {
            
            return prmCharTextualContents.getT();
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getText() {
        
        if (CollUtil.isNotEmpty(prmCharTextualContents.getText())) {
            
            return new StringWrapper(prmCharTextualContents.getText());
            
        } else {
            return null;
        }
        
    }




    


    
}