package stdgui.data.model.modelwrapper;

    import stdgui.data.model.orimodel.System;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class SystemWrapper {

    
    private System system;

    public SystemWrapper(System system) {
        this.system = system;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(system.getS())) {
            
            return system.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(system.getT())) {
            
            return system.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(system.getUuid())) {
            
            return system.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(system.getShortName())) {
            
            return new IdentifierWrapper(system.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(system.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = system.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(system.getLongName())) {
            
            return new MultilanguageLongNameWrapper(system.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(system.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(system.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(system.getCategory())) {
            
            return new CategoryStringWrapper(system.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(system.getAdminData())) {
            
            return new AdminDataWrapper(system.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(system.getIntroduction())) {
            
            return new DocumentationBlockWrapper(system.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(system.getAnnotations())) {
            ArrayList<Annotation> originalList = system.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(system.getVariationPoint())) {
            
            return new VariationPointWrapper(system.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ChapterWrapper> getSystemDocumentations() {
        
        if (CollUtil.isNotEmpty(system.getSystemDocumentations())) {
            ArrayList<Chapter> originalList = system.getSystemDocumentations();
            ArrayList<ChapterWrapper> wrapperList = (ArrayList<ChapterWrapper>)originalList.stream()
                .map(item -> new ChapterWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ClientIdDefinitionSetRefWrapper> getClientIdDefinitionSetRefs() {
        
        if (CollUtil.isNotEmpty(system.getClientIdDefinitionSetRefs())) {
            ArrayList<ClientIdDefinitionSetRef> originalList = system.getClientIdDefinitionSetRefs();
            ArrayList<ClientIdDefinitionSetRefWrapper> wrapperList = (ArrayList<ClientIdDefinitionSetRefWrapper>)originalList.stream()
                .map(item -> new ClientIdDefinitionSetRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ByteOrderEnumWrapper getContainerIPduHeaderByteOrder() {
        
        if (CollUtil.isNotEmpty(system.getContainerIPduHeaderByteOrder())) {
            
            return new ByteOrderEnumWrapper(system.getContainerIPduHeaderByteOrder());
            
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getEcuExtractVersion() {
        
        if (CollUtil.isNotEmpty(system.getEcuExtractVersion())) {
            
            return new RevisionLabelStringWrapper(system.getEcuExtractVersion());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<FibexElementRefConditionalWrapper> getFibexElements() {
        
        if (CollUtil.isNotEmpty(system.getFibexElements())) {
            ArrayList<FibexElementRefConditional> originalList = system.getFibexElements();
            ArrayList<FibexElementRefConditionalWrapper> wrapperList = (ArrayList<FibexElementRefConditionalWrapper>)originalList.stream()
                .map(item -> new FibexElementRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SystemMappingWrapper> getMappings() {
        
        if (CollUtil.isNotEmpty(system.getMappings())) {
            ArrayList<SystemMapping> originalList = system.getMappings();
            ArrayList<SystemMappingWrapper> wrapperList = (ArrayList<SystemMappingWrapper>)originalList.stream()
                .map(item -> new SystemMappingWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPncVectorLength() {
        
        if (CollUtil.isNotEmpty(system.getPncVectorLength())) {
            
            return new PositiveIntegerWrapper(system.getPncVectorLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getPncVectorOffset() {
        
        if (CollUtil.isNotEmpty(system.getPncVectorOffset())) {
            
            return new PositiveIntegerWrapper(system.getPncVectorOffset());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<RootSwCompositionPrototypeWrapper> getRootSoftwareCompositions() {
        
        if (CollUtil.isNotEmpty(system.getRootSoftwareCompositions())) {
            ArrayList<RootSwCompositionPrototype> originalList = system.getRootSoftwareCompositions();
            ArrayList<RootSwCompositionPrototypeWrapper> wrapperList = (ArrayList<RootSwCompositionPrototypeWrapper>)originalList.stream()
                .map(item -> new RootSwCompositionPrototypeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public RevisionLabelStringWrapper getSystemVersion() {
        
        if (CollUtil.isNotEmpty(system.getSystemVersion())) {
            
            return new RevisionLabelStringWrapper(system.getSystemVersion());
            
        } else {
            return null;
        }
        
    }




    


    
}