package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class ClientIdDefinitionWrapper {

    
    private ClientIdDefinition clientIdDefinition;

    public ClientIdDefinitionWrapper(ClientIdDefinition clientIdDefinition) {
        this.clientIdDefinition = clientIdDefinition;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getS())) {
            
            return clientIdDefinition.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getT())) {
            
            return clientIdDefinition.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getUuid())) {
            
            return clientIdDefinition.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getShortName())) {
            
            return new IdentifierWrapper(clientIdDefinition.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = clientIdDefinition.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getLongName())) {
            
            return new MultilanguageLongNameWrapper(clientIdDefinition.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(clientIdDefinition.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getCategory())) {
            
            return new CategoryStringWrapper(clientIdDefinition.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getAdminData())) {
            
            return new AdminDataWrapper(clientIdDefinition.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientIdDefinition.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getAnnotations())) {
            ArrayList<Annotation> originalList = clientIdDefinition.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getClientId() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getClientId())) {
            
            return new NumericalValueWrapper(clientIdDefinition.getClientId());
            
        } else {
            return null;
        }
        
    }

    public OperationInSystemInstanceRefWrapper getClientServerOperationIref() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getClientServerOperationIref())) {
            
            return new OperationInSystemInstanceRefWrapper(clientIdDefinition.getClientServerOperationIref());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientIdDefinition.getVariationPoint())) {
            
            return new VariationPointWrapper(clientIdDefinition.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}