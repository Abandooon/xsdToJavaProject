package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class TdEventSwcInternalBehaviorWrapper {

    
    private TdEventSwcInternalBehavior tdEventSwcInternalBehavior;

    public TdEventSwcInternalBehaviorWrapper(TdEventSwcInternalBehavior tdEventSwcInternalBehavior) {
        this.tdEventSwcInternalBehavior = tdEventSwcInternalBehavior;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getS())) {
            
            return tdEventSwcInternalBehavior.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getT())) {
            
            return tdEventSwcInternalBehavior.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getUuid())) {
            
            return tdEventSwcInternalBehavior.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getShortName())) {
            
            return new IdentifierWrapper(tdEventSwcInternalBehavior.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = tdEventSwcInternalBehavior.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getLongName())) {
            
            return new MultilanguageLongNameWrapper(tdEventSwcInternalBehavior.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(tdEventSwcInternalBehavior.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getCategory())) {
            
            return new CategoryStringWrapper(tdEventSwcInternalBehavior.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getAdminData())) {
            
            return new AdminDataWrapper(tdEventSwcInternalBehavior.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getIntroduction())) {
            
            return new DocumentationBlockWrapper(tdEventSwcInternalBehavior.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getAnnotations())) {
            ArrayList<Annotation> originalList = tdEventSwcInternalBehavior.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getVariationPoint())) {
            
            return new VariationPointWrapper(tdEventSwcInternalBehavior.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public TdEventOccurrenceExpressionWrapper getOccurrenceExpression() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getOccurrenceExpression())) {
            
            return new TdEventOccurrenceExpressionWrapper(tdEventSwcInternalBehavior.getOccurrenceExpression());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(tdEventSwcInternalBehavior.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public RunnableRefWrapper getRunnableRef() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getRunnableRef())) {
            
            return new RunnableRefWrapper(tdEventSwcInternalBehavior.getRunnableRef());
            
        } else {
            return null;
        }
        
    }

    public TdEventSwcInternalBehaviorTypeEnumWrapper getTdEventSwcInternalBehaviorType() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getTdEventSwcInternalBehaviorType())) {
            
            return new TdEventSwcInternalBehaviorTypeEnumWrapper(tdEventSwcInternalBehavior.getTdEventSwcInternalBehaviorType());
            
        } else {
            return null;
        }
        
    }

    public VariableAccessRefWrapper getVariableAccessRef() {
        
        if (CollUtil.isNotEmpty(tdEventSwcInternalBehavior.getVariableAccessRef())) {
            
            return new VariableAccessRefWrapper(tdEventSwcInternalBehavior.getVariableAccessRef());
            
        } else {
            return null;
        }
        
    }




    


    
}