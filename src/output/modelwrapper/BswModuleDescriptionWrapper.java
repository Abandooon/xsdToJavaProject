package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class BswModuleDescriptionWrapper {

    
    private BswModuleDescription bswModuleDescription;

    public BswModuleDescriptionWrapper(BswModuleDescription bswModuleDescription) {
        this.bswModuleDescription = bswModuleDescription;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getS())) {
            
            return bswModuleDescription.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getT())) {
            
            return bswModuleDescription.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getUuid())) {
            
            return bswModuleDescription.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getShortName())) {
            
            return new IdentifierWrapper(bswModuleDescription.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = bswModuleDescription.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getLongName())) {
            
            return new MultilanguageLongNameWrapper(bswModuleDescription.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(bswModuleDescription.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getCategory())) {
            
            return new CategoryStringWrapper(bswModuleDescription.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getAdminData())) {
            
            return new AdminDataWrapper(bswModuleDescription.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getIntroduction())) {
            
            return new DocumentationBlockWrapper(bswModuleDescription.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getAnnotations())) {
            ArrayList<Annotation> originalList = bswModuleDescription.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getVariationPoint())) {
            
            return new VariationPointWrapper(bswModuleDescription.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BlueprintPolicysWrapper getBlueprintPolicys() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getBlueprintPolicys())) {
            
            return new BlueprintPolicysWrapper(bswModuleDescription.getBlueprintPolicys());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getShortNamePattern() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getShortNamePattern())) {
            
            return new StringWrapper(bswModuleDescription.getShortNamePattern());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getModuleId() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getModuleId())) {
            
            return new PositiveIntegerWrapper(bswModuleDescription.getModuleId());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwComponentDocumentationWrapper> getBswModuleDocumentations() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getBswModuleDocumentations())) {
            ArrayList<SwComponentDocumentation> originalList = bswModuleDescription.getBswModuleDocumentations();
            ArrayList<SwComponentDocumentationWrapper> wrapperList = (ArrayList<SwComponentDocumentationWrapper>)originalList.stream()
                .map(item -> new SwComponentDocumentationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getProvidedEntrys() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getProvidedEntrys())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswModuleDescription.getProvidedEntrys();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleEntryRefConditionalWrapper> getOutgoingCallbacks() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getOutgoingCallbacks())) {
            ArrayList<BswModuleEntryRefConditional> originalList = bswModuleDescription.getOutgoingCallbacks();
            ArrayList<BswModuleEntryRefConditionalWrapper> wrapperList = (ArrayList<BswModuleEntryRefConditionalWrapper>)originalList.stream()
                .map(item -> new BswModuleEntryRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleDependencyWrapper> getBswModuleDependencys() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getBswModuleDependencys())) {
            ArrayList<BswModuleDependency> originalList = bswModuleDescription.getBswModuleDependencys();
            ArrayList<BswModuleDependencyWrapper> wrapperList = (ArrayList<BswModuleDependencyWrapper>)originalList.stream()
                .map(item -> new BswModuleDependencyWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeWrapper> getProvidedModeGroups() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getProvidedModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototype> originalList = bswModuleDescription.getProvidedModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ModeDeclarationGroupPrototypeWrapper> getRequiredModeGroups() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getRequiredModeGroups())) {
            ArrayList<ModeDeclarationGroupPrototype> originalList = bswModuleDescription.getRequiredModeGroups();
            ArrayList<ModeDeclarationGroupPrototypeWrapper> wrapperList = (ArrayList<ModeDeclarationGroupPrototypeWrapper>)originalList.stream()
                .map(item -> new ModeDeclarationGroupPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerWrapper> getReleasedTriggers() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getReleasedTriggers())) {
            ArrayList<Trigger> originalList = bswModuleDescription.getReleasedTriggers();
            ArrayList<TriggerWrapper> wrapperList = (ArrayList<TriggerWrapper>)originalList.stream()
                .map(item -> new TriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TriggerWrapper> getRequiredTriggers() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getRequiredTriggers())) {
            ArrayList<Trigger> originalList = bswModuleDescription.getRequiredTriggers();
            ArrayList<TriggerWrapper> wrapperList = (ArrayList<TriggerWrapper>)originalList.stream()
                .map(item -> new TriggerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleClientServerEntryWrapper> getProvidedClientServerEntrys() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getProvidedClientServerEntrys())) {
            ArrayList<BswModuleClientServerEntry> originalList = bswModuleDescription.getProvidedClientServerEntrys();
            ArrayList<BswModuleClientServerEntryWrapper> wrapperList = (ArrayList<BswModuleClientServerEntryWrapper>)originalList.stream()
                .map(item -> new BswModuleClientServerEntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswModuleClientServerEntryWrapper> getRequiredClientServerEntrys() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getRequiredClientServerEntrys())) {
            ArrayList<BswModuleClientServerEntry> originalList = bswModuleDescription.getRequiredClientServerEntrys();
            ArrayList<BswModuleClientServerEntryWrapper> wrapperList = (ArrayList<BswModuleClientServerEntryWrapper>)originalList.stream()
                .map(item -> new BswModuleClientServerEntryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getProvidedDatas() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getProvidedDatas())) {
            ArrayList<VariableDataPrototype> originalList = bswModuleDescription.getProvidedDatas();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<VariableDataPrototypeWrapper> getRequiredDatas() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getRequiredDatas())) {
            ArrayList<VariableDataPrototype> originalList = bswModuleDescription.getRequiredDatas();
            ArrayList<VariableDataPrototypeWrapper> wrapperList = (ArrayList<VariableDataPrototypeWrapper>)originalList.stream()
                .map(item -> new VariableDataPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<BswInternalBehaviorWrapper> getInternalBehaviors() {
        
        if (CollUtil.isNotEmpty(bswModuleDescription.getInternalBehaviors())) {
            ArrayList<BswInternalBehavior> originalList = bswModuleDescription.getInternalBehaviors();
            ArrayList<BswInternalBehaviorWrapper> wrapperList = (ArrayList<BswInternalBehaviorWrapper>)originalList.stream()
                .map(item -> new BswInternalBehaviorWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}