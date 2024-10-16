package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticMemoryIdentifierWrapper {

    
    private DiagnosticMemoryIdentifier diagnosticMemoryIdentifier;

    public DiagnosticMemoryIdentifierWrapper(DiagnosticMemoryIdentifier diagnosticMemoryIdentifier) {
        this.diagnosticMemoryIdentifier = diagnosticMemoryIdentifier;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getS())) {
            
            return diagnosticMemoryIdentifier.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getT())) {
            
            return diagnosticMemoryIdentifier.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getUuid())) {
            
            return diagnosticMemoryIdentifier.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getShortName())) {
            
            return new IdentifierWrapper(diagnosticMemoryIdentifier.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticMemoryIdentifier.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticMemoryIdentifier.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticMemoryIdentifier.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticMemoryIdentifier.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticMemoryIdentifier.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticMemoryIdentifier.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticMemoryIdentifier.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticMemoryIdentifier.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticMemoryIdentifier.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getId() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getId())) {
            
            return new PositiveIntegerWrapper(diagnosticMemoryIdentifier.getId());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryHighAddress() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getMemoryHighAddress())) {
            
            return new PositiveIntegerWrapper(diagnosticMemoryIdentifier.getMemoryHighAddress());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMemoryLowAddress() {
        
        if (CollUtil.isNotEmpty(diagnosticMemoryIdentifier.getMemoryLowAddress())) {
            
            return new PositiveIntegerWrapper(diagnosticMemoryIdentifier.getMemoryLowAddress());
            
        } else {
            return null;
        }
        
    }




    


    
}