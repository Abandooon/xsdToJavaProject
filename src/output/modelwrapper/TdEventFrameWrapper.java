package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TdEventFrameWrapper {

    
    private TdEventFrame tdEventFrame;

    public TdEventFrameWrapper(TdEventFrame tdEventFrame) {
        this.tdEventFrame = tdEventFrame;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getS())) {
            
            return tdEventFrame.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getT())) {
            
            return tdEventFrame.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getUuid())) {
            
            return tdEventFrame.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getShortName())) {
            
            return new IdentifierWrapper(tdEventFrame.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventFrame.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventFrame.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventFrame.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getCategory())) {
            
            return new CategoryStringWrapper(tdEventFrame.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getAdminData())) {
            
            return new AdminDataWrapper(tdEventFrame.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventFrame.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventFrame.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventFrame.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventFrame.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(tdEventFrame.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public FrameRefWrapper getFrameRef() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getFrameRef())) {
            
            return new FrameRefWrapper(tdEventFrame.getFrameRef());
            
        } else {
            return null;
        }
        
    }

    public PhysicalChannelRefWrapper getPhysicalChannelRef() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getPhysicalChannelRef())) {
            
            return new PhysicalChannelRefWrapper(tdEventFrame.getPhysicalChannelRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventFrameTypeEnumWrapper getTdEventType() {
        
        if (CollUtil.isNotEmpty(tdEventFrame.getTdEventType())) {
            
            return new TdEventFrameTypeEnumWrapper(tdEventFrame.getTdEventType());
            
        } else {
            return null;
        }
        
    }




    


    
}