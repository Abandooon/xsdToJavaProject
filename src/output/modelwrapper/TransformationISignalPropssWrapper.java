package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class TransformationISignalPropssWrapper {

    
    private TransformationISignalPropss transformationISignalPropss;

    public TransformationISignalPropssWrapper(TransformationISignalPropss transformationISignalPropss) {
        this.transformationISignalPropss = transformationISignalPropss;
    }

   
    public ArrayList<EndToEndTransformationISignalPropsWrapper> getEndToEndTransformationISignalProps() {
        
        if (CollUtil.isNotEmpty(transformationISignalPropss.getEndToEndTransformationISignalProps())) {
            ArrayList<EndToEndTransformationISignalProps> originalList = transformationISignalPropss.getEndToEndTransformationISignalProps();
            ArrayList<EndToEndTransformationISignalPropsWrapper> wrapperList = (ArrayList<EndToEndTransformationISignalPropsWrapper>)originalList.stream()
                .map(item -> new EndToEndTransformationISignalPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SomeipTransformationISignalPropsWrapper> getSomeipTransformationISignalProps() {
        
        if (CollUtil.isNotEmpty(transformationISignalPropss.getSomeipTransformationISignalProps())) {
            ArrayList<SomeipTransformationISignalProps> originalList = transformationISignalPropss.getSomeipTransformationISignalProps();
            ArrayList<SomeipTransformationISignalPropsWrapper> wrapperList = (ArrayList<SomeipTransformationISignalPropsWrapper>)originalList.stream()
                .map(item -> new SomeipTransformationISignalPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedTransformationISignalPropsWrapper> getUserDefinedTransformationISignalProps() {
        
        if (CollUtil.isNotEmpty(transformationISignalPropss.getUserDefinedTransformationISignalProps())) {
            ArrayList<UserDefinedTransformationISignalProps> originalList = transformationISignalPropss.getUserDefinedTransformationISignalProps();
            ArrayList<UserDefinedTransformationISignalPropsWrapper> wrapperList = (ArrayList<UserDefinedTransformationISignalPropsWrapper>)originalList.stream()
                .map(item -> new UserDefinedTransformationISignalPropsWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}