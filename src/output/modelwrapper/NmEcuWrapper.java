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
    

    
    


public class NmEcuWrapper {

    
    private NmEcu nmEcu;

    public NmEcuWrapper(NmEcu nmEcu) {
        this.nmEcu = nmEcu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(nmEcu.getS())) {
            
            return nmEcu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(nmEcu.getT())) {
            
            return nmEcu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(nmEcu.getUuid())) {
            
            return nmEcu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(nmEcu.getShortName())) {
            
            return new IdentifierWrapper(nmEcu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(nmEcu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = nmEcu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(nmEcu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(nmEcu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(nmEcu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(nmEcu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(nmEcu.getCategory())) {
            
            return new CategoryStringWrapper(nmEcu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(nmEcu.getAdminData())) {
            
            return new AdminDataWrapper(nmEcu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(nmEcu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(nmEcu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(nmEcu.getAnnotations())) {
            ArrayList<Annotation> originalList = nmEcu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public BusDependentNmEcusWrapper getBusDependentNmEcus() {
        
        if (CollUtil.isNotEmpty(nmEcu.getBusDependentNmEcus())) {
            
            return new BusDependentNmEcusWrapper(nmEcu.getBusDependentNmEcus());
            
        } else {
            return null;
        }
        
    }

    public BusSpecificNmEcuWrapper getBusSpecificNmEcu() {
        
        if (CollUtil.isNotEmpty(nmEcu.getBusSpecificNmEcu())) {
            
            return new BusSpecificNmEcuWrapper(nmEcu.getBusSpecificNmEcu());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(nmEcu.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(nmEcu.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmBusSynchronizationEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmBusSynchronizationEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmBusSynchronizationEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmComControlEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmComControlEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmComControlEnabled());
            
        } else {
            return null;
        }
        
    }

    public NmCoordinatorWrapper getNmCoordinator() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmCoordinator())) {
            
            return new NmCoordinatorWrapper(nmEcu.getNmCoordinator());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getNmCycletimeMainFunction() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmCycletimeMainFunction())) {
            
            return new TimeValueWrapper(nmEcu.getNmCycletimeMainFunction());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmMultipleChannelsEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmMultipleChannelsEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmMultipleChannelsEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmNodeDetectionEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmNodeDetectionEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmNodeDetectionEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmNodeIdEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmNodeIdEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmNodeIdEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmPassiveModeEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmPassiveModeEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmPassiveModeEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmPduRxIndicationEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmPduRxIndicationEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmPduRxIndicationEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmRemoteSleepIndEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmRemoteSleepIndEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmRemoteSleepIndEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmRepeatMsgIndEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmRepeatMsgIndEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmRepeatMsgIndEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmStateChangeIndEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmStateChangeIndEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmStateChangeIndEnabled());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getNmUserDataEnabled() {
        
        if (CollUtil.isNotEmpty(nmEcu.getNmUserDataEnabled())) {
            
            return new BooleanWrapper(nmEcu.getNmUserDataEnabled());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(nmEcu.getVariationPoint())) {
            
            return new VariationPointWrapper(nmEcu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}