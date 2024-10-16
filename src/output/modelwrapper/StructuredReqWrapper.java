package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Date;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    
        import stdgui.data.model.orimodel.String;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class StructuredReqWrapper {

    
    private StructuredReq structuredReq;

    public StructuredReqWrapper(StructuredReq structuredReq) {
        this.structuredReq = structuredReq;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(structuredReq.getS())) {
            
            return structuredReq.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(structuredReq.getT())) {
            
            return structuredReq.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(structuredReq.getUuid())) {
            
            return structuredReq.getUuid();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getSi() {
        
        if (CollUtil.isNotEmpty(structuredReq.getSi())) {
            
            return structuredReq.getSi();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getView() {
        
        if (CollUtil.isNotEmpty(structuredReq.getView())) {
            
            return structuredReq.getView();
            
        } else {
            return null;
        }
        
    }

    public ChapterEnumBreakSimple getBreak() {
        
        if (CollUtil.isNotEmpty(structuredReq.getBreak())) {
            
            return structuredReq.getBreak();
            
        } else {
            return null;
        }
        
    }

    public KeepWithPreviousEnumSimple getKeepWithPrevious() {
        
        if (CollUtil.isNotEmpty(structuredReq.getKeepWithPrevious())) {
            
            return structuredReq.getKeepWithPrevious();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(structuredReq.getShortName())) {
            
            return new IdentifierWrapper(structuredReq.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(structuredReq.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = structuredReq.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(structuredReq.getLongName())) {
            
            return new MultilanguageLongNameWrapper(structuredReq.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(structuredReq.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(structuredReq.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(structuredReq.getCategory())) {
            
            return new CategoryStringWrapper(structuredReq.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(structuredReq.getAdminData())) {
            
            return new AdminDataWrapper(structuredReq.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(structuredReq.getIntroduction())) {
            
            return new DocumentationBlockWrapper(structuredReq.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(structuredReq.getAnnotations())) {
            ArrayList<Annotation> originalList = structuredReq.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<TraceRefWrapper> getTraceRefs() {
        
        if (CollUtil.isNotEmpty(structuredReq.getTraceRefs())) {
            ArrayList<TraceRef> originalList = structuredReq.getTraceRefs();
            ArrayList<TraceRefWrapper> wrapperList = (ArrayList<TraceRefWrapper>)originalList.stream()
                .map(item -> new TraceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DateWrapper getDate() {
        
        if (CollUtil.isNotEmpty(structuredReq.getDate())) {
            
            return new DateWrapper(structuredReq.getDate());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getIssuedBy() {
        
        if (CollUtil.isNotEmpty(structuredReq.getIssuedBy())) {
            
            return new StringWrapper(structuredReq.getIssuedBy());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getType() {
        
        if (CollUtil.isNotEmpty(structuredReq.getType())) {
            
            return new StringWrapper(structuredReq.getType());
            
        } else {
            return null;
        }
        
    }

    public StringWrapper getImportance() {
        
        if (CollUtil.isNotEmpty(structuredReq.getImportance())) {
            
            return new StringWrapper(structuredReq.getImportance());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getDescription() {
        
        if (CollUtil.isNotEmpty(structuredReq.getDescription())) {
            
            return new DocumentationBlockWrapper(structuredReq.getDescription());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getRationale() {
        
        if (CollUtil.isNotEmpty(structuredReq.getRationale())) {
            
            return new DocumentationBlockWrapper(structuredReq.getRationale());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getDependencies() {
        
        if (CollUtil.isNotEmpty(structuredReq.getDependencies())) {
            
            return new DocumentationBlockWrapper(structuredReq.getDependencies());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getUseCase() {
        
        if (CollUtil.isNotEmpty(structuredReq.getUseCase())) {
            
            return new DocumentationBlockWrapper(structuredReq.getUseCase());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getConflicts() {
        
        if (CollUtil.isNotEmpty(structuredReq.getConflicts())) {
            
            return new DocumentationBlockWrapper(structuredReq.getConflicts());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getSupportingMaterial() {
        
        if (CollUtil.isNotEmpty(structuredReq.getSupportingMaterial())) {
            
            return new DocumentationBlockWrapper(structuredReq.getSupportingMaterial());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getRemark() {
        
        if (CollUtil.isNotEmpty(structuredReq.getRemark())) {
            
            return new DocumentationBlockWrapper(structuredReq.getRemark());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TestedItemRefWrapper> getTestedItemRefs() {
        
        if (CollUtil.isNotEmpty(structuredReq.getTestedItemRefs())) {
            ArrayList<TestedItemRef> originalList = structuredReq.getTestedItemRefs();
            ArrayList<TestedItemRefWrapper> wrapperList = (ArrayList<TestedItemRefWrapper>)originalList.stream()
                .map(item -> new TestedItemRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(structuredReq.getVariationPoint())) {
            
            return new VariationPointWrapper(structuredReq.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}