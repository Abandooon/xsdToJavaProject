package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TdEventISignalWrapper {

    
    private TdEventISignal tdEventISignal;

    public TdEventISignalWrapper(TdEventISignal tdEventISignal) {
        this.tdEventISignal = tdEventISignal;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getS())) {
            
            return tdEventISignal.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getT())) {
            
            return tdEventISignal.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getUuid())) {
            
            return tdEventISignal.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getShortName())) {
            
            return new IdentifierWrapper(tdEventISignal.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventISignal.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventISignal.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventISignal.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getCategory())) {
            
            return new CategoryStringWrapper(tdEventISignal.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getAdminData())) {
            
            return new AdminDataWrapper(tdEventISignal.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventISignal.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventISignal.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventISignal.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventISignal.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(tdEventISignal.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public ISignalRefWrapper getISignalRef() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getISignalRef())) {
            
            return new ISignalRefWrapper(tdEventISignal.getISignalRef());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelRefWrapper getPhysicalChannelRef() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getPhysicalChannelRef())) {
            
            return new PhysicalChannelRefWrapper(tdEventISignal.getPhysicalChannelRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventISignalTypeEnumWrapper getTdEventType() {
        
        if (CollUtil.isNotEmpty(tdEventISignal.getTdEventType())) {
            
            return new TdEventISignalTypeEnumWrapper(tdEventISignal.getTdEventType());
            
        } else {
            return null;
        }
        
    }




    


    
}