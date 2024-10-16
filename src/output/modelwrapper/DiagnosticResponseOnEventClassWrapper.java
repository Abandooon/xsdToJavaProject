package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticResponseOnEventClassWrapper {

    
    private DiagnosticResponseOnEventClass diagnosticResponseOnEventClass;

    public DiagnosticResponseOnEventClassWrapper(DiagnosticResponseOnEventClass diagnosticResponseOnEventClass) {
        this.diagnosticResponseOnEventClass = diagnosticResponseOnEventClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getS())) {
            
            return diagnosticResponseOnEventClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getT())) {
            
            return diagnosticResponseOnEventClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getUuid())) {
            
            return diagnosticResponseOnEventClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticResponseOnEventClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticResponseOnEventClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticResponseOnEventClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticResponseOnEventClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticResponseOnEventClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticResponseOnEventClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticResponseOnEventClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticResponseOnEventClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticResponseOnEventClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticResponseOnEventClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticResponseOnEventClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getInterMessageTime() {
        
        if (CollUtil.isNotEmpty(diagnosticResponseOnEventClass.getInterMessageTime())) {
            
            return new TimeValueWrapper(diagnosticResponseOnEventClass.getInterMessageTime());
            
        } else {
            return null;
        }
        
    }




    


    
}