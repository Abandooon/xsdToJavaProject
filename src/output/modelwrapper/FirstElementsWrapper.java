package stdgui.data.model.modelwrapper;


    
    

    
    


public class FirstElementsWrapper {

    
    private FirstElements firstElements;

    public FirstElementsWrapper(FirstElements firstElements) {
        this.firstElements = firstElements;
    }

   
    public ArrayList<ApplicationCompositeDataTypeSubElementRefWrapper> getApplicationCompositeDataTypeSubElementRef() {
        
        if (CollUtil.isNotEmpty(firstElements.getApplicationCompositeDataTypeSubElementRef())) {
            ArrayList<ApplicationCompositeDataTypeSubElementRef> originalList = firstElements.getApplicationCompositeDataTypeSubElementRef();
            ArrayList<ApplicationCompositeDataTypeSubElementRefWrapper> wrapperList = (ArrayList<ApplicationCompositeDataTypeSubElementRefWrapper>)originalList.stream()
                .map(item -> new ApplicationCompositeDataTypeSubElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ImplementationDataTypeSubElementRefWrapper> getImplementationDataTypeSubElementRef() {
        
        if (CollUtil.isNotEmpty(firstElements.getImplementationDataTypeSubElementRef())) {
            ArrayList<ImplementationDataTypeSubElementRef> originalList = firstElements.getImplementationDataTypeSubElementRef();
            ArrayList<ImplementationDataTypeSubElementRefWrapper> wrapperList = (ArrayList<ImplementationDataTypeSubElementRefWrapper>)originalList.stream()
                .map(item -> new ImplementationDataTypeSubElementRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}