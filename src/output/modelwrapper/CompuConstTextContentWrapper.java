package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuConstTextContentWrapper {

    
    private CompuConstTextContent compuConstTextContent;

    public CompuConstTextContentWrapper(CompuConstTextContent compuConstTextContent) {
        this.compuConstTextContent = compuConstTextContent;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuConstTextContent.getS())) {
            
            return compuConstTextContent.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuConstTextContent.getT())) {
            
            return compuConstTextContent.getT();
            
        } else {
            return null;
        }
        
    }

    public VerbatimStringWrapper getVt() {
        
        if (CollUtil.isNotEmpty(compuConstTextContent.getVt())) {
            
            return new VerbatimStringWrapper(compuConstTextContent.getVt());
            
        } else {
            return null;
        }
        
    }




    


    
}