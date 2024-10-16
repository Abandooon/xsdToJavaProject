package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    


public class DoIpGidNeedsWrapper {

    
    private DoIpGidNeeds doIpGidNeeds;

    public DoIpGidNeedsWrapper(DoIpGidNeeds doIpGidNeeds) {
        this.doIpGidNeeds = doIpGidNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getS())) {
            
            return doIpGidNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getT())) {
            
            return doIpGidNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getUuid())) {
            
            return doIpGidNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getShortName())) {
            
            return new IdentifierWrapper(doIpGidNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = doIpGidNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(doIpGidNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(doIpGidNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getCategory())) {
            
            return new CategoryStringWrapper(doIpGidNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getAdminData())) {
            
            return new AdminDataWrapper(doIpGidNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(doIpGidNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(doIpGidNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = doIpGidNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}