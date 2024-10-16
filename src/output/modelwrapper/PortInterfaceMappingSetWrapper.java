package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    


public class PortInterfaceMappingSetWrapper {

    
    private PortInterfaceMappingSet portInterfaceMappingSet;

    public PortInterfaceMappingSetWrapper(PortInterfaceMappingSet portInterfaceMappingSet) {
        this.portInterfaceMappingSet = portInterfaceMappingSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getS())) {
            
            return portInterfaceMappingSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getT())) {
            
            return portInterfaceMappingSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getUuid())) {
            
            return portInterfaceMappingSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getShortName())) {
            
            return new IdentifierWrapper(portInterfaceMappingSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = portInterfaceMappingSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(portInterfaceMappingSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(portInterfaceMappingSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getCategory())) {
            
            return new CategoryStringWrapper(portInterfaceMappingSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getAdminData())) {
            
            return new AdminDataWrapper(portInterfaceMappingSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(portInterfaceMappingSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getAnnotations())) {
            ArrayList<Annotation> originalList = portInterfaceMappingSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getVariationPoint())) {
            
            return new VariationPointWrapper(portInterfaceMappingSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(portInterfaceMappingSet.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getShortNamePattern())) {
            
            return new StringWrapper(portInterfaceMappingSet.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public PortInterfaceMappingsWrapper getPortInterfaceMappings() {
        
        if (CollUtil.isNotEmpty(portInterfaceMappingSet.getPortInterfaceMappings())) {
            
            return new PortInterfaceMappingsWrapper(portInterfaceMappingSet.getPortInterfaceMappings());
            
        } else {
            return null;
        }
        
    }




    


    
}