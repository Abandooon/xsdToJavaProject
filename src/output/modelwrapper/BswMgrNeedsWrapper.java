package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class BswMgrNeedsWrapper {

    
    private BswMgrNeeds bswMgrNeeds;

    public BswMgrNeedsWrapper(BswMgrNeeds bswMgrNeeds) {
        this.bswMgrNeeds = bswMgrNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getS())) {
            
            return bswMgrNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getT())) {
            
            return bswMgrNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getUuid())) {
            
            return bswMgrNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getShortName())) {
            
            return new IdentifierWrapper(bswMgrNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswMgrNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswMgrNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswMgrNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getCategory())) {
            
            return new CategoryStringWrapper(bswMgrNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getAdminData())) {
            
            return new AdminDataWrapper(bswMgrNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswMgrNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswMgrNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = bswMgrNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}