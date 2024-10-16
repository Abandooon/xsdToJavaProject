package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    


public class DtcStatusChangeNotificationNeedsWrapper {

    
    private DtcStatusChangeNotificationNeeds dtcStatusChangeNotificationNeeds;

    public DtcStatusChangeNotificationNeedsWrapper(DtcStatusChangeNotificationNeeds dtcStatusChangeNotificationNeeds) {
        this.dtcStatusChangeNotificationNeeds = dtcStatusChangeNotificationNeeds;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getS())) {
            
            return dtcStatusChangeNotificationNeeds.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getT())) {
            
            return dtcStatusChangeNotificationNeeds.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getUuid())) {
            
            return dtcStatusChangeNotificationNeeds.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getShortName())) {
            
            return new IdentifierWrapper(dtcStatusChangeNotificationNeeds.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = dtcStatusChangeNotificationNeeds.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getLongName())) {
            
            return new MultilanguageLongNameWrapper(dtcStatusChangeNotificationNeeds.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(dtcStatusChangeNotificationNeeds.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getCategory())) {
            
            return new CategoryStringWrapper(dtcStatusChangeNotificationNeeds.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getAdminData())) {
            
            return new AdminDataWrapper(dtcStatusChangeNotificationNeeds.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getIntroduction())) {
            
            return new DocumentationBlockWrapper(dtcStatusChangeNotificationNeeds.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getAnnotations())) {
            ArrayList<Annotation> originalList = dtcStatusChangeNotificationNeeds.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<DiagnosticAudienceEnumWrapper> getAudiences() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getAudiences())) {
            ArrayList<DiagnosticAudienceEnum> originalList = dtcStatusChangeNotificationNeeds.getAudiences();
            ArrayList<DiagnosticAudienceEnumWrapper> wrapperList = (ArrayList<DiagnosticAudienceEnumWrapper>)originalList.stream()
                .map(item -> new DiagnosticAudienceEnumWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public DiagRequirementIdStringWrapper getDiagRequirement() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getDiagRequirement())) {
            
            return new DiagRequirementIdStringWrapper(dtcStatusChangeNotificationNeeds.getDiagRequirement());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSecurityAccessLevel() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getSecurityAccessLevel())) {
            
            return new PositiveIntegerWrapper(dtcStatusChangeNotificationNeeds.getSecurityAccessLevel());
            
        } else {
            return null;
        }
        
    }

    public DtcFormatTypeEnumWrapper getDtcFormatType() {
        
        if (CollUtil.isNotEmpty(dtcStatusChangeNotificationNeeds.getDtcFormatType())) {
            
            return new DtcFormatTypeEnumWrapper(dtcStatusChangeNotificationNeeds.getDtcFormatType());
            
        } else {
            return null;
        }
        
    }




    


    
}