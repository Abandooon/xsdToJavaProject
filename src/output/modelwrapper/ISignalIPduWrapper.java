package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class ISignalIPduWrapper {

    
    private ISignalIPdu iSignalIPdu;

    public ISignalIPduWrapper(ISignalIPdu iSignalIPdu) {
        this.iSignalIPdu = iSignalIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getS())) {
            
            return iSignalIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getT())) {
            
            return iSignalIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getUuid())) {
            
            return iSignalIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getShortName())) {
            
            return new IdentifierWrapper(iSignalIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iSignalIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iSignalIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iSignalIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getCategory())) {
            
            return new CategoryStringWrapper(iSignalIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getAdminData())) {
            
            return new AdminDataWrapper(iSignalIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iSignalIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = iSignalIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(iSignalIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getLength())) {
            
            return new IntegerWrapper(iSignalIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(iSignalIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(iSignalIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<IPduTimingWrapper> getIPduTimingSpecifications() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getIPduTimingSpecifications())) {
            ArrayList<IPduTiming> originalList = iSignalIPdu.getIPduTimingSpecifications();
            ArrayList<IPduTimingWrapper> wrapperList = (ArrayList<IPduTimingWrapper>)originalList.stream()
                .map(item -> new IPduTimingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ISignalToIPduMappingWrapper> getISignalToPduMappings() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getISignalToPduMappings())) {
            ArrayList<ISignalToIPduMapping> originalList = iSignalIPdu.getISignalToPduMappings();
            ArrayList<ISignalToIPduMappingWrapper> wrapperList = (ArrayList<ISignalToIPduMappingWrapper>)originalList.stream()
                .map(item -> new ISignalToIPduMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SignalIPduCounterWrapper> getPduCounters() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getPduCounters())) {
            ArrayList<SignalIPduCounter> originalList = iSignalIPdu.getPduCounters();
            ArrayList<SignalIPduCounterWrapper> wrapperList = (ArrayList<SignalIPduCounterWrapper>)originalList.stream()
                .map(item -> new SignalIPduCounterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SignalIPduReplicationWrapper> getPduReplications() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getPduReplications())) {
            ArrayList<SignalIPduReplication> originalList = iSignalIPdu.getPduReplications();
            ArrayList<SignalIPduReplicationWrapper> wrapperList = (ArrayList<SignalIPduReplicationWrapper>)originalList.stream()
                .map(item -> new SignalIPduReplicationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getUnusedBitPattern() {
        
        if (CollUtil.isNotEmpty(iSignalIPdu.getUnusedBitPattern())) {
            
            return new IntegerWrapper(iSignalIPdu.getUnusedBitPattern());
            
        } else {
            return null;
        }
        
    }




    


    
}