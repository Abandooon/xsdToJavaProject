package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class DoIpPowerModeStatusNeedsWrapper {

    
    private DoIpPowerModeStatusNeeds doIpPowerModeStatusNeeds;

    public DoIpPowerModeStatusNeedsWrapper(DoIpPowerModeStatusNeeds doIpPowerModeStatusNeeds) {
        this.doIpPowerModeStatusNeeds = doIpPowerModeStatusNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getS())) {
            
            return doIpPowerModeStatusNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getT())) {
            
            return doIpPowerModeStatusNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getUuid())) {
            
            return doIpPowerModeStatusNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getShortName())) {
            
            return new IdentifierWrapper(doIpPowerModeStatusNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpPowerModeStatusNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpPowerModeStatusNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpPowerModeStatusNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getCategory())) {
            
            return new CategoryStringWrapper(doIpPowerModeStatusNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getAdminData())) {
            
            return new AdminDataWrapper(doIpPowerModeStatusNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpPowerModeStatusNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpPowerModeStatusNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpPowerModeStatusNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}