package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class ContainerIPduWrapper {

    
    private ContainerIPdu containerIPdu;

    public ContainerIPduWrapper(ContainerIPdu containerIPdu) {
        this.containerIPdu = containerIPdu;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getS())) {
            
            return containerIPdu.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getT())) {
            
            return containerIPdu.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getUuid())) {
            
            return containerIPdu.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getShortName())) {
            
            return new IdentifierWrapper(containerIPdu.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = containerIPdu.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getLongName())) {
            
            return new MultilanguageLongNameWrapper(containerIPdu.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(containerIPdu.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getCategory())) {
            
            return new CategoryStringWrapper(containerIPdu.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getAdminData())) {
            
            return new AdminDataWrapper(containerIPdu.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getIntroduction())) {
            
            return new DocumentationBlockWrapper(containerIPdu.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getAnnotations())) {
            ArrayList<Annotation> originalList = containerIPdu.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getVariationPoint())) {
            
            return new VariationPointWrapper(containerIPdu.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getLength() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getLength())) {
            
            return new IntegerWrapper(containerIPdu.getLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMetaDataLength() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getMetaDataLength())) {
            
            return new PositiveIntegerWrapper(containerIPdu.getMetaDataLength());
            
        } else {
            return null;
        }
        
    }

    public ContainedIPduPropsWrapper getContainedIPduProps() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getContainedIPduProps())) {
            
            return new ContainedIPduPropsWrapper(containerIPdu.getContainedIPduProps());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ContainedPduTriggeringRefWrapper> getContainedPduTriggeringRefs() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getContainedPduTriggeringRefs())) {
            ArrayList<ContainedPduTriggeringRef> originalList = containerIPdu.getContainedPduTriggeringRefs();
            ArrayList<ContainedPduTriggeringRefWrapper> wrapperList = (ArrayList<ContainedPduTriggeringRefWrapper>)originalList.stream()
                .map(item -> new ContainedPduTriggeringRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getContainerTimeout() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getContainerTimeout())) {
            
            return new TimeValueWrapper(containerIPdu.getContainerTimeout());
            
        } else {
            return null;
        }
        
    }

    public ContainerIPduTriggerEnumWrapper getContainerTrigger() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getContainerTrigger())) {
            
            return new ContainerIPduTriggerEnumWrapper(containerIPdu.getContainerTrigger());
            
        } else {
            return null;
        }
        
    }

    public ContainerIPduHeaderTypeEnumWrapper getHeaderType() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getHeaderType())) {
            
            return new ContainerIPduHeaderTypeEnumWrapper(containerIPdu.getHeaderType());
            
        } else {
            return null;
        }
        
    }

    public RxAcceptContainedIPduEnumWrapper getRxAcceptContainedIPdu() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getRxAcceptContainedIPdu())) {
            
            return new RxAcceptContainedIPduEnumWrapper(containerIPdu.getRxAcceptContainedIPdu());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getThresholdSize() {
        
        if (CollUtil.isNotEmpty(containerIPdu.getThresholdSize())) {
            
            return new PositiveIntegerWrapper(containerIPdu.getThresholdSize());
            
        } else {
            return null;
        }
        
    }




    


    
}