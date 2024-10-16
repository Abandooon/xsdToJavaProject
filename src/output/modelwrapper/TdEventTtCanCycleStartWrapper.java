package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    


public class TdEventTtCanCycleStartWrapper {

    
    private TdEventTtCanCycleStart tdEventTtCanCycleStart;

    public TdEventTtCanCycleStartWrapper(TdEventTtCanCycleStart tdEventTtCanCycleStart) {
        this.tdEventTtCanCycleStart = tdEventTtCanCycleStart;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getS())) {
            
            return tdEventTtCanCycleStart.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getT())) {
            
            return tdEventTtCanCycleStart.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getUuid())) {
            
            return tdEventTtCanCycleStart.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getShortName())) {
            
            return new IdentifierWrapper(tdEventTtCanCycleStart.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventTtCanCycleStart.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventTtCanCycleStart.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventTtCanCycleStart.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getCategory())) {
            
            return new CategoryStringWrapper(tdEventTtCanCycleStart.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getAdminData())) {
            
            return new AdminDataWrapper(tdEventTtCanCycleStart.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventTtCanCycleStart.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventTtCanCycleStart.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventTtCanCycleStart.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventTtCanCycleStart.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(tdEventTtCanCycleStart.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getCycleRepetition() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getCycleRepetition())) {
            
            return new IntegerWrapper(tdEventTtCanCycleStart.getCycleRepetition());
            
        } else {
            return null;
        }
        
    }

    public TtCanClusterRefWrapper getTtCanClusterRef() {
        
        if (CollUtil.isNotEmpty(tdEventTtCanCycleStart.getTtCanClusterRef())) {
            
            return new TtCanClusterRefWrapper(tdEventTtCanCycleStart.getTtCanClusterRef());
            
        } else {
            return null;
        }
        
    }




    


    
}