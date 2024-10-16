package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class RunnableEntityArgumentWrapper {

    
    private RunnableEntityArgument runnableEntityArgument;

    public RunnableEntityArgumentWrapper(RunnableEntityArgument runnableEntityArgument) {
        this.runnableEntityArgument = runnableEntityArgument;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(runnableEntityArgument.getS())) {
            
            return runnableEntityArgument.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(runnableEntityArgument.getT())) {
            
            return runnableEntityArgument.getT();
            
        } else {
            return null;
        }
        
    }

    public CIdentifierWrapper getSymbol() {
        
        if (CollUtil.isNotEmpty(runnableEntityArgument.getSymbol())) {
            
            return new CIdentifierWrapper(runnableEntityArgument.getSymbol());
            
        } else {
            return null;
        }
        
    }




    


    
}