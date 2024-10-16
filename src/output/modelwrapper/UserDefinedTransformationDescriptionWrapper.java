package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class UserDefinedTransformationDescriptionWrapper {

    
    private UserDefinedTransformationDescription userDefinedTransformationDescription;

    public UserDefinedTransformationDescriptionWrapper(UserDefinedTransformationDescription userDefinedTransformationDescription) {
        this.userDefinedTransformationDescription = userDefinedTransformationDescription;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getS())) {
            
            return userDefinedTransformationDescription.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getT())) {
            
            return userDefinedTransformationDescription.getT();
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedTransformationDescription.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedTransformationDescription.getCategory());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedTransformationDescription.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedTransformationDescription.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedTransformationDescription.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedTransformationDescription.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}