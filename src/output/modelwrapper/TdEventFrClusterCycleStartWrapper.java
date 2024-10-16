package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class TdEventFrClusterCycleStartWrapper {

    
    private TdEventFrClusterCycleStart tdEventFrClusterCycleStart;

    public TdEventFrClusterCycleStartWrapper(TdEventFrClusterCycleStart tdEventFrClusterCycleStart) {
        this.tdEventFrClusterCycleStart = tdEventFrClusterCycleStart;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getS())) {
            
            return tdEventFrClusterCycleStart.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getT())) {
            
            return tdEventFrClusterCycleStart.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getUuid())) {
            
            return tdEventFrClusterCycleStart.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getShortName())) {
            
            return new IdentifierWrapper(tdEventFrClusterCycleStart.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventFrClusterCycleStart.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventFrClusterCycleStart.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventFrClusterCycleStart.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getCategory())) {
            
            return new CategoryStringWrapper(tdEventFrClusterCycleStart.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getAdminData())) {
            
            return new AdminDataWrapper(tdEventFrClusterCycleStart.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventFrClusterCycleStart.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventFrClusterCycleStart.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventFrClusterCycleStart.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventFrClusterCycleStart.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(tdEventFrClusterCycleStart.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCycleRepetition() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getCycleRepetition())) {
            
            return new IntegerWrapper(tdEventFrClusterCycleStart.getCycleRepetition());
            
        } else {
            return null;
        }
        
    }

    public FrClusterRefWrapper getFrClusterRef() {
        
        if (CollUtil.isNotEmpty(tdEventFrClusterCycleStart.getFrClusterRef())) {
            
            return new FrClusterRefWrapper(tdEventFrClusterCycleStart.getFrClusterRef());
            
        } else {
            return null;
        }
        
    }




    


    
}