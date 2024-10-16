package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    


public class DiagnosticMemoryDestinationUserDefinedWrapper {

    
    private DiagnosticMemoryDestinationUserDefined diagnosticMemoryDestinationUserDefined;

    public DiagnosticMemoryDestinationUserDefinedWrapper(DiagnosticMemoryDestinationUserDefined diagnosticMemoryDestinationUserDefined) {
        this.diagnosticMemoryDestinationUserDefined = diagnosticMemoryDestinationUserDefined;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getS())) {
            
            return diagnosticMemoryDestinationUserDefined.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getT())) {
            
            return diagnosticMemoryDestinationUserDefined.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getUuid())) {
            
            return diagnosticMemoryDestinationUserDefined.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getShortName())) {
            
            return new IdentifierWrapper(diagnosticMemoryDestinationUserDefined.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticMemoryDestinationUserDefined.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticMemoryDestinationUserDefined.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticMemoryDestinationUserDefined.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticMemoryDestinationUserDefined.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticMemoryDestinationUserDefined.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticMemoryDestinationUserDefined.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticMemoryDestinationUserDefined.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticMemoryDestinationUserDefined.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryId() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryDestinationUserDefined.getMemoryId())) {
            
            return new PositiveIntegerWrapper(diagnosticMemoryDestinationUserDefined.getMemoryId());
            
        } else {
            return null;
        }
        
    }




    


    
}