package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SomeipTransformationISignalPropsWrapper {

    
    private SomeipTransformationISignalProps someipTransformationISignalProps;

    public SomeipTransformationISignalPropsWrapper(SomeipTransformationISignalProps someipTransformationISignalProps) {
        this.someipTransformationISignalProps = someipTransformationISignalProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getS())) {
            
            return someipTransformationISignalProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getT())) {
            
            return someipTransformationISignalProps.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(someipTransformationISignalProps.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getCategory())) {
            
            return new CategoryStringWrapper(someipTransformationISignalProps.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getIntroduction())) {
            
            return new DocumentationBlockWrapper(someipTransformationISignalProps.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getAdminData())) {
            
            return new AdminDataWrapper(someipTransformationISignalProps.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SomeipTransformationISignalPropsConditionalWrapper> getSomeipTransformationISignalPropsVariants() {
        
        if (CollUtil.isNotEmpty(someipTransformationISignalProps.getSomeipTransformationISignalPropsVariants())) {
            ArrayList<SomeipTransformationISignalPropsConditional> originalList = someipTransformationISignalProps.getSomeipTransformationISignalPropsVariants();
            ArrayList<SomeipTransformationISignalPropsConditionalWrapper> wrapperList = (ArrayList<SomeipTransformationISignalPropsConditionalWrapper>)originalList.stream()
                .map(item -> new SomeipTransformationISignalPropsConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}