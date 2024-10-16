package stdgui.data.model.modelwrapper;


    
    

    
    


public class TransformationComSpecPropssWrapper {

    
    private TransformationComSpecPropss transformationComSpecPropss;

    public TransformationComSpecPropssWrapper(TransformationComSpecPropss transformationComSpecPropss) {
        this.transformationComSpecPropss = transformationComSpecPropss;
    }

   
    public ArrayList<EndToEndTransformationComSpecPropsWrapper> getEndToEndTransformationComSpecProps() {
        
        if (CollUtil.isNotEmpty(transformationComSpecPropss.getEndToEndTransformationComSpecProps())) {
            ArrayList<EndToEndTransformationComSpecProps> originalList = transformationComSpecPropss.getEndToEndTransformationComSpecProps();
            ArrayList<EndToEndTransformationComSpecPropsWrapper> wrapperList = (ArrayList<EndToEndTransformationComSpecPropsWrapper>)originalList.stream()
                .map(item -> new EndToEndTransformationComSpecPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedTransformationComSpecPropsWrapper> getUserDefinedTransformationComSpecProps() {
        
        if (CollUtil.isNotEmpty(transformationComSpecPropss.getUserDefinedTransformationComSpecProps())) {
            ArrayList<UserDefinedTransformationComSpecProps> originalList = transformationComSpecPropss.getUserDefinedTransformationComSpecProps();
            ArrayList<UserDefinedTransformationComSpecPropsWrapper> wrapperList = (ArrayList<UserDefinedTransformationComSpecPropsWrapper>)originalList.stream()
                .map(item -> new UserDefinedTransformationComSpecPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}