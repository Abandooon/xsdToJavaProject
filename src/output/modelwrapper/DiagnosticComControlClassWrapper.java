package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class DiagnosticComControlClassWrapper {

    
    private DiagnosticComControlClass diagnosticComControlClass;

    public DiagnosticComControlClassWrapper(DiagnosticComControlClass diagnosticComControlClass) {
        this.diagnosticComControlClass = diagnosticComControlClass;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getS())) {
            
            return diagnosticComControlClass.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getT())) {
            
            return diagnosticComControlClass.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getUuid())) {
            
            return diagnosticComControlClass.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getShortName())) {
            
            return new IdentifierWrapper(diagnosticComControlClass.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = diagnosticComControlClass.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getLongName())) {
            
            return new MultilanguageLongNameWrapper(diagnosticComControlClass.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(diagnosticComControlClass.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getCategory())) {
            
            return new CategoryStringWrapper(diagnosticComControlClass.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getAdminData())) {
            
            return new AdminDataWrapper(diagnosticComControlClass.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getIntroduction())) {
            
            return new DocumentationBlockWrapper(diagnosticComControlClass.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getAnnotations())) {
            ArrayList<Annotation> originalList = diagnosticComControlClass.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getVariationPoint())) {
            
            return new VariationPointWrapper(diagnosticComControlClass.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public AccessPermissionRefWrapper getAccessPermissionRef() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getAccessPermissionRef())) {
            
            return new AccessPermissionRefWrapper(diagnosticComControlClass.getAccessPermissionRef());
            
        } else {
            return null;
        }
        
    }

    public DiagnosticAccessPermissionValidityEnumWrapper getAccessPermissionValidity() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getAccessPermissionValidity())) {
            
            return new DiagnosticAccessPermissionValidityEnumWrapper(diagnosticComControlClass.getAccessPermissionValidity());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AllChannelsRefWrapper> getAllChannelsRefs() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getAllChannelsRefs())) {
            ArrayList<AllChannelsRef> originalList = diagnosticComControlClass.getAllChannelsRefs();
            ArrayList<AllChannelsRefWrapper> wrapperList = (ArrayList<AllChannelsRefWrapper>)originalList.stream()
                .map(item -> new AllChannelsRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticComControlSpecificChannelWrapper> getSpecificChannels() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getSpecificChannels())) {
            ArrayList<DiagnosticComControlSpecificChannel> originalList = diagnosticComControlClass.getSpecificChannels();
            ArrayList<DiagnosticComControlSpecificChannelWrapper> wrapperList = (ArrayList<DiagnosticComControlSpecificChannelWrapper>)originalList.stream()
                .map(item -> new DiagnosticComControlSpecificChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticComControlSubNodeChannelWrapper> getSubNodeChannels() {
        
        if (CollUtil.isNotEmpty(diagnosticComControlClass.getSubNodeChannels())) {
            ArrayList<DiagnosticComControlSubNodeChannel> originalList = diagnosticComControlClass.getSubNodeChannels();
            ArrayList<DiagnosticComControlSubNodeChannelWrapper> wrapperList = (ArrayList<DiagnosticComControlSubNodeChannelWrapper>)originalList.stream()
                .map(item -> new DiagnosticComControlSubNodeChannelWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}