package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ExecutionTimeConstraintWrapper {

    
    private ExecutionTimeConstraint executionTimeConstraint;

    public ExecutionTimeConstraintWrapper(ExecutionTimeConstraint executionTimeConstraint) {
        this.executionTimeConstraint = executionTimeConstraint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getS())) {
            
            return executionTimeConstraint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getT())) {
            
            return executionTimeConstraint.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getUuid())) {
            
            return executionTimeConstraint.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getShortName())) {
            
            return new IdentifierWrapper(executionTimeConstraint.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = executionTimeConstraint.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getLongName())) {
            
            return new MultilanguageLongNameWrapper(executionTimeConstraint.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(executionTimeConstraint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getCategory())) {
            
            return new CategoryStringWrapper(executionTimeConstraint.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getAdminData())) {
            
            return new AdminDataWrapper(executionTimeConstraint.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getIntroduction())) {
            
            return new DocumentationBlockWrapper(executionTimeConstraint.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getAnnotations())) {
            ArrayList<Annotation> originalList = executionTimeConstraint.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getTraceRefs())) {
            ArrayList<TraceRef> originalList = executionTimeConstraint.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getVariationPoint())) {
            
            return new VariationPointWrapper(executionTimeConstraint.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ComponentInCompositionInstanceRefWrapper getComponentIref() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getComponentIref())) {
            
            return new ComponentInCompositionInstanceRefWrapper(executionTimeConstraint.getComponentIref());
            
        } else {
            return null;
        }
        
    }

    public ExecutableRefWrapper getExecutableRef() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getExecutableRef())) {
            
            return new ExecutableRefWrapper(executionTimeConstraint.getExecutableRef());
            
        } else {
            return null;
        }
        
    }

    public ExecutionTimeTypeEnumWrapper getExecutionTimeType() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getExecutionTimeType())) {
            
            return new ExecutionTimeTypeEnumWrapper(executionTimeConstraint.getExecutionTimeType());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMaximum() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getMaximum())) {
            
            return new MultidimensionalTimeWrapper(executionTimeConstraint.getMaximum());
            
        } else {
            return null;
        }
        
    }

    public MultidimensionalTimeWrapper getMinimum() {
        
        if (CollUtil.isNotEmpty(executionTimeConstraint.getMinimum())) {
            
            return new MultidimensionalTimeWrapper(executionTimeConstraint.getMinimum());
            
        } else {
            return null;
        }
        
    }




    


    
}