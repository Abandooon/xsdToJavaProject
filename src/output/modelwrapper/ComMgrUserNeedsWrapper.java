package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    


public class ComMgrUserNeedsWrapper {

    
    private ComMgrUserNeeds comMgrUserNeeds;

    public ComMgrUserNeedsWrapper(ComMgrUserNeeds comMgrUserNeeds) {
        this.comMgrUserNeeds = comMgrUserNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getS())) {
            
            return comMgrUserNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getT())) {
            
            return comMgrUserNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getUuid())) {
            
            return comMgrUserNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getShortName())) {
            
            return new IdentifierWrapper(comMgrUserNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = comMgrUserNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(comMgrUserNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(comMgrUserNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getCategory())) {
            
            return new CategoryStringWrapper(comMgrUserNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getAdminData())) {
            
            return new AdminDataWrapper(comMgrUserNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(comMgrUserNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = comMgrUserNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MaxCommModeEnumWrapper getMaxCommMode() {
        
        if (CollUtil.isNotEmpty(comMgrUserNeeds.getMaxCommMode())) {
            
            return new MaxCommModeEnumWrapper(comMgrUserNeeds.getMaxCommMode());
            
        } else {
            return null;
        }
        
    }




    


    
}