package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SwcToEcuMappingWrapper {

    
    private SwcToEcuMapping swcToEcuMapping;

    public SwcToEcuMappingWrapper(SwcToEcuMapping swcToEcuMapping) {
        this.swcToEcuMapping = swcToEcuMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getS())) {
            
            return swcToEcuMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getT())) {
            
            return swcToEcuMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getUuid())) {
            
            return swcToEcuMapping.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getShortName())) {
            
            return new IdentifierWrapper(swcToEcuMapping.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = swcToEcuMapping.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getLongName())) {
            
            return new MultilanguageLongNameWrapper(swcToEcuMapping.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swcToEcuMapping.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getCategory())) {
            
            return new CategoryStringWrapper(swcToEcuMapping.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getAdminData())) {
            
            return new AdminDataWrapper(swcToEcuMapping.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getIntroduction())) {
            
            return new DocumentationBlockWrapper(swcToEcuMapping.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getAnnotations())) {
            ArrayList<Annotation> originalList = swcToEcuMapping.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ComponentInSystemInstanceRefWrapper> getComponentIrefs() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getComponentIrefs())) {
            ArrayList<ComponentInSystemInstanceRef> originalList = swcToEcuMapping.getComponentIrefs();
            ArrayList<ComponentInSystemInstanceRefWrapper> wrapperList = (ArrayList<ComponentInSystemInstanceRefWrapper>)originalList.stream()
                .map(item -> new ComponentInSystemInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ControlledHwElementRefWrapper getControlledHwElementRef() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getControlledHwElementRef())) {
            
            return new ControlledHwElementRefWrapper(swcToEcuMapping.getControlledHwElementRef());
            
        } else {
            return null;
        }
        
    }

    public EcuInstanceRefWrapper getEcuInstanceRef() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getEcuInstanceRef())) {
            
            return new EcuInstanceRefWrapper(swcToEcuMapping.getEcuInstanceRef());
            
        } else {
            return null;
        }
        
    }

    public PartitionRefWrapper getPartitionRef() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getPartitionRef())) {
            
            return new PartitionRefWrapper(swcToEcuMapping.getPartitionRef());
            
        } else {
            return null;
        }
        
    }

    public ProcessingUnitRefWrapper getProcessingUnitRef() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getProcessingUnitRef())) {
            
            return new ProcessingUnitRefWrapper(swcToEcuMapping.getProcessingUnitRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(swcToEcuMapping.getVariationPoint())) {
            
            return new VariationPointWrapper(swcToEcuMapping.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}