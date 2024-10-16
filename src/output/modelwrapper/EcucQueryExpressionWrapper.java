package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class EcucQueryExpressionWrapper {

    
    private EcucQueryExpression ecucQueryExpression;

    public EcucQueryExpressionWrapper(EcucQueryExpression ecucQueryExpression) {
        this.ecucQueryExpression = ecucQueryExpression;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucQueryExpression.getS())) {
            
            return ecucQueryExpression.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucQueryExpression.getT())) {
            
            return ecucQueryExpression.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(ecucQueryExpression.getContent())) {
            
            return ecucQueryExpression.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = ecucQueryExpression.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}