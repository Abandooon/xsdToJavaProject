package stdgui.data.model.modelwrapper;


    
    

    
    


public class SecondElementsWrapper {

    
    private SecondElements secondElements;

    public SecondElementsWrapper(SecondElements secondElements) {
        this.secondElements = secondElements;
    }

   
    public ArrayList<ApplicationCompositeDataTypeSubElementRefWrapper> getApplicationCompositeDataTypeSubElementRef() {
        
        if (CollUtil.isNotEmpty(secondElements.getApplicationCompositeDataTypeSubElementRef())) {
            ArrayList<ApplicationCompositeDataTypeSubElementRef> originalList = secondElements.getApplicationCompositeDataTypeSubElementRef();
            ArrayList<ApplicationCompositeDataTypeSubElementRefWrapper> wrapperList = (ArrayList<ApplicationCompositeDataTypeSubElementRefWrapper>)originalList.stream()
                .map(item -> new ApplicationCompositeDataTypeSubElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ImplementationDataTypeSubElementRefWrapper> getImplementationDataTypeSubElementRef() {
        
        if (CollUtil.isNotEmpty(secondElements.getImplementationDataTypeSubElementRef())) {
            ArrayList<ImplementationDataTypeSubElementRef> originalList = secondElements.getImplementationDataTypeSubElementRef();
            ArrayList<ImplementationDataTypeSubElementRefWrapper> wrapperList = (ArrayList<ImplementationDataTypeSubElementRefWrapper>)originalList.stream()
                .map(item -> new ImplementationDataTypeSubElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}