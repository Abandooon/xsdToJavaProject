package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class GlobalTimeCanSlaveWrapper {

    
    private GlobalTimeCanSlave globalTimeCanSlave;

    public GlobalTimeCanSlaveWrapper(GlobalTimeCanSlave globalTimeCanSlave) {
        this.globalTimeCanSlave = globalTimeCanSlave;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getS())) {
            
            return globalTimeCanSlave.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getT())) {
            
            return globalTimeCanSlave.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getUuid())) {
            
            return globalTimeCanSlave.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getShortName())) {
            
            return new IdentifierWrapper(globalTimeCanSlave.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = globalTimeCanSlave.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getLongName())) {
            
            return new MultilanguageLongNameWrapper(globalTimeCanSlave.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(globalTimeCanSlave.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getCategory())) {
            
            return new CategoryStringWrapper(globalTimeCanSlave.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getAdminData())) {
            
            return new AdminDataWrapper(globalTimeCanSlave.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getIntroduction())) {
            
            return new DocumentationBlockWrapper(globalTimeCanSlave.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getAnnotations())) {
            ArrayList<Annotation> originalList = globalTimeCanSlave.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public CommunicationConnectorRefWrapper getCommunicationConnectorRef() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getCommunicationConnectorRef())) {
            
            return new CommunicationConnectorRefWrapper(globalTimeCanSlave.getCommunicationConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public GlobalTimeCrcValidationEnumWrapper getCrcValidated() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getCrcValidated())) {
            
            return new GlobalTimeCrcValidationEnumWrapper(globalTimeCanSlave.getCrcValidated());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getSequenceCounterJumpWidth() {
        
        if (CollUtil.isNotEmpty(globalTimeCanSlave.getSequenceCounterJumpWidth())) {
            
            return new PositiveIntegerWrapper(globalTimeCanSlave.getSequenceCounterJumpWidth());
            
        } else {
            return null;
        }
        
    }




    


    
}