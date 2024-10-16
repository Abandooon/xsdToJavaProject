package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    


public class BswModuleEntryWrapper {

    
    private BswModuleEntry bswModuleEntry;

    public BswModuleEntryWrapper(BswModuleEntry bswModuleEntry) {
        this.bswModuleEntry = bswModuleEntry;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getS())) {
            
            return bswModuleEntry.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getT())) {
            
            return bswModuleEntry.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getUuid())) {
            
            return bswModuleEntry.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getShortName())) {
            
            return new IdentifierWrapper(bswModuleEntry.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModuleEntry.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModuleEntry.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModuleEntry.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getCategory())) {
            
            return new CategoryStringWrapper(bswModuleEntry.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getAdminData())) {
            
            return new AdminDataWrapper(bswModuleEntry.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModuleEntry.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModuleEntry.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleEntry.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(bswModuleEntry.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getShortNamePattern())) {
            
            return new StringWrapper(bswModuleEntry.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getServiceId() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getServiceId())) {
            
            return new PositiveIntegerWrapper(bswModuleEntry.getServiceId());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getRole() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getRole())) {
            
            return new IdentifierWrapper(bswModuleEntry.getRole());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsReentrant() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getIsReentrant())) {
            
            return new BooleanWrapper(bswModuleEntry.getIsReentrant());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsSynchronous() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getIsSynchronous())) {
            
            return new BooleanWrapper(bswModuleEntry.getIsSynchronous());
            
        } else {
            return null;
        }
        
    }

    public BswCallTypeWrapper getCallType() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getCallType())) {
            
            return new BswCallTypeWrapper(bswModuleEntry.getCallType());
            
        } else {
            return null;
        }
        
    }

    public BswExecutionContextWrapper getExecutionContext() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getExecutionContext())) {
            
            return new BswExecutionContextWrapper(bswModuleEntry.getExecutionContext());
            
        } else {
            return null;
        }
        
    }

    public SwServiceImplPolicyEnumWrapper getSwServiceImplPolicy() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getSwServiceImplPolicy())) {
            
            return new SwServiceImplPolicyEnumWrapper(bswModuleEntry.getSwServiceImplPolicy());
            
        } else {
            return null;
        }
        
    }

    public SwServiceArgWrapper getReturnType() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getReturnType())) {
            
            return new SwServiceArgWrapper(bswModuleEntry.getReturnType());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwServiceArgWrapper> getArguments() {
        
        if (CollUtil.isNotEmpty(bswModuleEntry.getArguments())) {
            ArrayList<SwServiceArg> originalList = bswModuleEntry.getArguments();
            ArrayList<SwServiceArgWrapper> wrapperList = (ArrayList<SwServiceArgWrapper>)originalList.stream()
                .map(item -> new SwServiceArgWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}