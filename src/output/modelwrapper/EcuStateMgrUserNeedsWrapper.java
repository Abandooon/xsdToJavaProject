package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class EcuStateMgrUserNeedsWrapper {

    
    private EcuStateMgrUserNeeds ecuStateMgrUserNeeds;

    public EcuStateMgrUserNeedsWrapper(EcuStateMgrUserNeeds ecuStateMgrUserNeeds) {
        this.ecuStateMgrUserNeeds = ecuStateMgrUserNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getS())) {
            
            return ecuStateMgrUserNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getT())) {
            
            return ecuStateMgrUserNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getUuid())) {
            
            return ecuStateMgrUserNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getShortName())) {
            
            return new IdentifierWrapper(ecuStateMgrUserNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecuStateMgrUserNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecuStateMgrUserNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecuStateMgrUserNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getCategory())) {
            
            return new CategoryStringWrapper(ecuStateMgrUserNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getAdminData())) {
            
            return new AdminDataWrapper(ecuStateMgrUserNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuStateMgrUserNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecuStateMgrUserNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = ecuStateMgrUserNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}