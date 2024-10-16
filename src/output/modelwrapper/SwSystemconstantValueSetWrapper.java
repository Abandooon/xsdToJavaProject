package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class SwSystemconstantValueSetWrapper {

    
    private SwSystemconstantValueSet swSystemconstantValueSet;

    public SwSystemconstantValueSetWrapper(SwSystemconstantValueSet swSystemconstantValueSet) {
        this.swSystemconstantValueSet = swSystemconstantValueSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getS())) {
            
            return swSystemconstantValueSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getT())) {
            
            return swSystemconstantValueSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getUuid())) {
            
            return swSystemconstantValueSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getShortName())) {
            
            return new IdentifierWrapper(swSystemconstantValueSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swSystemconstantValueSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swSystemconstantValueSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swSystemconstantValueSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getCategory())) {
            
            return new CategoryStringWrapper(swSystemconstantValueSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getAdminData())) {
            
            return new AdminDataWrapper(swSystemconstantValueSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swSystemconstantValueSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getAnnotations())) {
            ArrayList<Annotation> originalList = swSystemconstantValueSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getVariationPoint())) {
            
            return new VariationPointWrapper(swSystemconstantValueSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwSystemconstValueWrapper> getSwSystemconstantValues() {
        
        if (CollUtil.isNotEmpty(swSystemconstantValueSet.getSwSystemconstantValues())) {
            ArrayList<SwSystemconstValue> originalList = swSystemconstantValueSet.getSwSystemconstantValues();
            ArrayList<SwSystemconstValueWrapper> wrapperList = (ArrayList<SwSystemconstValueWrapper>)originalList.stream()
                .map(item -> new SwSystemconstValueWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}