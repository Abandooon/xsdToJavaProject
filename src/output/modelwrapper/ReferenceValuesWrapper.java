package stdgui.data.model.modelwrapper;


    
    

    
    


public class ReferenceValuesWrapper {

    
    private ReferenceValues referenceValues;

    public ReferenceValuesWrapper(ReferenceValues referenceValues) {
        this.referenceValues = referenceValues;
    }

   
    public ArrayList<EcucInstanceReferenceValueWrapper> getEcucInstanceReferenceValue() {
        
        if (CollUtil.isNotEmpty(referenceValues.getEcucInstanceReferenceValue())) {
            ArrayList<EcucInstanceReferenceValue> originalList = referenceValues.getEcucInstanceReferenceValue();
            ArrayList<EcucInstanceReferenceValueWrapper> wrapperList = (ArrayList<EcucInstanceReferenceValueWrapper>)originalList.stream()
                .map(item -> new EcucInstanceReferenceValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucReferenceValueWrapper> getEcucReferenceValue() {
        
        if (CollUtil.isNotEmpty(referenceValues.getEcucReferenceValue())) {
            ArrayList<EcucReferenceValue> originalList = referenceValues.getEcucReferenceValue();
            ArrayList<EcucReferenceValueWrapper> wrapperList = (ArrayList<EcucReferenceValueWrapper>)originalList.stream()
                .map(item -> new EcucReferenceValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}