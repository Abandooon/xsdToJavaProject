package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class SwDataDependencyArgsWrapper {

    
    private SwDataDependencyArgs swDataDependencyArgs;

    public SwDataDependencyArgsWrapper(SwDataDependencyArgs swDataDependencyArgs) {
        this.swDataDependencyArgs = swDataDependencyArgs;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swDataDependencyArgs.getS())) {
            
            return swDataDependencyArgs.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swDataDependencyArgs.getT())) {
            
            return swDataDependencyArgs.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarParameterRefWrapper> getArParameter() {
        
        if (CollUtil.isNotEmpty(swDataDependencyArgs.getArParameter())) {
            ArrayList<AutosarParameterRef> originalList = swDataDependencyArgs.getArParameter();
            ArrayList<AutosarParameterRefWrapper> wrapperList = (ArrayList<AutosarParameterRefWrapper>)originalList.stream()
                .map(item -> new AutosarParameterRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceRefWrapper> getMcDataInstanceRef() {
        
        if (CollUtil.isNotEmpty(swDataDependencyArgs.getMcDataInstanceRef())) {
            ArrayList<McDataInstanceRef> originalList = swDataDependencyArgs.getMcDataInstanceRef();
            ArrayList<McDataInstanceRefWrapper> wrapperList = (ArrayList<McDataInstanceRefWrapper>)originalList.stream()
                .map(item -> new McDataInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AutosarVariableRefWrapper> getAutosarVariable() {
        
        if (CollUtil.isNotEmpty(swDataDependencyArgs.getAutosarVariable())) {
            ArrayList<AutosarVariableRef> originalList = swDataDependencyArgs.getAutosarVariable();
            ArrayList<AutosarVariableRefWrapper> wrapperList = (ArrayList<AutosarVariableRefWrapper>)originalList.stream()
                .map(item -> new AutosarVariableRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<McDataInstanceVarRefWrapper> getMcDataInstanceVarRef() {
        
        if (CollUtil.isNotEmpty(swDataDependencyArgs.getMcDataInstanceVarRef())) {
            ArrayList<McDataInstanceVarRef> originalList = swDataDependencyArgs.getMcDataInstanceVarRef();
            ArrayList<McDataInstanceVarRefWrapper> wrapperList = (ArrayList<McDataInstanceVarRefWrapper>)originalList.stream()
                .map(item -> new McDataInstanceVarRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}