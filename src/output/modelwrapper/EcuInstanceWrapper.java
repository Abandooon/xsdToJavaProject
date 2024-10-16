package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class EcuInstanceWrapper {

    
    private EcuInstance ecuInstance;

    public EcuInstanceWrapper(EcuInstance ecuInstance) {
        this.ecuInstance = ecuInstance;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getS())) {
            
            return ecuInstance.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getT())) {
            
            return ecuInstance.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getUuid())) {
            
            return ecuInstance.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getShortName())) {
            
            return new IdentifierWrapper(ecuInstance.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = ecuInstance.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getLongName())) {
            
            return new MultilanguageLongNameWrapper(ecuInstance.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(ecuInstance.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getCategory())) {
            
            return new CategoryStringWrapper(ecuInstance.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getAdminData())) {
            
            return new AdminDataWrapper(ecuInstance.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getIntroduction())) {
            
            return new DocumentationBlockWrapper(ecuInstance.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getAnnotations())) {
            ArrayList<Annotation> originalList = ecuInstance.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getVariationPoint())) {
            
            return new VariationPointWrapper(ecuInstance.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AssociatedComIPduGroupRefWrapper> getAssociatedComIPduGroupRefs() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getAssociatedComIPduGroupRefs())) {
            ArrayList<AssociatedComIPduGroupRef> originalList = ecuInstance.getAssociatedComIPduGroupRefs();
            ArrayList<AssociatedComIPduGroupRefWrapper> wrapperList = (ArrayList<AssociatedComIPduGroupRefWrapper>)originalList.stream()
                .map(item -> new AssociatedComIPduGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<AssociatedPdurIPduGroupRefWrapper> getAssociatedPdurIPduGroupRefs() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getAssociatedPdurIPduGroupRefs())) {
            ArrayList<AssociatedPdurIPduGroupRef> originalList = ecuInstance.getAssociatedPdurIPduGroupRefs();
            ArrayList<AssociatedPdurIPduGroupRefWrapper> wrapperList = (ArrayList<AssociatedPdurIPduGroupRefWrapper>)originalList.stream()
                .map(item -> new AssociatedPdurIPduGroupRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<CanTpAddressRefWrapper> getCanTpAddressRefs() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getCanTpAddressRefs())) {
            ArrayList<CanTpAddressRef> originalList = ecuInstance.getCanTpAddressRefs();
            ArrayList<CanTpAddressRefWrapper> wrapperList = (ArrayList<CanTpAddressRefWrapper>)originalList.stream()
                .map(item -> new CanTpAddressRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ClientIdRangeWrapper getClientIdRange() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getClientIdRange())) {
            
            return new ClientIdRangeWrapper(ecuInstance.getClientIdRange());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getComConfigurationGwTimeBase() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getComConfigurationGwTimeBase())) {
            
            return new TimeValueWrapper(ecuInstance.getComConfigurationGwTimeBase());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getComConfigurationRxTimeBase() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getComConfigurationRxTimeBase())) {
            
            return new TimeValueWrapper(ecuInstance.getComConfigurationRxTimeBase());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getComConfigurationTxTimeBase() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getComConfigurationTxTimeBase())) {
            
            return new TimeValueWrapper(ecuInstance.getComConfigurationTxTimeBase());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getComEnableMdtForCyclicTransmission() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getComEnableMdtForCyclicTransmission())) {
            
            return new BooleanWrapper(ecuInstance.getComEnableMdtForCyclicTransmission());
            
        } else {
            return null;
        }
        
    }

    public CommControllersWrapper getCommControllers() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getCommControllers())) {
            
            return new CommControllersWrapper(ecuInstance.getCommControllers());
            
        } else {
            return null;
        }
        
    }

    public ConnectorsWrapper getConnectors() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getConnectors())) {
            
            return new ConnectorsWrapper(ecuInstance.getConnectors());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getDiagnosticAddress() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getDiagnosticAddress())) {
            
            return new IntegerWrapper(ecuInstance.getDiagnosticAddress());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEcuPropsWrapper getDiagnosticProps() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getDiagnosticProps())) {
            
            return new DiagnosticEcuPropsWrapper(ecuInstance.getDiagnosticProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcuPartitionWrapper> getPartitions() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getPartitions())) {
            ArrayList<EcuPartition> originalList = ecuInstance.getPartitions();
            ArrayList<EcuPartitionWrapper> wrapperList = (ArrayList<EcuPartitionWrapper>)originalList.stream()
                .map(item -> new EcuPartitionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPnResetTime() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getPnResetTime())) {
            
            return new TimeValueWrapper(ecuInstance.getPnResetTime());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getPncPrepareSleepTimer() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getPncPrepareSleepTimer())) {
            
            return new TimeValueWrapper(ecuInstance.getPncPrepareSleepTimer());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getSleepModeSupported() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getSleepModeSupported())) {
            
            return new BooleanWrapper(ecuInstance.getSleepModeSupported());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TpAddressRefWrapper> getTpAddressRefs() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getTpAddressRefs())) {
            ArrayList<TpAddressRef> originalList = ecuInstance.getTpAddressRefs();
            ArrayList<TpAddressRefWrapper> wrapperList = (ArrayList<TpAddressRefWrapper>)originalList.stream()
                .map(item -> new TpAddressRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getWakeUpOverBusSupported() {
        
        if (CollUtil.isNotEmpty(ecuInstance.getWakeUpOverBusSupported())) {
            
            return new BooleanWrapper(ecuInstance.getWakeUpOverBusSupported());
            
        } else {
            return null;
        }
        
    }




    


    
}