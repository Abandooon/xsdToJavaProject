package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class NvBlockNeedsWrapper {

    
    private NvBlockNeeds nvBlockNeeds;

    public NvBlockNeedsWrapper(NvBlockNeeds nvBlockNeeds) {
        this.nvBlockNeeds = nvBlockNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getS())) {
            
            return nvBlockNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getT())) {
            
            return nvBlockNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getUuid())) {
            
            return nvBlockNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getShortName())) {
            
            return new IdentifierWrapper(nvBlockNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nvBlockNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nvBlockNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nvBlockNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getCategory())) {
            
            return new CategoryStringWrapper(nvBlockNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getAdminData())) {
            
            return new AdminDataWrapper(nvBlockNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nvBlockNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = nvBlockNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCalcRamBlockCrc() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getCalcRamBlockCrc())) {
            
            return new BooleanWrapper(nvBlockNeeds.getCalcRamBlockCrc());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getCheckStaticBlockId() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getCheckStaticBlockId())) {
            
            return new BooleanWrapper(nvBlockNeeds.getCheckStaticBlockId());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getCyclicWritingPeriod() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getCyclicWritingPeriod())) {
            
            return new TimeValueWrapper(nvBlockNeeds.getCyclicWritingPeriod());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNDataSets() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getNDataSets())) {
            
            return new PositiveIntegerWrapper(nvBlockNeeds.getNDataSets());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getNRomBlocks() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getNRomBlocks())) {
            
            return new PositiveIntegerWrapper(nvBlockNeeds.getNRomBlocks());
            
        } else {
            return null;
        }
        
    }

    public RamBlockStatusControlEnumWrapper getRamBlockStatusControl() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getRamBlockStatusControl())) {
            
            return new RamBlockStatusControlEnumWrapper(nvBlockNeeds.getRamBlockStatusControl());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getReadonly() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getReadonly())) {
            
            return new BooleanWrapper(nvBlockNeeds.getReadonly());
            
        } else {
            return null;
        }
        
    }

    public NvBlockNeedsReliabilityEnumWrapper getReliability() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getReliability())) {
            
            return new NvBlockNeedsReliabilityEnumWrapper(nvBlockNeeds.getReliability());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getResistantToChangedSw() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getResistantToChangedSw())) {
            
            return new BooleanWrapper(nvBlockNeeds.getResistantToChangedSw());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRestoreAtStart() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getRestoreAtStart())) {
            
            return new BooleanWrapper(nvBlockNeeds.getRestoreAtStart());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getStoreAtShutdown() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getStoreAtShutdown())) {
            
            return new BooleanWrapper(nvBlockNeeds.getStoreAtShutdown());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getStoreCyclic() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getStoreCyclic())) {
            
            return new BooleanWrapper(nvBlockNeeds.getStoreCyclic());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getStoreEmergency() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getStoreEmergency())) {
            
            return new BooleanWrapper(nvBlockNeeds.getStoreEmergency());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getStoreImmediate() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getStoreImmediate())) {
            
            return new BooleanWrapper(nvBlockNeeds.getStoreImmediate());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getUseAutoValidationAtShutDown() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getUseAutoValidationAtShutDown())) {
            
            return new BooleanWrapper(nvBlockNeeds.getUseAutoValidationAtShutDown());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getUseCrcCompMechanism() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getUseCrcCompMechanism())) {
            
            return new BooleanWrapper(nvBlockNeeds.getUseCrcCompMechanism());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWriteOnlyOnce() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getWriteOnlyOnce())) {
            
            return new BooleanWrapper(nvBlockNeeds.getWriteOnlyOnce());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWriteVerification() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getWriteVerification())) {
            
            return new BooleanWrapper(nvBlockNeeds.getWriteVerification());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getWritingFrequency() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getWritingFrequency())) {
            
            return new PositiveIntegerWrapper(nvBlockNeeds.getWritingFrequency());
            
        } else {
            return null;
        }
        
    }

    public NvBlockNeedsWritingPriorityEnumWrapper getWritingPriority() {
        
        if (CollUtil.isNotEmpty(nvBlockNeeds.getWritingPriority())) {
            
            return new NvBlockNeedsWritingPriorityEnumWrapper(nvBlockNeeds.getWritingPriority());
            
        } else {
            return null;
        }
        
    }




    


    
}