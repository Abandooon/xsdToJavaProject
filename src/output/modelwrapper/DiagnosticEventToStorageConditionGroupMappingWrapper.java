package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticEventToStorageConditionGroupMappingWrapper {

    
    private DiagnosticEventToStorageConditionGroupMapping diagnosticEventToStorageConditionGroupMapping;

    public DiagnosticEventToStorageConditionGroupMappingWrapper(DiagnosticEventToStorageConditionGroupMapping diagnosticEventToStorageConditionGroupMapping) {
        this.diagnosticEventToStorageConditionGroupMapping = diagnosticEventToStorageConditionGroupMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getS())) {
            
            return diagnosticEventToStorageConditionGroupMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getT())) {
            
            return diagnosticEventToStorageConditionGroupMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getUuid())) {
            
            return diagnosticEventToStorageConditionGroupMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getShortName())) {
            
            return new IdentifierWrapper(diagnosticEventToStorageConditionGroupMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticEventToStorageConditionGroupMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticEventToStorageConditionGroupMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticEventToStorageConditionGroupMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticEventToStorageConditionGroupMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticEventToStorageConditionGroupMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticEventToStorageConditionGroupMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticEventToStorageConditionGroupMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticEventToStorageConditionGroupMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticEventRefWrapper getDiagnosticEventRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getDiagnosticEventRef())) {
            
            return new DiagnosticEventRefWrapper(diagnosticEventToStorageConditionGroupMapping.getDiagnosticEventRef());
            
        } else {
            return null;
        }
        
    }

    public StorageConditionGroupRefWrapper getStorageConditionGroupRef() {
        
        if (CollUtil.isNotEmpty(diagnosticEventToStorageConditionGroupMapping.getStorageConditionGroupRef())) {
            
            return new StorageConditionGroupRefWrapper(diagnosticEventToStorageConditionGroupMapping.getStorageConditionGroupRef());
            
        } else {
            return null;
        }
        
    }




    


    
}