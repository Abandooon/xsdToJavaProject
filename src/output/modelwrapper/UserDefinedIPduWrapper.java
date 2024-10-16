package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class UserDefinedIPduWrapper {

    
    private UserDefinedIPdu userDefinedIPdu;

    public UserDefinedIPduWrapper(UserDefinedIPdu userDefinedIPdu) {
        this.userDefinedIPdu = userDefinedIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getS())) {
            
            return userDefinedIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getT())) {
            
            return userDefinedIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getUuid())) {
            
            return userDefinedIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getShortName())) {
            
            return new IdentifierWrapper(userDefinedIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getLength())) {
            
            return new IntegerWrapper(userDefinedIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(userDefinedIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(userDefinedIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getCddType() {
        
        if (CollUtil.isNotEmpty(userDefinedIPdu.getCddType())) {
            
            return new StringWrapper(userDefinedIPdu.getCddType());
            
        } else {
            return null;
        }
        
    }




    


    
}