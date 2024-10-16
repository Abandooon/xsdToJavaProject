package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class PhysicalDimensionWrapper {

    
    private PhysicalDimension physicalDimension;

    public PhysicalDimensionWrapper(PhysicalDimension physicalDimension) {
        this.physicalDimension = physicalDimension;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getS())) {
            
            return physicalDimension.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getT())) {
            
            return physicalDimension.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getUuid())) {
            
            return physicalDimension.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getShortName())) {
            
            return new IdentifierWrapper(physicalDimension.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = physicalDimension.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getLongName())) {
            
            return new MultilanguageLongNameWrapper(physicalDimension.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(physicalDimension.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getCategory())) {
            
            return new CategoryStringWrapper(physicalDimension.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getAdminData())) {
            
            return new AdminDataWrapper(physicalDimension.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getIntroduction())) {
            
            return new DocumentationBlockWrapper(physicalDimension.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getAnnotations())) {
            ArrayList<Annotation> originalList = physicalDimension.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getVariationPoint())) {
            
            return new VariationPointWrapper(physicalDimension.getVariationPoint());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getLengthExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getLengthExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getLengthExp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMassExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getMassExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getMassExp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getTimeExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getTimeExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getTimeExp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getCurrentExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getCurrentExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getCurrentExp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getTemperatureExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getTemperatureExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getTemperatureExp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getMolarAmountExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getMolarAmountExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getMolarAmountExp());
            
        } else {
            return null;
        }
        
    }

    public NumericalValueWrapper getLuminousIntensityExp() {
        
        if (CollUtil.isNotEmpty(physicalDimension.getLuminousIntensityExp())) {
            
            return new NumericalValueWrapper(physicalDimension.getLuminousIntensityExp());
            
        } else {
            return null;
        }
        
    }




    


    
}