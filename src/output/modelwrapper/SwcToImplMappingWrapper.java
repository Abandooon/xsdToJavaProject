package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class SwcToImplMappingWrapper {

    
    private SwcToImplMapping swcToImplMapping;

    public SwcToImplMappingWrapper(SwcToImplMapping swcToImplMapping) {
        this.swcToImplMapping = swcToImplMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getS())) {
            
            return swcToImplMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getT())) {
            
            return swcToImplMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getUuid())) {
            
            return swcToImplMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getShortName())) {
            
            return new IdentifierWrapper(swcToImplMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcToImplMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcToImplMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcToImplMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getCategory())) {
            
            return new CategoryStringWrapper(swcToImplMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getAdminData())) {
            
            return new AdminDataWrapper(swcToImplMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcToImplMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = swcToImplMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ComponentImplementationRefWrapper getComponentImplementationRef() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getComponentImplementationRef())) {
            
            return new ComponentImplementationRefWrapper(swcToImplMapping.getComponentImplementationRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ComponentInSystemInstanceRefWrapper> getComponentIrefs() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getComponentIrefs())) {
            ArrayList<ComponentInSystemInstanceRef> originalList = swcToImplMapping.getComponentIrefs();
            ArrayList<ComponentInSystemInstanceRefWrapper> wrapperList = (ArrayList<ComponentInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new ComponentInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcToImplMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(swcToImplMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}