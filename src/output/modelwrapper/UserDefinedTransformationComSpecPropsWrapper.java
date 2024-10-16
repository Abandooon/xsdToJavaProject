package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    


public class UserDefinedTransformationComSpecPropsWrapper {

    
    private UserDefinedTransformationComSpecProps userDefinedTransformationComSpecProps;

    public UserDefinedTransformationComSpecPropsWrapper(UserDefinedTransformationComSpecProps userDefinedTransformationComSpecProps) {
        this.userDefinedTransformationComSpecProps = userDefinedTransformationComSpecProps;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationComSpecProps.getS())) {
            
            return userDefinedTransformationComSpecProps.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationComSpecProps.getT())) {
            
            return userDefinedTransformationComSpecProps.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationComSpecProps.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedTransformationComSpecProps.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationComSpecProps.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedTransformationComSpecProps.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationComSpecProps.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedTransformationComSpecProps.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationComSpecProps.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedTransformationComSpecProps.getAdminData());
            
        } else {
            return null;
        }
        
    }




    


    
}