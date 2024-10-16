package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class DoIpGidSynchronizationNeedsWrapper {

    
    private DoIpGidSynchronizationNeeds doIpGidSynchronizationNeeds;

    public DoIpGidSynchronizationNeedsWrapper(DoIpGidSynchronizationNeeds doIpGidSynchronizationNeeds) {
        this.doIpGidSynchronizationNeeds = doIpGidSynchronizationNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getS())) {
            
            return doIpGidSynchronizationNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getT())) {
            
            return doIpGidSynchronizationNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getUuid())) {
            
            return doIpGidSynchronizationNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getShortName())) {
            
            return new IdentifierWrapper(doIpGidSynchronizationNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpGidSynchronizationNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpGidSynchronizationNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpGidSynchronizationNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getCategory())) {
            
            return new CategoryStringWrapper(doIpGidSynchronizationNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getAdminData())) {
            
            return new AdminDataWrapper(doIpGidSynchronizationNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpGidSynchronizationNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpGidSynchronizationNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpGidSynchronizationNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}