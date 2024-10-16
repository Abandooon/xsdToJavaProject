package stdgui.data.model.modelwrapper;


    
    

    
    


public class SwComparisonVariablesWrapper {

    
    private SwComparisonVariables swComparisonVariables;

    public SwComparisonVariablesWrapper(SwComparisonVariables swComparisonVariables) {
        this.swComparisonVariables = swComparisonVariables;
    }

   
    public ArrayList<AutosarVariableRefWrapper> getAutosarVariable() {
        
        if (CollUtil.isNotEmpty(swComparisonVariables.getAutosarVariable())) {
            ArrayList<AutosarVariableRef> originalList = swComparisonVariables.getAutosarVariable();
            ArrayList<AutosarVariableRefWrapper> wrapperList = (ArrayList<AutosarVariableRefWrapper>)originalList.stream()
                .map(item -> new AutosarVariableRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceVarRefWrapper> getMcDataInstanceVarRef() {
        
        if (CollUtil.isNotEmpty(swComparisonVariables.getMcDataInstanceVarRef())) {
            ArrayList<McDataInstanceVarRef> originalList = swComparisonVariables.getMcDataInstanceVarRef();
            ArrayList<McDataInstanceVarRefWrapper> wrapperList = (ArrayList<McDataInstanceVarRefWrapper>)originalList.stream()
                .map(item -> new McDataInstanceVarRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}