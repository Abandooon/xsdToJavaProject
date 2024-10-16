package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class AssemblySwConnectorWrapper {

    
    private AssemblySwConnector assemblySwConnector;

    public AssemblySwConnectorWrapper(AssemblySwConnector assemblySwConnector) {
        this.assemblySwConnector = assemblySwConnector;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getS())) {
            
            return assemblySwConnector.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getT())) {
            
            return assemblySwConnector.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getUuid())) {
            
            return assemblySwConnector.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getShortName())) {
            
            return new IdentifierWrapper(assemblySwConnector.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = assemblySwConnector.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getLongName())) {
            
            return new MultilanguageLongNameWrapper(assemblySwConnector.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(assemblySwConnector.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getCategory())) {
            
            return new CategoryStringWrapper(assemblySwConnector.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getAdminData())) {
            
            return new AdminDataWrapper(assemblySwConnector.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getIntroduction())) {
            
            return new DocumentationBlockWrapper(assemblySwConnector.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getAnnotations())) {
            ArrayList<Annotation> originalList = assemblySwConnector.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MappingRefWrapper getMappingRef() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getMappingRef())) {
            
            return new MappingRefWrapper(assemblySwConnector.getMappingRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getVariationPoint())) {
            
            return new VariationPointWrapper(assemblySwConnector.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PPortInCompositionInstanceRefWrapper getProviderIref() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getProviderIref())) {
            
            return new PPortInCompositionInstanceRefWrapper(assemblySwConnector.getProviderIref());
            
        } else {
            return null;
        }
        
    }

    public RPortInCompositionInstanceRefWrapper getRequesterIref() {
        
        if (CollUtil.isNotEmpty(assemblySwConnector.getRequesterIref())) {
            
            return new RPortInCompositionInstanceRefWrapper(assemblySwConnector.getRequesterIref());
            
        } else {
            return null;
        }
        
    }




    


    
}