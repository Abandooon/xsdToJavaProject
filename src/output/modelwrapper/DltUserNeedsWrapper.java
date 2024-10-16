package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class DltUserNeedsWrapper {

    
    private DltUserNeeds dltUserNeeds;

    public DltUserNeedsWrapper(DltUserNeeds dltUserNeeds) {
        this.dltUserNeeds = dltUserNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getS())) {
            
            return dltUserNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getT())) {
            
            return dltUserNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getUuid())) {
            
            return dltUserNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getShortName())) {
            
            return new IdentifierWrapper(dltUserNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dltUserNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dltUserNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dltUserNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getCategory())) {
            
            return new CategoryStringWrapper(dltUserNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getAdminData())) {
            
            return new AdminDataWrapper(dltUserNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dltUserNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dltUserNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = dltUserNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}