package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class GlobalTimeFrSlaveWrapper {

    
    private GlobalTimeFrSlave globalTimeFrSlave;

    public GlobalTimeFrSlaveWrapper(GlobalTimeFrSlave globalTimeFrSlave) {
        this.globalTimeFrSlave = globalTimeFrSlave;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getS())) {
            
            return globalTimeFrSlave.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getT())) {
            
            return globalTimeFrSlave.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getUuid())) {
            
            return globalTimeFrSlave.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getShortName())) {
            
            return new IdentifierWrapper(globalTimeFrSlave.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeFrSlave.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeFrSlave.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeFrSlave.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeFrSlave.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeFrSlave.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeFrSlave.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeFrSlave.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(globalTimeFrSlave.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public GlobalTimeCrcValidationEnumWrapper getCrcValidated() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getCrcValidated())) {
            
            return new GlobalTimeCrcValidationEnumWrapper(globalTimeFrSlave.getCrcValidated());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSequenceCounterJumpWidth() {
        
        if (CollUtil.isNotEmpty(globalTimeFrSlave.getSequenceCounterJumpWidth())) {
            
            return new PositiveIntegerWrapper(globalTimeFrSlave.getSequenceCounterJumpWidth());
            
        } else {
            return null;
        }
        
    }




    


    
}