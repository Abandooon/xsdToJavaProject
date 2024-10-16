package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticServiceTableWrapper {

    
    private DiagnosticServiceTable diagnosticServiceTable;

    public DiagnosticServiceTableWrapper(DiagnosticServiceTable diagnosticServiceTable) {
        this.diagnosticServiceTable = diagnosticServiceTable;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getS())) {
            
            return diagnosticServiceTable.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getT())) {
            
            return diagnosticServiceTable.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getUuid())) {
            
            return diagnosticServiceTable.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getShortName())) {
            
            return new IdentifierWrapper(diagnosticServiceTable.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticServiceTable.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticServiceTable.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticServiceTable.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticServiceTable.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticServiceTable.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticServiceTable.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticServiceTable.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticServiceTable.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticConnectionRefConditionalWrapper> getDiagnosticConnections() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getDiagnosticConnections())) {
            ArrayList<DiagnosticConnectionRefConditional> originalList = diagnosticServiceTable.getDiagnosticConnections();
            ArrayList<DiagnosticConnectionRefConditionalWrapper> wrapperList = (ArrayList<DiagnosticConnectionRefConditionalWrapper>)originalList.stream()
                .map(item -> new DiagnosticConnectionRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(diagnosticServiceTable.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getProtocolKind() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getProtocolKind())) {
            
            return new NmtokenStringWrapper(diagnosticServiceTable.getProtocolKind());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ServiceInstanceRef_DiagnosticServiceTableWrapper> getServiceInstanceRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticServiceTable.getServiceInstanceRefs())) {
            ArrayList<ServiceInstanceRef_DiagnosticServiceTable> originalList = diagnosticServiceTable.getServiceInstanceRefs();
            ArrayList<ServiceInstanceRef_DiagnosticServiceTableWrapper> wrapperList = (ArrayList<ServiceInstanceRef_DiagnosticServiceTableWrapper>)originalList.stream()
                .map(item -> new ServiceInstanceRef_DiagnosticServiceTableWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}