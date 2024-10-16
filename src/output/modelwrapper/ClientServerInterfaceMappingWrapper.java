package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    


public class ClientServerInterfaceMappingWrapper {

    
    private ClientServerInterfaceMapping clientServerInterfaceMapping;

    public ClientServerInterfaceMappingWrapper(ClientServerInterfaceMapping clientServerInterfaceMapping) {
        this.clientServerInterfaceMapping = clientServerInterfaceMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getS())) {
            
            return clientServerInterfaceMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getT())) {
            
            return clientServerInterfaceMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getUuid())) {
            
            return clientServerInterfaceMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getShortName())) {
            
            return new IdentifierWrapper(clientServerInterfaceMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = clientServerInterfaceMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(clientServerInterfaceMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(clientServerInterfaceMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getCategory())) {
            
            return new CategoryStringWrapper(clientServerInterfaceMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getAdminData())) {
            
            return new AdminDataWrapper(clientServerInterfaceMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientServerInterfaceMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = clientServerInterfaceMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(clientServerInterfaceMapping.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getShortNamePattern())) {
            
            return new StringWrapper(clientServerInterfaceMapping.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(clientServerInterfaceMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerApplicationErrorMappingWrapper> getErrorMappings() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getErrorMappings())) {
            ArrayList<ClientServerApplicationErrorMapping> originalList = clientServerInterfaceMapping.getErrorMappings();
            ArrayList<ClientServerApplicationErrorMappingWrapper> wrapperList = (ArrayList<ClientServerApplicationErrorMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerApplicationErrorMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerOperationMappingWrapper> getOperationMappings() {
        
        if (CollUtil.isNotEmpty(clientServerInterfaceMapping.getOperationMappings())) {
            ArrayList<ClientServerOperationMapping> originalList = clientServerInterfaceMapping.getOperationMappings();
            ArrayList<ClientServerOperationMappingWrapper> wrapperList = (ArrayList<ClientServerOperationMappingWrapper>)originalList.stream()
                .map(item -> new ClientServerOperationMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}