package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    


public class IPduPortWrapper {

    
    private IPduPort iPduPort;

    public IPduPortWrapper(IPduPort iPduPort) {
        this.iPduPort = iPduPort;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(iPduPort.getS())) {
            
            return iPduPort.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(iPduPort.getT())) {
            
            return iPduPort.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(iPduPort.getUuid())) {
            
            return iPduPort.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(iPduPort.getShortName())) {
            
            return new IdentifierWrapper(iPduPort.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(iPduPort.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = iPduPort.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(iPduPort.getLongName())) {
            
            return new MultilanguageLongNameWrapper(iPduPort.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(iPduPort.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(iPduPort.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(iPduPort.getCategory())) {
            
            return new CategoryStringWrapper(iPduPort.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(iPduPort.getAdminData())) {
            
            return new AdminDataWrapper(iPduPort.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(iPduPort.getIntroduction())) {
            
            return new DocumentationBlockWrapper(iPduPort.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(iPduPort.getAnnotations())) {
            ArrayList<Annotation> originalList = iPduPort.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationDirectionTypeWrapper getCommunicationDirection() {
        
        if (CollUtil.isNotEmpty(iPduPort.getCommunicationDirection())) {
            
            return new CommunicationDirectionTypeWrapper(iPduPort.getCommunicationDirection());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(iPduPort.getVariationPoint())) {
            
            return new VariationPointWrapper(iPduPort.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IPduSignalProcessingEnumWrapper getIPduSignalProcessing() {
        
        if (CollUtil.isNotEmpty(iPduPort.getIPduSignalProcessing())) {
            
            return new IPduSignalProcessingEnumWrapper(iPduPort.getIPduSignalProcessing());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getKeyId() {
        
        if (CollUtil.isNotEmpty(iPduPort.getKeyId())) {
            
            return new PositiveIntegerWrapper(iPduPort.getKeyId());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getRxSecurityVerification() {
        
        if (CollUtil.isNotEmpty(iPduPort.getRxSecurityVerification())) {
            
            return new BooleanWrapper(iPduPort.getRxSecurityVerification());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimestampRxAcceptanceWindow() {
        
        if (CollUtil.isNotEmpty(iPduPort.getTimestampRxAcceptanceWindow())) {
            
            return new TimeValueWrapper(iPduPort.getTimestampRxAcceptanceWindow());
            
        } else {
            return null;
        }
        
    }




    


    
}