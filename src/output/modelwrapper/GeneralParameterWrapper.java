package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class GeneralParameterWrapper {

    
    private GeneralParameter generalParameter;

    public GeneralParameterWrapper(GeneralParameter generalParameter) {
        this.generalParameter = generalParameter;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(generalParameter.getS())) {
            
            return generalParameter.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(generalParameter.getT())) {
            
            return generalParameter.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(generalParameter.getUuid())) {
            
            return generalParameter.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(generalParameter.getShortName())) {
            
            return new IdentifierWrapper(generalParameter.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(generalParameter.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = generalParameter.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(generalParameter.getLongName())) {
            
            return new MultilanguageLongNameWrapper(generalParameter.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(generalParameter.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(generalParameter.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(generalParameter.getCategory())) {
            
            return new CategoryStringWrapper(generalParameter.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(generalParameter.getAdminData())) {
            
            return new AdminDataWrapper(generalParameter.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(generalParameter.getIntroduction())) {
            
            return new DocumentationBlockWrapper(generalParameter.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(generalParameter.getAnnotations())) {
            ArrayList<Annotation> originalList = generalParameter.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PrmCharWrapper> getPrmChar() {
        
        if (CollUtil.isNotEmpty(generalParameter.getPrmChar())) {
            ArrayList<PrmChar> originalList = generalParameter.getPrmChar();
            ArrayList<PrmCharWrapper> wrapperList = (ArrayList<PrmCharWrapper>)originalList.stream()
                .map(item -> new PrmCharWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}