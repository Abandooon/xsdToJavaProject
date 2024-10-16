package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    


public class SenderReceiverInterfaceWrapper {

    
    private SenderReceiverInterface senderReceiverInterface;

    public SenderReceiverInterfaceWrapper(SenderReceiverInterface senderReceiverInterface) {
        this.senderReceiverInterface = senderReceiverInterface;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getS())) {
            
            return senderReceiverInterface.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getT())) {
            
            return senderReceiverInterface.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getUuid())) {
            
            return senderReceiverInterface.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getShortName())) {
            
            return new IdentifierWrapper(senderReceiverInterface.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = senderReceiverInterface.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getLongName())) {
            
            return new MultilanguageLongNameWrapper(senderReceiverInterface.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(senderReceiverInterface.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getCategory())) {
            
            return new CategoryStringWrapper(senderReceiverInterface.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getAdminData())) {
            
            return new AdminDataWrapper(senderReceiverInterface.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getIntroduction())) {
            
            return new DocumentationBlockWrapper(senderReceiverInterface.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getAnnotations())) {
            ArrayList<Annotation> originalList = senderReceiverInterface.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getVariationPoint())) {
            
            return new VariationPointWrapper(senderReceiverInterface.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(senderReceiverInterface.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getShortNamePattern())) {
            
            return new StringWrapper(senderReceiverInterface.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsService() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getIsService())) {
            
            return new BooleanWrapper(senderReceiverInterface.getIsService());
            
        } else {
            return null;
        }
        
    }

    public ServiceProviderEnumWrapper getServiceKind() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getServiceKind())) {
            
            return new ServiceProviderEnumWrapper(senderReceiverInterface.getServiceKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getDataElements() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getDataElements())) {
            ArrayList<VariableDataPrototype> originalList = senderReceiverInterface.getDataElements();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InvalidationPolicyWrapper> getInvalidationPolicys() {
        
        if (CollUtil.isNotEmpty(senderReceiverInterface.getInvalidationPolicys())) {
            ArrayList<InvalidationPolicy> originalList = senderReceiverInterface.getInvalidationPolicys();
            ArrayList<InvalidationPolicyWrapper> wrapperList = (ArrayList<InvalidationPolicyWrapper>)originalList.stream()
                .map(item -> new InvalidationPolicyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}