package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class FunctionInhibitionNeedsWrapper {

    
    private FunctionInhibitionNeeds functionInhibitionNeeds;

    public FunctionInhibitionNeedsWrapper(FunctionInhibitionNeeds functionInhibitionNeeds) {
        this.functionInhibitionNeeds = functionInhibitionNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getS())) {
            
            return functionInhibitionNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getT())) {
            
            return functionInhibitionNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getUuid())) {
            
            return functionInhibitionNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getShortName())) {
            
            return new IdentifierWrapper(functionInhibitionNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = functionInhibitionNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(functionInhibitionNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(functionInhibitionNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getCategory())) {
            
            return new CategoryStringWrapper(functionInhibitionNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getAdminData())) {
            
            return new AdminDataWrapper(functionInhibitionNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(functionInhibitionNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(functionInhibitionNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = functionInhibitionNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}