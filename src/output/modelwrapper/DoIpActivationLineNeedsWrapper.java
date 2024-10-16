package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class DoIpActivationLineNeedsWrapper {

    
    private DoIpActivationLineNeeds doIpActivationLineNeeds;

    public DoIpActivationLineNeedsWrapper(DoIpActivationLineNeeds doIpActivationLineNeeds) {
        this.doIpActivationLineNeeds = doIpActivationLineNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getS())) {
            
            return doIpActivationLineNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getT())) {
            
            return doIpActivationLineNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getUuid())) {
            
            return doIpActivationLineNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getShortName())) {
            
            return new IdentifierWrapper(doIpActivationLineNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpActivationLineNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpActivationLineNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpActivationLineNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getCategory())) {
            
            return new CategoryStringWrapper(doIpActivationLineNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getAdminData())) {
            
            return new AdminDataWrapper(doIpActivationLineNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpActivationLineNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpActivationLineNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpActivationLineNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}