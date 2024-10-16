package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    


public class DiagnosticIoControlWrapper {

    
    private DiagnosticIoControl diagnosticIoControl;

    public DiagnosticIoControlWrapper(DiagnosticIoControl diagnosticIoControl) {
        this.diagnosticIoControl = diagnosticIoControl;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getS())) {
            
            return diagnosticIoControl.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getT())) {
            
            return diagnosticIoControl.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getUuid())) {
            
            return diagnosticIoControl.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getShortName())) {
            
            return new IdentifierWrapper(diagnosticIoControl.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticIoControl.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticIoControl.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticIoControl.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticIoControl.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticIoControl.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticIoControl.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticIoControl.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticIoControl.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticIoControl.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DataIdentifierRefWrapper getDataIdentifierRef() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getDataIdentifierRef())) {
            
            return new DataIdentifierRefWrapper(diagnosticIoControl.getDataIdentifierRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getFreezeCurrentState() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getFreezeCurrentState())) {
            
            return new BooleanWrapper(diagnosticIoControl.getFreezeCurrentState());
            
        } else {
            return null;
        }
        
    }

    public IoControlClassRefWrapper getIoControlClassRef() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getIoControlClassRef())) {
            
            return new IoControlClassRefWrapper(diagnosticIoControl.getIoControlClassRef());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getResetToDefault() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getResetToDefault())) {
            
            return new BooleanWrapper(diagnosticIoControl.getResetToDefault());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getShortTermAdjustment() {
        
        if (CollUtil.isNotEmpty(diagnosticIoControl.getShortTermAdjustment())) {
            
            return new BooleanWrapper(diagnosticIoControl.getShortTermAdjustment());
            
        } else {
            return null;
        }
        
    }




    


    
}