package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DiagnosticReadDataByIdentifierClassWrapper {

    
    private DiagnosticReadDataByIdentifierClass diagnosticReadDataByIdentifierClass;

    public DiagnosticReadDataByIdentifierClassWrapper(DiagnosticReadDataByIdentifierClass diagnosticReadDataByIdentifierClass) {
        this.diagnosticReadDataByIdentifierClass = diagnosticReadDataByIdentifierClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getS())) {
            
            return diagnosticReadDataByIdentifierClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getT())) {
            
            return diagnosticReadDataByIdentifierClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getUuid())) {
            
            return diagnosticReadDataByIdentifierClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticReadDataByIdentifierClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticReadDataByIdentifierClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticReadDataByIdentifierClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticReadDataByIdentifierClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticReadDataByIdentifierClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticReadDataByIdentifierClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticReadDataByIdentifierClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticReadDataByIdentifierClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticReadDataByIdentifierClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticReadDataByIdentifierClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticReadDataByIdentifierClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxDidToRead() {
        
        if (CollUtil.isNotEmpty(diagnosticReadDataByIdentifierClass.getMaxDidToRead())) {
            
            return new PositiveIntegerWrapper(diagnosticReadDataByIdentifierClass.getMaxDidToRead());
            
        } else {
            return null;
        }
        
    }




    


    
}