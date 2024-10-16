package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class ParameterValuesWrapper {

    
    private ParameterValues parameterValues;

    public ParameterValuesWrapper(ParameterValues parameterValues) {
        this.parameterValues = parameterValues;
    }

   
    public ArrayList<EcucAddInfoParamValueWrapper> getEcucAddInfoParamValue() {
        
        if (CollUtil.isNotEmpty(parameterValues.getEcucAddInfoParamValue())) {
            ArrayList<EcucAddInfoParamValue> originalList = parameterValues.getEcucAddInfoParamValue();
            ArrayList<EcucAddInfoParamValueWrapper> wrapperList = (ArrayList<EcucAddInfoParamValueWrapper>)originalList.stream()
                .map(item -> new EcucAddInfoParamValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucNumericalParamValueWrapper> getEcucNumericalParamValue() {
        
        if (CollUtil.isNotEmpty(parameterValues.getEcucNumericalParamValue())) {
            ArrayList<EcucNumericalParamValue> originalList = parameterValues.getEcucNumericalParamValue();
            ArrayList<EcucNumericalParamValueWrapper> wrapperList = (ArrayList<EcucNumericalParamValueWrapper>)originalList.stream()
                .map(item -> new EcucNumericalParamValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucTextualParamValueWrapper> getEcucTextualParamValue() {
        
        if (CollUtil.isNotEmpty(parameterValues.getEcucTextualParamValue())) {
            ArrayList<EcucTextualParamValue> originalList = parameterValues.getEcucTextualParamValue();
            ArrayList<EcucTextualParamValueWrapper> wrapperList = (ArrayList<EcucTextualParamValueWrapper>)originalList.stream()
                .map(item -> new EcucTextualParamValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}