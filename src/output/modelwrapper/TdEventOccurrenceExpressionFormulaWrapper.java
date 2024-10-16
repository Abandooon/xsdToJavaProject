package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TdEventOccurrenceExpressionFormulaWrapper {

    
    private TdEventOccurrenceExpressionFormula tdEventOccurrenceExpressionFormula;

    public TdEventOccurrenceExpressionFormulaWrapper(TdEventOccurrenceExpressionFormula tdEventOccurrenceExpressionFormula) {
        this.tdEventOccurrenceExpressionFormula = tdEventOccurrenceExpressionFormula;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpressionFormula.getS())) {
            
            return tdEventOccurrenceExpressionFormula.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpressionFormula.getT())) {
            
            return tdEventOccurrenceExpressionFormula.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<Serializable> getContent() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpressionFormula.getContent())) {
            
            return tdEventOccurrenceExpressionFormula.getContent();
            
        } else {
            return null;
        }
        
    }




    


    
    public String getValue() {
        ArrayList<Serializable> serializables = tdEventOccurrenceExpressionFormula.getContent();
        StringBuilder textContent = new StringBuilder();
        for (Serializable item : serializables) {
            if (item instanceof String) {
                textContent.append((String) item);
            }
        }
        return textContent.toString().trim();
    }

    
    
}