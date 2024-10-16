package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class DiagnosticWriteDataByIdentifierClassWrapper {

    
    private DiagnosticWriteDataByIdentifierClass diagnosticWriteDataByIdentifierClass;

    public DiagnosticWriteDataByIdentifierClassWrapper(DiagnosticWriteDataByIdentifierClass diagnosticWriteDataByIdentifierClass) {
        this.diagnosticWriteDataByIdentifierClass = diagnosticWriteDataByIdentifierClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getS())) {
            
            return diagnosticWriteDataByIdentifierClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getT())) {
            
            return diagnosticWriteDataByIdentifierClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getUuid())) {
            
            return diagnosticWriteDataByIdentifierClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticWriteDataByIdentifierClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticWriteDataByIdentifierClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticWriteDataByIdentifierClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticWriteDataByIdentifierClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticWriteDataByIdentifierClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticWriteDataByIdentifierClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticWriteDataByIdentifierClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticWriteDataByIdentifierClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticWriteDataByIdentifierClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticWriteDataByIdentifierClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticWriteDataByIdentifierClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticWriteDataByIdentifierClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }




    


    
}