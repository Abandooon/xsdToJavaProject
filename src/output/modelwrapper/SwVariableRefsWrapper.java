package stdgui.data.model.modelwrapper;


    
    

    
    


public class SwVariableRefsWrapper {

    
    private SwVariableRefs swVariableRefs;

    public SwVariableRefsWrapper(SwVariableRefs swVariableRefs) {
        this.swVariableRefs = swVariableRefs;
    }

   
    public ArrayList<AutosarVariableRefWrapper> getAutosarVariable() {
        
        if (CollUtil.isNotEmpty(swVariableRefs.getAutosarVariable())) {
            ArrayList<AutosarVariableRef> originalList = swVariableRefs.getAutosarVariable();
            ArrayList<AutosarVariableRefWrapper> wrapperList = (ArrayList<AutosarVariableRefWrapper>)originalList.stream()
                .map(item -> new AutosarVariableRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceVarRefWrapper> getMcDataInstanceVarRef() {
        
        if (CollUtil.isNotEmpty(swVariableRefs.getMcDataInstanceVarRef())) {
            ArrayList<McDataInstanceVarRef> originalList = swVariableRefs.getMcDataInstanceVarRef();
            ArrayList<McDataInstanceVarRefWrapper> wrapperList = (ArrayList<McDataInstanceVarRefWrapper>)originalList.stream()
                .map(item -> new McDataInstanceVarRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}