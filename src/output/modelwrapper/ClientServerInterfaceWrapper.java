package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class ClientServerInterfaceWrapper {

    
    private ClientServerInterface clientServerInterface;

    public ClientServerInterfaceWrapper(ClientServerInterface clientServerInterface) {
        this.clientServerInterface = clientServerInterface;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getS())) {
            
            return clientServerInterface.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getT())) {
            
            return clientServerInterface.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getUuid())) {
            
            return clientServerInterface.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getShortName())) {
            
            return new IdentifierWrapper(clientServerInterface.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = clientServerInterface.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getLongName())) {
            
            return new MultilanguageLongNameWrapper(clientServerInterface.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(clientServerInterface.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getCategory())) {
            
            return new CategoryStringWrapper(clientServerInterface.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getAdminData())) {
            
            return new AdminDataWrapper(clientServerInterface.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getIntroduction())) {
            
            return new DocumentationBlockWrapper(clientServerInterface.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getAnnotations())) {
            ArrayList<Annotation> originalList = clientServerInterface.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getVariationPoint())) {
            
            return new VariationPointWrapper(clientServerInterface.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(clientServerInterface.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getShortNamePattern())) {
            
            return new StringWrapper(clientServerInterface.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsService() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getIsService())) {
            
            return new BooleanWrapper(clientServerInterface.getIsService());
            
        } else {
            return null;
        }
        
    }

    public ServiceProviderEnumWrapper getServiceKind() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getServiceKind())) {
            
            return new ServiceProviderEnumWrapper(clientServerInterface.getServiceKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientServerOperationWrapper> getOperations() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getOperations())) {
            ArrayList<ClientServerOperation> originalList = clientServerInterface.getOperations();
            ArrayList<ClientServerOperationWrapper> wrapperList = (ArrayList<ClientServerOperationWrapper>)originalList.stream()
                .map(item -> new ClientServerOperationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ApplicationErrorWrapper> getPossibleErrors() {
        
        if (CollUtil.isNotEmpty(clientServerInterface.getPossibleErrors())) {
            ArrayList<ApplicationError> originalList = clientServerInterface.getPossibleErrors();
            ArrayList<ApplicationErrorWrapper> wrapperList = (ArrayList<ApplicationErrorWrapper>)originalList.stream()
                .map(item -> new ApplicationErrorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}