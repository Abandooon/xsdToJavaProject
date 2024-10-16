package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class SyncTimeBaseMgrUserNeedsWrapper {

    
    private SyncTimeBaseMgrUserNeeds syncTimeBaseMgrUserNeeds;

    public SyncTimeBaseMgrUserNeedsWrapper(SyncTimeBaseMgrUserNeeds syncTimeBaseMgrUserNeeds) {
        this.syncTimeBaseMgrUserNeeds = syncTimeBaseMgrUserNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getS())) {
            
            return syncTimeBaseMgrUserNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getT())) {
            
            return syncTimeBaseMgrUserNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getUuid())) {
            
            return syncTimeBaseMgrUserNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getShortName())) {
            
            return new IdentifierWrapper(syncTimeBaseMgrUserNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = syncTimeBaseMgrUserNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(syncTimeBaseMgrUserNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(syncTimeBaseMgrUserNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getCategory())) {
            
            return new CategoryStringWrapper(syncTimeBaseMgrUserNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getAdminData())) {
            
            return new AdminDataWrapper(syncTimeBaseMgrUserNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(syncTimeBaseMgrUserNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(syncTimeBaseMgrUserNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = syncTimeBaseMgrUserNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}