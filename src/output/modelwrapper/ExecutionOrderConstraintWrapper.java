package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class ExecutionOrderConstraintWrapper {

    
    private ExecutionOrderConstraint executionOrderConstraint;

    public ExecutionOrderConstraintWrapper(ExecutionOrderConstraint executionOrderConstraint) {
        this.executionOrderConstraint = executionOrderConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getS())) {
            
            return executionOrderConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getT())) {
            
            return executionOrderConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getUuid())) {
            
            return executionOrderConstraint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getShortName())) {
            
            return new IdentifierWrapper(executionOrderConstraint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = executionOrderConstraint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(executionOrderConstraint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(executionOrderConstraint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getCategory())) {
            
            return new CategoryStringWrapper(executionOrderConstraint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getAdminData())) {
            
            return new AdminDataWrapper(executionOrderConstraint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(executionOrderConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getAnnotations())) {
            ArrayList<Annotation> originalList = executionOrderConstraint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getTraceRefs())) {
            ArrayList<TraceRef> originalList = executionOrderConstraint.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(executionOrderConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public BaseCompositionRefWrapper getBaseCompositionRef() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getBaseCompositionRef())) {
            
            return new BaseCompositionRefWrapper(executionOrderConstraint.getBaseCompositionRef());
            
        } else {
            return null;
        }
        
    }

    public ExecutionOrderConstraintTypeEnumWrapper getExecutionOrderConstraintType() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getExecutionOrderConstraintType())) {
            
            return new ExecutionOrderConstraintTypeEnumWrapper(executionOrderConstraint.getExecutionOrderConstraintType());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIsEvent() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getIsEvent())) {
            
            return new BooleanWrapper(executionOrderConstraint.getIsEvent());
            
        } else {
            return null;
        }
        
    }

    public OrderedElementsWrapper getOrderedElements() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getOrderedElements())) {
            
            return new OrderedElementsWrapper(executionOrderConstraint.getOrderedElements());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getPermitMultipleReferencesToEe() {
        
        if (CollUtil.isNotEmpty(executionOrderConstraint.getPermitMultipleReferencesToEe())) {
            
            return new BooleanWrapper(executionOrderConstraint.getPermitMultipleReferencesToEe());
            
        } else {
            return null;
        }
        
    }




    


    
}