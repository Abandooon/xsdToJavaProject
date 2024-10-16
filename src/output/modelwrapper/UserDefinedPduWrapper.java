package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    


public class UserDefinedPduWrapper {

    
    private UserDefinedPdu userDefinedPdu;

    public UserDefinedPduWrapper(UserDefinedPdu userDefinedPdu) {
        this.userDefinedPdu = userDefinedPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getS())) {
            
            return userDefinedPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getT())) {
            
            return userDefinedPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getUuid())) {
            
            return userDefinedPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getShortName())) {
            
            return new IdentifierWrapper(userDefinedPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = userDefinedPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(userDefinedPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(userDefinedPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getCategory())) {
            
            return new CategoryStringWrapper(userDefinedPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getAdminData())) {
            
            return new AdminDataWrapper(userDefinedPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(userDefinedPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = userDefinedPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(userDefinedPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getLength())) {
            
            return new IntegerWrapper(userDefinedPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(userDefinedPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getCddType() {
        
        if (CollUtil.isNotEmpty(userDefinedPdu.getCddType())) {
            
            return new StringWrapper(userDefinedPdu.getCddType());
            
        } else {
            return null;
        }
        
    }




    


    
}