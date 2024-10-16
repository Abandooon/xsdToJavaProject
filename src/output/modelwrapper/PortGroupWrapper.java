package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class PortGroupWrapper {

    
    private PortGroup portGroup;

    public PortGroupWrapper(PortGroup portGroup) {
        this.portGroup = portGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(portGroup.getS())) {
            
            return portGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(portGroup.getT())) {
            
            return portGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(portGroup.getUuid())) {
            
            return portGroup.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(portGroup.getShortName())) {
            
            return new IdentifierWrapper(portGroup.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(portGroup.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = portGroup.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(portGroup.getLongName())) {
            
            return new MultilanguageLongNameWrapper(portGroup.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(portGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(portGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(portGroup.getCategory())) {
            
            return new CategoryStringWrapper(portGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(portGroup.getAdminData())) {
            
            return new AdminDataWrapper(portGroup.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(portGroup.getIntroduction())) {
            
            return new DocumentationBlockWrapper(portGroup.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(portGroup.getAnnotations())) {
            ArrayList<Annotation> originalList = portGroup.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<InnerPortGroupInCompositionInstanceRefWrapper> getInnerGroupIrefs() {
        
        if (CollUtil.isNotEmpty(portGroup.getInnerGroupIrefs())) {
            ArrayList<InnerPortGroupInCompositionInstanceRef> originalList = portGroup.getInnerGroupIrefs();
            ArrayList<InnerPortGroupInCompositionInstanceRefWrapper> wrapperList = (ArrayList<InnerPortGroupInCompositionInstanceRefWrapper>)originalList.stream()
                .map(item -> new InnerPortGroupInCompositionInstanceRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<PortPrototypeRefConditionalWrapper> getOuterPorts() {
        
        if (CollUtil.isNotEmpty(portGroup.getOuterPorts())) {
            ArrayList<PortPrototypeRefConditional> originalList = portGroup.getOuterPorts();
            ArrayList<PortPrototypeRefConditionalWrapper> wrapperList = (ArrayList<PortPrototypeRefConditionalWrapper>)originalList.stream()
                .map(item -> new PortPrototypeRefConditionalWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(portGroup.getVariationPoint())) {
            
            return new VariationPointWrapper(portGroup.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}