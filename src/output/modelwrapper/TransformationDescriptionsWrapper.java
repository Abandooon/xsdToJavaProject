package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TransformationDescriptionsWrapper {

    
    private TransformationDescriptions transformationDescriptions;

    public TransformationDescriptionsWrapper(TransformationDescriptions transformationDescriptions) {
        this.transformationDescriptions = transformationDescriptions;
    }

   
    public ArrayList<EndToEndTransformationDescriptionWrapper> getEndToEndTransformationDescription() {
        
        if (CollUtil.isNotEmpty(transformationDescriptions.getEndToEndTransformationDescription())) {
            ArrayList<EndToEndTransformationDescription> originalList = transformationDescriptions.getEndToEndTransformationDescription();
            ArrayList<EndToEndTransformationDescriptionWrapper> wrapperList = (ArrayList<EndToEndTransformationDescriptionWrapper>)originalList.stream()
                .map(item -> new EndToEndTransformationDescriptionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SomeipTransformationDescriptionWrapper> getSomeipTransformationDescription() {
        
        if (CollUtil.isNotEmpty(transformationDescriptions.getSomeipTransformationDescription())) {
            ArrayList<SomeipTransformationDescription> originalList = transformationDescriptions.getSomeipTransformationDescription();
            ArrayList<SomeipTransformationDescriptionWrapper> wrapperList = (ArrayList<SomeipTransformationDescriptionWrapper>)originalList.stream()
                .map(item -> new SomeipTransformationDescriptionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedTransformationDescriptionWrapper> getUserDefinedTransformationDescription() {
        
        if (CollUtil.isNotEmpty(transformationDescriptions.getUserDefinedTransformationDescription())) {
            ArrayList<UserDefinedTransformationDescription> originalList = transformationDescriptions.getUserDefinedTransformationDescription();
            ArrayList<UserDefinedTransformationDescriptionWrapper> wrapperList = (ArrayList<UserDefinedTransformationDescriptionWrapper>)originalList.stream()
                .map(item -> new UserDefinedTransformationDescriptionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}