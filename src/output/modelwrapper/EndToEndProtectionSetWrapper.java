package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class EndToEndProtectionSetWrapper {

    
    private EndToEndProtectionSet endToEndProtectionSet;

    public EndToEndProtectionSetWrapper(EndToEndProtectionSet endToEndProtectionSet) {
        this.endToEndProtectionSet = endToEndProtectionSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getS())) {
            
            return endToEndProtectionSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getT())) {
            
            return endToEndProtectionSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getUuid())) {
            
            return endToEndProtectionSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getShortName())) {
            
            return new IdentifierWrapper(endToEndProtectionSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = endToEndProtectionSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(endToEndProtectionSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(endToEndProtectionSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getCategory())) {
            
            return new CategoryStringWrapper(endToEndProtectionSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getAdminData())) {
            
            return new AdminDataWrapper(endToEndProtectionSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(endToEndProtectionSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getAnnotations())) {
            ArrayList<Annotation> originalList = endToEndProtectionSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getVariationPoint())) {
            
            return new VariationPointWrapper(endToEndProtectionSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EndToEndProtectionWrapper> getEndToEndProtections() {
        
        if (CollUtil.isNotEmpty(endToEndProtectionSet.getEndToEndProtections())) {
            ArrayList<EndToEndProtection> originalList = endToEndProtectionSet.getEndToEndProtections();
            ArrayList<EndToEndProtectionWrapper> wrapperList = (ArrayList<EndToEndProtectionWrapper>)originalList.stream()
                .map(item -> new EndToEndProtectionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}