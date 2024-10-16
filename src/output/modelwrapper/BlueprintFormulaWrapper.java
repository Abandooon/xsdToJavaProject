package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class BlueprintFormulaWrapper {

    
    private BlueprintFormula blueprintFormula;

    public BlueprintFormulaWrapper(BlueprintFormula blueprintFormula) {
        this.blueprintFormula = blueprintFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(blueprintFormula.getS())) {
            
            return blueprintFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(blueprintFormula.getT())) {
            
            return blueprintFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(blueprintFormula.getContent())) {
            
            return blueprintFormula.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = blueprintFormula.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}