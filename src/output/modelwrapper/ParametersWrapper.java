package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.Parameters;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ParametersWrapper {

    
    private Parameters parameters;

    public ParametersWrapper(Parameters parameters) {
        this.parameters = parameters;
    }

   
    public ArrayList<EcucAddInfoParamDefWrapper> getEcucAddInfoParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucAddInfoParamDef())) {
            ArrayList<EcucAddInfoParamDef> originalList = parameters.getEcucAddInfoParamDef();
            ArrayList<EcucAddInfoParamDefWrapper> wrapperList = (ArrayList<EcucAddInfoParamDefWrapper>)originalList.stream()
                .map(item -> new EcucAddInfoParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucBooleanParamDefWrapper> getEcucBooleanParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucBooleanParamDef())) {
            ArrayList<EcucBooleanParamDef> originalList = parameters.getEcucBooleanParamDef();
            ArrayList<EcucBooleanParamDefWrapper> wrapperList = (ArrayList<EcucBooleanParamDefWrapper>)originalList.stream()
                .map(item -> new EcucBooleanParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucEnumerationParamDefWrapper> getEcucEnumerationParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucEnumerationParamDef())) {
            ArrayList<EcucEnumerationParamDef> originalList = parameters.getEcucEnumerationParamDef();
            ArrayList<EcucEnumerationParamDefWrapper> wrapperList = (ArrayList<EcucEnumerationParamDefWrapper>)originalList.stream()
                .map(item -> new EcucEnumerationParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucFloatParamDefWrapper> getEcucFloatParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucFloatParamDef())) {
            ArrayList<EcucFloatParamDef> originalList = parameters.getEcucFloatParamDef();
            ArrayList<EcucFloatParamDefWrapper> wrapperList = (ArrayList<EcucFloatParamDefWrapper>)originalList.stream()
                .map(item -> new EcucFloatParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucFunctionNameDefWrapper> getEcucFunctionNameDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucFunctionNameDef())) {
            ArrayList<EcucFunctionNameDef> originalList = parameters.getEcucFunctionNameDef();
            ArrayList<EcucFunctionNameDefWrapper> wrapperList = (ArrayList<EcucFunctionNameDefWrapper>)originalList.stream()
                .map(item -> new EcucFunctionNameDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucIntegerParamDefWrapper> getEcucIntegerParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucIntegerParamDef())) {
            ArrayList<EcucIntegerParamDef> originalList = parameters.getEcucIntegerParamDef();
            ArrayList<EcucIntegerParamDefWrapper> wrapperList = (ArrayList<EcucIntegerParamDefWrapper>)originalList.stream()
                .map(item -> new EcucIntegerParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucLinkerSymbolDefWrapper> getEcucLinkerSymbolDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucLinkerSymbolDef())) {
            ArrayList<EcucLinkerSymbolDef> originalList = parameters.getEcucLinkerSymbolDef();
            ArrayList<EcucLinkerSymbolDefWrapper> wrapperList = (ArrayList<EcucLinkerSymbolDefWrapper>)originalList.stream()
                .map(item -> new EcucLinkerSymbolDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucMultilineStringParamDefWrapper> getEcucMultilineStringParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucMultilineStringParamDef())) {
            ArrayList<EcucMultilineStringParamDef> originalList = parameters.getEcucMultilineStringParamDef();
            ArrayList<EcucMultilineStringParamDefWrapper> wrapperList = (ArrayList<EcucMultilineStringParamDefWrapper>)originalList.stream()
                .map(item -> new EcucMultilineStringParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucStringParamDefWrapper> getEcucStringParamDef() {
        
        if (CollUtil.isNotEmpty(parameters.getEcucStringParamDef())) {
            ArrayList<EcucStringParamDef> originalList = parameters.getEcucStringParamDef();
            ArrayList<EcucStringParamDefWrapper> wrapperList = (ArrayList<EcucStringParamDefWrapper>)originalList.stream()
                .map(item -> new EcucStringParamDefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}