package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class UserDefinedTransformationISignalPropsWrapper {

    
    private UserDefinedTransformationISignalProps userDefinedTransformationISignalProps;

    public UserDefinedTransformationISignalPropsWrapper(UserDefinedTransformationISignalProps userDefinedTransformationISignalProps) {
        this.userDefinedTransformationISignalProps = userDefinedTransformationISignalProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getS())) {
            
            return userDefinedTransformationISignalProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getT())) {
            
            return userDefinedTransformationISignalProps.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedTransformationISignalProps.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedTransformationISignalProps.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedTransformationISignalProps.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedTransformationISignalProps.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<UserDefinedTransformationISignalPropsConditionalWrapper> getUserDefinedTransformationISignalPropsVariants() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationISignalProps.getUserDefinedTransformationISignalPropsVariants())) {
            ArrayList<UserDefinedTransformationISignalPropsConditional> originalList = userDefinedTransformationISignalProps.getUserDefinedTransformationISignalPropsVariants();
            ArrayList<UserDefinedTransformationISignalPropsConditionalWrapper> wrapperList = (ArrayList<UserDefinedTransformationISignalPropsConditionalWrapper>)originalList.stream()
                .map(item -> new UserDefinedTransformationISignalPropsConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}