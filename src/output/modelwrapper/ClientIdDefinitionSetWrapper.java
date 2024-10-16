package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class ClientIdDefinitionSetWrapper {

    
    private ClientIdDefinitionSet clientIdDefinitionSet;

    public ClientIdDefinitionSetWrapper(ClientIdDefinitionSet clientIdDefinitionSet) {
        this.clientIdDefinitionSet = clientIdDefinitionSet;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getS())) {
            
            return clientIdDefinitionSet.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getT())) {
            
            return clientIdDefinitionSet.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getUuid())) {
            
            return clientIdDefinitionSet.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getShortName())) {
            
            return new IdentifierWrapper(clientIdDefinitionSet.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = clientIdDefinitionSet.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getLongName())) {
            
            return new MultilanguageLongNameWrapper(clientIdDefinitionSet.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(clientIdDefinitionSet.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getCategory())) {
            
            return new CategoryStringWrapper(clientIdDefinitionSet.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getAdminData())) {
            
            return new AdminDataWrapper(clientIdDefinitionSet.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientIdDefinitionSet.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getAnnotations())) {
            ArrayList<Annotation> originalList = clientIdDefinitionSet.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getVariationPoint())) {
            
            return new VariationPointWrapper(clientIdDefinitionSet.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientIdDefinitionWrapper> getClientIdDefinitions() {
        
        if (CollUtil.isNotEmpty(clientIdDefinitionSet.getClientIdDefinitions())) {
            ArrayList<ClientIdDefinition> originalList = clientIdDefinitionSet.getClientIdDefinitions();
            ArrayList<ClientIdDefinitionWrapper> wrapperList = (ArrayList<ClientIdDefinitionWrapper>)originalList.stream()
                .map(item -> new ClientIdDefinitionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}