package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class TdEventOccurrenceExpressionWrapper {

    
    private TdEventOccurrenceExpression tdEventOccurrenceExpression;

    public TdEventOccurrenceExpressionWrapper(TdEventOccurrenceExpression tdEventOccurrenceExpression) {
        this.tdEventOccurrenceExpression = tdEventOccurrenceExpression;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpression.getS())) {
            
            return tdEventOccurrenceExpression.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpression.getT())) {
            
            return tdEventOccurrenceExpression.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarOperationArgumentInstanceWrapper> getArguments() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpression.getArguments())) {
            ArrayList<AutosarOperationArgumentInstance> originalList = tdEventOccurrenceExpression.getArguments();
            ArrayList<AutosarOperationArgumentInstanceWrapper> wrapperList = (ArrayList<AutosarOperationArgumentInstanceWrapper>)originalList.stream()
                .map(item -> new AutosarOperationArgumentInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionFormulaWrapper getFormula() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpression.getFormula())) {
            
            return new TdEventOccurrenceExpressionFormulaWrapper(tdEventOccurrenceExpression.getFormula());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarVariableInstanceWrapper> getVariables() {
        
        if (CollUtil.isNotEmpty(tdEventOccurrenceExpression.getVariables())) {
            ArrayList<AutosarVariableInstance> originalList = tdEventOccurrenceExpression.getVariables();
            ArrayList<AutosarVariableInstanceWrapper> wrapperList = (ArrayList<AutosarVariableInstanceWrapper>)originalList.stream()
                .map(item -> new AutosarVariableInstanceWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}